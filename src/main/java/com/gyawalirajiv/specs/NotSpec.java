package com.gyawalirajiv.specs;

import com.gyawalirajiv.RealEstate;
import com.gyawalirajiv.Spec;

class NotSpec implements Spec {
    private final Spec spec;

    NotSpec(Spec spec) {
        this.spec = spec;
    }

    public boolean isSatisfiedBy(RealEstate estate) {
        return !spec.isSatisfiedBy(estate);
    }
}
