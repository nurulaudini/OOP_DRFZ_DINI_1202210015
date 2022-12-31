package MODUL3_DINI;

public class calculation implements Runnable{
    public double radius;
    public double side;
    public double area;
    public double phi = 3.14;

    public void setSquare(double side){
        this.side=side;
            try{
                if (side<1){
                    throw new IllegalArgumentException();
                } else{
                    area=side*side;
                }
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
    }
    public double getSquare(){
        return area;
    }
    public void setCircle(double radius){
        this.radius=radius;
        try {
            if(radius<1){
                throw new IllegalArgumentException();
            }else{
                area=phi*radius;
            }
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
    }
    public double getCircle(){
        return area;
    }
    public void setTrapezoid(double a,double b, double t){
        try{
            if (a<1 || b<1 || t<1){
                throw new IllegalArgumentException();
            }else{
                area=((a+b)*t)/2;
            }
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
    }
    public double getTrapezoid(){
        return area;
    }
    @Override
    public void run() {
        System.out.println("---PROGRAM WILL START IN : ");
        for (int i = 3; i>0 ; i--){
            try{
                System.out.println("Starting with thread " +i);
                Thread.sleep(1500);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
