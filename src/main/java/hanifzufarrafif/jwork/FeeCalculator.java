package hanifzufarrafif.jwork;

/**
 * FeeCalculator class untuk menghitung fee
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public class FeeCalculator implements Runnable{
    private Invoice invoice;

    public FeeCalculator (Invoice invoice){
        this.invoice = invoice;
    }

    @Override
    public void run(){
        System.out.println("Calculate invoice id: " + invoice.getId());
        invoice.setTotalFee();
        System.out.println("Finished calculate invoice id: " + invoice.getId());
    }
}

