package hanifzufarrafif.jwork;

/**
 * Job class untuk perincian database pekerjaan
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class Job
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int fee;
    private JobCategory category;
    private Recruiter recruiter;
    /**
     * Constructor for objects of class Job
     * @param id = nilai input variabel id
     * @param name = nilai input variable name
     * @param fee = nilai input untuk variable fee
     * @param recruiter = nilai inputan  variable recruiter
     * @param category = nilai inputan  variable category
     */
    public Job(int id, String name, Recruiter recruiter, int fee, JobCategory
            category)
    /** menggunakan keyword 'this'.
     * Bertujuan untuk menyatakan atau mereferensikan variabel */
    {
        this.id = id;
        this.recruiter = recruiter;
        this.name = name;
        this.fee = fee;
        this.category = category;
    }

    /**
     * method getId, menambahkan data id
     * accessor (get)
     * @return id = mengembalikkan nilai yang ada didalam variable id
     */
    public int getId()
    {
        return id;
    }
    /**
     * method getName, menambahkan data name
     * accessor (get)
     * @return name = mengembalikkan nilai yang ada didalam variable name
     */
    public String getName()
    {
        return name;
    }
    /**
     * method getFee, menambahkan data fee
     * accessor (get)
     * @return fee = mengembalikkan nilai yang ada didalam variable fee
     */
    public int getFee()
    {
        return fee;
    }
    /**
     * method getCategory, menambahkan data category
     * accessor (get)
     * @return category = mengembalikkan nilai yang ada didalam variable category
     */
    public JobCategory getCategory()
    {
        return category;
    }
    /**
     * method getRecruiter, menambahkan data recruiter
     * accessor (get)
     * @return recruiter = mengembalikkan nilai yang ada didalam variable recruiter
     *
     */
    public Recruiter getRecruiter()
    {
        return recruiter;
    }
    /**
     * method setId, menetapkan nilai variabel id
     * mutator (set)
     * @param id = sebagai inputan untuk variable id
     */
    public void setId(int id)
    {
        this.id = id;
    }
    /**
     * method setName, menetapkan nilai variabel name
     * mutator (set)
     * @param name = sebagai inputan untuk variable name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * method setRecruiter, menetapkan nilai variabel recruiter
     * mutator (set)
     * @param recruiter = sebagai inputan untuk variable recruiter
     */
    public void setRecruiter(Recruiter recruiter)
    {
        this.recruiter = recruiter;
    }
    /**
     * method setFee, menetapkan nilai variabel fee
     * mutator (set)
     * @param fee = sebagai inputan untuk variable fee
     */
    public void setFee(int fee)
    {
        this.fee = fee;
    }
    /**
     * method setCategory, menetapkan nilai variabel category
     * mutator (set)
     * @param category = sebagai inputan untuk variable category
     */
    public void setCategory(JobCategory category)
    {
        this.category = category;
    }
    /**
     * method printData untuk dengan return void.
     * mencetak data sesuai variabel
     */
    public String toString()
    {
        return "ID= "+id+"\nNama= "+name+"\nRecruiter= "+recruiter.getName()+"\nRecruiter= "+recruiter.getLocation().getCity()+"\nFee= "+getFee()+"\nCategory="+category+"\n";
    }
}