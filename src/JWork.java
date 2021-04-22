import java.util.GregorianCalendar;

/**
 * Write a description of class Jwork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JWork
{
    // instance variables-replace the example below with your own
    public JWork(){
    }
    
    public static void main(String[] args) {
        Location location1 = new Location("Jakarta","Jakarta Timur","Tempat Lahir");
        Recruiter recruiter1 = new Recruiter(1, "rafif", "rafif@ui.ac.id", "085781726006", location1);
        Job job1 = new Job(1, "Junior Dev", recruiter1, 50, JobCategory.WebDeveloper);
        Jobseeker jobseeker1 = new Jobseeker(1, "Zufar", "hanif.zufar@ui.ac.id", "Hanif123", new GregorianCalendar(2000, 7, 22));
        Jobseeker jobseeker2 = new Jobseeker(2, "Zufar", "hanif.zufar@ui.ac.id", "Hanif123", 2000, 3, 28);
        Jobseeker jobseeker3 = new Jobseeker(3, "Zufar", "hanif.zufar@ui.ac.id", "Hanif123");
        Bonus bonus1 = new Bonus(1, "BONUS", 50, 50, true);
        EwalletPayment invoice1 = new EwalletPayment(1, job1, jobseeker1, InvoiceStatus.Finished);
        BankPayment invoice2 = new BankPayment(4, job1, jobseeker1, InvoiceStatus.Finished);
    
        invoice1.setTotalFee();
        invoice2.setTotalFee();
        System.out.println("\n==================== E-Wallet ====================");
        System.out.println(invoice1);
        System.out.println("\n==================== Bank ====================");
        System.out.println(invoice2);
    }   
}
