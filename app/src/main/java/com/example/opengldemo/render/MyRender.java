package com.example.opengldemo.render;

import android.content.Context;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import static android.opengl.GLES10.glClear;
import static android.opengl.GLES10.glClearColor;
import static android.opengl.GLES10.glViewport;
import static javax.microedition.khronos.opengles.GL10.GL_COLOR_BUFFER_BIT;

/**
 * Created by chunjiang1 on 2022/1/24.
 */
public class MyRender implements GLSurfaceView.Renderer {

    public MyRender(Context context) {

    }

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        //当Surface被创建的时候，GLSurfaceView会调用这个方法，这发生在应用程序创建的第一次，并且当设备被唤醒或者用户从其他activity切换回去时，也会被调用。
        glClearColor(1.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        //在Surface创建以后，每次Surface尺寸变化后，这个方法都会调用
        glViewport(0, 0, 200, 200);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        //当绘制每一帧的时候会被调用。
        glClear(GL_COLOR_BUFFER_BIT);
    }
}
