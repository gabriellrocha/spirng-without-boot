package org.example;

import org.springframework.stereotype.Component;

@Component
public class Developer {

      private Computer computer;


//    // Injection via XML
//    public Developer(Computer computer) {
//        this.computer = computer;
//    }


    public void build() {
        System.out.println("This Developer says: Working on Awesome Project");
        computer.compile();
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
