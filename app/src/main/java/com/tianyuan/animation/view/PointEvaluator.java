package com.tianyuan.animation.view;

import android.animation.TypeEvaluator;

/**
 * Created by litianyuan on 16/8/26.
 */

public class PointEvaluator  implements TypeEvaluator{
    @Override
    public Object evaluate(float fraction, Object startValue, Object endValue) {
        Point startPoint = (Point) startValue;
        Point endPoint = (Point) endValue;
        float x = startPoint.getX() + fraction * (endPoint.getX() - startPoint.getX());
        float y = startPoint.getY() + fraction * (endPoint.getY() - startPoint.getY());
        Point point = new Point(x, y);
        return point;
    }
}
