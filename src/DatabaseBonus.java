import java.util.ArrayList;

/**
 * Write a description of class DatabaseBonus here.
 *
 * @author Hanif Zufar Rafif
 * @version 01/04/2021
 */
public class DatabaseBonus {
    // instance variables
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Bonus> getBonusDatabase(){
        return BONUS_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Bonus getBonusById(int id) throws BonusNotFoundException {
        Bonus temp = null;

        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                temp = bonus;
                return temp;
            }
        }
        throw new BonusNotFoundException(id);
    }

    public static Bonus getBonusByRefferalCode(String refferalCode){
        Bonus temp = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (refferalCode.equals(bonus.getReferralCode())) {
                temp = bonus;
            }
        }
        return temp;
    }
    
    /**
     * addBonus untuk menambah bonus
     * @param bonus
     * @return boolean
     */
    public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException {
        for (Bonus element : BONUS_DATABASE) {
            if (element.getReferralCode() == bonus.getReferralCode()) {
                throw new ReferralCodeAlreadyExistsException(bonus);
            }
        }
        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    public static boolean activateBonus(int id){
        boolean temp = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(true);
                temp = true;
            }
        }
        return temp;
    }

    public static boolean deactivateBonus(int id){
        boolean temp = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(false);
                temp = true;
            }
        }
        return temp;
    }

    /**
     * removeBonus untuk menghapus bonus
     * @param id
     * @return boolean
     */
    public static boolean removeBonus(int id) throws BonusNotFoundException {
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                BONUS_DATABASE.remove(bonus);
                return true;
            }
        }
        throw new BonusNotFoundException(id);
    }
}

