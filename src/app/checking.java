package app; 
public class checking extends bankAccount{
    private double checkingTotal;

    public checking(String brand, String name, String address, double total){
        super(brand, name, address, total);
        this.checkingTotal = 0.0;
    }//end of constructor

    /**
     * Add funds to checking account
     * @param amnt the amount you want to add to your checking account
     */
    protected void addChecking(double amnt){
        this.checkingTotal += amnt;
        super.add(amnt);
    }
    /**
     * Withdraw funds from checking account
     * @param amnt the amount yow want to withdraw 
     */
    protected void subtractChecking(double amnt){
        this.checkingTotal -= amnt;
        super.subtract(amnt);
    }
    /**
     * 
     * @return the checking account balance
     */
    protected double getCheckingTotal(){
        return this.checkingTotal;
    }

}//end of checking