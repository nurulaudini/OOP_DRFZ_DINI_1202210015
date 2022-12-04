public class laptop extends perangkat{
    protected boolean webcam;

    public laptop (String drive, int ram, float processor,boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam ;
    }

    @Override
    public void informasi(){
        if (this.webcam==false){
            System.out.printf("laptop ini memiliki Drive tipe %s dengan Ram sebesar %d GB dan Processor secepat %.2f Ghz. %nSelain itu laptop ini juga tidak memiliki webcam %n", drive, ram, processor);
        }else {
            System.out.printf("laptop ini memiliki Drive tipe %s dengan Ram sebesar %d GB dan Processor secepat %.2f Ghz. %nSelain itu laptop ini juga memiliki webcam %n", drive, ram, processor);
        }
    }
    public void opengame(String name_game){
        System.out.printf("Laptop berhasil membuka game %s %n",name_game);   
    }
    public void mengirim_email(String email){
        System.out.printf("Laptop berhasil mengirimkan email ke email %s %n",email); 
    }
    public void  mengirim_email(String emaila, String emailb){
        System.out.printf("Laptop berhasil mengirimkan email ke email %s dan ke email %s %n",emaila, emailb); 
    }
}

