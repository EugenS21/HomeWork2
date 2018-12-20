public class BankCustomer extends BankDetails
    implements ICreditCard{

    @Override
    public int getCreditNumber() {
        return 100;
    }

    @Override
    public int getAvailableMoney() {
        return 0;
    }

    @Override
    public String getNameData() {
        return "Default Data";
    }
}
