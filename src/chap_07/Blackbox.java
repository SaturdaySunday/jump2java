package chap_07;

public class Blackbox {
    String modelName;
    String resolution;
    int price;
    String color;
    static boolean canAutoReport = false;

    int serialNumber;

    static int counter = 0;


    Blackbox(){
        System.out.println("기본 생성자");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버 : " + this.serialNumber);
    }

    Blackbox(String modelName, String resolution, int price, String color){
        this(); //기본생성자 호출
        System.out.println("사용자 정의");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동안됨");
        }


    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "입니다.");
    }

    int getVideoFlieCount(int type){
        if (type == 1) {//일반
            return 9;

        }
        else if (type == 2) {//이벤트
            return 1;

        }
        return 10;
    }

    void record(boolean showDataTime, boolean showSpeed, int min){
        System.out.println("녹화 시작");
        if (showDataTime) {
            System.out.println("영상에 날짜정보가 표시됨");

        }
        if (showSpeed) {
            System.out.println("영상에 속도표시");

        }
        System.out.println("영상은" + min + "분 단위로 기록");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터로 연결");
        //modelName = "test";


    }

    void appendModelName(String modelName) {
        this.modelName += modelName;

    }
}