package com.github.sparsick.heise.equalshashcode;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContractTest {


    // equals contract
    //    reflexive: an object must equal itself
    //    symmetric: x.equals(y) must return the same result as y.equals(x)
    //    transitive: if x.equals(y) and y.equals(z), then also x.equals(z)
    //    consistent: the value of equals() should change only if a property that is contained in equals() changes (no randomness allowed)

    @Test
    void equalsTest(){
        Person a = new Person("Sandra", "Parsick", "Software Developer");
        Person b = new Person("Sandra", "Parsick", "Software Developer");

        // reflexive
        assertThat(a).isEqualTo(a);

        // symmetric
        assertThat(a).isEqualTo(b);
        assertThat(b).isEqualTo(a);

        // transitive
        Person c = new Person("Sandra", "Parsick", "Software Developer");
        assertThat(a).isEqualTo(b);
        assertThat(b).isEqualTo(c);
        assertThat(a).isEqualTo(c);

        // consistent
        assertThat(a).isEqualTo(a);
        a.setLastName("P.");
        assertThat(a).isEqualTo(a);
    }


    // hashCode contract
    //    internal consistency: the value of hashCode() may only change if a property that is in equals() changes
    //    equals consistency: objects that are equal to each other must return the same hashCode => Thumb rule: If we override equals, we have to override hashCode
    //    collisions: unequal objects may have the same hashCode

    @Test
    void hashCodeTest(){
        Person a = new Person("Sandra", "Parsick", "Software Developer");
        Person b = new Person("Sandra", "Parsick", "Software Developer");

        assertThat(a).isEqualTo(b);
        assertThat(a.hashCode()).isEqualTo(b.hashCode());


        a.setJobTitle("Software Engineer");
        assertThat(a).isNotEqualTo(b);
        assertThat(a.hashCode()).isNotEqualTo(b.hashCode());
    }
}
