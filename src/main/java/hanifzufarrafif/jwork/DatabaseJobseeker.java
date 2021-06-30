package hanifzufarrafif.jwork;
import java.util.ArrayList;

/**
 * DatabaseJobseeker class untuk rincian dan tempat penyimpanan data jobseeker dalam database
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class DatabaseJobseeker
{
    // instance variables - replace the example below with your own
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    private static int lastId = 0;

    public static ArrayList<Jobseeker> getJobseekerDatabase() {
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    /**
     * method getJobseeker, mendapatkan jobseeker yang terdaftar dari database jobseeker
     *
     * @return null = tidak ada nilai yang dikembalikan
     */
    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException{
        Jobseeker x = null;
        try{
            for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
                if (id == jobseeker.getId()) {
                    x = jobseeker;
                }
            }
        }
        catch (Exception e){
            throw new JobSeekerNotFoundException(id);
        }
        return x;
    }

    /**
     * method addJobseeker, menambahkan data jobseeker ke database jobseeker
     *
     * @param jobseeker digunakan sebagai inputan untuk method ini
     * @return false = mengembalikan nilai boolean "false"
     */
    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
        for (Jobseeker element : JOBSEEKER_DATABASE) {
            if (element.getEmail() == jobseeker.getEmail()) {
                throw new EmailAlreadyExistsException(jobseeker);
            }
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }
    /**
     * method removeJobseeker, menghapus data jobseeker ke database jobseeker
     *
     * @param id digunakan sebagai inputan untuk method ini
     * @return false = mengembalikan nilai boolean "false"
     */
    public static boolean removeJobseeker(int id) throws JobSeekerNotFoundException {
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == id) {
                JOBSEEKER_DATABASE.remove(jobseeker.getId());
                return true;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }

    public static Jobseeker getJobseekerLogin(String email, String password){
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getEmail().equals(email) && jobseeker.getPassword().equals(password)) {
                return jobseeker;
            }
        }
        return null;
    }


}
