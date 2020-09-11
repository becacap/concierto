package cap.curso.concierto.excepciones;

@SuppressWarnings("serial")
public class SinSonidoException extends Exception
{
	public SinSonidoException(String msg) {
		super(msg);
	}
}
