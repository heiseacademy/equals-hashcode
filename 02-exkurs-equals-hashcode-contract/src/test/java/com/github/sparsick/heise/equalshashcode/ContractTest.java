package com.github.sparsick.heise.equalshashcode;



public class ContractTest {

    // equals contract
    //    reflexive: an object must equal itself
    //    symmetric: x.equals(y) must return the same result as y.equals(x)
    //    transitive: if x.equals(y) and y.equals(z), then also x.equals(z)
    //    consistent: the value of equals() should change only if a property that is contained in equals() changes (no randomness allowed)

    // hashCode contract
    //    internal consistency: the value of hashCode() may only change if a property that is in equals() changes
    //    equals consistency: objects that are equal to each other must return the same hashCode => Thumb rule: If wer override equals, we have to override hashCode
    //    collisions: unequal objects may have the same hashCode


}
