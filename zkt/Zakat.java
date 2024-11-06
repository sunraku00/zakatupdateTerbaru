public class Zakat {
    private static final double ZAKAT_FITRAH_RATE = 3.5;  // contoh dalam kilogram beras
    private static final double ZAKAT_MAAL_RATE = 0.025; // 2.5%

    // Menghitung Zakat Fitrah berdasarkan jumlah jiwa dalam keluarga
    public double htzktfit(int jumlahJiwa) {
        return jumlahJiwa * ZAKAT_FITRAH_RATE;
    }

    // Menghitung Zakat Maal berdasarkan nilai kekayaan
    public double htzktmaal(double nilaiKekayaan) {
        return nilaiKekayaan * ZAKAT_MAAL_RATE;
    }
    //diatas adalah parameternya:)
}
