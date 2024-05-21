import java.util.Scanner;

public class User {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    public User(int id, String name, String email, String phoneNumber, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public void login() {
        Scanner sc = new Scanner(System.in);
        String enterID;
        String enterPassword;
        while (true) {
            System.out.println("Enter your user ID: ");
            enterID = sc.nextLine();
            System.out.println("Enter your password: ");
            enterPassword = sc.nextLine();
            if (enterID.equals(String.valueOf(this.id)) && enterPassword.equals(this.password)) {
                System.out.println("Login Successfully");
                break;
            } else {
                System.out.println("Wrong ID or password, please enter again");
            }
        }
    }

    public void resetPassword() {
        Scanner sc = new Scanner(System.in);
        String enterPassword;
        while (true) {
            System.out.println("Enter current password: ");
            enterPassword = sc.nextLine();
            if (enterPassword.equals(this.password)) {
                System.out.println("Enter new password: ");
                String newPassword = sc.nextLine();
                this.password = newPassword;
                System.out.println("You have changed password successfully");
                break;
            } else {
                System.err.println("Wrong password, please re-enter again!");
            }
        }
    }
}
