package unidad05;

import unidad05.exception.DadoNoPermitidoException;

public class Dado_main {

	public static void main(String[] args) {
		try {
			Dado dadoCuatro = new Dado((short) 4);
			System.out.println(dadoCuatro);
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
			dadoCuatro.lanzar();
		} catch (DadoNoPermitidoException e) {
			System.err.println(e.getMessage());
		}

	}

}
	