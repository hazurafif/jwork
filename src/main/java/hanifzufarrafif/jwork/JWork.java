package hanifzufarrafif.jwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWork
{
    public static void main (String[] args)
    {

        DatabaseJobseekerPostgre.insertJobseeker(new Jobseeker(DatabaseJobseekerPostgre.getLastId()+1, "Rafif", "hanif.zufar@ui.ac.id", "Hanif123"));

        Location location1 = new Location("Banten", "Tangerang", "rumah");
        Location location2 = new Location("Jakarta", "Jakarta Barat", "bukan rumah");

        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Rafif", "hanif.zr@ui.ac.id", "081297204160", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Zufar", "zufar.hanif@ui.ac.id", "081334567890", location2));

        try {
            DatabaseBonus.addBonus(new Bonus(1, "Bonus1", 10000, 30000, true));
        } catch (ReferralCodeAlreadyExistsException e) {
            e.printStackTrace();
        }

        try {
            DatabaseJob.addJob(new Job(1, "BackEnd AI", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(2, "BackEnd UI", DatabaseRecruiter.getRecruiterById(1), 15000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(3, "FrontEnd AI", DatabaseRecruiter.getRecruiterById(2), 35000, JobCategory.FrontEnd));

        } catch (RecruiterNotFoundException e) {
            e.printStackTrace();
        }

        SpringApplication.run(JWork.class, args);

    }
}
