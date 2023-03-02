public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");  //to print and have "\n" after it
        // System.out.printf("Hi,There");
        System.out.printf("Hi,There").println();
        System.out.printf("5 * 2 = %d" , 5*2).println();
        System.out.printf("%d %d %d", 5, 7, 5*7).println();
        System.out.printf("%d * %d = %d", 5, 7, 5*7).println();
        System.out.printf("Print %s", "Testing").println();
        System.out.printf("%f + %f = %f", 5.5, 6.5, 7.5).println();

        //adding int and String gives you a new String
        System.out.println("1"+2);
        int i = 5;
        System.out.println("value of i is " + i);

    }
}
