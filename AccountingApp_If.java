public class AccountingApp_If {
    public static void main(String[] args) {

        double ValueOfSupply = Double.parseDouble(args[0]); // 나머지는 고정값으로
        double VatRate = 0.1;
        double ExpenseRate = 0.3;
        double VAT = ValueOfSupply*VatRate;
        double Total = ValueOfSupply+ValueOfSupply*VatRate;
        double Expense = ValueOfSupply*ExpenseRate;
        double Income = ValueOfSupply-Expense;

        double Dividend1;
        double Dividend2;
        double Dividend3;

        if(Income > 10000.0) {
            Dividend1 = Income*0.5;
            Dividend2 = Income*0.3;
            Dividend3 = Income*0.2;
        } else {
            Dividend1 = Income*1.0;
            Dividend2 = Income*0;
            Dividend3 = Income*0;
        }

        System.out.println("Value of supply : "+ValueOfSupply);
        System.out.println("VAT : "+VAT);
        System.out.println("Total : "+Total);
        System.out.println("Expense : "+Expense);
        System.out.println("Income : "+Income);
        System.out.println("Dividend : "+Dividend1);
        System.out.println("Dividend : "+Dividend2);
        System.out.println("Dividend : "+Dividend3);

        // Arguments를 통해 ValueOfSupply 를 제외한 나머지는 고정값으로 두고 ValueOfSupply만 변경하기 위함
    }
}
