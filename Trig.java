import java.util.*;



public class Trig{

    //Instance Variables
    private double angle;
    private Scanner input;
    private int numerator;
    private int denominator;

    public Trig(double pAngle){
        this.angle = pAngle;
        
    }

    public Trig(){

    }


    public double getReferenceAng(double ang){
        if(ang > 360){
            while(ang > 360){
                ang -= 360;
            }
        } 

        if(ang < 0){
            while(ang < 0){
                ang += 360;
            }
        }
        
        if(ang > 270){
            return 360 - ang;
        } 
        else if(ang > 180){
            return ang - 180;
            
        } 
        else if(ang > 90){
            return 180 - ang;
        } 
        else if(ang > 0){
            return ang;
        } 
        else {
            return 0;
        }
    }

    public double getQuadrant(double ang){

        

        if(ang > 360){
            while(ang > 360){
                ang -= 360;
            }
        }

        if(ang < 0){
            while(ang < 0){
                ang += 360;
            }
        }
        
        if(ang > 270){
            return 4;
        } 
        else if(ang > 180){
            return 3;
        } 
        else if(ang > 90){
            return 2;
        } 
        else if(ang > 0){
            return 1;
        } 
        else {
            return 0;
        }
    }

    public String getSpecialSin(double ang){
        double referenceAng = getReferenceAng(ang);
        double quadrant = getQuadrant(ang);

        if(referenceAng == 0){
            return "0";
        } 
        else if(referenceAng == 30 && quadrant >= 3){
            return "-1/2";
        } 
        else if(referenceAng == 30){
            return "1/2";
        }
        else if(referenceAng == 45 && quadrant >= 3){
            return "-\u221A" + 2 + "/" + 2;
        }
        else if(referenceAng == 45){
            return "\u221A" + 2 + "/" + 2;
        }
        else if(referenceAng == 60 && quadrant >= 3){
            return "-\u221A" + 3 + "/" + 2;
        }
        else if(referenceAng == 60){
            return "\u221A" + 3 + "/" + 2;
        }
        else if(referenceAng == 90 && quadrant >= 3){
            return "-1";
        } 
        else if(referenceAng == 90){
            return "1";
        }
        else {
            return "Not Valid";
        }
        
    }

    public String getSpecialCos(double ang){
        double referenceAng = getReferenceAng(ang);
        double quadrant = getQuadrant(ang);
        boolean divisibleBy360 = false;
        boolean divisibleBy180 = false;
        boolean divisibleBy90 = false;

        if(this.angle % 360 == 0){
            divisibleBy360 = true;
        } else if(this.angle % 180 == 0){
            divisibleBy180 = true;
        } else if(this.angle % 90 == 0){
            divisibleBy90 = true;
        }
        
        if(referenceAng == 30 && quadrant > 1 && quadrant < 4){
            return "-\u221A" + 3 + "/" + 2;
        } 
        else if(referenceAng == 30){
            return "\u221A" + 2 + "/" + 2;
        }
        else if(referenceAng == 45 && quadrant > 1 && quadrant < 4){
            return "-\u221A" + 2 + "/" + 2;
        }
        else if(referenceAng == 45){
            return "\u221A" + 2 + "/" + 2;
        }
        else if(referenceAng == 60 && quadrant > 1 && quadrant < 4){
            return "-1/2";
        }
        else if(referenceAng == 60){
            return "1/2";
        }
        else if(divisibleBy360){
            return "1";
        }
        else if(divisibleBy180){
            return "-1";
        }
        else if(divisibleBy90){
            return "0";
        }
        else {
            return "Not Valid";
        }
        
    }

