//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        CardPayment cardPayment = new CardPayment();
        ApprovalPayment approvalPayment1 = new ApprovalPayment();
        approvalPayment1.approval(cardPayment, 2000);

        CashPayment cashPayment = new CashPayment();
        ApprovalPayment approvalPayment2 = new ApprovalPayment();
        approvalPayment2.approval(cashPayment, 4000);

        EWalletPayment eWalletPayment = new EWalletPayment();
        ApprovalPayment approvalPayment3 = new ApprovalPayment();
        approvalPayment3.approval(eWalletPayment, 6000);

        PaymentObject paymentObject = new CardPayment();
        CardPayment cardPayment1 = (CardPayment)paymentObject;
        cardPayment1.getStatus();
    }
}