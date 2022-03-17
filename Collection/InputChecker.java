package Collection;

public class InputChecker {

    public InputChecker(){}

    private  static final double eps = 1E-6;
    public static boolean integerValidCheck(String s, int min, int max){
        try{
            int x = Integer.parseInt(s);
            if(x >= min && x <= max) return true;
            System.out.println("Input is invalid. Please enter the integer in correct range");
            return false;
        } catch(NumberFormatException e){
            System.out.println("Input is invalid. Please enter a integer number");
            return false;
        }
    }

    public static boolean doubleValidCheck(String s, Double min, Double max){
        try{
            Double x = Double.parseDouble(s);
            if( x - min > eps && max - x > eps){
                return true;
            }
            System.out.println("Input is invalid. Please enter the double number in correct range");
            return false;
        } catch (NumberFormatException e){
            System.out.println("Input is invalid. Please enter a double number");
            return false;
        }
    }
    public boolean longValidCheck(String s, Long min, Long max){
        try{
            long x = Long.parseLong(s);
            if(x >= min && x <= max) return true;
            System.out.println("Input is invalid. Please enter the long number in correct range");
            return false;
        } catch(NumberFormatException e){
            System.out.println("Input is invalid. Please enter a long number");
            return false;
        }
    }

}
