package cap.curso.concierto.musicos;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cap.curso.concierto.anotaciones.Vigilante;
import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Instrumento;

//@Component("federico")
public class HombreOrquesta extends Musico
{

	@Override
	@Vigilante
	public void tocar() throws SinSonidoException
	{
		for (Instrumento instrumento : getInstrumentos())
		{
			if(instrumento.getSonido().equals("nada"))
				throw new SinSonidoException("el "+instrumento.getClass().getSimpleName()+" esta roto");
			System.out.println(instrumento.sonar());
			try
			{
				Thread.sleep(10);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	@Override
	//@Autowired
	//@Qualifier("tocameami")
	public void setInstrumentos(Set<Instrumento> instrumentos)
	{
		// TODO Auto-generated method stub
		super.setInstrumentos(instrumentos);
	}
	
	@Override
	//@Autowired
	//@Qualifier("tocameami")
	public void setInstrumento(Instrumento instrumento)
	{
		// TODO Auto-generated method stub
		super.setInstrumento(instrumento);
	}
}
