package com.gyawalirajiv.specs;

import com.gyawalirajiv.RealEstate;
import com.gyawalirajiv.Spec;

import java.util.stream.Stream;

public class AndSpec implements Spec {
    private Spec[] specs;

    public AndSpec(Spec... specs) {

        this.specs = specs;
    }

    public boolean isSatisfiedBy(RealEstate estate) {
        return Stream.of(specs)
                .allMatch(spec -> spec.isSatisfiedBy(estate));
    }
}
