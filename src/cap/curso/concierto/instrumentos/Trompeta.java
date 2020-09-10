package cap.curso.concierto.instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("TocameAmi")

public class Trompeta extends Instrumento
{
	@Override
	@Value("aTlan,Tlon con anotación")
	public void setSonido(String sonido)
	{
		// TODO Auto-generated method stub
		super.setSonido(sonido);
	}
}
