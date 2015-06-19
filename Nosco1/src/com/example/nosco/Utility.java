package com.example.nosco;

import org.opencv.core.Mat;
import org.opencv.core.Rect;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.AlphaAnimation;

public class Utility {
	
	@SuppressLint("NewApi")
	public static void setAlpha(View view, float alpha)
	{
	    if (Build.VERSION.SDK_INT < 11)
	    {
	        final AlphaAnimation animation = new AlphaAnimation(alpha, alpha);
	        animation.setDuration(0);
	        animation.setFillAfter(true);
	        view.startAnimation(animation);
	    }
	    else view.setAlpha(alpha);
	}
	
	// Checks if roi is smaller than mat
	public static boolean roiSizeOk(Mat mat, Rect roi) {
		if (roi.x >= 0 && roi.y >= 0 && roi.x + roi.width < mat.cols() 
				&& roi.y + roi.height < mat.rows()) {
			return true;
		} else {
			return false;
		}
	}
}
