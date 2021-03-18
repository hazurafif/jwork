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
        Location location1 = new Location ("Jawa Barat", "Bekasi", "Bekasi Selatan");
        Recruiter recruiter1 = new Recruiter (1, "Hanif", "hanif@ui.ac.id", "085781726006", location1);
        Jobseeker jobseeker1 = new Jobseeker (1, "Zufar", "zufar@ui.ac.id", "zufar123", "18 Maret 2021");
        Job job = new Job (1,"Admin",recruiter1,5000000,"IT");
        Invoice invoice1 = new Invoice (1, 1, "18 Maret 2021", 5000000, jobseeker1);
    }
}
