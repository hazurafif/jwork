/**
 * Write a description of class Recruiter here.
 *
 * @author Hanif Zufar Rafif
 * @version 18/03/2021
 */

public class Recruiter
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    
    /**
     * Recruiter untuk membuat recruiter
     *
     * @param id - merupakan nilai inputan untuk variable id
     * @param name - merupakan nilai inputan untuk variable name
     * @param email - merupakan nilai inputan untuk variable email
     * @param phoneNumber - merupakan nilai inputan untuk variable phoneNumber
     * @param location - merupakan nilai inputan untuk object location
     * @return object Recruiter
     */
    public Recruiter(int id, String name, String email, String phoneNumber, Location location){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
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
     * getEmail untuk mengambil email
     *
     * @return email
     */
    public  String getEmail(){
        return email;
    }
    
    /**
     * getPhoneNumber untuk mengambil PhoneNumber
     *
     * @return PhoneNumber
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    /**
     * getLocation untuk mengambil getLocation
     *
     * @return location
     */
    public Location getLocation(){
        return location;
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
     * setEmail untuk mengisi email
     *
     * @param email
     * @return email
     */
    public void setEmail(String email){
        this.email = email;
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
     * setPhoneNumber untuk mengisi PhoneNumber
     *
     * @param PhoneNumber
     * @return PhoneNumber
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * setLocation untuk mengisi Location
     *
     * @param Location object location
     * @return location
     */
    public void setLocation(Location location){
        this.location = location;
    }
    
    public String toString(){
        return "Id = " +getId()+ "\nNama = " +getName()+"\nEmail = " +getEmail()+"\nLocation = " +getLocation();
    }
}

