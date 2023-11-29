package com.ohgiraffers.section02.annotation.subsection04.resources;

import com.ohgiraffers.section02.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("pokemonServiceResources")
public class PokemonService {
    /*
    * @Resource 어노테이션은 자바에서 제공하는 기본 어노테이션이다.
    * @Autowired와 같은 스프링 어노테이션과 다르게 name 속성 값으로 의존성 주입을 할 수 있다.
    * */
    @Resource(name = "pikachu") // bean의 이름으로 의존성을 주입
    private Pokemon pokemon;

    public void pokemonAttack(){

        pokemon.attack();
    }

    // 아래 코드도 가능하다.
//    @Resource
//    private List<Pokemon> pokemonList;
//
//    public void pokemonAttack(){
//        pokemonList.forEach(Pokemon::attack);
//    }

}
