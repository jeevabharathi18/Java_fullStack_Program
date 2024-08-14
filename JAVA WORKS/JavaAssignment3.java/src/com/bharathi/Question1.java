package com.bharathi;

public class Question1 {

    class Animal {
        void makeSound() {
            System.out.println("Animal sound");
        }
    }

    class Cat extends Animal {
        void makeSound() {
            System.out.println("Cat barks");
        }
    }

    public static void main(String[] args) {
        Question1 question1 = new Question1();
        Cat myCat = question1.new Cat();
        myCat.makeSound();
    }
}
