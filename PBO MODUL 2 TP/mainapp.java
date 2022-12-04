public class mainapp {
    public static void main (String[] arg) throws Exception{
        perangkat p = new perangkat("C(WINDOWS)",4,1.8f);
        p.informasi();
        System.out.println();

        laptop a = new laptop("toshiba",8,2.4f,true);
        a.informasi();
        a.opengame("stumble");
        a.mengirim_email("nurulaudiniii@gmail.com");
        a.mengirim_email("nurulaudiniii@gmail.com","nurulaudini@student.telkomuniversity.ac.id");
        System.out.println();

        Handphone b = new Handphone("sandisk", 3, 2.2f, false);
        b.informasi();
        b.telpon(628110);
        b.kirim_pesan(628912);
        b.kirim_pesan(6239483, 6283294);
        System.out.println();
    }
}
