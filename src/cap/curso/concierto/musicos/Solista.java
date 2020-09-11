package cap.curso.concierto.musicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cap.curso.concierto.anotaciones.Propietario;
import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Instrumento;

@Component
public class Solista extends Musico {

	@Override
	@Propietario
	public void tocar(int estado) throws SinSonidoException 
	{
		if (getInstrumento().getSonido().equals("nada"))
			throw new SinSonidoException("El " + getInstrumento().getClass().getSimpleName() + " esta roto");
		
		System.out.println(getInstrumento().sonar());

	}
	
	@Override
	@Autowired
	@Qualifier("guitarra")
	public void setInstrumento(Instrumento instrumento) {
		
		super.setInstrumento(instrumento);
	}

}
