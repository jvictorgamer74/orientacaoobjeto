package com.jsan.aplicativo;

public class Cachorro extends Mamifero{

	@Override
	public String getNome() {
		
		return "Kim Kardashian";
	}
	
	@Override
	public void andar() {
		System.out.println("O cachorro anda de 4 patas");
	}
	
	@Override
	public void mamar() {
		System.out.println("O cachorro mama na cachorra mãe");
	}

}
