package hanifzufarrafif.jwork;

/**
 * Bonus class untuk merinci data bonus yang akan ada
 *
 * @author Hanif Zufar Rafif
 * @version 01/04/2021
 */
public class Bonus
{
    private int id;
    private String referralCode;
    private int extraFee;
    private int minTotalFee;
    private boolean active;
    /**
     * Constructor for objects of class Job
     * @param id = nilai input variabel id
     * @param referralCode = nilai input variable referralCode
     * @param extraFee = nilai input untuk variable extraFee
     * @param minTotalFee = nilai inputan  variable minTotalFee
     * @param active = nilai inputan  variable active
     */
    public Bonus(int id, String referralCode, int extraFee, int minTotalFee,
                 boolean active)
    /** menggunakan keyword 'this'.
     * Bertujuan untuk menyatakan atau mereferensikan variabel */
    {
        this.id = id;
        this.referralCode = referralCode;
        this.extraFee = extraFee;
        this.minTotalFee = minTotalFee;
        this.active = active;
    }

    /**
     * method getId, menambahkan data id
     * accessor (get)
     * @return id = mengembalikkan nilai yang ada didalam variable id
     */
    public int getId()
    {
        return id;
    }
    /**
     * method getReferralCode, menambahkan data referralCode
     * accessor (get)
     * @return referralCode = mengembalikkan nilai yang ada didalam variable referralCode
     */
    public String getReferralCode()
    {
        return referralCode;
    }
    /**
     * method getExtraFee, menambahkan data extraFee
     * accessor (get)
     * @return extraFee = mengembalikkan nilai yang ada didalam variable extraFee
     */
    public int getExtraFee()
    {
        return extraFee;
    }
    /**
     * method getMinTotalFee, menambahkan data minTotalFee
     * accessor (get)
     * @return minTotalFee = mengembalikkan nilai yang ada didalam variable minTotalFee
     */
    public int getMinTotalFee()
    {
        return minTotalFee;
    }
    /**
     * method getActive, menambahkan data active
     * accessor (get)
     * @return active = mengembalikkan nilai yang ada didalam variable active
     */
    public boolean getActive()
    {
        return active;
    }
    /**
     * method setId, menetapkan nilai variabel id
     * mutator (set)
     * @param id = sebagai inputan untuk variable id
     */
    public void setId(int id)
    {
        this.id = id;
    }
    /**
     * method setReferralCode, menetapkan nilai variabel referralCode
     * mutator (set)
     * @param referralCode = sebagai inputan untuk variable referralCode
     */
    public void setReferralCode(String referralCode)
    {
        this.referralCode = referralCode;
    }
    /**
     * method setExtraFee, menetapkan nilai variabel extraFee
     * mutator (set)
     * @param extraFee = sebagai inputan untuk variable extraFee
     */
    public void setExtraFee(int extraFee)
    {
        this.extraFee = extraFee;
    }
    /**
     * method setMinTotalFee, menetapkan nilai variabel minTotalFee
     * mutator (set)
     * @param minTotalFee = sebagai inputan untuk variable minTotalFee
     */
    public void setMinTotalFee(int minTotalFee)
    {
        this.minTotalFee = minTotalFee;
    }
    /**
     * method setActive, menetapkan nilai variabel active
     * mutator (set)
     * @param active = sebagai inputan untuk variable active
     */
    public void setActive(boolean active)
    {
        this.active = active;
    }
    /**
     * method printData dengan return void.
     * mencetak data sesuai variabel
     */
    public String toString()
    {
        return "ID= "+id+"\nReferralCode= "+referralCode+"\nExtraFee= "+extraFee+"\nMinTotalFee= "+minTotalFee+"\nActive= "+active+"\n";
    }
}