package hanifzufarrafif.jwork.controller;


import hanifzufarrafif.jwork.Bonus;
import hanifzufarrafif.jwork.DatabaseBonus;
import hanifzufarrafif.jwork.ReferralCodeAlreadyExistsException;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

/**
 * Class BonusController untuk kontrol pengaturan database bonus
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
@RequestMapping("/bonus")
@RestController
public class BonusController {
    @RequestMapping("")
    public ArrayList<Bonus> getAllBonus(){
        return(DatabaseBonus.getBonusDatabase());
    }
    @RequestMapping("/{referralCode}")
    public Bonus getBonusByReferralCode(
            @PathVariable String referralCode){
        return(DatabaseBonus.getBonusByRefferalCode(referralCode));
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Bonus addBonus(
            @RequestParam(value="referralCode") String referralCode,
            @RequestParam(value="extraFee") int extraFee,
            @RequestParam(value="minTotalFee") int minTotalFee,
            @RequestParam(value="active") boolean active

    ){
        Bonus bonus = new Bonus(DatabaseBonus.getLastId() + 1, referralCode, extraFee, minTotalFee, active);
        try{
            DatabaseBonus.addBonus(bonus);
        }
        catch(ReferralCodeAlreadyExistsException e){
            e.getMessage();
            return null;
        }
        return bonus;
    }
}
