package com.CPSC310Spring.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.CPSC310Spring.demo", "com.CPSC310Spring.demo.Controllers"])
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
