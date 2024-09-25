package com.practice.coding;

public interface InteritanceDemo {
    public String getA();
}

interface InteritanceDemo1 {
    public String getA();
}

class ChildClass implements InteritanceDemo, InteritanceDemo1 {

    @Override
    public String getA() {
        return null;
    }
}


