package com.woslx.thinkinjava.ch10.s10_7_1;//: innerclasses/ClassInInterface.java
// {main: ClassInInterface$Test}

public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
} /* Output:
Howdy!
*///:~
