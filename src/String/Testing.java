package String;

public class Testing {
    public static void main(String[] args){
        String s = "hello";
        s.concat("world");
        System.out.print(s);

        String a = "abc";
        String b = new String("abc");


        System.out.println(a==b);
        System.out.println(a.equals(b));


    }
}
