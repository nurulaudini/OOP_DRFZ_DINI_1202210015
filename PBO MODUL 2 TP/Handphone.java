public class Handphone extends perangkat {
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor,boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi(){
        if (this.fingerprint == false){
            System.out.printf("Handphone ini memiliki Drive tipe %s dengan Ram sebesar %d GB dan Processor secepat %.2f Ghz. %nSelain itu Handphone ini juga tidak memiliki fingerprint", drive, ram, processor);
        } else {
            System.out.printf("Handphone ini memiliki Drive tipe %s dengan Ram sebesar %d GB dan Processor secepat %.2f Ghz. %nSelain itu Handphone ini juga memiliki fingerprint", drive, ram, processor);
        }

        }
    public void telpon(int nohp){
        System.out.printf( "%nHandphone telah berhasil menyambukan telpon ke no %s", nohp);

    }
    public void kirim_pesan(int nohp){
        System.out.printf("%nhandphone telah berhasil menyambungkan telepon ke no %s", nohp);

    }
    public void kirim_pesan(int nohpa , int nohpb){
        System.out.printf("%nHandphone telah berhasil menyambungkan telepon ke no hp %s",nohpa ,nohpb);
    }
}

