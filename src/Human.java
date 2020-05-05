package com.company;


import java.util.Date;

public class Human {

    Animal pet;
    Car mycar;
    Car myCar;
    Double salary;

    Date date = new Date();


    void addMyCar(Car car) {
        this.myCar = car;
    }

    public Double setSalary(Double salary) {

        if (salary < 0) {
            System.out.println("Musisz cos zarabiac");
        } else {
            System.out.println("Nowa pensja w kadrach ");
            System.out.println("Wez to do Ani");
            System.out.println("ZUS i US kradną część siana ");

            return salary;
        }
        return salary;
    }

    public Animal getPet() {
        return pet;
    }

    public Car getMyCar() {
        return myCar;
    }

    void addMyCar(Car car){
        this.mycar=car;
        public Double getSalry() {
            System.out.println(date + " " + " " + salary);
            return salary;
        }
    }