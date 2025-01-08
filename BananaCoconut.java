/**
 * This program should accept multiple numbers as command line arguments and print those numbers out again space separated, but for multiples of 3 
print “banana” instead of the number, for multiples of 7 print “coconut” instead of the number, and for the multiples of both 
3 and 7 print “banana-coconut” instead of the number. For numbers smaller than 1, print “puttputt”. 
 * 
 * @author Vu Nguyen
 */
public class BananaCoconut { 
    /** 
     * A method that check if the number is multiple by 3 or not.
     * 
     * @param num the number that in the commandline that will be checked
     * @return boolean
     */
    private static boolean isMultipleOf3(int num){
        if(num%3 == 0 && num != 0){
            return true;
        }
        return false;
    }
    
    /** 
     * A method that check if the number is multiple by 7 or not.
     * 
     * @param num the number that in the commandline that will be checked
     * @return boolean
     */
    private static boolean isMultipleOf7(int num){
        if(num%7 == 0&& num != 0){
            return true;
        }
        return false;
    }
    
    /** 
     * A method that check if the number is multiple by 3 and 7 or not.
     * 
     * @param num the number that in the commandline that will be checked
     * @return boolean
     */
    private static boolean isMultipleOf7And3(int num){
        if(isMultipleOf3(num) && isMultipleOf7(num) && num != 0){
            return true;
        }
        return false;
    }
    
    /** 
     * A method that check if the number is less than 1 or not.
     * 
     * @param num the number that in the commandline that will be checked
     * @return boolean
     */
    private static boolean isSmallerThan1(int num){
        if(num <= 0){
            return true;
        }
        return false;
    }

    
    /** 
     * This took in the command line argument and combine it with the method of the class to print out the result.
     * 
     * @param args the command line arguments that will be checked
     */
    public static void main(String[] args){
        if(args.length == 0){
            System.err.println(
                "One or more numbers required as a command line argument.\nExample Usage: java BananaCoconut [number] [number] [...]");
        }
        try{
            for(int i = 0; i < args.length; i++){
                Integer.parseInt(args[i]);
            }
        }
        catch(NumberFormatException e){
            System.err.println(
                "One or more numbers required as a command line argument.\nExample Usage: java BananaCoconut [number] [number] [...]");
            return;
        }
        for(int i = 0; i < args.length; i++){
            if(isSmallerThan1(Integer.parseInt(args[i]))){
                System.out.print("puttputt");
            }
            else if(isMultipleOf7And3(Integer.parseInt(args[i]))){
                System.out.print("banana-coconut");
            }
            else if(isMultipleOf3(Integer.parseInt(args[i]))){
                System.out.print("banana");
            }
            else if(isMultipleOf7(Integer.parseInt(args[i]))){
                System.out.print("coconut");
            }
            else{
                System.out.print(Integer.parseInt(args[i]));
            }
            if(i != args.length-1){
                System.out.print(" ");
            }
        }
    }
}
