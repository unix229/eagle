package com.unix229.media.capture;


public interface ICamera {
//    public  static ICamera create() {
//        ICamera camera = null;
//        return camera;
//    }

    public void open();
    public void close();
}
