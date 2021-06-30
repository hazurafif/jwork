package hanifzufarrafif.jwork;

/**
 * InvoiceNotFoundException class untuk exception saat tidak ada invoice
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class InvoiceNotFoundException extends Exception{
    private int invoice_error;

    public InvoiceNotFoundException(int invoice_input)
    {
        super("Invoice ID: ");
        invoice_error = invoice_input;
    }

    public String getMessage()
    {
        return super.getMessage() + invoice_error + " not Found";
    }
}
