import javax.swing.JOptionPane;

public class AccountingApp_Dialog {
    public static void main(String[] args) {

        double ValueOfSupply = Double.parseDouble(JOptionPane.showInputDialog("Supply"));
        double VatRate = Double.parseDouble(JOptionPane.showInputDialog("Vat"));
        double ExpenseRate = 0.3;		// 30% 고정 수치로 가정

        double VAT = ValueOfSupply*VatRate;
        double Total = ValueOfSupply+ValueOfSupply*VatRate;
        double Expense = ValueOfSupply*ExpenseRate;
        double Income = ValueOfSupply-Expense;
        double Dividend1 = Income*Double.parseDouble(JOptionPane.showInputDialog("Div1"));
        double Dividend2 = Income*Double.parseDouble(JOptionPane.showInputDialog("Div2"));
        double Dividend3 = Income*Double.parseDouble(JOptionPane.showInputDialog("Div3"));

        System.out.println("Value of supply : "+ValueOfSupply);
        System.out.println("VAT : "+VAT);
        System.out.println("Total : "+Total);
        System.out.println("Expense : "+Expense);
        System.out.println("Income : "+Income);
        System.out.println("Dividend : "+Dividend1);
        System.out.println("Dividend : "+Dividend2);
        System.out.println("Dividend : "+Dividend3);

        // Dialog를 통해 ExpenseRate를 제외한 나머지 값을 전부 임의로 설정하기 위함
    }
}
