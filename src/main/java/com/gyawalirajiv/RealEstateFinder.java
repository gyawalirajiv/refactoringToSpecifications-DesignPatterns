package com.gyawalirajiv;


import com.gyawalirajiv.specs.AndSpecBuilder;
import com.gyawalirajiv.specs.Specs;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.gyawalirajiv.specs.Specs.*;

/**
 * Copyright (c) 2020 IT Train Wlodzimierz Krakowski (www.refactoring.pl)
 * Sources are available only for personal usage by Udemy students of this course.
 */
public class RealEstateFinder {
    private List<RealEstate> repository;

    public RealEstateFinder(List<RealEstate> repository) {
        this.repository = repository;
    }

    public List<RealEstate> bySpec(Predicate<RealEstate> spec) {
        return repository.stream()
                .filter(spec::test)
                .collect(Collectors.toList());
    }

    public List<RealEstate> byBelowArea(float maxBuildingArea){
        return bySpec(belowArea(maxBuildingArea));
    }

    public List<RealEstate> byMaterial(EstateMaterial material){
        return bySpec(ofMaterial(material));
    }

    public List<RealEstate> byMaterialBelowArea(EstateMaterial material, float maxBuildingArea){
        return bySpec(new AndSpecBuilder().withSpec(ofMaterial(material))
                .withSpec(belowArea(maxBuildingArea)).createAndSpec());
    }

    public List<RealEstate> byPlacement(EstatePlacement placement){
        Spec placementSpec = placedIn(placement);
        return bySpec(placementSpec);
    }

    public List<RealEstate> byAvoidingPlacement(EstatePlacement placement){
        return bySpec(not(placedIn(placement)));
    }

    public List<RealEstate> byAreaRange(float minArea, float maxArea){
        return bySpec(ofAreaRange(minArea, maxArea));
    }

    public List<RealEstate> byType(EstateType type){
        return bySpec(ofType(type));
    }

    public List<RealEstate> byVerySpecificCriteria(EstateType type, EstatePlacement placement, EstateMaterial material){
        return bySpec(new AndSpecBuilder().withSpec(ofType(type))
                .withSpec(placedIn(placement))
                .withSpec(ofMaterial(material)).createAndSpec());
    }

}
