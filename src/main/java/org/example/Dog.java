package org.example;

public class Dog extends Animal{


    @Override
    public void makeSound() {
        System.out.println("woff");
    }

    @Override
    public boolean eat(String foodtype){
        return true;
    }
}
