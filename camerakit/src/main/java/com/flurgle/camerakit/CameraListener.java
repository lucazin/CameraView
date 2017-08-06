package com.flurgle.camerakit;

import android.graphics.PointF;
import android.graphics.YuvImage;

import java.io.File;

public abstract class CameraListener {

    /**
     * Notifies that the camera was opened.
     * The {@link CameraOptions} object collects all supported options by the current camera.
     *
     * @param options camera supported options
     */
    public void onCameraOpened(CameraOptions options) {

    }


    public void onCameraClosed() {

    }


    public void onPictureTaken(byte[] jpeg) {

    }
    

    public void onVideoTaken(File video) {

    }


    /**
     * Notifies that user tapped on screen at position given by x and y,
     * and the autofocus is trying to focus around that area.
     * This can be used to draw things on screen.
     *
     * @param x coordinate with respect to CameraView.getWidth()
     * @param y coordinate with respect to CameraView.getHeight()
     */
    public void onFocusStart(float x, float y) {

    }


    /**
     * Notifies that a tap-to-focus event just ended, and the camera converged
     * to a new focus (and possibly exposure and white balance).
     * This might succeed or not.
     *
     * @param successful whether camera succeeded
     * @param x coordinate with respect to CameraView.getWidth()
     * @param y coordinate with respect to CameraView.getHeight()
     */
    public void onFocusEnd(boolean successful, float x, float y) {

    }


    /**
     * Noitifies that a finger pinch-to-zoom gesture just caused the camera zoom
     * to be changed. This can be used to draw, for example, a seek bar.
     *
     * @param zoom the new zoom value, 0...1
     * @param fingers finger positions that caused the event
     */
    public void onZoomChanged(float zoom, PointF[] fingers) {

    }

}