package com.designpattern.demo.simple_factory;

import org.reflections.Reflections;

import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleFactory3 {

    private static Map<String, Class> allCars;

    static {
        Reflections reflections = new Reflections("com.designpattern.demo.simple_factory");
        Set<Class<?>> annotatedClasses = reflections.getTypesAnnotatedWith(Vehicle.class);
        allCars = new ConcurrentHashMap<String, Class>();
        for (Class<?> classObject : annotatedClasses) {
            Vehicle vehicle = classObject.getAnnotation(Vehicle.class);
            allCars.put(vehicle.type(), classObject);
        }
        allCars = Collections.unmodifiableMap(allCars);
    }


    public static Car newCar(String name) throws Exception{
        Car car = null;
        if (allCars.containsKey(name)) {
            car = (Car) allCars.get(name).newInstance();
        }
        return car;
    }


    public static void main(String[] args) throws Exception {
        Car car = SimpleFactory3.newCar("AuDi");
        car.drive();
    }
}
