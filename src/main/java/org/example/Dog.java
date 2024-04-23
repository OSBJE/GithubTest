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

    @Override
    public String mood(boolean mood) {
        if (mood){
            return "dog is Happy";
        } else {
            return "dog is unhappy";
        }

    }
}
