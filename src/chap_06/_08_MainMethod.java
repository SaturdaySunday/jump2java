package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        for (String s :args) {
            System.out.println(s);
        }

        if (args.length == 1) {
            switch (args[0]) {
                case "1":
                    System.out.println("조회");
                    break;
                case "2":
                    System.out.println("대출");
                    break;
                case "3":
                    System.out.println("반납");
                    break;
                default:
                    System.out.println("잘못");
            }
        }else {
            System.out.println("1~3");

        }
    }
}
