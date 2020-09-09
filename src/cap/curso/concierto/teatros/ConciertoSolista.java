package cap.curso.concierto.teatros;

import cap.curso.concierto.instrumentos.Instrumento;
import cap.curso.concierto.musicos.Musico;
import cap.curso.concierto.musicos.Solista;

public class ConciertoSolista
{

	public static void main(String[] args)
	{
		Instrumento tambor = new Instrumento();
		tambor.setSonido("pom, pom, pom");
		Musico solista = new Solista();
		solista.setInstrumento(tambor);
		solista.tocar();

	}

}
