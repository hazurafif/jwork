import java.util.ArrayList;

/**
 * Write a description of class DatabaseJob here.
 *
 * @author Hanif Zufar Rafif
 * @version 18/03/2021
 */
public class DatabaseJob
{
    //instance variable
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
    private static int lastId = 0;

    public static ArrayList<Job> getJobDatabase() {
        return JOB_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    /**
     * addJob untuk menambah Job
     *
     * @param job berisi object job
     * @return boolean 
     */   
    public static boolean addJob(Job job){
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }
    
    /**
     * removeJob untuk menghapus Job
     *
     * @param id berisi object job
     * @return boolean
     */
    public static boolean removeJob(int id) throws JobNotFoundException {
        boolean status = false;
        for (Job element : JOB_DATABASE) {
            if (element.getId() == id) {
                JOB_DATABASE.remove(element);
                status = true;
                break;
            }
        }
        if (!status){
            throw new JobNotFoundException(id);
        }

        return status;
    }

    public static Job getJobById(int id) throws JobNotFoundException {
        Job result = null;
        for (Job element : JOB_DATABASE) {
            if (element.getId() == id) {
                result = element;
                return result;
            }
        }
        if (result == null){
            throw new JobNotFoundException(id);
        }

        return result;
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId){
        ArrayList<Job> result = null;

        for (Job element : JOB_DATABASE) {
            if (element.getRecruiter().getId() == recruiterId) {
                if (result == null) {
                    result = new ArrayList<Job>();
                }
                result.add(element);
            }
        }
        return result;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory category) {
        ArrayList<Job> result = null;

        for (Job element : JOB_DATABASE) {
            if (element.getCategory() == category) {
                if (result == null) {
                    result = new ArrayList<Job>();
                }
                result.add(element);
            }
        }
        return result;
    }
}
