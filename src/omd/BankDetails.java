public class BankDetails {
    private int availableMoney;
    private int accountNumber;
    private String clientInfo;

    private ICreditCard newCreditCard;


    public void setCreditNumber() {
        this.accountNumber = newCreditCard.getCreditNumber();
    }

    public void setAvailableMoney() {
        this.availableMoney = newCreditCard.getAvailableMoney();
    }

    public void setNameData(String nameSurname) {
        this.clientInfo = newCreditCard.getNameData();
    }
}
