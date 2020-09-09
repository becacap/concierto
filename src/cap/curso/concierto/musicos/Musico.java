package cap.curso.concierto.musicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import cap.curso.concierto.instrumentos.Instrumento;

public abstract class Musico implements MusicoInterface
{

	private Instrumento instrumento;
	private List<Instrumento> instrumentos = new ArrayList<>();
	private Set<Instrumento> instrumentosSet = new TreeSet<Instrumento>();
	
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
	
	private int edad;

	@Override
	public abstract void tocar();

	public Instrumento getInstrumento()
	{
		return instrumento;
	}

	public void setInstrumento(Instrumento instrumento)
	{
		this.instrumento = instrumento;
	}

	public List<Instrumento> getInstrumentos()
	{
		return this.instrumentos;
	}
	
	public void setInstrumentos(List<Instrumento> l) {
		this.instrumentos = l;
	}
	
	public void addInstrumento(Instrumento i) {
		this.instrumentos.add(i);
	}

	public Set<Instrumento> getInstrumentosSet()
	{
		return instrumentosSet;
	}

	public void setInstrumentosSet(Set<Instrumento> instrumentosSet)
	{
		this.instrumentosSet = instrumentosSet;
	}

}
