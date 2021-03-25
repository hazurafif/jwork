
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author Hanif Zufar Rafif
 * @version 25/03/2021
 */
public enum PaymentType
{
    BankPayment("Bank Payment"), 
    EwalletPayment("Ewallet Payment");
    
    private String type;
    
    private PaymentType(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
    
    public static void main(String[] args) {
        PaymentType type1 = PaymentType.BankPayment;
        PaymentType type2 = PaymentType.EwalletPayment;
        System.out.println(type1);
        System.out.println(type2);
    }
}
