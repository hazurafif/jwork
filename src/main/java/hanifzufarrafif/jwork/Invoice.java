package hanifzufarrafif.jwork;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

/**
 * Invoice class untuk mengatur dan merinci pembayaran perekrutan pekerjaan
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private ArrayList<Job> jobs;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;

    /**
     * Constructor for objects of class Invoice
     * @param id = nilai input variabel id
     * @param jobs = nilai input variable job
     * @param jobseeker = nilai inputan  variable jobseeker
     */
    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    /** menggunakan keyword 'this'.
     * Bertujuan untuk menyatakan atau mereferensikan variabel */
    {
        this.id = id;
        this.jobs = jobs;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.invoiceStatus = InvoiceStatus.OnGoing;
        this.date = Calendar.getInstance();
    }

    /**
     * method getId, menambahkan data id
     * accessor (get)
     * @return id = mengembalikkan nilai yang ada didalam variable id
     */
    public int getId(){
        return id;
    }
    /**
     * method getJob, menambahkan pekerjaan pada id tertentu
     * accessor (get)
     * @return job = mengembalikkan nilai yang ada didalam variable job
     */
    public ArrayList<Job> getJobs(){
        return jobs;
    }
    /**
     * method getDate, menambahkan waktu rekrutan
     * accessor (get)
     * @return date = mengembalikkan nilai yang ada didalam variable date
     *
     */
    public Calendar getDate(){
        return date;
    }
    /**
     * method getTotalFee, menambahkan pembayaran rekruan
     * accessor (get)
     * @return totalFee = mengembalikkan nilai yang ada didalam variable totalFee
     */
    public int getTotalFee(){
        return totalFee;
    }
    /**
     * method getJobseeker, menambahkan perekrut
     * accessor (get)
     * @return jobseeker = mengembalikkan nilai yang ada didalam variable jobseeker
     */
    public Jobseeker getJobseeker(){
        return jobseeker;
    }
    /**
     * method getPaymentType, menambahkan tipe paymentType
     * abstract
     */
    public abstract PaymentType getPaymentType();
    /**
     * method getInvoiceStatus, menambahkan invoiceStatus invoice
     * accessor (get)
     * @return invoiceStatus = mengembalikkan nilai yang ada didalam variable invoiceStatus
     */
    public InvoiceStatus getInvoiceStatus(){
        return invoiceStatus;
    }
    /**
     * method setId, menetapkan nilai variabel id
     * mutator (set)
     * @param id = sebagai inputan untuk variable id
     */
    public void setId(int id){
        this.id = id;
    }
    /**
     * method setJob, menetapkan nilai variabel job
     * mutator (set)
     * @param jobs = sebagai inputan untuk variable job
     */
    public void setJobs(ArrayList<Job> jobs){
        this.jobs = jobs;
    }
    /**
     * method setDate, menetapkan nilai variabel date
     * mutator (set)
     * @param date = sebagai inputan untuk variable date
     */
    public void setDate(Calendar date){
        this.date = date;
    }
    /**
     * method setDate, menetapkan nilai variabel date
     * mutator (set)
     * @param year, month, dayOfMonth = sebagai inputan untuk variable date
     */
    public void setDate(int year, int month, int dayOfMonth)
    {
        this.date = new GregorianCalendar(year, month -1, dayOfMonth);
    }
    /**
     * method setTotalFee, menetapkan nilai totalFee
     * abstract
     */
    public abstract void setTotalFee();
    /**
     * method setJobseeker, menetapkan nilai jobseeker
     * mutator (set)
     * @param jobseeker = sebagai inputan untuk variable jobseeker
     */
    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }

    /**
     * method setJobseeker, menetapkan nilai jobseeker
     * mutator (set)
     * @param invoiceStatus = sebagai inputan untuk variable jobseeker
     */
    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }
    /**
     * method printData, mencetak data
     * abstract
     */
    @Override
    public abstract String toString();
}
