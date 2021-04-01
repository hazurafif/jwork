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
        Location location1 = new Location("Jakarta", "Jakarta Timur", "Tempat Lahir");
        Recruiter recruiter1 = new Recruiter(1, "rafif", "rafif@ui.ac.id", "085781726006", location1);
        Job job1 = new Job(1, "Junior Dev", recruiter1, 50, JobCategory.WebDeveloper);
        Jobseeker jobseeker1 = new Jobseeker(1, "zufar", "zufar@ui.ac.id", "zufar", "1 April 2021");
        Bonus bonus1 = new Bonus(1, "OOP", 50, 1 , true);
        Bonus bonus2 = new Bonus(1, "OOP2", 50, 1000, true);
        EwalletPayment payment1 = new EwalletPayment(1, job1, "1 Mei 2021",jobseeker1,InvoiceStatus.OnGoing);
        EwalletPayment payment2 = new EwalletPayment(2, job1, "1 Mei 2021",jobseeker1,InvoiceStatus.OnGoing, bonus1);
        EwalletPayment payment3 = new EwalletPayment(3, job1, "1 Mei 2021",jobseeker1,InvoiceStatus.OnGoing, bonus2);
        payment1.printData();
        payment2.printData();
        payment3.printData();
    }
        
}
