package cap.curso.concierto.musicos;

import java.util.Set;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;

import cap.curso.concierto.anotaciones.Propietario;
import cap.curso.concierto.anotaciones.Vigilante;
import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Instrumento;

//@Component("federico")
public class HombreOrquesta extends Musico
{

	/*
	 * De normal, si tenemos dos aspectos lo mejor sería juntarlo y que prevalezca el más importante.
	 * En este caso, el propietario puede hacer el trabajo del vigilante. Pero alg me debo haber saltado
	 * porque a mí no me da tanto mensaje en el log asi que se va aquedar asi.
	 * 
	 */
	
	@Override
	@Vigilante
	@Propietario
	public void tocar() throws SinSonidoException
	{
		// TODO Auto-generated method stub
		for (Instrumento instrumento : getInstrumentos()){
			
			if (instrumento.getSonido().equals("nada"))
				throw new SinSonidoException("El " + instrumento.getClass().getSimpleName() + " está roto.");
			
			System.out.println(instrumento.sonar());
		}

	}
	
	@Override
	//@Autowired
	@Qualifier("tocameami")
	public void setInstrumentos(Set<Instrumento> instrumentos)
	{
		// TODO Auto-generated method stub
		super.setInstrumentos(instrumentos);
	}
	
	@Override
	//@Autowired
	@Qualifier("pepe")
	public void setInstrumento(Instrumento instrumento)
	{
		// TODO Auto-generated method stub
		super.setInstrumento(instrumento);
	}

}
