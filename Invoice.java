/**
 * Write a description of class Invoice here.
 *
 * @author Hanif Zufar Rafif
 * @version 18/03/2021
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;
    private PaymentType paymentType;
    private InvoiceStatus status;

    /**
     * Invoice untuk membuat Invoice
     *
     * @param  id - merupakan nilai inputan untuk variable id
     * @param idJob - merupakan nilai inputan untuk variable idJob
     * @param totalFee - merupakan nilai inputan untuk variable totalFee
     * @param jobseeker - merupakan nilai inputan untuk variable jobseeker
     * @return object Invoice
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker, PaymentType paymentType, InvoiceStatus status)
    {
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.paymentType = paymentType;
        this.status = status;
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
     * getIdJob untuk mengambil idJob
     *
     * @return idJob
     */
    public int getIdJob(){
        return idJob;
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
    
    public PaymentType getPaymentType(){
        return paymentType;
    }
    
    public InvoiceStatus getInvoiceStatus(){
        return status;
    }
    
    /**
     * setId untuk mengisi id
     *
     * @param  id
     * @return id
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * setIdJob untuk mengambil idJob
     *
     * @param idJob
     * @return idJob
     */
    public void setIdJob(int idJob){
        this.idJob = idJob;
    }
    
    /**
     * setDate untuk mengambil date
     *
     * @param date
     * @return date
     */
    public void setDate(String date){
        this.date = date;
    }
    
    /**
     * setTotalFee untuk mengambil totalFee
     *
     * @param totalFee
     * @return totalFee
     */
    public void setTotalFee(int totalFee){
        this.totalFee = totalFee;
    }
    
    /**
     * setJobseeker untuk mengisi objek Jobseeker
     *
     * @param Jobseeker objek jobseeker
     * @return jobseeker
     */
    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }
    
    public void setPaymentType(PaymentType paymentType){
        this.paymentType = paymentType;
    }
    
    public void setInvoiceStatus(InvoiceStatus status){
        this.status = status;
    }

    /**
     * printData untuk memprint data
     *
     * @return
     */
    public void printData(){
        System.out.println("========== INVOICE ==========");
        System.out.println("ID: "+id);
        System.out.println("ID Job: "+idJob);
        System.out.println("tanggal: "+date);
        System.out.println("Seeker: "+jobseeker.getName());
        System.out.println("Fee: "+totalFee);
        System.out.println("Status: "+status);
    }
}
