package org.example.main;

import static java.lang.System.out;
import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;

public class Main {
    public static void main(String[] args) {
        ClassOne classone = new ClassOne();
        out.println(classone.greet());
        ClassTwo classtwo = new ClassTwo();
        out.println(classtwo.greet());
        ClassThree classthree = new ClassThree();
        out.println(classthree.greet());
    }
}