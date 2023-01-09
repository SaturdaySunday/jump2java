package chap_03;

public class _03_String3 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java"));
        System.out.println(s2.equalsIgnoreCase("python"));

        s1 = "1234"; //참조값 벽의 메모지
        s2 = "1234";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        s1 = new String("1234"); // 각각의 메모지
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); //이름만같고 다른위치에 값이존재
    }
}
