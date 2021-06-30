package hanifzufarrafif.jwork;

/**
 *  InvoiceStatus class enum untuk merinci status dalam invoice
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public enum InvoiceStatus
{
    OnGoing("OnGoing"),
    Finished("Finished"),
    Cancelled("Cancelled");

    private final String status;

    private InvoiceStatus(String status){
        this.status = status;
    }

    public String toString() {
        return status;
    }
}
