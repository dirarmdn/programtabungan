import java.util.Scanner;

public class Transaksi implements Menu{
    String nama;
    int menu;
    int saldo = 1000000;

    public void penyetoran(int sal){
        saldo = saldo + sal;
        System.out.println("Jumlah Saldo anda saat ini adalah : "+saldo);
    }

    public void penarikan(int jumlahTarikan){
        if (saldo < 20000){
            System.out.println("Maaf saldo tidak mencapai minimal penarikan, segera lakukan penyetoran");
        } else {
            saldo = saldo-jumlahTarikan;
            System.out.println("Jumlah saldo anda saat ini :"+saldo);
        }
    }

    public void transfer(int s){
        if (saldo < 20000){
            System.out.println("Maaf saldo tidak mencapai minimal transfer, segera lakukan penyetoran");
        } else {
            saldo = saldo - s;
            System.out.println("Jumlah saldo anda saat ini :"+saldo);
        }
    }

    public void cetakSaldo()
    {
        System.out.println("Saldo anda saat ini "+saldo);
    }

}
