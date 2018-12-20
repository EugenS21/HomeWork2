public class Main {
    public static void main(String[] args) {
        ICreditCard myCreditCard = new BankCustomer();
        myCreditCard.getAvailableMoney(100);
        myCreditCard.getCreditNumber(154);
        myCreditCard.getNameData("Name Surname");
    }

}
