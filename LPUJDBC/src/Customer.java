public class Customer {
    int uid;
    String email;
    String password;

    public Customer() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer [email=" + email + ", password=" + password + ", uid=" + uid + "]";
    }

    public String saveToDb() {
        return "Insert into customer values(0, '" + email + "', '" + password + "' );";
    }

}
