import java.util.Random;
import java.util.Scanner;

public class Simpedes extends Nasabah{
    private final Random random = new Random();
    private static String nama;
    private static String alamat;
    private static int notlp;
    static int nik;

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



   void daftarSimPeDes()
    {
        Scanner inp = new Scanner(System.in);
        Simpedes data = new Simpedes();
        int no_rek = data.NoRek(8);

        System.out.println("=====Pendaftaran Nasabah Baru=====");
        System.out.print("Masukkan Nama Lengkap Anda : ");
        nama = inp.nextLine();
        System.out.print("Alamat : ");
        alamat = inp.nextLine();
        System.out.print("Nomor Telepon : ");
        notlp = inp.nextInt();
        System.out.print("NIK : ");
        nik = inp.nextInt();

        System.out.println("Selamat Rekening SimPeDes Anda sudah terbit!");
        System.out.println("Nama :"+nama);
        System.out.println("Alamat :"+alamat);
        System.out.println("Nomor Telepon : "+notlp);
        System.out.println("NIK : "+nik);
        System.out.println("Rekening anda adalah :"+no_rek);
        System.out.println("Untuk penerbitan kartu kunjungi kantor cabang terdekat");
    }
}
