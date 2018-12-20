public class BankDetails {
    public int availableMoney;
    public int accountNumber;
    public String clientInfo;

    public void setCreditNumber(int number) {
        this.accountNumber = number;
    }

    public void setAvailableMoney(int money) {
        this.availableMoney = money;
    }

    public void setNameData(String nameSurname) {
        this.clientInfo = nameSurname;
    }
}
