package com.unix229.media.capture;

import android.graphics.SurfaceTexture;

import java.util.Set;

abstract class CameraService {

    protected Callback mCallback;

    protected SurfaceTexture mSurfaceTexture;
    protected int mWidth;
    protected int mHeight;
    CameraService() {
        mCallback = null;
        mSurfaceTexture = null;
        mWidth = 0;
        mHeight = 0;
    }

    void setCallback(Callback callback) {
        mCallback = callback;
    }

    void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        mSurfaceTexture = surfaceTexture;
    }

    void setSize(int width, int height) {
        mWidth = width;
        mHeight = height;
    }
    /**
     * @return {@code true} if the implementation was able to start the camera session.
     */
    abstract boolean start();

    abstract void stop();

    abstract void surfaceChanged();

    abstract boolean isCameraOpened();

    abstract void setFacing(int facing);

    abstract int getFacing();

    abstract Set<AspectRatio> getSupportedAspectRatios();

    /**
     * @return {@code true} if the aspect ratio was changed.
     */
    abstract boolean setAspectRatio(AspectRatio ratio);

    abstract AspectRatio getAspectRatio();

    abstract void setAutoFocus(boolean autoFocus);

    abstract boolean getAutoFocus();

    abstract void setFlash(int flash);

    abstract int getFlash();

    abstract void takePicture();

    abstract void setDisplayOrientation(int displayOrientation);

    interface Callback {

        void onCameraOpened();

        void onCameraClosed();

        void onPictureTaken(byte[] data);

    }

}