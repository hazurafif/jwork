package hanifzufarrafif.jwork;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * EwalletPayment class untuk merinci pembayaran cashless dengan bonus dan referral code
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class EwalletPayment extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;
    /**
     * Constructor for objects of class EwalletPayment
     * @param id = nilai input variabel id
     * @param jobs = nilai input variable job
     * @param jobseeker = nilai input untuk variable jobseeker
     * menggunakan metode keyword "super" dan "this"
     */
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    /** menggunakan keyword 'super'.
     * Bertujuan untuk menyatakan atau mereferensikan variabel */
    {
        super(id,jobs,jobseeker);
    }
    /** @param bonus = nilai input untuk variable bonus */
    public EwalletPayment(int id,ArrayList<Job> jobs,Jobseeker jobseeker,Bonus bonus)
    /** menggunakan keyword "super" dan "this".
     * Bertujuan untuk menyatakan atau mereferensikan variabel */
    {
        super(id,jobs,jobseeker);
        this.setBonus(bonus);
    }
    /**
     * method getPaymentType,menambahkan nilai variabel PaymentType
     * accessor (get)
     * @return PAYMENT_TYPE = mengembalikkan nilai yang ada didalam variable PAYMENT_TYPE
     */
    @Override
    public PaymentType getPaymentType(){
        //To Do auto-generated method stub
        return PAYMENT_TYPE;
    }
    /**
     * method getBonus, menambahkan rincian nilai bonus
     * accessor (get)
     * @return bonus = mengembalikkan nilai yang ada didalam variable bonus
     */
    public Bonus getBonus(){
        return bonus;
    }
    /**
     * method setBonus, menetapkan nilai variabel bonus
     * mutator (set)
     * @param bonus = sebagai inputan untuk variable bonus
     */
    public void setBonus(Bonus bonus){
        this.bonus = bonus;
    }
    /**
     * method setTotalFee, menetapkan nilai variabel totalFee
     * mutator (set)
     * terdapat kondisi untuk memenuhi nilai akhir totalFee yang dipengaruhi extraFee
     */
    @Override
    public void setTotalFee() {
        ArrayList<Job> jobs = getJobs();
        for(Job job: jobs){
            int fee = job.getFee();
            if (bonus != null && (bonus.getActive() == true) && fee > bonus.getMinTotalFee()) {
                super.totalFee = fee + bonus.getExtraFee();
            } else {
                super.totalFee = fee;
            }
        }
    }
    /**
     * method printData untuk dengan return void.
     * mencetak data sesuai variabel
     * terdapat kondisi untuk menambahkan nilai totalFee yang dipengaruhi referralCode
     */
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());
        String res = "";
        for (Job job : getJobs()) {
            if ((bonus != null) && (bonus.getActive() == true) && (job.getFee() > bonus.getMinTotalFee())) {
                res.concat("\nId = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName() + "\nReferral Code = " + bonus.getReferralCode() + "\nTotal Fee = "
                        + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            } else {
                res.concat("\nId = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName() + bonus.getReferralCode() + "\nTotal Fee = "
                        + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            }

        }
        return res;
    }
}
