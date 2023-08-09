package com.entregaSpring.EntregaSpring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/dados")
public class EntregaSpringApplication {

	private List<Double> valores = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(EntregaSpringApplication.class, args);
	}

	@PostMapping("/AdicionarValor")
	public String addValue(@RequestBody List<Double> numero) {
		valores = numero;
		return "Valor adicionado com sucesso!";
	}

	@GetMapping("/CalcularValor")
	public String calculateStatistics() {
		if (valores.isEmpty()) {
			return "Nenhum valor foi inserido ainda.";
		}

		double media = calcularMedia(valores);
		double desvioPadrao = calcularDesvioPadrao(valores, media);
		double mediana = calcularMediana(valores);
		int quantidade = valores.size();

		return  "Valores: " + valores +
				"\nMédia: " + media +
				"\nDesvio Padrão: " + desvioPadrao +
				"\nMediana: " + mediana +
				"\nQuantidade de números inseridos: " + quantidade;
	}

	private static double calcularMedia(List<Double> valores) {
		double soma = 0;
		for (Double valor : valores) {
			soma += valor;
		}
		return soma / valores.size();
	}

	private static double calcularDesvioPadrao(List<Double> valores, double media) {
		double somaDasDiferencasAoQuadrado = 0;
		for (Double valor : valores) {
			double diferenca = valor - media;
			somaDasDiferencasAoQuadrado += diferenca * diferenca;
		}
		return Math.sqrt(somaDasDiferencasAoQuadrado / valores.size());
	}

	private static double calcularMediana(List<Double> valores) {
		Collections.sort(valores);
		if (valores.size() % 2 == 0) {
			int meio = valores.size() / 2;
			return (valores.get(meio - 1) + valores.get(meio)) / 2;
		} else {
			return valores.get(valores.size() / 2);
		}
	}
}
