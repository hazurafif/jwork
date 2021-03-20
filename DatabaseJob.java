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
     * @return list DatabaseJob
     */
    public DatabaseJob(String[] listJob){
        listJob = new String[10];
    }
    
    /**
     * addJob untuk menambah Job
     *
     * @param job berisi object job
     * @return boolean 
     */   
    public static boolean addJob(Job job){
        return false;
    }
    
    /**
     * removeJob untuk menghapus Job
     *
     * @param job berisi object job
     * @return boolean
     */
    public boolean remove(Job job){
        return false;
    }
    
    /**
     * getJob untuk mengambil Job
     *
     * @param job berisi object job
     * @return null
     */
    public Job getJob(){
        return null;
    }
    
    /**
     * getListJob untuk mengambil daftar Job
     *
     * @param job berisi object job
     * @return boolean (untuk sementara)
     */
    public String[] getListJob(){
        return listJob;
    }
}
