package chap_07;

public class _07_This {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelName = "꺼멍";
        b1.appendModelName("(최신)");
        System.out.println(b1.modelName);

    }
}
