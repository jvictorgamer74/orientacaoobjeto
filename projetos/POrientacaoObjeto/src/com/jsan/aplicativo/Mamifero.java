package com.jsan.aplicativo;

public abstract class Mamifero implements IMamifero {

	@Override
	public void andar() {
		System.out.print("\n O mamífero anda.");
	}

	@Override
	public void mamar() {
		System.out.println("\n O mamífero mama.");

	}
	
	public abstract String getNome();

}
