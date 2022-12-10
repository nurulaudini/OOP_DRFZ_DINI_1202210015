public class TransportasiAir {
    protected String jenis;
    protected int JumlahKursi;
    protected int biaya;

    public TransportasiAir(int JumlahKursi, int biaya){
        this.JumlahKursi = JumlahKursi ;
        this.biaya = biaya;
    }

    public void informasi(){
        System.out.println("Transportasi Air jenis %s dengan jumlah kursi sebanyak %d ditetapkan dengan biaya sebesar %f ",jenis,JumlahKursi,biaya);
    }
    public void Berlabuh(){
        
        System.out.println("Transportasi Air jenis %s sedang berlayar ");
    }