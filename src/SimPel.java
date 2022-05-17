import java.util.Random;
import java.util.Scanner;

public class SimPel extends Nasabah{
    private final Random random = new Random();
    private static String nama;
    private static String alamat;
    private static int notlp;
    static int nik;

    String NamaNasabah(String nm){
        nama = nm;
        return nama;
    }

    String Alamat(String almt){
        alamat = almt;
        return alamat;
    }

    int NoTelp(int no){
        notlp = no;
        return notlp;
    }

    int NomorInduk (int nik){
        return nik;
    }

    int Norek(int length){
        String code = "";
        for (int i = 0; i < length; i++) {
            code += (char) (random.nextInt(8) + '0');
        }
        return Integer.parseInt(code);
    }



    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        Simpedes data = new Simpedes();
        int no_rek = data.Norek(8);

        System.out.println("Pendaftaran Nasabah Baru");
        System.out.print("Masukkan Nama Lengkap Anda : ");
        nama = inp.nextLine();
        System.out.print("Alamat :");
        alamat = inp.nextLine();
        System.out.print("Nomor Telepon :");
        notlp = inp.nextInt();
        System.out.print("NIK :");
        nik = inp.nextInt();

        System.out.println("Rekening anda adalah :"+no_rek);


        System.out.println(nama);
    }
}
