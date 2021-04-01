
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
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
