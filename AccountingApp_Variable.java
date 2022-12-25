public class AccountingApp_Variable {
    public static void main(String[] args) {

        double ValueOfSupply = 100000.0;
        double VatRate = 0.1;
        double ExpenseRate = 0.3;
        double VAT = ValueOfSupply*VatRate;
        double Total = ValueOfSupply+ValueOfSupply*VatRate;
        double Expense = ValueOfSupply*ExpenseRate;
        double Income = ValueOfSupply-Expense;

        double Dividend1 = Income*0.5;
        double Dividend2 = Income*0.3;
        double Dividend3 = Income*0.2;

        System.out.println("Value of supply : "+ValueOfSupply);
        System.out.println("VAT : "+VAT);
        System.out.println("Total : "+Total);
        System.out.println("Expense : "+Expense);
        System.out.println("Income : "+Income);
        System.out.println("Dividend : "+Dividend1);
        System.out.println("Dividend : "+Dividend2);
        System.out.println("Dividend : "+Dividend3);

    }
}
