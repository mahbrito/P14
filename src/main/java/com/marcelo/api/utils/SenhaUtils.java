package com.marcelo.api.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {
	/*
	 * Gera um hash utilizando o BCrypt.
	 */
	public static String gerarBCrypt(String senha) {//gera uma nova senha (hash
		if (senha == null) {
			return senha;
		}
		
		BCryptPasswordEncoder senhaEncoder = new BCryptPasswordEncoder();//faz uma instância do BCryptEncoder
		return senhaEncoder.encode(senha);//a senha é passada por parametro
	}
	/*VERIFICANDO A VALIDADE DA SENHA
	 * o método recebe a senha e o hash gerado para verificar se a senha é compativel com o hash
	 */
	public static boolean senhaValida(String senha, String senhaEncoded) {//verifica a validade da senha retornando um valor se ela é valida ou não
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.matches(senha, senhaEncoded);//verifica se a senha bate com o hash
	
	}
}