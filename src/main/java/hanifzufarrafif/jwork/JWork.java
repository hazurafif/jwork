package hanifzufarrafif.jwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWork {

    public static void main(String[] args) {
        Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Stasiun");
        Location location2 = new Location("Jawa Barat", "Bandung Barat", "Warung");
        Location location3 = new Location("Jawa Timur", "Malang", "Batu");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Hanif", "hanif@example.com", "111222111", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Zufar", "zufar@example.com", "222111222", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Rafif", "rafif@example.com", "111222222", location3));
        try {
            DatabaseJob.addJob(new Job(14, "Backend Engineer TOKO", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(15, "Frontend Engineer TOKO", DatabaseRecruiter.getRecruiterById(2), 10000, JobCategory.FrontEnd));
            DatabaseJob.addJob(new Job(16, "UI/UX Engineer TOKO", DatabaseRecruiter.getRecruiterById(2), 10000, JobCategory.UI));
        }
        catch(RecruiterNotFoundException e){
            e.printStackTrace();
        }

        SpringApplication.run(JWork.class, args);
    }

}