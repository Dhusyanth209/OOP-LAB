class User {
    private String password;

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }
    }

    public String getPassword() {
        return (password != null) ? "********" : "Password not set";
    }
}

public class EncapsulationWithValidation1 {
    public static void main(String[] args) {
        User u = new User();
        u.setPassword("securePass");
        System.out.println("Password: " + u.getPassword());
    }
}