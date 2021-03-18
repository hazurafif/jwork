/**
 * Write a description of class DatabaseJob here.
 *
 * @author Hanif Zufar Rafif
 * @version 18/03/2021
 */
public class DatabaseJob
{
    private String[] listJob;
    
    /**
     * DatabaseJob untuk membuat DatabaseJob
     *
     * @param  DatabaseJob berisi object DatabaseJob
     * @return object DatabaseJob
     */

    public DatabaseJob(String[] listJob){
        listJob = new String[10];
    }

    public static boolean addJob(Job job){
        return false;
    }
    
    public static boolean removeJob(Job job){
        return false;
    }
    
    public Job getJob(){
        return null;
    }
    
    public String[] getListJob(){
        return listJob;
    }
}
