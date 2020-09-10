package cap.curso.concierto.instrumentos;

public class Instrumento implements InstrumentoInterface
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

	//@Override
	public int compareTo(Instrumento otro)
	{
		
		return this.getSonido().compareTo(otro.getSonido());
	}

	
	

}
