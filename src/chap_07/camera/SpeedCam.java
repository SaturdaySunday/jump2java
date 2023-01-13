package chap_07.camera;

public class SpeedCam extends Camera {


    public SpeedCam() {
        this.name = "과속단속";
    }


    public void checkSpeed() {
        System.out.println("속도측정");

    }

    public void recongnizeLicensePlate() {
        System.out.println("차량 번호를 인식");
    }
    @Override
    public void showMainFeature() {
        System.out.println(this.name + "의 주요기능 : 속도 측정, 번호 인식");
    }


}
