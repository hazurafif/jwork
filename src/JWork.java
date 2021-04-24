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
        Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Stasiun Gambir");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Hanif", "hanif@ui.ac.id", "123654", location1));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Zufar", "zufar@ui.ac.id", "Zufar123", 2021, 02, 22));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Rafif", "rafif@ui.ac.id", "Rafif123", 2021, 03 ,22));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1 , "Raf", "raf@ui.ac.id", "Raf12345", 2021, 04, 22));
        System.out.println("\n=====================Jobseeker Database====================\n");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());
        ArrayList<Job> job1 = new ArrayList<Job>();
        ArrayList<Job> job2 = new ArrayList<Job>();
        ArrayList<Job> job3 = new ArrayList<Job>();
        job1.add(new Job(1, "FrontEnd Engineer TokoA", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.FrontEnd));
        job2.add(new Job(1, "Data Analyst TokoB", DatabaseRecruiter.getRecruiterById(1), 20000, JobCategory.DataAnalyst));
        job3.add(new Job(1, "Data Scientist TokoC", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.DataScientist));
        System.out.println("\n=====================Job Database By Category====================\n");
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.DataAnalyst));
        DatabaseBonus.addBonus(new Bonus(1, "HZR111", 1000, 500, false));
        DatabaseBonus.addBonus(new Bonus(2, "HZR111", 1000, 500, true));
        System.out.println(DatabaseBonus.getBonusById(1));
        System.out.println(DatabaseBonus.getBonusById(2));

    }   
}