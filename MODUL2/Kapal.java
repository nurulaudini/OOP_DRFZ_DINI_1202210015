public class extends TransportasiAir{
    public class Kapal {
        protected String mesin;

        public Sampan(int JumlahKursi, int biaya, String mesin){
            super(JumlahKursi,biaya);
            this mesin = mesin;
        }
        @Override
        public void informasi(){
            System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah "+JumlahKursi+" ditetapkan dengan biaya sebesar Rp: "+biaya);
            
        }

        public void berlayar(){
            System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin "+mesin+"dengan kecepatan yang tidak stabil");
        }

        public void berlayar(int kecepatan){
            System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin "+mesin+"dengan kecepatan stabil di kisaran "+kecepatan+" knot");

        }

        public void berlabuh(){
            System.out.println("Transportasi Air jenis Kapal berlabuh di pantai");
        }
    }
}