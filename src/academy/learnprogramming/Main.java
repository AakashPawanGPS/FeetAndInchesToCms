package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(7,8);
        calcFeetAndInchesToCentimeters(100);

    }
    public static double calcFeetAndInchesToCentimeters(double feet , double inches){
        if(feet>=0 && (inches>=0 && inches<=12)){                        //1cm=0.393in,0.033ft
            double cms = ((2.54*inches)+(30.47*feet));
            System.out.println(feet+" ft,"+inches+" inches = "+cms+" cm");
            return cms;
        }
        else {
            System.out.println("Invalid Parameters");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches>=0){
            double feet = (int)inches / 12;
            double rem = (int)inches % 12;
            System.out.println(inches+" inches = "+feet+" feet and "+rem+" inches");
            return calcFeetAndInchesToCentimeters(feet,rem);
        }
        else {
            System.out.println("Invalid Parameters");
            return -1;
        }
    }
}
