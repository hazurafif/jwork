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

    /**
     * Invoice untuk membuat Invoice
     *
     * @param  invoice berisi object invoice
     * @return object invoice
     */
    
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker)
    {
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
    }

    public int getId(){
        return id;
    }
    
    public int getIdJob(){
        return idJob;
    }
    
    public String getDate(){
        return date;
    }
    
    public int getTotalFee(){
        return totalFee;
    }
    
    public Jobseeker getJobseeker(){
        return jobseeker;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setIdJob(int idJob){
        this.idJob = idJob;
    }
    
    public void setDate(String date){
        this.date = date;
    }
    
    public void setTotalFee(int totalFee){
        this.totalFee = totalFee;
    }
    
    public void setJobseeker(Jobseeker jobseeker){
        this.jobseeker = jobseeker;
    }
    
    public void printData(){
    }
}
