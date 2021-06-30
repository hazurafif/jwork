package hanifzufarrafif.jwork;

/**
 * RecruiterNotFoundException class untuk exception saat tidak ada recruiter
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class RecruiterNotFoundException extends Exception{
    private int recruiter_error;

    public RecruiterNotFoundException(int recruiter_input)
    {
        super("Recruiter Id: ");
        recruiter_error = recruiter_input;
    }

    public String getMessage()
    {
        return super.getMessage() + recruiter_error + " not Found";
    }
}
