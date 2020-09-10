package cap.curso.concierto.musicos;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cap.curso.concierto.instrumentos.Instrumento;

//@Component("federico")
public class HombreOrquesta extends Musico
{

	@Override
	public void tocar()
	{
		for (Instrumento instrumento : getInstrumentos())
		{
			System.out.println(instrumento.sonar());
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
