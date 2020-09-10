package cap.curso.concierto.teatros;

import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Instrumento;
import cap.curso.concierto.musicos.Solista;

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
