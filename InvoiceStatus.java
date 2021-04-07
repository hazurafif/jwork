
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author Hanif Zufar Rafif
 * @version 27/03/2021
 */
public enum InvoiceStatus
{
    OnGoing("OnGoing"), 
    Finished("Finished"),
    Cancelled("Cancelled");
    
    private String status;
    
    private InvoiceStatus(String status){
        this.status = status;
    }
    
    public String toString(){
        return status;
    }
}
