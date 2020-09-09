package cap.curso.concierto.musicos;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cap.curso.concierto.instrumentos.Instrumento;

@Component("federico")
public class HombreOrquesta extends Musico
{
	
	private List<Instrumento> instrumentos = new ArrayList<>();
	// private Set<Instrumento> instrumentosSet = new TreeSet<Instrumento>();
	
	/*private Set<Instrumento> instrumentosSet = new TreeSet<Instrumento>(new Comparator<Instrumento>() {

		@Override
		public int compare(Instrumento o1, Instrumento o2)
		{
			int comparacion = o1.getSonido().compareTo(o2.getSonido());
			int result = 0;
			
			if(comparacion < 0) result = 1;
			else if(comparacion > 0) result = -1;
			return result;
		}
		
	});
	*/

	@Override
	public void tocar()
	{
		for(Instrumento i : this.getInstrumentos()) {
			System.out.println(i.sonar());
		}
		
		/*
		System.out.println();
		for(Instrumento i : this.getInstrumentosSet()) {
			System.out.println(i.sonar());
		}*/
	}
	
	public List<Instrumento> getInstrumentos()
	{
		return this.instrumentos;
	}
	
	@Autowired
	@Qualifier("tocame a mi")
	public void setInstrumentos(List<Instrumento> l) {
		this.instrumentos = l;
	}
	
	public void addInstrumento(Instrumento i) {
		this.instrumentos.add(i);
	}

	/*
	public Set<Instrumento> getInstrumentosSet()
	{
		return instrumentosSet;
	}

	public void setInstrumentosSet(Set<Instrumento> instrumentosSet)
	{
		this.instrumentosSet = instrumentosSet;
	}
	*/

}
