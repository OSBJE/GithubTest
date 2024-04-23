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

    @Override
    public String mood(boolean mood) {
        if (mood){
            return "cat is Happy";
        } else {
            return "cat is unhappy";
        }

    }
}
