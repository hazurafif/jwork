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
    private String date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;

    /**
     * Constructor for objects of class Invoice
     *
     * @param  id - merupakan nilai inputan untuk variable id
     * @param idJob - merupakan nilai inputan untuk variable idJob
     * @param totalFee - merupakan nilai inputan untuk variable totalFee
     * @param jobseeker - merupakan nilai inputan untuk variable jobseeker
     * @return object Invoice
     */
    public Invoice(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
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
    public String getDate(){
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
     * setJob untuk mengambil Job
     *
     * @param Job
     */
    public void setJob(Job job){
        this.job = job;
    }
    
    /**
     * setDate untuk mengambil date
     *
     * @param date
     */
    public void setDate(String date){
        this.date = date;
    }
    
    /**
     * setTotalFee untuk mengambil totalFee
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

    /**
     * printData untuk memprint data
     *
     */
    public abstract void printData();
}
