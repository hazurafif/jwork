package hanifzufarrafif.jwork;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Class BankPayment untuk pembayaran dengan metode bank
 *
 * @author Hanif Zufar Rafif
 * @version 04/03/2021
 */
public class BankPayment extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;
    /**
     * Constructor for objects of class BankPayment
     * @param id = nilai input variabel id
     * @param jobs = nilai input variable job
     * @param jobseeker = nilai input untuk variable jobseeker
     * menggunakan metode keyword "super" dan "this"
     */
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    /** menggunakan keyword 'super'.
     * Bertujuan untuk menyatakan atau mereferensikan variabel */
    {
        super(id,jobs,jobseeker);
    }
    /** @param adminFee = nilai input untuk variable adminFee*/
    public BankPayment(int id, ArrayList<Job> jobs,Jobseeker jobseeker,int adminFee)
    /** menggunakan keyword "super" dan "this".
     * Bertujuan untuk menyatakan atau mereferensikan variabel */
    {
        super(id,jobs,jobseeker);
        this.setAdminFee(adminFee);
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
    public int getAdminFee(){
        return adminFee;
    }
    /**
     * method setBonus, menetapkan nilai variabel bonus
     * mutator (set)
     * @param adminFee = sebagai inputan untuk variable bonus
     */
    public void setAdminFee(int adminFee){
        this.adminFee = adminFee;
    }
    /**
     * method setTotalFee, menetapkan nilai variabel totalFee
     * mutator (set)
     * terdapat kondisi untuk memenuhi nilai akhir totalFee yang dipengaruhi extraFee
     */
    @Override
    public void setTotalFee() {
        for(Job job : getJobs()) {
            if(adminFee != 0) {
                totalFee = job.getFee() - getAdminFee();
            }
            else {
                totalFee = job.getFee();
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
            if (adminFee != 0) {
                res.concat("\nId = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName() + "\nAdmin Fee = " + adminFee + "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            } else {
                res.concat("\nId = " + getId() + "\nJob = " + job.getName() + "\nDate = " + date + "\nJob Seeker = "
                        + getJobseeker().getName() + "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
            }
        }
        return res;
    }
}

