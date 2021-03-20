/**
 * Write a description of class Jobseeker here.
 *
 * @author Hanif Zufar Rafif
 * @version 18/03/2021
 */
public class Jobseeker
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;
    
    /**
     * Jobseeker untuk membuat Jobseeker
     *
     * @param  jobseeker berisi object jobseeker
     * @return object jobseeker
     */
    public Jobseeker(int id, String name, String email, String password, String joinDate){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }

    /**
     * getId untuk mengisi Id
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
     * getEmail untuk mengambil email
     *
     * @return email
     */
    public String getEmail(){
        return email;
    }
    
    /**
     * getPassword untuk mengambil password
     *
     * @return password
     */
    public String getPassword(){
        return password;
    }
    
    /**
     * getJoinDate untuk mengambil joinDate
     *
     * @return joinDate
     */    
    public String getJoinDate(){
        return joinDate;
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
     * setEmail untuk mengisi email
     *
     * @param email
     * @return email
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * setPassword untuk mengambil password
     *
     * @param password
     * @return password
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * setJoinDate untuk mengambil joinDate
     * 
     * @param joinDate
     * @return joinDate
     */ 
    public void setJoinDate(String joinDate){
        this.joinDate = joinDate;
    }
    
    public void printData(){
        System.out.println(getId());
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println(getPassword());
        System.out.println(getJoinDate());
    }
}
