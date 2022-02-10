import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Controller {
    Connection connection;
    Statement statement;
    public Controller(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("[Connection] Driver Loaded");
            String url = "jdbc:mysql://localhost/estore";
            String user = "root";
            String password = "shivam";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("[Connection] Connection Created");
            statement = connection.createStatement();
            System.out.println("[Connection] Statement Created");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Something went wrong");
        }
    }
    public int executeSQLstatement(String sql){
        int result = 0;
        try {
            result = statement.executeUpdate(sql);
            System.out.println("[Connection] statement executed");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Something went wrong");
        }
        return result;
    }
    public void closeConnection(){
        try {
            connection.close();
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}

