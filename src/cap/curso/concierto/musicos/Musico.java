package cap.curso.concierto.musicos;

import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Instrumento;

//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;
//import java.util.TreeSet;

public abstract class Musico implements MusicoInterface
{

	private Instrumento instrumento;
	private Set<Instrumento> instrumentos = new HashSet<>();
	
	@Override
	public abstract void tocar() throws SinSonidoException;
	
	public Instrumento getInstrumento()
	{
		return instrumento;
	}
	public void setInstrumento(Instrumento instrumento)
	{
		this.instrumento = instrumento;
	}

	public Set<Instrumento> getInstrumentos()
	{
		return instrumentos;
	}

	public void setInstrumentos(Set<Instrumento> instrumentos)
	{
		this.instrumentos = instrumentos;
	}
	
	/*public List<Instrumento> getInstrumentos()
	{
		return instrumentos;
	}
	public void setInstrumentos(List<Instrumento> instrumentos)
	{
		this.instrumentos = instrumentos;
	}*/

}
