/**
 * Write a description of class Job here.
 *
 * @author Hanif Zufar Rafif
 * @version 18/03/2021
 */
public class Job
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private Recruiter recruiter;
    private int fee;
    private String category;
    /**
     * Job untuk membuat Job
     *
     * @param  job berisi object job
     * @return object job
     */
    public Job(int id, String name, Recruiter recruiter, int fee, String category){
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;
    }

    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getFee(){
        return fee;
    }
    
    public String getCategory(){
        return category;
    }
    
    public Recruiter getRecruiter(){
        return recruiter;
    }
    
    public void setId(int id){
       this.id = id;
    }
    
    public void setName(String name){
       this.name = name;
    }
    
    public void setRecruiter(Recruiter recruiter){
        this.recruiter = recruiter;
    }
    
    public void setFee(int fee){
       this.fee = fee;
    }
    
    public void setCategory(String category){
        this.category = category;
    }
    
    public static void printData(){
    }
}
