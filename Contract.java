public interface Contract {
    void buildContractID();

    void buildPropertyID(String propertyID);

    void buildTenantID(String tenantID);

    void buildRentAmount(double rentAmount);

    Contract signContract();
}
