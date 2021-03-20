/**
 * Write a description of class Jwork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jwork
{
    public Jwork(){
    }
    
    public static void main(String[] args) {
        Location location1 = new Location ("Jakarta", "Jakarta Pusat", "RS");
        Recruiter recruiter1 = new Recruiter (1, "Hanif", "hanif.zufar@ui.ac.id", "085781726006", location1);
        Job job1 = new Job (1,"Zufar",recruiter1,5000000,"IT");
        Jobseeker jobseeker1 = new Jobseeker (1, "Zufar", "zufar@ui.ac.id", "zufar123", "Maret 2021");
        Invoice invoice1 = new Invoice (1, 1, "Maret 2021", 5000000, jobseeker1);
        System.out.println(recruiter1.getName());
        recruiter1.setName("MK");
        System.out.println(recruiter1.getName());
        job1.printData();
        
        
    }
}
