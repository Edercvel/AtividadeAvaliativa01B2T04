package fag;

import java.util.Scanner;

import fag.objeto.BicicletaAlugada;
import fag.objeto.ContaBancaria;
import fag.objeto.ContaLuz;
import fag.objeto.Filme;
import fag.objeto.Funcionario;
import fag.objeto.Musica;
import fag.objeto.Pessoa;
import fag.objeto.ProdutoEstoque;
import fag.objeto.Retangulo;
import fag.objeto.Temperatura;

public class Principal {
	public static void main(String[] args) {
		//atividadeUm();
		//atividadeDois();
		//atividadeTres();
		//atividadeQuatro();
		//atividadeCinco();
		//atividadeSeis();
		//atividadeSete();
		//atividadeOito();
		//atividadeNove();
		atividadeDez();
	}
	
	public static void atividadeUm() {
		ContaBancaria contaUm = new ContaBancaria("Eder Fabio da Silva", 0);
		System.out.println("Saldo R$ " +contaUm.getSaldo());
		contaUm.depositar(1000);
		System.out.println("Saldo R$ " +contaUm.getSaldo());
		contaUm.sacar(200);
		System.out.println("Saldo R$ " +contaUm.getSaldo());
		
	}
	public static void atividadeDois() {
		Filme filmeUm = new Filme("O Poderoso Chefao", 5);
		Filme filmeDois = new Filme("A Lista de Schindler.", 5);
		
		System.out.println(filmeUm.exibir());
		System.out.println(filmeDois.exibir());
		
	}
	public static void atividadeTres() {
		Funcionario fUm = new Funcionario("Pedro",1000);
		Funcionario fDois = new Funcionario("Jose",2000);
		
		System.out.println("Funcionario: "+fUm.getNome()+" Salario: "+ fUm.getSalario());
		System.out.println("Funcionario: "+fDois.getNome()+" Salario: "+ fDois.getSalario());
		
		fUm.aumentarSalario(10);
		fDois.aumentarSalario(10);
		System.out.println("Funcionario: "+fUm.getNome()+" Salario: "+ fUm.getSalario());
		System.out.println("Funcionario: "+fDois.getNome()+" Salario: "+ fDois.getSalario());		
		
	}
	public static void atividadeQuatro() {
		Retangulo retanguloUm = new Retangulo(50,50);
		
		System.out.println("Area: "+retanguloUm.area());
		System.out.println("Perimetro: "+retanguloUm.perimetro());
		
	}
	public static void atividadeCinco() {
		Musica musicaUm = new Musica ("AC/DC - Thunderstruck", 292);
		Musica musicaDois = new Musica ("AC/DC - T.N.T", 215);
		
		System.out.println("Titulo: "+musicaUm.getTitulo()+ "Duração: "+musicaUm.formatarDuracao());
		System.out.println("Titulo: "+musicaDois.getTitulo()+ "Duração: "+musicaDois.formatarDuracao());
		
	}
	public static void atividadeSeis() {
		Pessoa pessoaUm = new Pessoa ("Eder", 105, 1.85);
		System.out.println("Nome: "+pessoaUm.getNome()+" IMC: "+ pessoaUm.calcularIMC() +" Classificação: "+ pessoaUm.classificacaoIMC());
		
	}
	public static void atividadeSete() {
		ContaLuz contaUm = new ContaLuz(200, 0.63);
		
		System.out.println("Valor da Conta de Luz R$ "+ contaUm.calculorValor());
	}
	public static void atividadeOito() {
		Scanner scanner = new Scanner (System.in);
		BicicletaAlugada bikeUm = new BicicletaAlugada(0, 32.50);
		
		System.out.println("Insira a Quantidade de horas? ");
		bikeUm.setHoras(scanner.nextInt());
		
		
		System.out.println("Valor do aluguel R$ "+ bikeUm.calcularValor());
		
	}
	public static void atividadeNove() {
		ProdutoEstoque produtoUm = new ProdutoEstoque("Televisão", 0);
		
		System.out.println("Saldo da "+ produtoUm.getNome()+" é "+ produtoUm.getQuantidade());
		produtoUm.adicionarEstoque(10);
		System.out.println("Saldo da "+ produtoUm.getNome()+" é "+ produtoUm.getQuantidade());
		produtoUm.removerEstoque(3);
		System.out.println("Saldo da "+ produtoUm.getNome()+" é "+ produtoUm.getQuantidade());
		
	}
	public static void atividadeDez() {
		Scanner scanner = new Scanner(System.in);
		Temperatura tempUm = new Temperatura();
		System.out.println("Insira o valor da temperatura:");
		tempUm.setCelsius(scanner.nextDouble());
		System.out.println("A temperatura é "+ tempUm.getCelsius()+"C");
		System.out.println("Convertendo para Fahrenheit:"+ tempUm.paraFahrenhiet()+"F");
		System.out.println("Convertendo para Kelvin:"+ tempUm.paraKelvin()+"K");
		
	}
	
}
