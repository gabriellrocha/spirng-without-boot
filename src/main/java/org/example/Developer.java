package org.example;

import org.springframework.stereotype.Component;

@Component
public class Developer {

//    private int age;
//    private String name;

    private Laptop laptop;

//    public Developer(int age, String name){
//        this.age = age;
//        this.name = name;
//    }


    public Developer(Laptop laptop) {
        this.laptop = laptop;
    }


    public void build() {
        System.out.println("This Developer says: Working on Awesome Project");
        laptop.compile();
//        System.out.println("I'm old " + age);
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
