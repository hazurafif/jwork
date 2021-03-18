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
     * Recruiter untuk membuat Recruiter
     *
     * @param  recruiter berisi object recruiter
     * @return object recruiter
     */
    
    public Recruiter(int id, String name, String email, String phoneNumber, Location location){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public  String getEmail(){
        return email;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public Location getLocation(){
        return location;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public void setLocation(Location location){
        this.location = location;
    }
    
    public void printData(){
        System.out.println(getName());
    }
}

