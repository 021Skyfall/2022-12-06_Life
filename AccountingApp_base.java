public class AccountingApp_base {
    public static void main(String[] args) {

        System.out.println("Value of supply : "+10000);
        System.out.println("VAT : "+(10000*0.1));
        System.out.println("Total : "+(10000+10000*0.1));
        System.out.println("Expense : "+(10000*0.3));
        System.out.println("Income : "+(10000-10000*0.3));
        System.out.println("Dividend : "+(10000-10000*0.3)*0.5);
        System.out.println("Dividend : "+(10000-10000*0.3)*0.3);
        System.out.println("Dividend : "+(10000-10000*0.3)*0.2);
    }
}
