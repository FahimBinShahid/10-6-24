public class DecimalComperator {

    public static boolean areEqualByThreeDecimalPlaces(double parameter1, double parameter2){

        parameter1=(int)(parameter1*1000);
        parameter2=(int)(parameter2*1000);
        return parameter1 == parameter2;

    }

    public static void main(String[] args) {
       double parameter1, parameter2;
        parameter1 = 3.1756;
        parameter2 = 3.175;
        System.out.println("Comparing " + parameter1 + " and "
                + parameter2 + ": " + areEqualByThreeDecimalPlaces(parameter1, parameter2));// true


        parameter1 = 3.175;
        parameter2 = 3.176;
        System.out.println("Comparing" + parameter1 + " and "
                + parameter2 + ": "+ areEqualByThreeDecimalPlaces(parameter1, parameter2));


        parameter1 = 3.0;
        parameter2 = 3.0;
        System.out.println("Comparing" + parameter1 + " and "
                + parameter2 + ": " + areEqualByThreeDecimalPlaces(parameter1, parameter2));

        parameter1= -3.123;
        parameter2 = 3.123;
        System.out.println("Comparing" + parameter1 + " and "
                + parameter2 + ": " + areEqualByThreeDecimalPlaces(parameter1,parameter2));


    }

}