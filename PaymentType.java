
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author Hanif Zufar Rafif
 * @version 25/03/2021
 */
public enum PaymentType
{
    BankPayment("BankPayment"), 
    EwalletPayment("EwalletPayment");
    
    private String type;
    
    private PaymentType(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}
