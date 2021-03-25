
/**
 * Enumeration class JobCategory - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum JobCategory
{
    WebDeveloper("Web Developer"),
    FrontEnd("Front End"), 
    BackEnd("Back End"),
    UI("UI"),
    UX("UX"),
    Devops("Devops"), 
    DataScientist("Data Scientist"), 
    DataAnalyst("Data Analys");
    
    private String category;

    private JobCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return category;
    }

    public static void main(String[] args) {
        JobCategory category1 = JobCategory.WebDeveloper;
        JobCategory category2 = JobCategory.FrontEnd;
        JobCategory category3 = JobCategory.BackEnd;
        JobCategory category4 = JobCategory.UI;
        JobCategory category5 = JobCategory.UX;
        JobCategory category6 = JobCategory.Devops;
        JobCategory category7 = JobCategory.DataScientist;
        JobCategory category8 = JobCategory.DataAnalyst;
        System.out.println(category1);
        System.out.println(category2);
        System.out.println(category3);
        System.out.println(category4);
        System.out.println(category5);
        System.out.println(category6);
        System.out.println(category7);
        System.out.println(category8);
    }
}
