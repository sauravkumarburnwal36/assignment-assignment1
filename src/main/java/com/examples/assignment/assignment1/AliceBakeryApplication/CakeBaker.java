package com.examples.assignment.assignment1.AliceBakeryApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    @Autowired
    Frosting frosting;

    @Autowired
    Syrup syrup;

    public void bakeCake() {
        System.out.println("Frosting Type: "+frosting.getFrostingType()+" and syrup: "+syrup.getSyrupType());
    }
}
