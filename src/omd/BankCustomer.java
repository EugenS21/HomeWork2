public class BankCustomer extends BankDetails
    implements ICreditCard{

    @Override
    public void getCreditNumber(int cardNumber) {
        setCreditNumber(cardNumber);
    }

    @Override
    public void getAvailableMoney(int availableMoney) {
        setAvailableMoney(availableMoney);
    }

    @Override
    public void getNameData(String clientData) {
        setNameData(clientData);
    }
}
