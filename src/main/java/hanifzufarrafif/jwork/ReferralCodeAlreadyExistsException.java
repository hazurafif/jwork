package hanifzufarrafif.jwork;

/**
 *  ReferralCodeAlreadyExistsException class untuk exception saat ada referralCode
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class ReferralCodeAlreadyExistsException extends Exception {

    private Bonus referral_error;

    public ReferralCodeAlreadyExistsException(Bonus referral_input){
        super("Referral Code: ");
        this.referral_error = referral_input;
    }

    public String getMessage() {
        return super.getMessage() + referral_error.getReferralCode() + " already exists.";
    }
}

