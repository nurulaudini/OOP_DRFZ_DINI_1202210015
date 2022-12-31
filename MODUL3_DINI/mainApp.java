package MODUL3_DINI;
import java.util.Scanner;
import java.util.InputMismatchException;

public class mainApp {
    public static void main(String[]args)throws Exception{
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        calculation calculation = new calculation();
        int menu_program;

        do{
            System.out.println("---MENU PROGRAM PENGHITUNG LUAS---");
            System.out.println("1. Square\n2. Circle\n3. Trapezoid\n0. Exit program");
            try{
                System.out.println("Select menu : ");
                menu_program=input.nextInt();
                switch(menu_program){
                    case 1 :
                        System.out.println("Enter the length of side of the square : ");
                        double side = input.nextDouble();
                        calculation.setSquare(side);
                        calculation.run();
                        System.out.println("the calculation result : " +calculation.getSquare());
                        break;
                    case 2 :
                        System.out.println("Enter the radius of the circle : ");
                        double radius = input.nextDouble();
                        calculation.setCircle(radius);
                        calculation.run();
                        System.out.println("the calculation result : " +calculation.getCircle());
                        break;
                    case 3 :
                        System.out.println("insert the side of the base of the trapezoid : ");
                        double a = input.nextDouble();
                        System.out.println("enter the upper side of the trapezoid : ");
                        double b = input.nextDouble();
                        System.out.println("enter the height of the trapezoid : ");
                        double t = input.nextDouble();
                        calculation.setTrapezoid(a, b, t);
                        calculation.run();
                        System.out.println("the calculation result : " +calculation.getTrapezoid());
                        break;
                    case 0 :
                        System.out.println("Thankyou\n===PROGRAM HAS ENDED===");
                    default :
                        System.out.println("menu is not available, choose other menu please ^^");

                    }
                    repeat=false;
                
            }catch (InputMismatchException e){
                System.out.println("THERE IS A ERROR !!! \n ERROS MUST BE AN INTEGER");
                Scanner scanner;
                input.next();
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        } while (repeat);
        input.close();
    }
}
