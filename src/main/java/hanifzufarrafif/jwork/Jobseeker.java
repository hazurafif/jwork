package hanifzufarrafif.jwork;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


/**
 * Jobseeker Class, untuk pencari kerja dan digunakan untuk mengatur segala data yang terkait dengan detail orang pencari kerja.
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class Jobseeker
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;
    /**
     * Constructor for objects of class Jobseeker
     *
     * @param id = nilai inputan untuk variable id
     * @param name  = nilai inputan untuk variable name
     * @param email  = nilai inputan untuk variable email
     * @param password = nilai inputan untuk variable password
     * @param joinDate = nilai inputan untuk variable joinDate
     */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate)
    {
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

    public Jobseeker(int id, String name, String email, String password)
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
    }

    /**
     * method getId untuk memperoleh data id.
     * termasuk dalam method accessor (get)
     * @return id = mengembalikan nilai variabel
     */
    public int getId()
    {
        return id;
    }
    /**
     * method getName untuk memperoleh data name.
     * termasuk dalam method accessor (get)
     * @return id = mengembalikan nilai variabel
     */
    public String getName()
    {
        return name;
    }
    /**
     * method getEmail untuk memperoleh data email.
     * termasuk dalam method accessor (get)
     * @return id = mengembalikan nilai variabel
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * method getPassword untuk memperoleh data password.
     * termasuk dalam method accessor (get)
     * @return id = mengembalikan nilai variabel
     */
    public String getPassword()
    {
        return password;
    }
    /**
     * method getJoinDate untuk memperoleh data joinDate.
     * termasuk dalam method accessor (get)
     * @return id = mengembalikan nilai variabel
     */
    public Calendar getJoinDate()
    {
        return joinDate;
    }
    /**
     * method setId untuk menetapkan nilai variabel id.
     * termasuk dalam method mutator (set)
     * @param id digunakan sebagai inputan untuk variable
     */
    public void setId(int id)
    {
        this.id = id;
    }
    /**
     * method setName untuk menetapkan nilai variabel name.
     * termasuk dalam method mutator (set)
     * @param Name digunakan sebagai inputan untuk variable
     */
    public void setName(String Name)
    {
        this.name = name;
    }
    /**
     * method setEmail untuk menetapkan nilai variabel email.
     * termasuk dalam method mutator (set)
     * @param email digunakan sebagai inputan untuk variable
     */

    public void setEmail(String email){
        String emailRegex = "^[a-zA-Z0-9&*_~]+([.{1}]?[a-z]+)+@[a-z0-9]+([.]{1}[a-z]+)+([.]{1}[a-z]+)+";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            this.email = email;
        }
        else{
            this.email = "";
        }
    }
    /**
     * method setPassword untuk menetapkan nilai variabel password.
     * termasuk dalam method accessor (get)
     * @param password digunakan sebagai inputan untuk variable
     */
    public void setPassword(String password){
        String passRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
        Pattern pattern = Pattern.compile(passRegex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()){
            this.password = password;
        }
        else{
            this.password = "";
        }
    }
    /**
     * method setJoinDate untuk menetapkan nilai variabel joinDate.
     * termasuk dalam method accessor (get)
     * @param joinDate digunakan sebagai inputan untuk variable
     */
    public void setJoinDate(Calendar joinDate)
    {
        this.joinDate = joinDate;
    }
    /**
     * method setJoinDate untuk menetapkan nilai variabel joinDate.
     * termasuk dalam method accessor (get)
     * @param dayOfMonth digunakan sebagai inputan untuk variable
     */
    public void setJoinDate(int year, int month, int dayOfMonth)
    {
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    /**
     * method printData untuk dengan return void.
     * mencetak nilai variabel name
     */
    @Override
    public String toString()
    {
        if (this.joinDate == null) {
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = "
                    + getPassword()+"\n";
        } else {
            SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formattedDate.format(getJoinDate().getTime());
            return "ID= "+getId()+"\nNama= "+getName()+"\nEmail= "+getEmail()+"\nPassword= "+getPassword()+"\nJoin Date= "+date+"\n";
        }
    }
}
