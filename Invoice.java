import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

/**
 * Write a description of class Invoice here.
 *
 * @author Hanif Zufar Rafif
 * @version 18/03/2021
 */
public  abstract class Invoice
{
    // instance variables
    private int id;
    private Job job;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;

    /**
     * Constructor for objects of class Invoice
     *
     * @param id - merupakan nilai inputan untuk variable id
     * @param job - merupakan nilai inputan untuk variable job
     * @param date - merupakan nilai inputan untuk variable date (tanggal)
     * @param jobseeker - merupakan nilai inputan untuk variable jobseeker
     * @param invoiceStatus - merupakan nilai inputan untuk variable status
     */
    public Invoice(int id, Job job, Calendar date, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        this.id = id;
        this.job = job;
        this.date = date;
        this.jobseeker = jobseeker;
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * getId untuk mengambil id
     *
     * @return id
     */
    public int getId(){
        return id;
    }
    
    /**
     * getJob untuk mengambil Job
     *
     * @return Job
     */
    public Job getJob(){
        return job;
    }
    
    /**
     * getDate untuk mengambil date
     *
     * @return date
     */
    public Calendar getDate(){
        return date;
    }
    
    /**
     * getTotalFee untuk mengambil totalFee
     *
     * @return totalFee
     */
    public int getTotalFee(){
        return totalFee;
    }
    
    /**
     * getJobseeker untuk mengambil objek Jobseeker
     *
     * @return jobseeker
     */
    public Jobseeker getJobseeker(){
        return jobseeker;
    }
    
    public abstract PaymentType getPaymentType();
    
    /**
     * InvoiceStatus untuk mengambil objek InvoiceStatus
     *
     * @return invoiceStatus
     */
    public InvoiceStatus getInvoiceStatus(){
        return invoiceStatus;
    }
    
    /**
     * setId untuk mengisi id
     *
     * @param  id
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * setJob untuk mengisi Job
     *
     * @param Job
     */
    public void setJob(Job job){
        this.job = job;
    }
    
    /**
     * setDate untuk mengisi date
     *
     * @param date
     */
    public void setDate(Calendar date){
        this.date = Calendar.getInstance();
    }
    
    public void setDate(int year, int month, int dayOfMonth){
        this.date = new GregorianCalendar(year, month-1, dayOfMonth);
    }
    
    /**
     * setTotalFee untuk mengisi totalFee
     *
     * @param totalFee
     */
    public abstract void setTotalFee();
    
    /**
     * setJobseeker untuk mengisi objek Jobseeker
     *
     * @param Jobseeker objek jobseeker
     */
    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }
    
    /**
     * setInvoiceStatus untuk mengisi invoiceStatus
     *
     * @param invoiceStatus
     */
    public void setInvoiceStatus(InvoiceStatus invoiceStatus){
        this.invoiceStatus = invoiceStatus;
    }

    public abstract String toString();
}

