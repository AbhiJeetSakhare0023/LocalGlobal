public class LocalGlobal {
    static int num; // global static form main
    boolean b; // global non-static for main
    static char b1 ; // global static for main 2 method
    double d; // global non-static form main 2

    public  void main2()
    {

        System.out.println("we can access global static in non-static context. "+b1); // we can access global static in non-static context.
        System.out.println("----------------------------------------------------");
        System.out.println("we can access global non-static in non-static context. "+d);// we can access global non-static in non-static context.
        System.out.println("----------------------------------------------------");
    }
    public static void main(String[] args) {
        String s;
       // System.out.println(s); shows CTE java: variable s might not have been initialized
        System.out.println("----------------------------------------------------");
        System.out.println("we can access global static variable in static context.// print default value "+num); // static variable in static context.// print default value //
        LocalGlobal e1 = new LocalGlobal();
        System.out.println("----------------------------------------------------");
        e1.main2();// we can access no-static method in static context using object creation
        System.out.println("we can access global non-static in static by creating object. "+e1.b); //  we can access global non-static in static by creating object.


        final int a1=10;
       // a1++;
        System.out.println("----------------------------------------------------");
        System.out.println(" We can not modify if prefixed with final "+a1);
        System.out.println("----------------------------------------------------");
        System.out.println(" -- we can not prefix public,private,protected to LOCAL");

    }

}
