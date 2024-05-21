public class Property {
    int PropertyID;
    String Description;
    int PropertyOwnerId;

    public int getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(int propertyID) {
        PropertyID = propertyID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPropertyOwnerId() {
        return PropertyOwnerId;
    }

    public void setPropertyOwnerId(int propertyOwnerId) {
        PropertyOwnerId = propertyOwnerId;
    }

    public Property(int propertyID, String description, int propertyOwnerId) {
        PropertyID = propertyID;
        Description = description;
        PropertyOwnerId = propertyOwnerId;
    }
}
