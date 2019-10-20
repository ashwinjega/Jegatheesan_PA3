class SavingsAccount{
    private static double annualInterestRate = 0.0;
    private double savingsBalance;
    public SavingsAccount(double amount){
        savingsBalance = amount;
    }


    public void calculateMonthlyInterest(){
        double inter;
        inter = (savingsBalance * (annualInterestRate/100))/12;
        savingsBalance += inter;
    }

    public static void modifyInterestRate(double Rate){
        annualInterestRate = Rate;
    }


    public void Display(){
        System.out.printf("$%.2f", savingsBalance);
    }



}