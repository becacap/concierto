package main.java.cap.curso.concierto.teatros;

import main.java.cap.curso.concierto.excepciones.SinSonidoException;
import main.java.cap.curso.concierto.instrumentos.Instrumento;
import main.java.cap.curso.concierto.musicos.Solista;

public class ConciertoSolista
{

	public static void main(String[] args) throws SinSonidoException
	{
		Instrumento tambor = new Instrumento();
		tambor.setSonido("pom, pom, pom");
		Solista solista = new Solista();
		solista.setInstrumento(tambor);
		solista.tocar();

	}

}
