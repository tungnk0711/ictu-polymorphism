public class CardPayment extends PaymentObject {
    @Override
    boolean isPay(int amount) {
        System.out.println("Card Payment." + amount);
        return true;
    }

    public void getStatus(){
        System.out.println("Status Enable.");
    }
}
