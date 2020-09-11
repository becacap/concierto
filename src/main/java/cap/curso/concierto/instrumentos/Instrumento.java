package main.java.cap.curso.concierto.instrumentos;

public class Instrumento implements InstrumentoInterface, Comparable<Instrumento>
{

	private String sonido;

	@Override
	public String sonar()
	{

		return getSonido();
	}

	public String getSonido()
	{
		return sonido;
	}

	public void setSonido(String sonido)
	{
		this.sonido = sonido;
	}

	@Override
	public int compareTo(Instrumento o)
	{
		return this.getSonido().compareTo(o.getSonido());
	}

}
