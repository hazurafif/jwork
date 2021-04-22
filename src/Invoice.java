import java.util.ArrayList;
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
    private ArrayList<Job> jobs;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;

    /**
     * Constructor for objects of class Invoice
     *
     * @param id - merupakan nilai inputan untuk variable id
     * @param jobs - merupakan nilai inputan untuk variable job
     * @param jobseeker - merupakan nilai inputan untuk variable jobseeker
     */
    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        this.id = id;
        this.jobs = jobs;
        this.jobseeker = jobseeker;
        this.date = Calendar.getInstance();
        this.invoiceStatus = InvoiceStatus.OnGoing;
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
    public ArrayList<Job> getJobs(){
        return jobs;
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
     * @param jobs
     */
    public void setJobs(ArrayList<Job> jobs){
        this.jobs = jobs;
    }
    
    /**
     * setDate untuk mengisi date
     *
     * @param date
     */
    public void setDate(Calendar date){
        this.date = date;
    }
    
    public void setDate(int year, int month, int dayOfMonth){
        this.date = new GregorianCalendar(year, month-1, dayOfMonth);
    }
    
    /**
     * setTotalFee untuk mengisi totalFee
     */
    public abstract void setTotalFee();
    
    /**
     * setJobseeker untuk mengisi objek Jobseeker
     *
     * @param jobseeker objek jobseeker
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

