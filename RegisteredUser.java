import java.util.List;

public class RegisteredUser {
    private int id;
    private String password;
    private String email;
    private List<String> listOfUser;

    public RegisteredUser(int id, String password, String email, List<String> listOfUser) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.listOfUser = listOfUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getListOfUser() {
        return listOfUser;
    }

    public void setListOfUser(List<String> listOfUser) {
        this.listOfUser = listOfUser;
    }

    public void addUser(String username) {
        listOfUser.add(username);
    }

    public void removeUser(String username) {
        listOfUser.remove(username);
    }
}