package com.company;

public class Main {

    public static void main(String[] args) {

      Animal animal = new Animal();

        animal.feed();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();

      Human human = new Human();
      Car Audi = new Car();


      human.addMyCar(Audi);

      human.addMyCar(Audi);

      System.out.println("________________________");
      human.getSalry();
      human.getSalary();

    }
}