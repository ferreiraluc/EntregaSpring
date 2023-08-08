package com.entregaSpring.EntregaSpring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


@SpringBootApplication
public class EntregaSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(EntregaSpringApplication.class, args);

		Scanner scanner = new Scanner(System.in);
		List<Double> valores = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			System.out.print("Digite o valor " + (i + 1) + ": ");
			double valor = scanner.nextDouble();
			valores.add(valor);
		}

		System.out.println("Valores inseridos: " + valores);

		double media = calcularMedia(valores);
		System.out.printf("Média: %.2f%n", media);

		double desvioPadrao = calcularDesvioPadrao(valores, media);
		System.out.printf("Desvio Padrão: %.2f%n", desvioPadrao);

		double mediana = calcularMediana(valores);
		System.out.printf("Mediana: %.2f%n", mediana);

		int quantidade = valores.size();
		System.out.println("Quantidade de numeros inseridos: " + quantidade);

		scanner.close();

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