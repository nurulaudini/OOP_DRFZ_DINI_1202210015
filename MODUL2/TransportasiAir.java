public class TransportasiAir {
    protected String jenis;
    protected int JumlahKursi;
    protected int biaya;

    public TransportasiAir(int JumlahKursi, int biaya){
        this.JumlahKursi = JumlahKursi ;
        this.biaya = biaya;
    }

    public void informasi(){
        System.out.println("Transportasi Air jenis "+jenis+" dengan jumlah kursi sebanyak "+JumlahKursi+" ditetapkan dengan biaya sebesar "+biaya);
    }
    public void Berlabuh(){
        
        System.out.println("Transportasi Air jenis %s sedang berlayar ");
    }
}