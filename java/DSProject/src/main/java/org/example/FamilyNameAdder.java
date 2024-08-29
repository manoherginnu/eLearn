package org.example;

import java.util.ArrayList;

@FunctionalInterface
public interface FamilyNameAdder<T,U,R>{
    R myProcessFamilyData(T t,U u,R r);
}

