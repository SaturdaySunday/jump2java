package chap_07;

import java.lang.module.ResolutionException;

public class _18_Enum {
    public static void main(String[] args) {

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.print("동영상 품질 : ");
        switch (resolution) {
            case HD :
                System.out.println("일반");
                break;
            case FHD:
                System.out.println("고");
                break;
            case UHD:
                System.out.println("초고");
                break;
        }

        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.ordinal());
        }

        System.out.println("-------------");
        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }

    }
}

enum Resolution {
    HD(720),FHD(1080),UHD(3840);

    private final int width;
    Resolution(int width) {
        this.width = width;

    }

    public int getWidth() {
        return width;
    }
}
