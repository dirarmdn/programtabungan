public class Transaksi implements Menu{
    int saldo;

    public void penyetoran(int sal){
        saldo = saldo + sal;
    }

    public void penarikan(int jumlahTarikan){
        if (saldo < 20000){
            System.out.println("Maaf saldo tidak mencapai minimal penarikan, segera lakukan penyetoran");
        } else {
            saldo = saldo - jumlahTarikan;
        }
    }

    public void transfer(int s){
        if (saldo < 20000){
            System.out.println("Maaf saldo tidak mencapai minimal transfer, segera lakukan penyetoran");
        } else {
            saldo = saldo - s;
        }
    }

    public void cetakSaldo()
    {
        System.out.println("hello");
    }

}
