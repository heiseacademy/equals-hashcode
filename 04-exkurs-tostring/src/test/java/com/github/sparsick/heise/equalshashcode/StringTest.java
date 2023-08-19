package com.github.sparsick.heise.equalshashcode;


import org.junit.jupiter.api.Test;

public class StringTest {
    
    @Test
    void personToString(){
        var person = new Person("Sandra", "Parsick", "Software Developer");

        System.out.println(person);
    }

}
