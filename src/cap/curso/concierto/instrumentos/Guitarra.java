package cap.curso.concierto.instrumentos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Con @Component, Spring nos hace un new Guitarra y lo pone en memoria,
// pudiendo así eliminar cosillas del xml

@Component("pepe")
public class Guitarra extends Instrumento
{
	
	@Override
	@Value("tlan tlan tlan con anotaciones")
	public void setSonido(String sonido)
	{
		// TODO Auto-generated method stub
		super.setSonido(sonido);
	}

}
