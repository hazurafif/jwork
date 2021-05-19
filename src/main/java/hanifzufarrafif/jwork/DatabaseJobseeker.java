package hanifzufarrafif.jwork;
import java.util.ArrayList;

/**
 * Write a description of class DatabaseJobseeker here.
 *
 * @author Hanif Zufar Rafif
 * @version 25/03/2021
 */
public class DatabaseJobseeker{
    // instance variables
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    private static int lastId = 0;

    public static ArrayList<Jobseeker> getDatabaseJobseeker() {
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException{
        Jobseeker temp = null;
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (id == jobseeker.getId()) {
                temp = jobseeker;
                return temp;
            }
        }
        throw new JobSeekerNotFoundException(id);
    }

    /**
     * addJobseeker untuk menambahkan jobseeker
     *
     * @param jobseeker
     * @return boolean
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
     * removeJobseeker menghapus jobseeker
     *
     * @param id
     * @return boolean
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
}
