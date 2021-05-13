package com.gyawalirajiv.specs;

import com.gyawalirajiv.RealEstate;
import com.gyawalirajiv.Spec;

class AreaRangeSpec implements Spec {
    private final float minArea;
    private final float maxArea;

    AreaRangeSpec(float minArea, float maxArea) {
        this.minArea = minArea;
        this.maxArea = maxArea;
    }

    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getBuildingArea() >= minArea && estate.getBuildingArea() <= maxArea;
    }
}
