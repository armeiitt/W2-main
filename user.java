import java.util.*;

public class user {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    public user(int id, String name, String email, String phoneNumber, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void Login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your user ID: ");
        String enterID = sc.nextLine();
        System.out.println("Enter your password: ");
        String enterPassword = sc.nextLine();
        if (enterID.equals(this.id) && enterPassword.equals(this.password)) {
            System.out.println("Login Successfully");
        } else {
            System.out.println("Wrong ID or password, please enter again");
            System.out.println("Enter your user ID: ");
            enterID = sc.nextLine();
            System.out.println("Enter your password: ");
            enterPassword = sc.nextLine();
        }
    }

    public void ResetPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current password: ");
        String enterPassword = sc.nextLine();
        if (enterPassword.equals(this.password)) {
            this.password = enterPassword;
            System.out.println("You have changed password successfully");
        } else {
            System.err.println("Wrong password, please re-enter again!");
            enterPassword = sc.nextLine();
        }
    }
}
