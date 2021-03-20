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
     * @param  id - merupakan nilai inputan untuk variable id
     * @param name - merupakan nilai inputan untuk variable name
     * @param fee - merupakan nilai inputan untuk variable fee
     * @param category - merupakan nilai inputan untuk variable category
     * @param recruiter - merupakan nilai inputan untuk variable recruiter
     * @return object job
     */
    public Job(int id, String name, Recruiter recruiter, int fee, String category){
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
    public String getCategory(){
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
    public void setCategory(String category){
        this.category = category;
    }
    
    /**
     * printData untuk memprint data
     *
     * @return
     */
    public void printData(){
        System.out.println(getId());
        System.out.println(getName());
        System.out.println(getRecruiter());
        System.out.println(getFee());
        System.out.println(getCategory());
    }
}
