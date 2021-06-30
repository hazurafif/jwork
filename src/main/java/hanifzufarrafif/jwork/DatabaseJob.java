package hanifzufarrafif.jwork;

import java.util.ArrayList;

/**
 * DatabaseJob class untuk rincian dan tempat penyimpanan data job dalam database
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class DatabaseJob
{
    // instance variables - replace the example below with your own
    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
    private static int lastId = 0;


    public static ArrayList<Job> getJobDatabase(){
        return JOB_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    /**
     * method getListJob, mendapatkan list job dari database job
     *
     * @return listJob = mengembalikan nilai listJob
     */
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

    public static ArrayList<Job> getJobByRecruiter(int recruiterId) {
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
        ArrayList<Job> temp = new ArrayList<Job>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (category == JOB_DATABASE.get(i).getCategory()) {
                temp.add(JOB_DATABASE.get(i));
            }
        }
        return temp;
    }

    /**
     * method addJob, menambahkan job ke database job
     *
     * @param job digunakan sebagai inputan untuk method ini
     * @return false = mengembalikan nilai boolean "false"
     */
    public static boolean addJob(Job job)
    {
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }
    /**
     * method remove, menghapus job dari database job
     *
     * @param id digunakan sebagai inputan untuk method ini
     * @return false = mengembalikan nilai boolean "false"
     */
    public static boolean removeJob(int id) throws JobNotFoundException {
        for (Job job : JOB_DATABASE) {
            if (job.getId() == id) {
                JOB_DATABASE.remove(job);
                return true;
            }
        }
        throw new JobNotFoundException(id);
    }
}
