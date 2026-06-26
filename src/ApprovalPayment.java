public class ApprovalPayment {

    /*public void approvalCardPayment(CardPayment cardPayment, int amount) {
        if (cardPayment.isPay(amount)) {
            System.out.println("Approval.");
        }
    }

    public void approvalCashPayment(CashPayment cashPayment, int amount) {
        if (cashPayment.isPay(amount)) {
            System.out.println("Approval.");
        }
    }

    public void approvalEWalletPayment(EWalletPayment eWalletPayment, int amount) {
        if (eWalletPayment.isPay(amount)) {
            System.out.println("Approval.");
        }
    }*/

    public void approvalPayment(PaymentObject paymentObject, int amount) {
        if (paymentObject.isPay(amount)) {
            System.out.println("Approval.");
        }
    }

}
