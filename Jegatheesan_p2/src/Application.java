public class Application {


    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(4.0);
        System.out.println("Month \t Saver1 \t Saver2 ");


        for (int i = 1; i < 13; i++)
        {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.print("Month " + i + ": \t");
            saver1.Display();
            System.out.print("\t");
            saver2.Display();
            System.out.println();
        }
        SavingsAccount.modifyInterestRate(5.0);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("\nThe new rate 5.0 has been set.\n");
        System.out.print("Month 13 \t");
        saver1.Display();
        System.out.print("\t");
        saver2.Display();

    }




}