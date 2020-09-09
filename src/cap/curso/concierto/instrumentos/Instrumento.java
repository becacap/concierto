package cap.curso.concierto.instrumentos;

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
	public int compareTo(Instrumento otro)
	{
		// TODO Auto-generated method stub
		return this.getSonido().compareTo(otro.getSonido());
	}

	@Override
	public boolean equals(Object obj)
	{
		Instrumento otro = (Instrumento) obj;
		return this.getSonido().equals(otro.getSonido());
	}

}
