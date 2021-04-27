import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws InputMismatchException{


        
        Trig triangle = new Trig();
    
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("What do you need?\n1) Find Angle Measure (If you have 2 sides)\n2) Complete Triangle (If you have 1 side; 1 angle)\n3) Find Reference Angle of given angle \n4) Table Output (CONFIRM WITH TABLE) \n5) Log Off");
            int numInput = input.nextInt();

            if(numInput == 1){
                System.out.println(triangle.getAngleValue());
            } 
            else if(numInput == 2){
                triangle.getLegValue();
            } 
            else if(numInput == 3){
                System.out.println("What is your angle? ");
                double angleInput = input.nextDouble();
                System.out.println("Reference Angle = " + triangle.getReferenceAng(angleInput));
            }
            else if(numInput == 4){
                System.out.println("Enter what special angle: (RELATES TO TABLE) \n1) 0\u00B0 \n2) 30\u00B0 \n3) 45\u00B0 \n4) 60\u00B0 \n5) 90\u00B0");
                int specialAngle = input.nextInt();
                if(specialAngle == 1){
                    System.out.println("Sin = " + triangle.getSpecialSin(0));
                    System.out.println("Cos = " + triangle.getSpecialCos(0));
                    System.out.println("Tan = " + triangle.getSpecialTan(0));
                } else if(specialAngle == 2){
                    System.out.println("Sin = " + triangle.getSpecialSin(30));
                    System.out.println("Cos = " + triangle.getSpecialCos(30));
                    System.out.println("Tan = " + triangle.getSpecialTan(30));
                } else if(specialAngle == 3){
                    System.out.println("Sin = " + triangle.getSpecialSin(45));
                    System.out.println("Cos = " + triangle.getSpecialCos(45));
                    System.out.println("Tan = " + triangle.getSpecialTan(45));
                } else if(specialAngle == 4){
                    System.out.println("Sin = " + triangle.getSpecialSin(60));
                    System.out.println("Cos = " + triangle.getSpecialCos(60));
                    System.out.println("Tan = " + triangle.getSpecialTan(60));
                } else if(specialAngle == 5){
                    System.out.println("Sin = " + triangle.getSpecialSin(90));
                    System.out.println("Cos = " + triangle.getSpecialCos(90));
                    System.out.println("Tan = " + triangle.getSpecialTan(90));
                }
            }
            else if(numInput == 5){
                System.out.println("Re-run to get asked again!");
                input.close();
                break;
            }
            else if(numInput > 5 || numInput < 1){
                System.out.println("Incorrect Number\nRerun");
                input.close();
                break;
            }
        }
        
       
        
    }
}