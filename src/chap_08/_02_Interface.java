package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDtector;
import chap_08.report.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        NomalReporter nomalReporter = new NomalReporter();
        nomalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        Detectable fireDetector = new FireDtector();
        fireDetector.detect();

        Detectable advanceFireDetector = new AdvancedFireDetector();
        advanceFireDetector.detect();

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.setReporter(nomalReporter);

        factoryCam.detect();
        factoryCam.report();


    }
}
