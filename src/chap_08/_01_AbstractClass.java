package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화
        // 추상 클래스
        // 추상 메소드
        //Camera camera = new Camera {
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainfeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainfeature();

        }
    }

