import java.util.Scanner;

public class App {
    public static Controller controller;
    public static String createTable() {
      return  "CREATE TABLE Customer( uid int PRIMARY KEY AUTO_INCREMENT , email varchar(255), password varchar(255));";
    }

    public static void createNewCustomer() {
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        customer.uid = 0;
        System.out.println("Enter Customer E-Mail");
        customer.setEmail(sc.nextLine());
        System.out.println("Enter Customer Password");
        customer.setPassword(sc.nextLine());
        System.out.println("PLease review your Customer Details: \n");
        System.out.println(customer);

        sc.close();
        
       int result = controller.executeSQLstatement(customer.saveToDb());
       String message = result >0?"Saved Sucessfully":"Failed";
       System.out.println(message);
    }

    public static void exitApp() {
        controller.closeConnection();
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("App Started");
        controller = new Controller();
        createNewCustomer();
        System.out.println("App Finished");
    }
}
