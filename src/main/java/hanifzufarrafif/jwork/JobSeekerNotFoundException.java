package hanifzufarrafif.jwork;

/**
 * JobSeekerNotFoundException class untuk exception saat tidak ada jobseeker
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class JobSeekerNotFoundException extends Exception {
    private int jobseeker_error;

    public JobSeekerNotFoundException(int jobseeker_input) {
        super("Jobseeker ID: ");
        this.jobseeker_error = jobseeker_input;
    }

    public String getMessage() {
        return super.getMessage() + jobseeker_error + " not found";
    }

}
