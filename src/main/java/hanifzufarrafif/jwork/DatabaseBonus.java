package hanifzufarrafif.jwork;

import java.util.ArrayList;

/**
 * DatabaseBonus class untuk rincian dan tempat penyimpanan data bonus dalam database
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class DatabaseBonus
{
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    public static ArrayList<Bonus> getBonusDatabase(){
        return BONUS_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    /**
     * method getBonus, mendapatkan job yang terdaftar dari database bonus
     *
     * @return null = tidak ada nilai yang dikembalikan
     */
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
        Bonus x = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (refferalCode.equals(bonus.getReferralCode())) {
                x = bonus;
            }
        }
        return x;
    }

    /**
     * method addBonus, menambahkan job ke database bonus
     *
     * @param bonus digunakan sebagai inputan untuk method bonus
     * @return false = mengembalikan nilai boolean "false"
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
        boolean x = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(true);
                x = true;
            }
        }
        return x;
    }

    public static boolean deactivateBonus(int id){
        boolean x = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(false);
                x = true;
            }
        }
        return x;
    }
    /**
     * method removeBonus, menghapus job dari database bonus
     *
     * @param id digunakan sebagai inputan untuk method bonus
     * @return false = mengembalikan nilai boolean "false"
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