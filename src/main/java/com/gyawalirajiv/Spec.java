package com.gyawalirajiv;

import java.util.function.Predicate;

public interface Spec extends Predicate<RealEstate> {
    boolean isSatisfiedBy(RealEstate estate);

    @Override
    default boolean test(RealEstate realEstate) {
        return isSatisfiedBy(realEstate);
    }
}
