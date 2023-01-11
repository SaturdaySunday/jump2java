package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        String[] coffees = new String[4];
        //String coffees[] = new String[4];
        coffees[0] = "아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "라떼";
        coffees[3] = "카푸치노";

        //String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸니노"};
        //String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸니노"};

        System.out.println(coffees[0] + "하나");
        System.out.println(coffees[1] + "하나");
        coffees[2] = "에스";
        System.out.println(coffees[2] + "하나");
        System.out.println(coffees[3] + "하나");
        System.out.println("내놔");






    }
}
