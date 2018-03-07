package com.goudai.factory;

import com.goudai.bean.Car;

//静态工厂，无需创建工厂类实例
public class CarFactory {
    public static Car createCar(){
        Car car = new Car();
        car.setBrand("大众捷达");
        car.setMaxSpeed(30);
        return car;
    }
}
