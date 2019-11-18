package app;
public class bankAccount{
    private String brand;
    private String name;
    private String address;
    private double total;


    public bankAccount(String brand, String name, String address, double total ){
        this.brand = brand;
        this.name = name;
        this.address = address;
        this.total = total;
    }//end of constructor

    protected void setBrand(String value){
        this.brand = value;
    }//end of setBrand

    protected void setName(String value){
        this.name = value;
    }//end of setName

    protected void setAddress(String value){
        this.address = value;
    }//end of setAddress

    protected void add(double value){
        this.total += value;
    }

    protected void subtract(double value){
        this.total -= value;
    }

    /**
     * Returns the Account balance summary
     * @return the account balance
     */
    protected double getBalance(){
        return this.total;
    }
}