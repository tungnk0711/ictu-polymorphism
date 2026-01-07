public class ApprovalPayment {
    /*public void approval(PaymentObject paymentObject, int amount){
        if(paymentObject.isPay(amount)){
            System.out.println("Approval.");
        }
    }*/

    /*public void approval1(CardPayment cardPayment, int amount) {
        if (cardPayment.isPay(amount)) {
            System.out.println("Approval.");
        }
    }

    public void approval2(CashPayment cashPayment, int amount) {
        if (cashPayment.isPay(amount)) {
            System.out.println("Approval.");
        }
    }*/

    public void approval(PaymentObject paymentObject, int amount) {
        if (paymentObject.isPay(amount)) {
            System.out.println("Approval.");
        }
    }
}
