package com.algaworks.logistica.api.exceptionhandler;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Problema {
	
	private Integer status;
	private LocalDateTime dataHora;
	private String titulo;
	private List<Campo> campos;
	
	@AllArgsConstructor
	@Getter
	public static class Campo {
		
		private String nome;
		private String mensagem;
	}

}
