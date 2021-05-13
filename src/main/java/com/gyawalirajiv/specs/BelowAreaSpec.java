package com.gyawalirajiv.specs;

import com.gyawalirajiv.RealEstate;
import com.gyawalirajiv.Spec;

class BelowAreaSpec implements Spec {
    private float maxBuildingArea;

    BelowAreaSpec(float maxBuildingArea) {
        this.maxBuildingArea = maxBuildingArea;
    }

    @Override
    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getBuildingArea() < maxBuildingArea;
    }
}
