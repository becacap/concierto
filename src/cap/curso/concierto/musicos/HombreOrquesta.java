package cap.curso.concierto.musicos;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Instrumento;

@Component("Federico")
public class HombreOrquesta extends Musico
{

	@Override
	public void tocar() throws SinSonidoException
	{
		for (Instrumento instrumento : getInstrumentos())
		{
			if(instrumento.getSonido().equals("nada")) {
				throw new SinSonidoException("el "+ instrumento.getClass().getSimpleName() + " est� roto");
			}
			System.out.println(instrumento.sonar());
		}

	}

//	Como es una colecci�n tocara todos los intrumentos, no es necesario decir qu� instrumento tocar
//	@Override
//	Busca los objetos del tipo del m�todo. Aqu� busca Instrumentos
//	@Autowired
//	Solamente muestra los que tienen esta anotacion (con este id) en su clase
//	@Qualifier("tocameami")
	public void setInstrumentos(Set<Instrumento> instrumentos)
	{
		super.setInstrumentos(instrumentos);
	}

}
