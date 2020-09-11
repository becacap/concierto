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

	private Instrumento instrumento;
	private Instrumento instrumento2;

	@Override
	@Propietario
	public void tocar() throws SinSonidoException
	{
		if (this.getInstrumento().getSonido().equals("nada"))
		{
			throw new SinSonidoException("El instrumento esta roto");
		}
		System.out.println(this.getInstrumento().sonar());
	}

	public Instrumento getInstrumento()
	{
		return instrumento;
	}

	// Automaticamente cada vez que se haga una instancia de un musico
	// tendra guitarra de valor por defecto en el instrumento
	/*
	 * Por defecto el nombre de la clase en minuscula o si no el que nosotros le
	 * demos a la anotacion @Component
	 */
	@Autowired
	@Qualifier("guitarra")
	public void setInstrumento(Instrumento instrumento)
	{
		this.instrumento = instrumento;
	}

	public Instrumento getInstrumento2()
	{
		return instrumento2;
	}

	@Autowired
	@Qualifier("guitarra")
	public void setInstrumento2(Instrumento instrumento)
	{
		instrumento2 = instrumento;
	}

}
