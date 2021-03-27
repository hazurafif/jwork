
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
    /*
    public static void main(String[] args) {
        InvoiceStatus status1 = InvoiceStatus.OnGoing;
        InvoiceStatus status2 = InvoiceStatus.Finished;
        InvoiceStatus status3 = InvoiceStatus.Cancelled;
        System.out.println(status1);
        System.out.println(status2);
        System.out.println(status3);
    }*/
}
