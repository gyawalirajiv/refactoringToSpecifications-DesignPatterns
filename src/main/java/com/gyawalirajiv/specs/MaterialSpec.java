package com.gyawalirajiv.specs;

import com.gyawalirajiv.EstateMaterial;
import com.gyawalirajiv.RealEstate;
import com.gyawalirajiv.Spec;

class MaterialSpec implements Spec {
    private EstateMaterial material;

    MaterialSpec(EstateMaterial material) {
        this.material = material;
    }

    public boolean isSatisfiedBy(RealEstate estate) {
        return estate.getMaterial().equals(material);
    }
}