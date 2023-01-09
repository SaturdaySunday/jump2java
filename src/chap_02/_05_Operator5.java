package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int max = (x >y) ? 1 : 2;
        System.out.println(max);

        int min = (x <y) ? x : y;
        System.out.println(min);


        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = (x != y) ? "다름" : "같음";
        System.out.println(s);
    }
}
