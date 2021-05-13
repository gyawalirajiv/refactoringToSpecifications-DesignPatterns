package com.gyawalirajiv.specs;

import com.gyawalirajiv.EstateMaterial;
import com.gyawalirajiv.EstatePlacement;
import com.gyawalirajiv.EstateType;
import com.gyawalirajiv.Spec;

public class Specs {
    public static AreaRangeSpec ofAreaRange(float minArea, float maxArea) {
        return new AreaRangeSpec(minArea, maxArea);
    }

    public static BelowAreaSpec belowArea(float maxBuildingArea) {
        return new BelowAreaSpec(maxBuildingArea);
    }

    public static MaterialSpec ofMaterial(EstateMaterial material) {
        return new MaterialSpec(material);
    }

    public static NotSpec not(Spec spec) {
        return new NotSpec(spec);
    }

    public static PlacementSpec placedIn(EstatePlacement placement) {
        return new PlacementSpec(placement);
    }

    public static TypeSpec ofType(EstateType type) {
        return new TypeSpec(type);
    }
}
