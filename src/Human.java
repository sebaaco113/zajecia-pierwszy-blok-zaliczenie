package com.company;


import java.util.Date;

public class Human {

    Animal pet;
    Car myCar;
    private Car myCar;
    Double salary;

    Date date = new Date();
    @@ -38,7 +38,19 @@ public Car getMyCar() {
        return myCar;
    }

    public Double getSalry() {
        public void setMyCar(Car myCar) {
            if(salary>=myCar.price) {
                System.out.println("Możesz kupić furę!");
                addMyCar(myCar);
            }else if (salary>(myCar.price/12)){
                System.out.println("Możesz kupić furę na raty");
                addMyCar(myCar);
            }else {
                System.out.println("Jesteś zbyt biedny");
            }
        }

        public Double getSalary() {
            System.out.println(date + " " + " " + salary);
            return salary;
        }
