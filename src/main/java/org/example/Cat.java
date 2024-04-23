package org.example;

public class Cat extends Animal{


    @Override
    public void makeSound() {
        System.out.println("mejay");
    }

    @Override
    public boolean eat(String foodtype){
        return true;
    }
}
