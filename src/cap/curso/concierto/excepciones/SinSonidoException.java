package cap.curso.concierto.excepciones;


/* Si sale un warning es un warning de Eclipse, dice una parida de 
* serialVersionUID, si cambiasemos de editor puede desaparecer
* y comenta que está relacionado con que se trabaja en clúster
* Es un numerito que no se ha de repetir, que nos lo pide porque esta 
* clase está serializada y por ende se entiende que se puede trabajar
* en clúster. De todas formas al pasarle Jenkins generará uno. 
*/

public class SinSonidoException extends Exception
{

	/**
	 * Genrada automaticamente, si coincidiese por lo que fuese, no podriamos
	 * trabajar en cluster
	 */
	private static final long serialVersionUID = 1L;

	public SinSonidoException(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}

}
