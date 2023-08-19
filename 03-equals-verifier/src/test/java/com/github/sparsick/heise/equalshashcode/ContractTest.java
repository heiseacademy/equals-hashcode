package com.github.sparsick.heise.equalshashcode;


import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContractTest {


    // equals contract
    //    reflexive: an object must equal itself
    //    symmetric: x.equals(y) must return the same result as y.equals(x)
    //    transitive: if x.equals(y) and y.equals(z), then also x.equals(z)
    //    consistent: the value of equals() should change only if a property that is contained in equals() changes (no randomness allowed)

    // hashCode contract
    //    internal consistency: the value of hashCode() may only change if a property that is in equals() changes
    //    equals consistency: objects that are equal to each other must return the same hashCode => Thumb rule: If we override equals, we have to override hashCode
    //    collisions: unequal objects may have the same hashCode

    @Test
    void equalsTest(){
        EqualsVerifier.simple().forClass(Person.class).verify();

        EqualsVerifier.forClass(Person.class)
                .suppress(Warning.NONFINAL_FIELDS)
                .verify();



//        EqualsVerifier.forClasses(Person.class)
//        EqualsVerifier.forPackage("com.github.sparsick.heise.equals")
    }


}
