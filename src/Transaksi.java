public class Transaksi implements Menu{
    int saldo;

    public void penyetoran(int sal){
        saldo = saldo + sal;
    }

    public void penarikan(int jumlahTarikan){
        saldo = saldo - jumlahTarikan;
    }

    public void transfer(int s){
        saldo = saldo - s;
    }

    public void cetakSaldo()
    {
        System.out.println("hello");
    }

}
