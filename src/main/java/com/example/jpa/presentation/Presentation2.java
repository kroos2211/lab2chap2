
package com.example.jpa.presentation;

import com.example.jpa.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.jpa")
public class Presentation2 {

    public static void main(String[] args) {

        // Création du contexte Spring
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Presentation2.class);

        // Récupération du bean métier
        IMetier metier = context.getBean(IMetier.class);

        // Affichage du résultat
        System.out.println("Résultat = " + metier.calcul());
    }
}
