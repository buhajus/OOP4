public class Main {
    public static void main(String[] args) {

        spausdintiSarasa(mokiniuSarasas());
        System.out.printf("Visų mokinių vidurkis : %.2f", skaiciuotiBendraMokiniuViduriki(mokiniuSarasas()));
    }

    public static Mokiniai[] mokiniuSarasas() {

        Mokiniai mok1 = new Mokiniai("Tadas", "Rukas", "5a", new int[]{2, 4, 1, 6, 1, 6});
        Mokiniai mok2 = new Mokiniai("Lukas", "Mikas", "6a", new int[]{1, 2, 3, 7, 2, 7});
        Mokiniai mok3 = new Mokiniai("Asta", "Pasta", "9a", new int[]{5, 8, 3, 1, 6, 4});
        Mokiniai mok4 = new Mokiniai("Mykolas", "Mikas", "6a", new int[]{5, 6, 1, 7, 3, 1});
        Mokiniai mok5 = new Mokiniai("Simas", "Karka", "5a", new int[]{2, 6, 3, 5, 6, 1});
        Mokiniai mok6 = new Mokiniai("Alyte", "Jurgis", "9a", new int[]{9, 8, 10, 9, 9, 10});
        Mokiniai mok7 = new Mokiniai("Karolis", "Baltakis", "7a", new int[]{7, 6, 7, 5, 6, 10});
        Mokiniai mok8 = new Mokiniai("Benas", "Tukas", "5a", new int[]{9, 2, 9, 5, 2, 1});
        Mokiniai mok9 = new Mokiniai("Rasa", "Karka", "5a", new int[]{1, 6, 3, 10, 6, 1});
        Mokiniai mok10 = new Mokiniai("Petriukas", "Tinderis", "8a", new int[]{10, 2, 3, 10, 6, 10});

        Mokiniai[] mokiniai = {mok1, mok2, mok3, mok4, mok5, mok6, mok7, mok8, mok9, mok10};

        return mokiniai;
    }

    public static void spausdintiSarasa(Mokiniai[] masyvas) {

        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i] + " ");
        }
    }

    public static double skaiciuotiBendraMokiniuViduriki(Mokiniai[] masyvas) {

        int[] pazymiuSuma;
        double viso = 0;
        int kiekis = 0;

        for (int i = 0; i < masyvas.length; i++) {

            pazymiuSuma = masyvas[i].getPazymiai();

            for (int j = 0; j < masyvas[i].getPazymiai().length; j++) {

                viso += pazymiuSuma[j];
                kiekis++;
            }
        }

        return viso / kiekis;
    }

}
