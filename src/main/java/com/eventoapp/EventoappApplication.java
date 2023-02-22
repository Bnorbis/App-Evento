package com.eventoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventoappApplication {
	//Main: função e classe principal e responsável pela compilação do código.
	//Código referente a criação de uma lista de eventos. O código realiza as seguintes operações:
	//- Cadastra e deleta eventos.
	//- Cadastra e deleta convidados dos respectivos eventos.
	//- Lista e separa em colunas tanto os convidados como seus eventos.
	//- Atribui Nome, Local, Data, Horário e opção Deletar aos eventos.
	//- Atribui nome, RG e opção deletar aos convidados.
	//- Inclui detalhes do evento.
	//- Dentre outros requisitos.
	public static void main(String[] args) {
		SpringApplication.run(EventoappApplication.class, args);
	}

}
