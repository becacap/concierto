package cap.curso.concierto.musicos;

import cap.curso.concierto.instrumentos.Instrumento;

public class Musico implements MusicoInterface
{

	private Instrumento instrumento;
	@Override
	public void tocar()
	{
		System.out.println(getInstrumento().sonar());

	}
	public Instrumento getInstrumento()
	{
		return instrumento;
	}
	public void setInstrumento(Instrumento instrumento)
	{
		this.instrumento = instrumento;
	}

}
