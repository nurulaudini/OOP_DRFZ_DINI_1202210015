public class extends TransportasiAir{
    public class Sampan {
        protected int Layar;

        public Sampan(int JumlahKursi, int biaya, int Layar){
            super(JumlahKursi,biaya)
            this Layar = Layar
        }
        @Override
        public void informasi(){
            System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah "+jumlahKursi+" ditetapkan dengan biaya sebesar Rp. "+biaya);
        }

        public void berlayar(){
            System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan "+layar+"layar");
        }

        public void berlabuh(){
            System.out.println("Transportasi Air jenis Sampan berlabuh di pantai tanpa jangkar");

        }

        public void berlabuh(int jangkar){
            System.out.println("Transportasi Air jenis Sampan berlabuh di pantai menggunakan "+jangkar+"Jangkar");
        }
    }
}
