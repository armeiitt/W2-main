import java.util.ArrayList;

public class PropertyOwner extends user {

    public PropertyOwner(int id, String name, String email, String phoneNumber, String password) {
        super(id, name, email, phoneNumber, password);
        // TODO Auto-generated constructor stub
    }

    private ArrayList<Property> ListProperty;

    public PropertyOwner(int id, String name, String email, String phoneNumber, String password,
            ArrayList<Property> listProperty) {
        super(id, name, email, phoneNumber, password);
        ListProperty = listProperty;
    }

    public ArrayList<Property> getListProperty() {
        return ListProperty;
    }

    public void setListProperty(ArrayList<Property> listProperty) {
        ListProperty = listProperty;
    }

    public void listProperties() {
        System.out.println("Owned Properties:");
        for (Property property : ListProperty) {
            System.out.println(property.toString());
        }
    }

    public void addProperty(Property property) {
        ListProperty.add(property);
    }

    public void removeAccount(Property property) {
        ListProperty.remove(property);
    }
}