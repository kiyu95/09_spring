package com.ohgiraffers.section02.annotation.subsection01.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section02");

        String[] beanNames = context.getBeanDefinitionNames();

        for (String bean : beanNames) {
            System.out.println(bean);
        }

        PokemonService pokemonService = context.getBean("pokemonServicePrimary", PokemonService.class);
        // PokemonService.class 따로 import하지 않았으므로 qualifier 안의 PokemonService를 가져온다

        pokemonService.pokemonAttack();
    }
}
