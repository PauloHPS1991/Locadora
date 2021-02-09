package br.com.locadora.filmes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.locadora.filmes.locadora.Locadora;

public class Catalogo {
	private List<String> filmes = new ArrayList<>();
	
	public List<String> getFilmes() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("filmes.txt"));
		while(scan.hasNextLine()) {
			String linha = scan.nextLine();
			filmes.add(linha);
		}
			return filmes;
	}
	//escrever no arquivo na ultima linha?
	
	
	
}
