package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelName = "꺼멍";
        System.out.println(b1.modelName);

        Blackbox b2 = new Blackbox();
        b2.modelName = "하양";
        System.out.println(b2.modelName);

        System.out.println(" - 개발 전 - ");
        System.out.println(b1.modelName + "자동 신고 시능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + "자동 신고 시능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + Blackbox.canAutoReport);

        //기능개발
        Blackbox.canAutoReport = true;

        System.out.println(" - 개발 후 - ");
        System.out.println(b1.modelName + "자동 신고 시능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + "자동 신고 시능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + Blackbox.canAutoReport);

    }
}
