import java.util.Date;

public class RentalContract {
    private int contractID;
    private int propertyID;
    private int tenantID;
    private Date startDate;
    private Date endDate;
    private float rentAmount;

    public RentalContract(int contractID, int propertyID, int tenantID, Date startDate, float rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.startDate = startDate;
        this.rentAmount = rentAmount;
    }

    public void terminateContract() {
        this.endDate = new Date(); 
        System.out.println("Rental contract terminated successfully.");
    }

    public int getContractID() {
        return contractID;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public int getTenantID() {
        return tenantID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public float getRentAmount() {
        return rentAmount;
    }
}
