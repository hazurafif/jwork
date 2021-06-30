package hanifzufarrafif.jwork;
import java.util.ArrayList;

/**
 * DatabaseInvoice class untuk rincian dan tempat penyimpanan data invoice dalam database
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class DatabaseInvoice {

    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    /**
     * method getBonus, mendapatkan job yang terdaftar dari database bonus
     * @return null = tidak ada nilai yang dikembalikan
     */
    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException
    {
        Invoice temp = null;
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()){
                temp = invoice;
            }
            else{
                temp =  null;
            }
        }
        if (temp == null){
            throw new InvoiceNotFoundException(id);
        }
        return temp;

    }

    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId)
    {
        ArrayList<Invoice> temp = null;
        ArrayList<Invoice> temp1 = new ArrayList<Invoice>();
        for (Invoice invoice: INVOICE_DATABASE) {
            if (jobseekerId == invoice.getJobseeker().getId()){
                temp = temp1;
            }
            else{
                temp =  null;
            }
        }
        return temp;
    }

    /**
     * method addBonus, menambahkan job ke database bonus
     *
     * @param jobSeekerId digunakan sebagai inputan untuk method bonus
     * @return false = mengembalikan nilai boolean "false"
     */
    public static ArrayList<Invoice> getInvoiceByJobSeeker(int jobSeekerId) {
        ArrayList<Invoice> temp = new ArrayList<Invoice>();
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (jobSeekerId == INVOICE_DATABASE.get(i).getJobseeker().getId()) {
                temp.add(INVOICE_DATABASE.get(i));
            }
        }
        return temp;
    }

    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException{
        for (Invoice invoicee : INVOICE_DATABASE) {
            if (invoicee.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }
    /**
     * method removeBonus, menghapus job dari database bonus
     *
     * @param id digunakan sebagai inputan untuk method bonus
     * @return false = mengembalikan nilai boolean "false"
     */
    public static boolean removeInvoice(int id) throws InvoiceNotFoundException{
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }
    /**
     * method getBonus, mendapatkan job yang terdaftar dari database bonus
     *
     * @return null = tidak ada nilai yang dikembalikan
     */

}
