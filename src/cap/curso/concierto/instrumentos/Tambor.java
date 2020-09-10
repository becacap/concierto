package cap.curso.concierto.instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("tocameami")
public class Tambor extends Instrumento
{

	@Override
	@Value("pom, pom, pom con anotaciones")
	public void setSonido(String sonido)
	{
		super.setSonido(sonido);
	}

}
