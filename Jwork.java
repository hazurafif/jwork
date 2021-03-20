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
        System.out.println(location1.getProvince());
        System.out.println(location1.getCity());
        System.out.println(location1.getDescription());
        Recruiter recruiter1 = new Recruiter (1, "Hanif", "hanif.zufar@ui.ac.id", "085781726006", location1);
        System.out.println(recruiter1.getId());
        System.out.println(recruiter1.getName());
        System.out.println(recruiter1.getEmail());
        System.out.println(recruiter1.getLocation());
        Job job1 = new Job (1,"Zufar",recruiter1,5000000,"IT");
        System.out.println(job1.getId());
        System.out.println(job1.getName());
        System.out.println(job1.getRecruiter());
        System.out.println(job1.getFee());
        System.out.println(job1.getCategory());
        Jobseeker jobseeker1 = new Jobseeker (1, "Zufar", "zufar@ui.ac.id", "zufar123", "Maret 2021");
        System.out.println(jobseeker1.getId());
        System.out.println(jobseeker1.getName());
        System.out.println(jobseeker1.getEmail());
        System.out.println(jobseeker1.getPassword());
        System.out.println(jobseeker1.getJoinDate());
        Invoice invoice1 = new Invoice (1, 1, "Maret 2021", 5000000, jobseeker1);
        System.out.println(invoice1.getId());
        System.out.println(invoice1.getIdJob());
        System.out.println(invoice1.getDate());
        System.out.println(invoice1.getTotalFee());
        System.out.println(invoice1.getJobseeker());
    }
}
