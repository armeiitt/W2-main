public class ShortTerm implements Contract {
    private String contractID;
    private double rentAmount;
    private String tenantID;
    private String propertyID;

    @Override
    public void buildContractID() {
        this.contractID = "SHORT-" + System.currentTimeMillis();
    }

    @Override
    public void buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    @Override
    public void buildTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    @Override
    public void buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public Contract signContract() {
        System.out.println("Short-term contract signed.");
        return this;
    }

    @Override
    public String getContractID() {
        return this.contractID;
    }
}
