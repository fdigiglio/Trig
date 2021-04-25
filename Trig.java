import java.util.*;
import java.lang.*;


public class Trig{

    //Instance Variables
    private double angle;
    

    public Trig(double pAngle){
        this.angle = pAngle;
        
    }

    public Trig(){

    }


    public double getReferenceAng(){
        double ang = this.angle;

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

    public double getQuadrant(){

        double ang = this.angle;

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

    public String getSpecialSin(){
        double referenceAng = getReferenceAng();
        double quadrant = getQuadrant();

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


    public String getSpecialCos(){
        double referenceAng = getReferenceAng();
        double quadrant = getQuadrant();
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

    public boolean isInterger(double n){
        return n % 1 == 0;
    }

/*
    public String getSin(){
        double angleDegrees = this.angle;
        double angleInRadians = Math.toRadians(angleDegrees);
        double valueOfSin = Math.sin(angleInRadians);
        
        double numerator = 0.8;
        int denominator = 1;

        while(!isInterger(numerator * denominator)){
            denominator++;
        }
        return numerator * denominator + "/" + denominator;




        //return "Value of sin(" + angleDegrees + ") = " + valueOfSin;
        
    }
*/


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

    public void getLegValue(){
        Scanner input = new Scanner(System.in);
        System.out.println("1) SOH\n2) CAH \n3) TOA");
        int sohcahtoaDecision = input.nextInt();
        if(sohcahtoaDecision == 1){
            System.out.println("What part of triangle is missing according to theta?");
            System.out.println("1) Opposite\n2) Hypotenuse");
            int missing = input.nextInt();
            if(missing == 1){
                System.out.println("What is the hypotenuse?");
                double hypotenuse = input.nextInt();
                System.out.println("What is your angle measurment?");
                double angleMeasurment = input.nextDouble();
                double opposite = getDecimalSin(angleMeasurment) * hypotenuse;
                System.out.println("Hypotenuse: " + Math.round(hypotenuse) + "\nOpposite: " + Math.round(opposite) + "\nAdjacent: " + Math.round(getDecimalCos(angleMeasurment) * hypotenuse));
            } else if(missing == 2){
                System.out.println("What is the opposite?");
                double opposite = input.nextInt();
                System.out.println("What is your angle measurment?");
                double angleMeasurment = input.nextDouble();
                double hypotenuse = opposite / getDecimalSin(angleMeasurment);
                System.out.println("Hypotenuse: " + Math.round(hypotenuse) + "\nOpposite: " + Math.round(opposite) + "\nAdjacent: " + Math.round(getDecimalCos(angleMeasurment) * hypotenuse));
            }
        } 
        else if(sohcahtoaDecision == 2){
            System.out.println("What part of triangle is missing according to theta?");
            System.out.println("1) Adjacent\n2) Hypotenuse");
            int missing = input.nextInt();
            if(missing == 1){
                System.out.println("What is the hypotenuse?");
                double hypotenuse = input.nextInt();
                System.out.println("What is your angle measurment?");
                double angleMeasurment = input.nextDouble();
                double adjacent = getDecimalCos(angleMeasurment) * hypotenuse;
                System.out.println("Hypotenuse: " + Math.round(hypotenuse) + "\nOpposite: " + Math.round(getDecimalSin(angleMeasurment) * hypotenuse) + "\nAdjacent: " + Math.round(adjacent));
            } else if(missing == 2){
                System.out.println("What is the adjacent?");
                double adjacent = input.nextInt();
                System.out.println("What is your angle measurment?");
                double angleMeasurment = input.nextDouble();
                double hypotenuse = adjacent / getDecimalCos(angleMeasurment);
                System.out.println("Hypotenuse: " + Math.round(hypotenuse) + "\nOpposite: " + Math.round(getDecimalSin(angleMeasurment) * hypotenuse) + "\nAdjacent: " + Math.round(adjacent));
            }
        }
        else if(sohcahtoaDecision == 3){
            System.out.println("What part of triangle is missing according to theta?");
            System.out.println("1) Adjacent\n2) Opposite");
            int missing = input.nextInt();
            if(missing == 1){
                System.out.println("What is the Opposite?");
                double opposite = input.nextInt();
                System.out.println("What is your angle measurment?");
                double angleMeasurment = input.nextDouble();
                double adjacent = opposite / getDecimalTan(angleMeasurment);
                System.out.println("Hypotenuse: " + Math.round(opposite / getDecimalSin(angleMeasurment)) + "\nOpposite: " + Math.round(opposite) + "\nAdjacent: " + Math.round(adjacent));
            } else if(missing == 2){
                System.out.println("What is the Adjacent?");
                double adjacent = input.nextInt();
                System.out.println("What is your angle measurment?");
                double angleMeasurment = input.nextDouble();
                double opposite = adjacent * getDecimalTan(angleMeasurment);
                System.out.println("Hypotenuse: " + opposite / getDecimalSin(angleMeasurment) + "\nOpposite: " + opposite + "\nAdjacent: " + adjacent);
            }
        }

            
    }

    

    

}