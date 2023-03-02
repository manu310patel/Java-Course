import java.math.BigDecimal;

public class Main{
    public static void main(String[] args) {
        /*
         * Wrapper classes Byte,Short,Integer,Long
         * Size     => Byte.SIZE
         * Bytes    => Byte.BYTES
         * MaxVal   => Byte.MAX_VAL
         * MinVal   => Byte.MIN_VAL 
         */
        long l = 500000000000l;
        System.out.println(l);
        
        //java supports octal and hexadecimal
        //anything starting with 0 -> octal for ex 010
        //anything starting with 0x -> hexadecimal for 0x
        //java supports each all of number systems
        int eight = 010;  
        int sixteen = 0x10;
        int fifteen = 0XF;

        System.out.println(eight+" "+sixteen+" "+fifteen);

        int i = 5;
        // short s = i; wrong
        short s = (short)i;
        System.out.println(s);

        //43.5  is double by default and not float
        float val = 43.5f;
        
        System.out.println(val);

        // int x = val; error
        int x = (int) val;
        System.out.println(x);

        //floating and double points are not very accurate
        System.out.println(34.56789876 + 34.2234);
        //res = 68.79129875999999

        BigDecimal number1 = new BigDecimal("34.56789876");
        BigDecimal number2 = new BigDecimal("34.2234");
        BigDecimal number3 = number1.add(number2);
        System.out.println(number3);

        //Bigdecimal is an immutable class once assigned values
        //cannot be changed
        //use number as string inside bigdecimal to get accurate values
        BigDecimal number4 = new BigDecimal("5.023");
        BigDecimal number5 = new BigDecimal(5.023); //not accurate, can be used
        // when the number is a integer
        System.out.println(number4+"\n"+number5);

        int four = 4;
        System.out.println(new BigDecimal(four).multiply(number5));

        //java supports all unicode characters
        char ch3 = '\u00A2';
        char ch4 = 65; //"A"
        System.out.println(ch3+" "+ch4);
        System.out.println(ch4+5); //here ch4 will be converted to larger type
                                // which is int
        char ch5 = '\n';
        System.out.println(ch5);
        
        String text1 = "\n is used for next line";
        System.out.println(text1); 
        String text2 = "\\n is used for next line";
        System.out.println(text2);
    }
}