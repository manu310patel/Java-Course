public class WrapperClasses {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(i);

        Integer i3 = Integer.valueOf(5);
        Integer i4 = Integer.valueOf(5);

        // Integer i5 = new Integer(5);   //deprecated
        // Integer i6 = new Integer(5);
        // System.out.println(i5==i6);   //will give false

        System.out.println(i3 == i4);  //true

        //autoboxing
        Integer i1 = 5; //to achieve this java in background will use valueOf
        Integer i2 = 5;

        System.out.println(i1 == i2);  //true
        //Integer.MAX_VALUE
        //Integer.MIN_VALUE
        //Integer.SIZE
        //Integer.BYTES

        //refer to JavaDates.java

    }
}
