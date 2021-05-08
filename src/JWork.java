import java.util.ArrayList;
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
    public static void main(String[] args) {

        Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Tanah Abang");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Vincent", "vincentiuslithgow@gmail.com", "088219440870", location1));

        System.out.println("=====================Errors====================");

        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "hanif", "hanif@ui.ac.id", "Hanif123", 2021, 4, 22));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "zufar", "hanif.zufar@ui.ac.id", "Hanif123", 2021, 4, 23));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Rafif", "rafif@ui.ac.id", "Hanif123", 2021, 3, 6));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Rafif", "rafif@ui.ac.id", "Hanif123", 2021, 3, 6));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "AAA", 10, 1, false));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId() + 1, "AAA", 10, 1, false));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseJobseeker.removeJobseeker(22);
        } catch (JobSeekerNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseRecruiter.removeRecruiter(28);
        } catch (RecruiterNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJob.getJobById(20);
        } catch (JobNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.getBonusById(21);
        } catch (BonusNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=========Database JobSeeker============");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());

        System.out.println("=========Database Bonus===============");
        System.out.println(DatabaseBonus.getBonusDatabase());

        ArrayList<Job> jobs = new ArrayList<Job>();
        ArrayList<Job> jobs1 = new ArrayList<Job>();

        try {
            jobs.add(new Job(1, "Backend Engineer", DatabaseRecruiter.getRecruiterById(1), 1000, JobCategory.BackEnd));
        }
        catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }
        try {
            jobs1.add(new Job(2, "Frontend Engineer", DatabaseRecruiter.getRecruiterById(1), 1000, JobCategory.FrontEnd));
        }
        catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }

        try {
            DatabaseInvoice.addInvoice(new BankPayment(DatabaseInvoice.getLastId()+1, jobs, DatabaseJobseeker.getJobseekerById(1), 6500));
            DatabaseInvoice.addInvoice(new BankPayment(DatabaseInvoice.getLastId()+1, jobs, DatabaseJobseeker.getJobseekerById(1), 6500));
            DatabaseInvoice.addInvoice(new EwalletPayment(DatabaseInvoice.getLastId()+1, jobs, DatabaseJobseeker.getJobseekerById(1), DatabaseBonus.getBonusById(1)));
        } catch (OngoingInvoiceAlreadyExistsException | JobSeekerNotFoundException | BonusNotFoundException e) {
            System.out.println(e.getMessage());
        }
        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase()){
            new Thread(new FeeCalculator(invoice)).start();
        }
        System.out.println(DatabaseInvoice.getInvoiceDatabase());
        try {
            DatabaseInvoice.getInvoiceById(69);
        } catch (InvoiceNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }   
}
