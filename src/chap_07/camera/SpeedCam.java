package chap_07.camera;

public class SpeedCam extends Camera {


    public SpeedCam() {
        super("과속단속");
    }

    public void takePicture() {
        //사진 촬영
        //System.out.println(this.name + " : 사진을 촬영합니다.");
        super.takePicture();
        checkSpeed();
        recongnizeLicensePlate();
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