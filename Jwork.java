/**
 * Write a description of class Jwork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JWork
{
    public JWork(){
    }
    
    public static void main(String[] args) {
        Location location1 = new Location ("Jakarta", "Jakarta Pusat", "Dekat Mall");
        Recruiter recruiter1 = new Recruiter (1, "Hanif", "hanif.zufar@ui.ac.id", "085781726006", location1);
        Job job1 = new Job (1,"Junior Desainer",recruiter1,5000000,JobCategory.WebDeveloper);
        job1.printData();
    }
}
