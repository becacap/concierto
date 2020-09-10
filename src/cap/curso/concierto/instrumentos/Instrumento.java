package cap.curso.concierto.instrumentos;


/* Si mantenemos la clase Comparable, trabajamos con el TreeSet y tenemos que implementar
 * el método compareTo para indicar un criterio de comparación, pero si cambiamos al 
 * HashSet, ordena por Hash y no por un criterio que le marquemos nosotros. Seguirá 
 * metiéndolo un poco a lo loco, pero no ordena.
 * 
 * En musico tendremos que cambiar a HashSet obviamente
 */

public class Instrumento implements InstrumentoInterface/*, Comparable<Instrumento>*/
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

	/*@Override
	public int compareTo(Instrumento otro)
	{
		// TODO Auto-generated method stub
		return otro.getSonido().compareTo(this.getSonido());
	}*/

	@Override
	public boolean equals(Object obj)
	{
		Instrumento otro = (Instrumento) obj;
		return this.getSonido().equals(otro.getSonido());
	}

}
