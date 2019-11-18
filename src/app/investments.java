package app;
public class investments extends bankAccount{
    private double investmentsTotal;

    public investments(String brand, String name, String address, double total){
        super(brand, name, address, total);
        this.investmentsTotal = 0.0;
    }//end of constructor

    /**
     * Deposit fund into investemt account
     * @param amnt the anount you want to deposit to investment account
     */
    protected void addInvestments(double amnt){
        this.investmentsTotal += amnt;
        super.add(amnt);
    }

    /**
     * Withdraw funds from investment account
     * @param amnt the amount you want to withdraw from investment account
     */
    protected void subtractInvestments(double amnt){
        this.investmentsTotal += amnt;
        super.subtract(amnt);
    }

    /**
     * 
     * @return the account balance
     */
    protected double getInvestmentsTotal(){
        return this.investmentsTotal;
    }
}//end of investments