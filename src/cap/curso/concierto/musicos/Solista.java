package cap.curso.concierto.musicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cap.curso.concierto.anotaciones.Propietario;
import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Instrumento;

@Component

public class Solista extends Musico
{

	@Override
	@Propietario
	public void tocar(int estado) throws SinSonidoException
	{
		if (getInstrumento().getSonido().equals("nada"))
		{
			throw new SinSonidoException("el " + getInstrumento().getClass().getSimpleName() + " est� roto");
		}
		System.out.println(getInstrumento().sonar());

	}

	@Override
//	Anotaci�n para que escoja automaticamente el valor
	@Autowired
//	Anotaci�n para escoger el valor que introducimos solo
	@Qualifier("trompeta")
	public void setInstrumento(Instrumento instrumento)
	{
		super.setInstrumento(instrumento);
	}
}
