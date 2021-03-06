package com.gyawalirajiv.specs;


import com.gyawalirajiv.Spec;

import java.util.ArrayList;
import java.util.List;

public class AndSpecBuilder {
    private List<Spec> specs = new ArrayList<>();

    public AndSpecBuilder withSpec(Spec spec) {
        this.specs.add(spec);
        return this;
    }

    //    public AndSpecBuilder withSpecs(Spec... specs) {
//        this.specs = Arrays.asList(specs);
//        return this;
//    }

    public AndSpec createAndSpec() {
        return new AndSpec(specs.toArray(new Spec[specs.size()]));
    }
}