    public String getSpecialTan(double ang){
        double referenceAng = getReferenceAng(ang);
        double quadrant = getQuadrant(ang);
        boolean divisibleBy360 = false;
        boolean divisibleBy180 = false;
        boolean divisibleBy90 = false;

        if(this.angle % 360 == 0){
            divisibleBy360 = true;
        } else if(this.angle % 180 == 0){
            divisibleBy180 = true;
        } else if(this.angle % 90 == 0){
            divisibleBy90 = true;
        }
        
        if(referenceAng == 30 && (quadrant == 2 || quadrant == 4)){
            return "-\u221A" + 3 + "/" + 3;
        } 
        else if(referenceAng == 30){
            return "\u221A" + 3 + "/" + 3;
        }
        else if(referenceAng == 45 && (quadrant == 2 || quadrant == 4)){
            return "-1";
        }
        else if(referenceAng == 45){
            return "1";
        }
        else if(referenceAng == 60 && (quadrant == 2 || quadrant == 4)){
            return "-\u221A" + 3;
        }
        else if(referenceAng == 60){
            return "\u221A" + 3;
        }
        else if(divisibleBy360){
            return "0";
        }
        else if(divisibleBy180){
            return "0";
        }
        else if(divisibleBy90){
            return "Not Defined";
        }
        else {
            return "Not Valid";
        }
    }

    public double getDecimalSin(double angle){
        double angleInRadians = Math.toRadians(angle);
        double valueOfSin = Math.sin(angleInRadians);
        return valueOfSin;
    }

    public double getDecimalCos(double angle){
        double angleInRadians = Math.toRadians(angle);
        double valueOfCos = Math.cos(angleInRadians);
        return valueOfCos;
    }

    public double getDecimalTan(double angle){
        double angleInRadians = Math.toRadians(angle);
        double valueOfTan = Math.tan(angleInRadians);
        return valueOfTan;
    }

    public double getAngleValueSin(double x, double y){
        double inRadians = Math.asin(x/y);
        double inDegrees = Math.toDegrees(inRadians);
        return inDegrees;
    }

    public double getAngleValueCos(double x, double y){
        double inRadians = Math.acos(x/y);
        double inDegrees = Math.toDegrees(inRadians);
        return inDegrees;
    }

    public double getAngleValueTan(double x, double y){
        double inRadians = Math.atan(x/y);
        double inDegrees = Math.toDegrees(inRadians);
        return inDegrees;
    }

    public String getAngleValue(){
        
        input = new Scanner(System.in);
        System.out.println("What are your legs according to theta? (Ex: Opposite and Hypotenuse)");
        System.out.println("1) Opposite & Hypotenuse\n2) Adjacent & Hypotenuse\n3) Opposite & Adjacent");
        int typeInput = input.nextInt();

        if(typeInput == 1){
            System.out.println("Enter Value of Opposite Leg (According to THETA): ");
            double oppositeLeg = input.nextInt();
            System.out.println("Enter Value of Hypotenuse Leg (According to THETA): ");
            double hypotenuseLeg = input.nextInt();
            double angleValue = getAngleValueSin(oppositeLeg, hypotenuseLeg);
            return "The Angle Theta = " + Math.round(angleValue) + "\u00B0";
        } 
        else if(typeInput == 2){
            System.out.println("Enter Value of Adjacent Leg (According to THETA): ");
            int adjacentLeg = input.nextInt();
            System.out.println("Enter Value of Hypotenuse Leg (According to THETA): ");
            int hypotenuseLeg = input.nextInt();
            double angleValue = getAngleValueCos(adjacentLeg, hypotenuseLeg);
            return "The Angle Theta = " + Math.round(angleValue) + "\u00B0";
        } 
        else if(typeInput == 3){
            System.out.println("Enter Value of Opposite Leg (According to THETA): ");
            double oppositeLeg = input.nextDouble();
            System.out.println("Enter Value of Adjacent Leg (According to THETA): ");
            double adjacentLeg = input.nextDouble();
            double angleValue = getAngleValueTan(oppositeLeg, adjacentLeg);
            return "The Angle Theta = " + Math.round(angleValue) + "\u00B0";
        } else 
            return "0";
    
    }

