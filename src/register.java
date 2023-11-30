import java.util.Scanner;

public class register {
    private String fullName;
    private String email;
    private String password;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public static register register(){
        register register = new register();
        System.out.print("Enter your full name: ");
        register.setFullName(new Scanner(System.in).nextLine());
        System.out.print("Enter your email: ");
        register.setEmail(new Scanner(System.in).nextLine());
        System.out.print("Enter your password: ");
        register.setPassword(new Scanner(System.in).nextLine());
        return  register;
    }
    public static boolean login(register[] users) {
        System.out.print("Enter login: ");
        String login = new Scanner(System.in).nextLine();
        System.out.print("Enter password: ");
        String password = new Scanner(System.in).nextLine();
        if (users.length == 0) System.out.println("User not find!!! ");
        for (int i = 0; i < users.length; i++) {
            if (users[i].getEmail().equals(login) && users[i].getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
