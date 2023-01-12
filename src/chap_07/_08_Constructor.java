package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();

        Blackbox b2 = new Blackbox("꺼멍", "UHD", 300000, "검정");
        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);

    }
}