    public void getLegValue(){
        input = new Scanner(System.in);
        System.out.println("Enter what Trig Function you want to use (i.e If you have the opposite and is missing hypotenuse use SOH): ");
        System.out.println("1) SOH (Sin = OPPOSITE / HYPOTENUSE)\n2) CAH (Cos = ADJACENT / HYPOTENUSE)\n3) TOA (Tan = OPPOSITE / ADJACENT)");
        int sohcahtoaDecision = input.nextInt();
        
        //Sin
        if(sohcahtoaDecision == 1){
            System.out.println("What part of triangle is missing according to theta?");
            System.out.println("1) Opposite\n2) Hypotenuse");
            int missing = input.nextInt();

            if(missing == 1){
                System.out.println("What is the hypotenuse?");
                double hypotenuse = input.nextDouble();
                
                System.out.println("What is your angle measurment?");
                double angleMeasurment = input.nextDouble();
                
                double opposite = getDecimalSin(angleMeasurment) * hypotenuse;
                
                double adjacent = getDecimalCos(angleMeasurment) * hypotenuse;
                
                System.out.println("========================================================================\nHypotenuse: " + hypotenuse + "\nOpposite: " + opposite + "\nAdjacent: " + adjacent);
                System.out.println("\nSix Trig Functions:\nSin " + opposite + "/" + hypotenuse + "\nCosec: " + hypotenuse + "/" + opposite + "\n\nCos: " + adjacent + "/" + hypotenuse + "\nSec: " + hypotenuse + "/" + adjacent + "\n\nTan: " + opposite + "/" + adjacent + "\nCot: " + adjacent + "/" + opposite);
                System.out.println("\nThe work for OPPOSITE = " + hypotenuse + " * sin(" + angleMeasurment + ")");
                System.out.println("The work for ADJACENT = " + hypotenuse + " * cos(" + angleMeasurment + ")\n");
            } 

            else if(missing == 2){
                System.out.println("What is the opposite?");
                double opposite = input.nextDouble();
        
                System.out.println("What is your angle measurment?");
                double angleMeasurment = input.nextDouble();

                double hypotenuse = opposite / getDecimalSin(angleMeasurment);
                
                double adjacent = getDecimalCos(angleMeasurment) * hypotenuse;

                System.out.println("========================================================================\nHypotenuse: " + hypotenuse + "\nOpposite: " + opposite + "\nAdjacent: " + adjacent);
                System.out.println("\nSix Trig Functions:\nSin " + opposite + "/" + hypotenuse + "\nCosec: " + hypotenuse + "/" + opposite + "\n\nCos: " + adjacent + "/" + hypotenuse + "\nSec: " + hypotenuse + "/" + adjacent + "\n\nTan: " + opposite + "/" + adjacent + "\nCot: " + adjacent + "/" + opposite);
                System.out.println("\nThe work for HYPOTENUSE = " + opposite + " / sin(" + angleMeasurment + ")");
                System.out.println("The work for ADJACENT = " + hypotenuse + " * cos(" + angleMeasurment + ")\n");
            }
        } 
        //Cos
        else if(sohcahtoaDecision == 2){
            System.out.println("What part of triangle is missing according to theta?");
            System.out.println("1) Adjacent\n2) Hypotenuse");
            int missing = input.nextInt();
            if(missing == 1){
                System.out.println("What is the hypotenuse?");
                double hypotenuse = input.nextDouble();

                System.out.println("What is your angle measurment?");
                double angleMeasurment = input.nextDouble();
                double adjacent = getDecimalCos(angleMeasurment) * hypotenuse;

                double opposite = getDecimalSin(angleMeasurment) * hypotenuse;

                System.out.println("========================================================================\nHypotenuse: " + hypotenuse + "\nOpposite: " + opposite + "\nAdjacent: " + adjacent);
                System.out.println("\nSix Trig Functions:\nSin " + opposite + "/" + hypotenuse + "\nCosec: " + hypotenuse + "/" + opposite + "\n\nCos: " + adjacent + "/" + hypotenuse + "\nSec: " + hypotenuse + "/" + adjacent + "\n\nTan: " + opposite + "/" + adjacent + "\nCot: " + adjacent + "/" + opposite);
                System.out.println("\nThe work for ADJACENT = " + hypotenuse + " * cos(" + angleMeasurment + ")");
                System.out.println("The work for OPPOSITE = " + hypotenuse + " * sin(" + angleMeasurment + ")\n");
            } 
            else if(missing == 2){
                System.out.println("What is the adjacent?");
                double adjacent = input.nextDouble();
                
                System.out.println("What is your angle measurment?");
                double angleMeasurment = input.nextDouble();

                double hypotenuse = adjacent / getDecimalCos(angleMeasurment);

                double opposite = getDecimalSin(angleMeasurment) * hypotenuse;
                
                System.out.println("========================================================================\nHypotenuse: " + hypotenuse + "\nOpposite: " + opposite + "\nAdjacent: " + adjacent);
                System.out.println("\nSix Trig Functions:\nSin " + opposite + "/" + hypotenuse + "\nCosec: " + hypotenuse + "/" + opposite + "\n\nCos: " + adjacent + "/" + hypotenuse + "\nSec: " + hypotenuse + "/" + adjacent + "\n\nTan: " + opposite + "/" + adjacent + "\nCot: " + adjacent + "/" + opposite);
                System.out.println("\nThe work for HYPOTENUSE = " + adjacent + " / cos(" + angleMeasurment + ")");
                System.out.println("The work for OPPOSITE = " + hypotenuse + " * sin(" + angleMeasurment + ")\n");

            }
        }
        //Tan 
        else if(sohcahtoaDecision == 3){
            System.out.println("What part of triangle is missing according to theta?");
            System.out.println("1) Adjacent\n2) Opposite");
            int missing = input.nextInt();
            if(missing == 1){
                System.out.println("What is the Opposite?");
                double opposite = input.nextDouble();
                
                System.out.println("What is your angle measurment?");
                double angleMeasurment = input.nextDouble();
                double adjacent = opposite / getDecimalTan(angleMeasurment);
                
                double hypotenuse = opposite / getDecimalSin(angleMeasurment);
                
                System.out.println("========================================================================\nHypotenuse: " + hypotenuse + "\nOpposite: " + opposite + "\nAdjacent: " + adjacent);
                System.out.println("\nSix Trig Functions:\nSin " + opposite + "/" + hypotenuse + "\nCosec: " + hypotenuse + "/" + opposite + "\n\nCos: " + adjacent + "/" + hypotenuse + "\nSec: " + hypotenuse + "/" + adjacent + "\n\nTan: " + opposite + "/" + adjacent + "\nCot: " + adjacent + "/" + opposite);
                System.out.println("\nThe work for ADJACENT = " + opposite + " / tan(" + angleMeasurment + ")");
                System.out.println("The work for HYPOTENUSE = " + opposite + " / sin(" + angleMeasurment + ")\n");

            } else if(missing == 2){
                System.out.println("What is the Adjacent?");
                double adjacent = input.nextDouble();
                
                System.out.println("What is your angle measurment?");
                double angleMeasurment = input.nextDouble();
                
                double opposite = adjacent * getDecimalTan(angleMeasurment);
                
                double hypotenuse = opposite / getDecimalSin(angleMeasurment);

                System.out.println("========================================================================\nHypotenuse: " + hypotenuse + "\nOpposite: " + opposite + "\nAdjacent: " + adjacent);
                System.out.println("\nSix Trig Functions:\nSin " + opposite + "/" + hypotenuse + "\nCosec: " + hypotenuse + "/" + opposite + "\n\nCos: " + adjacent + "/" + hypotenuse + "\nSec: " + hypotenuse + "/" + adjacent + "\n\nTan: " + opposite + "/" + adjacent + "\nCot: " + adjacent + "/" + opposite);
                System.out.println("\nThe work for opposite: " + adjacent + " * tan(" + angleMeasurment + ")");
                System.out.println("The work for hypotenuse: " + opposite + " / sin(" + angleMeasurment + ")\n");
            }
        }

            
    }

    public void reduceFraction(int x, int y){
        int d;
        d = gcd(x, y);
        
        x = x / d;
        y = y / d;

        numerator = x;
        denominator = y;
    }

    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b, a % b);
        }
    }

    public void convert(){
        Scanner scan = new Scanner(System.in);
        String pi = "\u03C0";
        System.out.println("Enter the conversion type: \n1) Degrees to Radians \n2) Radians to Degrees");
        int conversionType = scan.nextInt();
        if(conversionType == 1){
            System.out.println("Enter your degrees: ");
            int degrees = scan.nextInt();
            int numeratorDegrees = degrees;
            int denominatorDegrees = 180;
            reduceFraction(numeratorDegrees, denominatorDegrees);
            System.out.println(numerator + "\u03C0/" + denominator);
            
        } 
        // else if(conversionType == 2){
        //     System.out.println("Enter your radians numerator: ");
        //     int radiansNumerator = scan.nextInt();
        //     System.out.println("Enter your");
        // }
        

    }

    

}