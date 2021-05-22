package hanifzufarrafif.jwork;
/**
 * Write a description of class Job here.
 *
 * @author Hanif Zufar Rafif
 * @version 18/03/2021
 */
public class Job
{
    // instance variables
    private int id;
    private String name;
    private Recruiter recruiter;
    private int fee;
    private JobCategory category;
    
    /**
     * Constructor for objects of class Job
     *
     * @param  id - merupakan nilai inputan untuk variable id
     * @param name - merupakan nilai inputan untuk variable name
     * @param fee - merupakan nilai inputan untuk variable fee
     * @param category - merupakan nilai inputan untuk variable category
     * @param recruiter - merupakan nilai inputan untuk variable recruiter
     * @return object job
     */
    public Job(int id, String name, Recruiter recruiter, int fee, JobCategory category){
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;
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
     * getName untuk mengambil name
     *
     * @return name
     */
    public String getName(){
        return name;
    }
    
    /**
     * getFee untuk mengambil fee
     *
     * @return fee
     */
    public int getFee(){
        return fee;
    }
    
    /**
     * getCategory untuk mengambil category
     *
     * @return category
     */
    public JobCategory getCategory(){
        return category;
    }
    
    /**
     * getRecruiter untuk mengambil recruiter
     *
     * @return recruiter
     */
    public Recruiter getRecruiter(){
        return recruiter;
    }
    
    /**
     * setId untuk mengisi Id
     * 
     * @param id
     * @return id
     */
    public void setId(int id){
       this.id = id;
    }
    
    /**
     * setName untuk mengisi name
     *
     * @param name
     * @return name
     */
    public void setName(String name){
       this.name = name;
    }
    
    /**
     * setRecruiter untuk mengisi recruiter
     *
     * @param Recruiter berisi object recruiter
     * @return recruiter
     */
    public void setRecruiter(Recruiter recruiter){
        this.recruiter = recruiter;
    }
    
    /**
     * setFee untuk mengisi fee
     *
     * @param fee
     * @return fee
     */
    public void setFee(int fee){
       this.fee = fee;
    }
    
    /**
     * setCategory untuk mengisi category
     *
     * @param category
     * @return category
     */
    public void setCategory(JobCategory category){
        this.category = category;
    }
    
    @Override
    public String toString(){
        return "Id = " +getId()+ "\nNama = " +getName()+"\nRecruiter = " +recruiter.getName()+ "\nCity = "+recruiter.getLocation().getCity()+ "\nFee = " +getFee()+ "\nCategory = " +getCategory();
    }
}