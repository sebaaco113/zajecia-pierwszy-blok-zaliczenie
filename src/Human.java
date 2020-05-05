package com.company;


import com.company.devices.Car;

import java.util.Date;

public class Human {
    @@ -11,7 +13,9 @@

            Date date = new Date();


    public String toString(){
        return pet+" "+myCar+"  "+salary;
    }
    void addMyCar(Car car) {
        this.myCar = car;
    }
