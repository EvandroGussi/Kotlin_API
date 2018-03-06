package br.com.evandrogussi.games

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GamesApplication

fun main(args: Array<String>) {
    runApplication<GamesApplication>(*args)
}
