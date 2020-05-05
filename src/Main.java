package com.company;

import com.company.devices.Car;

public class Main {

  public static void main(String[] args) {
    @@ -15,13 +17,39 @@ public static void main(String[] args) {
      animal.takeForAWalk();

      Human human = new Human();
      Car Audi= new Car();

      Car audi_1 = new Car();
      bmw_1.setColour("red");
      bmw_1.setModel("e46");
      bmw_1.setPrice(400);
      bmw_1.setProducer("Audi AG");

      Car audi_2 = new Car();
      bmw_2.setColour("red");
      bmw_2.setModel("e46");
      bmw_2.setPrice(400);
      bmw_2.setProducer("Audi AG");



      Car audi_3 = new Car();
      opel.setColour("blue");
      opel.setModel("corsa");
      opel.setPrice(999);
      opel.setProducer("Audi AG");

      human.addMyCar(Audi);

      human.addMyCar(audi_1);

      System.out.println("________________________");
      human.getSalary();

      //System.out.println(bmw_1.getColour()+" "+bmw_1.getModel()+" "+bmw_1.getProducer()+"  "+bmw_1.getPrice());
      System.out.println("________________________");

      System.out.println(human.toString());
      System.out.println(audi_1.toString());
      System.out.println(animal.toString());

    }
  }