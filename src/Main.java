//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CardPayment cardPayment = new CardPayment();
        CashPayment cashPayment = new CashPayment();
        EWalletPayment eWalletPayment = new EWalletPayment();
        ApprovalPayment approvalPayment = new ApprovalPayment();
        
        approvalPayment.approvalPayment(cardPayment, 2000);
        approvalPayment.approvalPayment(cashPayment, 4000);
        approvalPayment.approvalPayment(eWalletPayment, 6000);

       
    }
}