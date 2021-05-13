package com.gyawalirajiv;

import com.gyawalirajiv.specs.AndSpec;
import com.gyawalirajiv.specs.AndSpecBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AndSpecTest {

    private Spec yesSpec;

    @BeforeEach
    void setUp() {
        yesSpec = Mockito.mock(Spec.class);
        Mockito.when(yesSpec.isSatisfiedBy(Mockito.any(RealEstate.class)))
                .thenReturn(true);
    }

    @Test
    void shouldVerifyTwoComponentsOfYesResults() {
//        Given
        AndSpec andSpec = new AndSpecBuilder().withSpec(yesSpec)
                .withSpec(yesSpec).createAndSpec();

//        When
        boolean andResult = andSpec.isSatisfiedBy(Mockito.mock(RealEstate.class));

//        Then
        assertTrue(andResult);

        Mockito.verify(yesSpec, Mockito.times(2))
                .isSatisfiedBy(Mockito.any(RealEstate.class));
    }

    @Test
    void shouldVerifyThreeComponentsOfYesResults() {
//        Given
        AndSpec andSpec = new AndSpecBuilder().withSpec(yesSpec)
                .withSpec(yesSpec)
                .withSpec(yesSpec).createAndSpec();

//        When
        boolean andResult = andSpec.isSatisfiedBy(Mockito.mock(RealEstate.class));

//        Then
        assertTrue(andResult);

        Mockito.verify(yesSpec, Mockito.times(3))
                .isSatisfiedBy(Mockito.any(RealEstate.class));
    }

}