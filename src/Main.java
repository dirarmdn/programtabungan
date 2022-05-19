import java.util.Scanner;

public class Main {
    static int tab, menu, saldo;
    static String nama;

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        Simpedes spd = new Simpedes();
        SimPel spl = new SimPel();
        Transaksi tr = new Transaksi();
        nama = "Jiya";
        saldo = 100000;

        System.out.println("Selamat Datang Di Bank");
        System.out.println("Menu :");
        System.out.println("1. Daftar SimPeDes");
        System.out.println("2. Daftar SimPel");
        System.out.println("3. Keluar");
        System.out.println("4. Lanjut");
        System.out.println("Masukkan pilihan menu : ");

        tab = inp.nextInt();
        switch (tab) {
            case 1:
                spd.daftarSimPeDes();
                System.exit(0);
                break;
            case 2:
                spl.daftarSimPel();
                System.exit(0);
                break;
            case 3:
                System.out.println("Selamat Tinggal!");
                System.exit(0);
            default:
                System.out.println("Selamat Datang "+nama);
                break;
        }

        System.out.println("Pilih jenis transaksi : ");
        System.out.println("1. Setor Tabungan");
        System.out.println("2. Tarik Saldo");
        System.out.println("3. Transfer");
        System.out.println("4. Cetak Saldo");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan transaksi : ");
        menu = inp.nextInt();
        switch (menu) {
            case 1:
                System.out.print("Masukkan nominal setoran : ");
                tr.penyetoran(inp.nextInt());
                break;
            case 2:
                System.out.print("Masukkan nominal penarikan : ");
                tr.transfer(inp.nextInt());
                break;
            case 3:
                System.out.print("Masukkan nominal transfer : ");
                tr.transfer(inp.nextInt());
                break;
            case 4:
                tr.cetakSaldo();
                break;
            default:
                System.out.println("Selamat tinggal!");
                System.exit(0);
                break;
        }


    }
}
