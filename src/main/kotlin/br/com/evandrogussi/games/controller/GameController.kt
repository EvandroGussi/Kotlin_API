package br.com.evandrogussi.games.controller

import br.com.evandrogussi.games.model.Game
import br.com.evandrogussi.games.service.GameServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping(value = "/game")
class GameController{

    @Autowired
    lateinit var gameService : GameServices

    @GetMapping
    fun buscarTodos(): List<Game>{
        return gameService.buscarTodos()
    }

    @GetMapping(value = "/titulo/{titulo}")
    fun buscarPor(@PathVariable(value = "titulo") titulo : String): List<Game>{
        return gameService.buscarPor(nome = titulo)
    }

    @PostMapping
    fun salvar(@RequestBody game : Game){
        gameService.salvar(game)
    }

    @DeleteMapping("{id}")
    fun apagar(@PathVariable("id") id : String){
        gameService.apagar(id)    }



}