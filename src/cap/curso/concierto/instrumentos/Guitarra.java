package cap.curso.concierto.instrumentos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Podemos o no ponerle nombre. En caso de no ponerlo en la etiqueta Qualifier(clase solista) hay que poner el nombre de esta clase en minuscula
//@Component("pepe")
public class Guitarra extends Instrumento
{

	@Override
//	@Value("tlan, tlan, tlan con anotaciones")
	public void setSonido(String sonido)
	{
		super.setSonido(sonido);
	}

}
