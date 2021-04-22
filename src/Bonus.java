/**
 * Write a description of class Bonus here.
 *
 * @author Hanif Zufar Rafif
 * @version 01/04/2021
 */
public class Bonus
{
    // instance variables
    private int id;
    private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private boolean active;
    
    /**
     * Constructor for objects of class Bonus
     * 
     * @param id - merupakan nilai inputan untuk variable id
     * @param referralCode - merupakan nilai inputan untuk variable referralCode
     * @param extraFee - merupakan nilai inputan untuk variable extraFee
     * @param minTotalFee - merupakan nilai inputan untuk variable minTotalFee
     * @param active merupakan - nilai inputan untuk variable active ('True' or 'False)
     */
    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active)
    {
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active;
    }

    /**
     * getId untuk mengambil id
     *
     * @return id
     */
    public int getId(){
        return id;
    }
    
    /**
     * getReferralCode untuk mengambil referralCode
     *
     * @return referralCode
     */
    public String getReferralCode(){
        return referralCode;
    }
    
    /**
     * getExtraFee untuk mengambil extraFee
     *
     * @return extraFee
     */
    public int getExtraFee(){
        return extraFee;
    }
    
    /**
     * getMinTotalFee untuk mengambil minTotalFee
     *
     * @return minTotalFee
     */
    public int getMinTotalFee(){
        return minTotalFee;
    }
    
    /**
     * getActive untuk mengambil active
     *
     * @return boolean
     */
    public boolean getActive(){
        return active;
    }
    
    /**
     * setId untuk mengisi id
     *
     * @param id
     * @return id
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * setReferralCode untuk mengisi referralCode
     *
     * @param referralCode
     * @return referralCode
     */
    public void setReferralCode(String referralCode){
        this.referralCode = referralCode;
    }
    
    /**
     * setExtraFee untuk mengisi extraFee
     *
     * @param extraFee
     * @return extraFee
     */
    public void setExtraFee(int extraFee){
        this.extraFee = extraFee;
    }
    
    /**
     * setMinTotalFee untuk mengisi minTotalFee
     *
     * @param minTotalFee
     * @return minTotalFee
     */
    public void setMinTotalFee(int minTotalFee){
        this.minTotalFee = minTotalFee;
    }
    
    /**
     * setActive untuk mengisi active
     *
     * @param active
     * @return active
     */
    public void setActive(boolean active){
        this.active = active;
    }
    
    @Override
    public String toString(){
        return "ID = " + getId()+"\nReferral Code = " + getReferralCode()+"\nExtra Fee = " + getExtraFee()+"\nMin Total Fee = " + getMinTotalFee()+"\nActive Status = " + getActive();
    }
}
