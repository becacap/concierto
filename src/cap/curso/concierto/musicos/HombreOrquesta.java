package cap.curso.concierto.musicos;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cap.curso.concierto.anotaciones.Propietario;
import cap.curso.concierto.anotaciones.Vigilante;
import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Instrumento;

@Component("Federico")
public class HombreOrquesta extends Musico
{

	@Override
//	@Vigilante
	@Propietario
	public void tocar(int estado) throws SinSonidoException
	{
		for (Instrumento instrumento : getInstrumentos())
		{
			if(instrumento.getSonido().equals("nada")) {
				throw new SinSonidoException("el "+ instrumento.getClass().getSimpleName() + " está roto");
			}
			System.out.println(instrumento.sonar());
		}

	}

//	Como es una colección tocara todos los intrumentos, no es necesario decir qué instrumento tocar
//	@Override
//	Busca los objetos del tipo del método. Aquí busca Instrumentos
//	@Autowired
//	Solamente muestra los que tienen esta anotacion (con este id) en su clase
//	@Qualifier("tocameami")
	public void setInstrumentos(Set<Instrumento> instrumentos)
	{
		super.setInstrumentos(instrumentos);
	}

}
