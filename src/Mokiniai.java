import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

public class Mokiniai {
    private String vardas;
    private String pavarde;
    private String klase;
    private int pazymiai[];
    private double vidurkis;

    NumberFormat numberFormat = new DecimalFormat("0.00");



    public Mokiniai(String vardas, String pavarde, String klase, int pazymiai[]) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.pazymiai = pazymiai;
    }

    @Override
    public String toString() {
        return "Mokiniai{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", klase='" + klase + '\'' +
                ", pazymiai=" + Arrays.toString(pazymiai) +
                ", vidurkis= " +numberFormat.format(mokinioVidurkis())+
                ", ar skolinknas = " + (arSkolinkas(mokinioVidurkis()) ? "Taip" : "Ne") +

                '}';
    }

    public void setVidurkis(double vidurkis) {
        this.vidurkis = vidurkis;
    }

    public Mokiniai() {
    }

    public double getVidurkis() {
        return vidurkis;
    }

    public int[] getPazymiai() {
        return pazymiai;
    }

    public double mokinioVidurkis() {
        double viso = 0;
        double kiekis = 0;
        for (int i = 0; i < pazymiai.length; i++) {

            viso += pazymiai[i];
            kiekis++;
        }

        return viso / kiekis;
    }

    public boolean arSkolinkas(double vidurkis) {
        if (vidurkis < 5.5) {
            return true;
        }
        return false;
    }

}
