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

//      Aplicação sem Spring Boot
//
//      Cria o IoC container - as config são feitas via XML

                                // Em um APP com Spring Boot ele que é o responsável
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//     Lembre-se o Spring cria os beans assim que o app é inicializado  (eager initialization) com escopo singleton

        Developer developer = context.getBean(Developer.class); // recupera o Bean criado pelo Spring

        Laptop laptop = (Laptop) context.getBean("lap"); // recupera o Bean pelo id - necessário Cast


        developer.build();
//        laptop.compile();


    }
}
