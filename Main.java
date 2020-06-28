import java.util.*;
public class Main {
    public static int sortDesc(final int num) {
        //Your code
            String a = Integer.toString(num);
            System.out.println(a);
            String[] numbers = a.split("");
            String result = "";

            Arrays.sort(numbers);

           /* for(int j = 0; j < numbers.length; ++j){
                System.out.println(numbers[j]);
            }*/

            for(int i = numbers.length - 1; i > -1 ; --i) {
                result = result + numbers[i];
            }
        return Integer.parseInt(result);
    }
    public static void main(String[] args){
        int c = sortDesc( 145263);
        System.out.println(c);
    }
}
