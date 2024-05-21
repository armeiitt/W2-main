import java.util.Scanner;

public class Client {
    public Contract requestCreateRentalContract(String contractType, String propertyID, String tenantID, double rentAmount) {
        Contract contract = null;

        switch (contractType) {
            case "Permanent":
                contract = new Permanent();
                break;
            case "LongTerm":
                contract = new LongTerm();
                break;
            case "ShortTerm":
                contract = new ShortTerm();
                break;
            default:
                throw new IllegalArgumentException("Unknown contract type: " + contractType);
        }

        contract.buildContractID();
        contract.buildPropertyID(propertyID);
        contract.buildTenantID(tenantID);
        contract.buildRentAmount(rentAmount);
        return contract.signContract();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter contract type (Permanent, LongTerm, ShortTerm): ");
        String contractType = scanner.nextLine();

        System.out.println("Enter property ID: ");
        String propertyID = scanner.nextLine();

        System.out.println("Enter tenant ID: ");
        String tenantID = scanner.nextLine();

        System.out.println("Enter rent amount: ");
        double rentAmount = scanner.nextDouble();

        Client client = new Client();
        Contract contract = client.requestCreateRentalContract(contractType, propertyID, tenantID, rentAmount);

        if (contract instanceof Permanent) {
            System.out.println("Permanent Contract created with ID: " + ((Permanent) contract).contractID);
        } else if (contract instanceof LongTerm) {
            System.out.println("Long Term Contract created with ID: " + ((LongTerm) contract).contractID);
        } else if (contract instanceof ShortTerm) {
            System.out.println("Short Term Contract created with ID: " + ((ShortTerm) contract).contractID);
        }

        scanner.close();
    }
}
