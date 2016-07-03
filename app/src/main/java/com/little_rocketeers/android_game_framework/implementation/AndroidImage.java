package com.little_rocketeers.android_game_framework.implementation;

/**
 * Created by Melanie on 03.07.2016.
 */
import android.graphics.Bitmap;

import com.little_rocketeers.android_game_framework.Image;
import com.little_rocketeers.android_game_framework.Graphics.ImageFormat;

public class AndroidImage implements Image {
    Bitmap bitmap;
    ImageFormat format;

    public AndroidImage(Bitmap bitmap, ImageFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    @Override
    public int getWidth() {
        return bitmap.getWidth();
    }

    @Override
    public int getHeight() {
        return bitmap.getHeight();
    }

    @Override
    public ImageFormat getFormat() {
        return format;
    }

    @Override
    public void dispose() {
        bitmap.recycle();
    }
}