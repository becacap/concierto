package cap.curso.concierto.instrumentos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Guitarra extends Instrumento
{
	@Override
	@Value("tu tu tu con anotaciones")
	public void setSonido(String sonido)
	{
		super.setSonido(sonido);
	}
}
