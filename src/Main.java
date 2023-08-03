public class Main {
    public static void main(String[] args) {
        String s1 = "BitCode";

        s1.toString();
        s1.hashCode();

        int [] arr = {11, 22, 33};
        arr.toString();
        arr.hashCode();

        Pixel p1 = new Pixel(10, 100);
        p1.toString();
        p1.hashCode();

        Object obj;

        obj = s1;
        System.out.println(obj.toString());
        System.out.println( ((String) obj).length() );

        System.out.println();

        obj = p1;
        System.out.println(obj.toString());
        ((Pixel) obj).draw();
        //System.out.println( ((String) obj).length() ); //class cast exception

        line();

        String str = "This is Demo " + p1;
        System.out.println(str);
        System.out.println(p1);
        System.out.println(p1.hashCode());

        line();

        Pixel p2 = new Pixel(200, 200);
        Pixel p3 = new Pixel(200, 200);

        System.out.println(p2.equals(p3));

    }

    public static void line() {
        System.out.println("------------------------------------");
    }
}
