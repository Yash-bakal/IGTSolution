package P3;

public class Demo2 {
    public static void main(String[] args) {

        String s = new String("Ramesh"); // immutable
        System.out.println(s);

        s = s.concat(" Kumar");
        System.out.println(s);

        //it's thread safe
        StringBuffer sb = new StringBuffer("Pravin");
        System.out.println(sb);

        sb.append(" Kumar");
        System.out.println(sb);

        sb.insert(0, "Mr ");
        System.out.println(sb);

        sb.delete(0, 3);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        //it's not safe
        StringBuilder sb1 = new StringBuilder("Charan");
        System.out.println(sb1);

        sb1.append(" Kumar");
        System.out.println(sb1);
    }

 

}