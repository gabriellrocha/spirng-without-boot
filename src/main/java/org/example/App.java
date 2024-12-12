package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        // Como é uma aplicação que não usa Spring Boot, todas as configs é feita pelo dev

        // Cria o IoC container - assim como o Spring Boot, porém, as config devem ser feitas via XML
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//    Lembre-se o Spring cria os beans assim que o app é inicializado  (eager initialization) com escopo singleton

        Developer developer = context.getBean(Developer.class);
        Laptop laptop = (Laptop) context.getBean("lap"); // Obter o Bean pelo id


        developer.build();
//        System.out.println(developer.getAge());
//        System.out.println(developer.getName());
//        laptop.compile();



    }
}
