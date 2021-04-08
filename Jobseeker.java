import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Write a description of class Jobseeker here.
 *
 * @author Hanif Zufar Rafif
 * @version 18/03/2021
 */
public class Jobseeker
{
    // instance variables
    private int id;
    private String name;
    private String email;
    private String password;
    public Calendar joinDate;
    
    /**
     * Constructor for objects of class Jobseeker
     *
     * @param id merupakan nilai inputan untuk variable id
     * @param name  merupakan nilai inputan untuk variable name
     * @param email  merupakan nilai inputan untuk variable email
     * @param password merupakan nilai inputan untuk variable password
     * @param joinDate merupakan nilai inputan untuk variable joinDate
     */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate){
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }
    
    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth) {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    public Jobseeker(int id, String name, String email, String password){
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
    }
    
    /**
     * getId untuk mengambil Id
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
    public Calendar getJoinDate(){
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
        String regex = "^[a-zA-Z0-9&*_~]+([\\.{1}]?[a-z]+)+@[a-z0-9]+([\\.]{1}[a-z]+)\\S+(?!.*?\\.\\.)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            this.email = email;
        }
        else{
            this.email = "";
        }
    }

    /**
     * setPassword untuk mengambil password
     *
     * @param password
     * @return password
     */
    public void setPassword(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()){
            this.password = password;
        }
        else{
            this.password = "";
        }
    }

    /**
     * setJoinDate untuk mengambil joinDate
     * 
     * @param joinDate
     * @return joinDate
     */ 
    public void setJoinDate(Calendar joinDate){
        this.joinDate = joinDate;
    }
    
    public void setJoinDate(int year, int month, int dayOfMonth){
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    @Override
    public String toString() {
        if (this.joinDate == null) {
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "+ getPassword();
        } else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getJoinDate().getTime());
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "+ getPassword() + "\nJoin Date = " + date;
        }
    }
}
