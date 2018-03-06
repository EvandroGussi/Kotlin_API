package br.com.evandrogussi.games.service

import br.com.evandrogussi.games.model.Game
import br.com.evandrogussi.games.repository.GameRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GameServices {

    @Autowired
    lateinit var gameRepository : GameRepository

    fun buscarTodos() : List<Game>{
        return gameRepository.findAll()
    }

    fun buscarPor(nome : String) : List<Game>{
        return gameRepository.findByNomeIgnoreCaseContaining(nome);
    }

    fun salvar(game : Game){
        gameRepository.save(game)
    }

    fun apagar(id : String){
        gameRepository.deleteById(id)
    }
}