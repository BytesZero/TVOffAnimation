# TVOffAnimation
仿电视关闭的一个动画效果
#仿电视关机效果的动画
---
- **效果图**

![这里写图片描述](https://github.com/yy1300326388/TVOffAnimation/blob/master/image/tvoffanimation.gif)

- **主要代码**
``` java
package com.zhengsonglan.tvanimation;

import android.graphics.Matrix;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by zsl on 2015/3/27.
 */
public class TVOffAnimation extends Animation {
    int halfWidth;
    int halfHeight;

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
        //设置动画时间为700毫秒
        setDuration(700);
        //设置动画结束后就结束在动画结束的时刻
        setFillAfter(true);
        //保存View的中心点
        halfWidth=width/2;
        halfHeight=height/2;
        //设置动画先加速后减速
        setInterpolator(new AccelerateDecelerateInterpolator());
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {

       
        final Matrix matrix=t.getMatrix();
        //interpolatedTime是从0~1的一个变化，所以我们前80%让动画缩小成一个线，后20%保持线的高度缩小线的宽度
        if (interpolatedTime<0.8){
            matrix.preScale(1+0.625f*interpolatedTime,1-interpolatedTime/0.8f+0.01f,halfWidth,halfHeight);
        }else{
            matrix.setScale(7.5f*(1-interpolatedTime),0.01f,halfWidth,halfHeight);
        }

    }
}

```
- **bolg地址**

>[点击这里，欢迎指正](http://blog.csdn.net/yy1300326388/article/details/44674219)

