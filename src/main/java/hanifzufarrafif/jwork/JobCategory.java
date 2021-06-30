package hanifzufarrafif.jwork;

/**
 * JobCategory Class enum untuk merilis/merinci pekerjaan apa aja yang ada
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
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
    DataAnalyst("Data Analyst");

    private final String category;

    private JobCategory(String category){
        this.category = category;
    }
    public String toString() {
        return category;
    }

}