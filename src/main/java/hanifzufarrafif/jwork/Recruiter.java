package hanifzufarrafif.jwork;

/**
 * Recruiter class untuk perekrut dan digunakan untuk mengatur segala data yang terkait dengan informasi perekrut atau rekrut pegawai
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
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
     * Constructor for objects of class Recruiter
     *
     * @param id = nilai inputan untuk variable id
     * @param name  = nilai inputan untuk variable name
     * @param email  = nilai inputan untuk variable email
     * @param phoneNumber = nilai inputan untuk variable phoneNumber
     * @param location = nilai inputan untuk variable location
     */
    public Recruiter(int id, String name, String email, String phoneNumber,
                     Location location)
    /** Digunakan sebuah keyword 'this'.
     * Tujuaanya untuk menyatakan atau mereferensikan variable yang ada didalam class itu sendiri*/
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
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
     * method getPhoneNumber untuk memperoleh data phoneNumber.
     * termasuk dalam method accessor (get)
     * @return id = mengembalikan nilai variabel
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    /**
     * method getLocation untuk memperoleh data location.
     * termasuk dalam method accessor (get)
     * @return id = mengembalikan nilai variabel
     */
    public Location getLocation()
    {
        return location;
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
     * method setEmail untuk menetapkan nilai variabel email.
     * termasuk dalam method mutator (set)
     * @param email digunakan sebagai inputan untuk variable
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    /**
     * method setName untuk menetapkan nilai variabel name.
     * termasuk dalam method mutator (set)
     * @param name digunakan sebagai inputan untuk variable
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * method setPhoneNumber untuk menetapkan nilai variabel phoneNumber.
     * termasuk dalam method mutator (set)
     * @param phoneNumber digunakan sebagai inputan untuk variable
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    /**
     * method setLocation untuk menetapkan nilai variabel location.
     * termasuk dalam method mutator (set)
     * @param location digunakan sebagai inputan untuk variable
     */
    public void setLocation(Location location)
    {
        this.location = location;
    }
    /**
     * method printData untuk dengan return void.
     * mencetak nilai variabel name
     */
    public String toString() {
        return "ID= "+id+"\nName= "+name+"\nPhoneNumber= "+phoneNumber+"\nLocation= "+location+"\n";
    }
}