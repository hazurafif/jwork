package hanifzufarrafif.jwork;

/**
 * Location class untuk mengatur perincian lokasi
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class Location
{
    private String province;
    private String city;
    private String description;
    /**
     * Constructor for objects of class Location
     * @param province = nilai input variabel province
     * @param city = nilai input variable city
     * @param description = nilai input untuk variable description

     * menggunakan metode keyword "this"
     */
    public Location (String province, String city, String description)
    /** menggunakan keyword 'this'.
     * Bertujuan untuk menyatakan atau mereferensikan variabel */
    {
        this.province = province;
        this.city = city;
        this.description = description;
    }
    /**
     * method getProvince, menambahkan data province
     * accessor (get)
     * @return province = mengembalikkan nilai yang ada didalam variable province
     */
    public String getProvince()
    {
        return province;
    }
    /**
     * method getCity, menambahkan data city
     * accessor (get)
     * @return city = mengembalikkan nilai yang ada didalam variable city
     */
    public String getCity()
    {
        return city;
    }
    /**
     * method getDescription, menambahkan data description
     * accessor (get)
     * @return description = mengembalikkan nilai yang ada didalam variable description
     */
    public String getDescription()
    {
        return description;
    }
    /**
     * method setProvince, menetapkan nilai variabel province
     * mutator (set)
     * @param province = sebagai inputan untuk variable province
     */
    public void setProvince(String province)
    {
        this.province = province;
    }
    /**
     * method setCity, menetapkan nilai variabel city
     * mutator (set)
     * @param city = sebagai inputan untuk variable city
     */
    public void setCity(String city)
    {
        this.city = city;
    }
    /**
     * method setDescription, menetapkan nilai variabel description
     * mutator (set)
     * @param description = sebagai inputan untuk variable description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    /**
     * method printData untuk dengan return void.
     * mencetak nilai variabel province
     */
    public String toString()
    {
        return "Province= "+province+"\nCity= "+city+"\nDescription= "+description+"\n";
    }
}