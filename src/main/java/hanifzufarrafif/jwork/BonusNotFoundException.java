package hanifzufarrafif.jwork;

/**
 * BonusNotFoundException class untuk exception saat tidak ada bonus
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class BonusNotFoundException extends Exception {
    private int bonus_error;

    public BonusNotFoundException(int referral_input){
        super("Referral Code ID: ");
        bonus_error = referral_input;
    }

    public String getMessage() {
        return super.getMessage() + bonus_error + " not found";
    }

}

