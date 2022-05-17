public abstract class Nasabah {
    private String NamaNasabah;
    private String Alamat;
    private int NomorInduk;
    private int NoTelp;

    abstract String NamaNasabah(String nm);

    abstract String Alamat (String almt);

    abstract int NomorInduk (int nik);

    abstract int NoTelp (int no);

    abstract int Norek(int length);
}
