package com.woslx.thinkinjava.ch10.s10_1;//: innerclasses/Parcel1.java
// Creating inner classes.

public class Parcel1 {
    public Contents c2 = new Contents();
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {

        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }

    }

    // Using inner classes looks just like
    // using any other class, within Parcel1:
    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
        System.out.println(c.i);
        System.out.println(d.label);
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }
} /* Output:
Tasmania
*///:~
