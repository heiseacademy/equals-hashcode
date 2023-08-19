package com.github.sparsick.heise.equalshashcode;


import com.jparams.verifier.tostring.ToStringVerifier;
import com.jparams.verifier.tostring.preset.IntelliJPreset;
import com.jparams.verifier.tostring.preset.Preset;
import com.jparams.verifier.tostring.preset.Presets;
import org.junit.jupiter.api.Test;

public class ToStringTest {
    
    @Test
    void sample(){
        var person = new Person("Sandra", "Parsick", "Software Developer", "Düsseldorf");

        System.out.println(person);
    }

    @Test
    void toStringTest(){
        ToStringVerifier.forClass(Person.class)
                .withPreset(Presets.INTELLI_J)
//                .withIgnoredFields("location")
//                .withFailOnExcludedFields(true)
                .verify();
    }

}
