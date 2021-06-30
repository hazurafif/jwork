package hanifzufarrafif.jwork;

/**
 * DatabaseJobseeker class untuk exception saat ada email
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class EmailAlreadyExistsException extends Exception {

    private Jobseeker jobseeker_error;

    public EmailAlreadyExistsException(Jobseeker jobseeker_input){
        super("Jobseeker Email: ");
        this.jobseeker_error = jobseeker_input;
    }


    public String getMessage() {
        return super.getMessage() + jobseeker_error.getEmail() + " already exists.";
    }
}