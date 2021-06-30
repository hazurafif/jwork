package hanifzufarrafif.jwork;

/**
 * Enumeration PaymentType Class untuk merilis/merinci metode pembayaran apa aja yang ada
 *
 * @author Hanif Zufar Rafif
 * @version 24.06.2021
 */
public enum PaymentType
{
    BankPayment("Bank Payment"),
    EwalletPayment("E-wallet Payment");

    private final String type;

    private PaymentType(String type){
        this.type = type;
    }

    public String toString() {
        return type;
    }
}
