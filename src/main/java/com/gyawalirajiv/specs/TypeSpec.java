package com.gyawalirajiv.specs;

import com.gyawalirajiv.EstateType;
import com.gyawalirajiv.RealEstate;
import com.gyawalirajiv.Spec;

class TypeSpec implements Spec {
    private EstateType type;

    TypeSpec(EstateType type) {
        this.type = type;
    }

    public boolean isSatisfiedBy(
            RealEstate estate) {
        return estate.getType().equals(type);
    }
}