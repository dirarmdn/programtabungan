import java.util.Random;
import java.util.Scanner;

public class SimPel extends Nasabah{
    private final Random random = new Random();
    private static String nama;
    private static String alamat;
    private static int notlp;
    static int nik;
    char pelajar;

    @Override
    String NamaNasabah(String nm){
        nama = nm;
        return nama;
    }

    @Override
    String Alamat(String almt){
        alamat = almt;
        return alamat;
    }

    @Override
    int NoTelp(int no){
        notlp = no;
        return notlp;
    }

    @Override
    int NomorInduk (int nik){
        return nik;
    }

    @Override
    int NoRek(int length){
        String code = "";
        for (int i = 0; i < length; i++) {
            code += (char) (random.nextInt(8) + '0');
        }
        return Integer.parseInt(code);
    }



    void daftarSimPel()
    {
        Scanner inp = new Scanner(System.in);
        SimPel spl = new SimPel();
        int no_rek = spl.NoRek(8);

        System.out.println("Pendaftaran Nasabah Baru");
        System.out.print("Masukkan Nama Lengkap Anda : ");
        nama = inp.nextLine();
        System.out.print("Masukkan Alamat Lengkap: ");
        alamat = inp.nextLine();
        System.out.print("Masukkan Nomor Telepon :");
        notlp = inp.nextInt();
        System.out.print("Masukkan NIK sesuai dengan KTP:");
        nik = inp.nextInt();

        System.out.println("Selamat Rekening SimPel Anda sudah terbit!");
        System.out.println("Nama :"+nama);
        System.out.println("Alamat :"+alamat);
        System.out.println("Nomor Telepon : "+notlp);
        System.out.println("NIK : "+nik);
        System.out.println("Rekening anda adalah :"+no_rek);

        System.out.println("Nama :"+nama);
        System.out.println("Alamat :"+alamat);
        System.out.println("Nomor Telepon : "+notlp);
        System.out.println("NIK : "+nik);
        System.out.println("Untuk penerbitan kartu kunjungi kantor cabang terdekat");
    }
}
