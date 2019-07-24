/*
Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:
• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)
• Realizar uma entrada no estoque e mostrar novamente os dados do produto
• Realizar uma saída no estoque e mostrar novamente os dados do produto
Para resolver este problema, você deve criar
uma CLASSE conforme projeto ao lado:
(veja exemplo na próxima página)
 */
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String name = sc.nextLine();
		double price = sc.nextDouble();
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println("Produto inicial: ");
		System.out.println(product);
		
		System.out.print("Produto adicionado: ");
		quantity = sc.nextInt();
		product.addProduct(quantity);
		
		System.out.println("Digite quantidade produto adicionado: ");
		System.out.println(product);
		
		System.out.print("Digite quantidade produto removido: ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		
		System.out.println("Produto atualizado: ");
		System.out.println(product);
		
		
		sc.close();
	}

}
