package hanifzufarrafif.jwork;

/**
 * JobNotFoundException class untuk exception saat tidak ada job
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class JobNotFoundException extends Exception{
    private int job_error;

    public JobNotFoundException(int job_input){
        super("Job ID: ");
        this.job_error = job_input;
    }

    public String getMessage(){
        return super.getMessage() + job_error + " not found";
    }
}
