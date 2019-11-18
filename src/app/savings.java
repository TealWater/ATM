package app;
public class savings extends bankAccount{
    private double savingsTotal;

    public savings(String brand, String name, String address, double total){
        super(brand, name, address, total);
        this.savingsTotal = 0.0;
    }//end of constructor

    /**
     * Deposit funds to savings account
     * @param amnt you want to deposit into savings account
     */
    public void addSavings(double amnt){
        this.savingsTotal += amnt;
        super.add(amnt);
    }

    /**
     * Withdraw funds from savings account
     * @param amnt you want to withdraw from savings account
     */
    public void subtractSavings(double amnt){
        this.savingsTotal += amnt;
        super.subtract(amnt);
    }

    /**
     * Account balance summary
     * @return savings account balance
     */
    public double getSavingsTotal(){
        return this.savingsTotal;
    }

}//end of savings