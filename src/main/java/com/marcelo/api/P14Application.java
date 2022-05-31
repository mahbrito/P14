/**
 * O commandLineRunner() é executado assim que a aplicação iniciar
 * Esse método 
 */
package com.marcelo.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.marcelo.api.utils.SenhaUtils;

@SpringBootApplication
public class P14Application {

	public static void main(String[] args) {
		SpringApplication.run(P14Application.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRuneer() {
		return args -> {
			String senhaEncoded = SenhaUtils.gerarBCrypt("123456");//gera uma senha
			System.out.println("Senha encoded: " + senhaEncoded);//printa a senha
			
			senhaEncoded = SenhaUtils.gerarBCrypt("123456");//gera um novo hash pra mesma senha
			System.out.println("Senha encoded novamente: " + senhaEncoded);//printa de novo
			
			System.out.println("Senha válida: " + senhaEncoded);//verifica o ultimo hash passado pra ver se a senha é válida
		};
	}

}
