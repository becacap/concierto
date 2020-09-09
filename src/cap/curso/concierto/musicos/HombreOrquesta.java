package cap.curso.concierto.musicos;

import cap.curso.concierto.instrumentos.Instrumento;

public class HombreOrquesta extends Musico
{

	@Override
	public void tocar()
	{
		for (Instrumento instrumento : getInstrumentos())
		{
			System.out.println(instrumento.sonar());
		}
		
	}

}
