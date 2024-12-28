import java.util.Scanner;
import static java.lang.Math.pow;

public class AreaOfGeometry {
    public static void main ( String [] args){
        //Declare variable
        short Option;
        double Area,Pi= 3.14;
        float width,Length;
        float High,Bath,a,radius;
        float ConerofCube;

        Scanner sc =  new Scanner(System.in);
        //Menu of All Area about Geometry
        System.out.println("=====> MENU Area of Geometry<======");
        System.out.println("||     1.Area of Rectangle       ||");
        System.out.println("||     2.Area of Triangle        ||");
        System.out.println("||     3.Area of Circle          ||");
        System.out.println("||     4.Area of Square          ||");
        System.out.println("||     5.Area of Prolelogram     ||");
        System.out.println("||     6.Area of Trapezoid       ||");//Trapezoid == jak to  koun pneay
        System.out.println("||     7.Area of Cube            ||");
        System.out.println("||     8.Area ot Cylinder        ||");
        System.out.println("=====>>==============<<===========");
        System.out.println("Note* : Press key(0) to Exit Program!");

        do {
            System.out.print("Enter a number for you want to do : ");    Option = sc.nextShort();
            switch (Option){
                case 1: {
                    System.out.println("======Area of Rectangle======");
                    System.out.print("Enter Width of Rectangle [cm]: ");width = sc.nextFloat();
                    System.out.print("Enter Length of Rectangle [cm]");Length = sc.nextFloat();
                    Area = width * Length; // This is Syntax or Grammer of thiS math
                    System.out.println("Area of Rectangle is " + Area + "cm^2");
                    break;
                }
                case 2 : {
                    System.out.println("=====Area of Triangle======");
                    System.out.print("Enter Bath of Triagle [cm] : "); Bath = sc.nextFloat();
                    System.out.print("Enter High of Triagle [cm] :"); High = sc.nextFloat();
                    Area = 0.5* Bath * High; //Syntax Triagle 1/2 * bath * high
                    System.out.println("Area of Triagle : "+ Area +"cm^2");
                    break;
                }
                case 3: {
                    System.out.println("======Area of Circle======");
                    System.out.print("Enter radius of Circle [cm]: "); radius= sc.nextFloat();
                    if(radius > 0){
                        Area =  Pi * radius*radius; //Syntax = pi*r^2
                        System.out.println("Area of Circle = " + Area + "cm^2");
                    }
                    else{
                        System.out.println("Radius can not zero and Negative value!");
                    }
                    break;
                }
                case 4: {
                    System.out.println("=======Area of Square======");
                    System.out.print("Enter width of Square [cm] : ");width = sc.nextFloat();
                    System.out.print("Enter Length of Square [cm] :");Length = sc.nextFloat();
                    if(width == Length){
                        Area = width * Length;//Syntax area = l * w
                        System.out.println("Area of Square = " + Area + "cm^2");
                    }
                    else if(width != Length){
                        System.out.println("Width and Length always Equal to if width and Legnth different value it not Sqaure");
                    }
                    break;
                }
                case 5: {
                    System.out.println("======Area of Prolelogram====== ");
                    System.out.print("Enter Base of Prolelogram [cm]:");Bath = sc.nextFloat();
                    System.out.print("Enter Height of Prolelogram [cm] :"); High = sc.nextFloat();
                    Area = Bath * High;
                    System.out.println("Area of Prolelogram = " + Area + "cm^2");
                    break;
                }
                case 6: {
                    System.out.println("======Area of Trapezoid======");
                    System.out.print("Enter a of Trapezoid[cm] : "); a = sc.nextFloat();
                    System.out.print("Enter Base of Trapezoid[cm] : "); Bath = sc.nextFloat();
                    System.out.print("Enter Height of Trapezoid[cm] :"); High = sc.nextFloat();
                    Area = 0.5*((a + Bath)*High);
                    System.out.println("Area of Trapezoid = " + Area + "cm^2");
                    break;
                }
                case 7: {
                    System.out.println("======Area of Cube======");
                    System.out.print("Enter Corner of Cube[cm] : ");ConerofCube = sc.nextFloat();
                    Area = 6 * pow(ConerofCube,2); //area = 6*i^2
                    System.out.println("Area of Cube =  " + Area + "cm^2");
                    break;
                }
                case 8 : {
                    System.out.println("=====Area of Cylinder======");
                    System.out.print("Enter radius of Cylinder[cm]: "); radius = sc.nextFloat();
                    System.out.print("Enter Height of Cylinder[cm]: "); High = sc.nextFloat();
                    Area = Pi * pow(radius,2) * High;//area = 3.15*r^2*h
                    System.out.println("Area of Cylinder = " + Area + "cm^2");
                    break;
                }
                default:{
                    System.out.println("Option not Found 404 Error!");
                }
            }
        }while(Option != 0);
    }
}
