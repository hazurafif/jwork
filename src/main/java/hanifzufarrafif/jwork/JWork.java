package hanifzufarrafif.jwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWork {

    public static void main(String[] args) {
        Location location1 = new Location("DKI Jakarta", "Jakarta Pusat", "Kantor");
        Location location2 = new Location("Jawa Barat", "Bekasi", "Rumah");
        Location location3 = new Location("Jambi", "Jambi", "Hotel");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "hanif", "hanif@gmail.com", "12345", location1));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "zufar", "zufar@gmail.com", "678910", location2));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "rafif", "rafif@gmail.com", "1456732", location3));
        try {
            DatabaseJob.addJob(new Job(1, "Backend Engineer", DatabaseRecruiter.getRecruiterById(1), 10000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(2, "Backend Engineer", DatabaseRecruiter.getRecruiterById(2), 10000, JobCategory.BackEnd));
            DatabaseJob.addJob(new Job(3, "Frontend Engineer", DatabaseRecruiter.getRecruiterById(3), 10000, JobCategory.FrontEnd));
            DatabaseJob.addJob(new Job(4, "UI Engineer", DatabaseRecruiter.getRecruiterById(3), 10000, JobCategory.UI));
        }
        catch(RecruiterNotFoundException e){
            e.printStackTrace();
        }
        SpringApplication.run(JWork.class, args);
    }

}