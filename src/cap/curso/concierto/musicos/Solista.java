package cap.curso.concierto.musicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cap.curso.concierto.instrumentos.Instrumento;

@Component
public class Solista extends Musico
{

	@Override
	public void tocar()
	{
		System.out.println(getInstrumento().sonar());
	}
	
	@Override
	//@Autowired
	//@Qualifier("pepe")
	public void setInstrumento(Instrumento instrumento)
	{
		// TODO Auto-generated method stub
		super.setInstrumento(instrumento);
	}

}
