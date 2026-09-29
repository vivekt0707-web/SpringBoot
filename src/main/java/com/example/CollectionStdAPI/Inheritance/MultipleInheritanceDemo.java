package com.example.CollectionStdAPI.Inheritance;


class A{

    int x=10;
    int y = 20;

}

class B{

    int x = 15;
    int y = 25;
}
//Java does not support multiple inheritance because ambiguty in making dicision while accepting the properties
public class MultipleInheritanceDemo extends A,B{

}

