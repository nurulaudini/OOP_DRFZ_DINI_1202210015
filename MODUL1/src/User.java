public class User {
    public String name ;
    public int phone ;
    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    User(String name,int phone){
        this.name = name;
        this.phone = phone;
    }
    public String registrasi (){
        return "\nRegistrasi Sukses\n Name: "+this.name+"\nPhone: "+this.phone+"\n";
    }
}
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message

