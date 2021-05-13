package com.gyawalirajiv.specs;

import com.gyawalirajiv.EstatePlacement;
import com.gyawalirajiv.RealEstate;
import com.gyawalirajiv.Spec;

class PlacementSpec implements Spec {
    private EstatePlacement placement;

    PlacementSpec(EstatePlacement placement) {
        this.placement = placement;
    }

    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getPlacement().equals(placement);
    }
}
