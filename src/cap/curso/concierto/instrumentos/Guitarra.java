package cap.curso.concierto.instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("tocame a mi")
public class Guitarra extends Instrumento
{
	@Override
	@Value("ctu tu tu con anotaciones")
	public void setSonido(String sonido)
	{
		super.setSonido(sonido);
	}
}
