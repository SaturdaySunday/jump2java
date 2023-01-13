package chap_07.camera;

public class FactoryCam extends Camera {

    public FactoryCam() {
        this.name = "공장 카메라";
    }
        public void detectFire() {
            System.out.println("불이야");
        }
    public void showMainFeature() {
        System.out.println(this.name + "의 주요기능 : 화재 감지");
    }
        }





