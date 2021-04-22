import java.util.ArrayList;
/**
 * Write a description of class DatabaseRecruiter here.
 *
 * @author Hanif Zufar Rafif
 * @version 25/03/2021
 */
public class DatabaseRecruiter
{
    // instance variables
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;

    public static ArrayList<Recruiter> getRecruiterDatabase() {
        return RECRUITER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Recruiter getRecruiterById(int id) {
        Recruiter temp = null;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()){
                temp = recruiter;
            }
            else{
                temp =  null;
            }
        }
        return temp;
    }

    /**
     * addRecruiter untuk menambahkan recruiter
     * @param recruiter
     * @return boolean
     */
    public static boolean addRecruiter(Recruiter recruiter) {
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }
    
    /**
     * removeRecruiter menghapus recruiter
     * @param id
     * @return boolean
     */
    public static boolean removeRecruiter(int id)
    {
        boolean temp = true;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()){
                RECRUITER_DATABASE.remove(id);
                temp = true;
            }
            else{
                temp = false;
            }
        }
        return temp;
    }
}
