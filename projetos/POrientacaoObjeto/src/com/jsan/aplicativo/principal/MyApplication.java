package com.jsan.aplicativo.principal;

import com.jsan.aplicativo.Cachorro;
import com.jsan.aplicativo.Homem;

public class MyApplication {

	public static void main(String[] args) {
		//IMamifero mamifero = new IMamifero();
		//Mamifero mamifero = new Mamifero();
		Cachorro kim = new Cachorro();
		
		System.out.println("nome do meu dog = " + kim.getNome() );
		
		kim.andar();
		
		kim.mamar();
		
		Homem homem = new Homem();
		
		System.out.println("o nome desse homi é = " + homem.getNome());
		
		homem.andar();
		
		homem.mamar();
	}
}
