package com.jsan.aplicativo;

public class Homem extends Mamifero {

	@Override
	public String getNome() {
		return "meu nome é Johnnnn";
	}
	
	@Override
	public void andar() {
		System.out.println("O JOnh anda com suas duas pernas");
	}
	
	@Override
	public void mamar() {
		System.out.println("O JOnh mamou qdo era bebê.");
	}

}
