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
     * @param job berisi object job
     * @return boolean
     */
    public static boolean remove(Job job){
        for (Job job1 : JOB_DATABASE){
            if (job.getId() == job1.getId()){
                JOB_DATABASE.remove(job);
                return true;
            }
        }
        return false;
    }
    
    public static Job getJobById(int id){
        Job temp = null;
        for (Job job : JOB_DATABASE){
            if (id == job.getId()){
                temp = job;
            }
        }
        return temp;
    }
    public static ArrayList<Job> getJobByRecruiter(int recruiterId){
        ArrayList<Job> temp = new ArrayList<Job>();
        for (Job job : JOB_DATABASE) {
            if (recruiterId == job.getRecruiter().getId()) {
                temp.add(job);
            } else {
                return null;
            }
        }
        return temp;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory category) {
        ArrayList<Job> temp = new ArrayList<Job>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (category == JOB_DATABASE.get(i).getCategory()) {
                temp.add(JOB_DATABASE.get(i));
            }
        }
        return temp;
    }
}
