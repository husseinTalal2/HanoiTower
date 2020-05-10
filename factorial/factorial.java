package factorial;
public class factorial {
    
    public static int fact(int a) {
        return (a != 1) ? a * fact(a -1) : 1 ;
    }
    
    public static void main(String[] args) {
        int x = 5;
        int factResult = fact(x);
        System.out.println( "the result is :" + factResult);        
    }
}