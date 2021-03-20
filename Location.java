/**
 * Write a description of class Location here.
 *
 * @author Hanif Zufar Rafif
 * @version 18/03/2021
 */
public class Location
{

    private String province;
    private String city;
    private String description;
    
    /**
     * Location untuk membuat Location
     *
     * @param province - merupakan nilai inputan untuk variable province
     * @param city - merupakan nilai inputan untuk variable city
     * @param description - merupakan nilai inputan untuk variable description
     * @return object location
     */
    public Location(String province, String city, String description){
        this.province = province;
        this.city = city;
        this.description = description;
    }
    
    /**
     * getProvince untuk membuat province
     *
     * @return province
     */
    public String getProvince(){
        return province;
    }

    /**
     * getCity untuk membuat city
     *
     * @return city
     */
    public String getCity(){
        return city;
    }
    
    /**
     * getDescription untuk membuat description
     *
     * @return description
     */
    public  String getDescription(){
        return description;
    }
    
    /**
     * setProvince untuk mengisi province
     * 
     * @param province
     * @return province
     */
    public void setProvince(String province){
        this.province = province;
    }
    
    /**
     * setCity untuk mengisi city
     * 
     * @param city
     * @return city
     */
    public void setCity(String city){
        this.city = city;
    }
    
    /**
     * setDescription untuk mengisi description
     * 
     * @param description
     * @return description
     */
    public void setDescription(String description){
        this.description = description;
    }
    
    /**
     * printData untuk memprint data
     *
     * @return
     */    
    public void printData(){
        System.out.println(getProvince());
        System.out.println(getCity());
        System.out.println(getDescription());
    }
    
}
