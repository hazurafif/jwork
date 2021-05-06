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

    }   
}
