public class CardPayment extends PaymentObject {
    
    @Override
    public boolean isPay(int amount) {
        System.out.println("Card Payment." + amount);
        return true;
    }
}
