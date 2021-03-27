
/**
 * Enumeration class JobCategory - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum JobCategory
{
    WebDeveloper("WebDeveloper"),
    FrontEnd("FrontEnd"), 
    BackEnd("BackEnd"),
    UI("UI"),
    UX("UX"),
    Devops("Devops"), 
    DataScientist("DataScientist"), 
    DataAnalyst("DataAnalyst");
    
    private String category;

    private JobCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return category;
    }
}
