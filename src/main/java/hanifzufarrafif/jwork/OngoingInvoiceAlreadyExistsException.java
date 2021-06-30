package hanifzufarrafif.jwork;

/**
 * OngoingInvoiceAlreadyExistsException class untuk exception saat ada OngoingInvoice
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class OngoingInvoiceAlreadyExistsException extends Exception{
    private Invoice invoice_error;

    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input)
    {
        super("Status Ongoing Invoice: ");
        invoice_error = invoice_input;
    }

    public String getMessage()
    {
        return super.getMessage() + invoice_error.getInvoiceStatus() + " not Found";
    }
}