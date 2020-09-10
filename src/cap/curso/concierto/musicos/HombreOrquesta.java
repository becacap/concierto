package cap.curso.concierto.musicos;

import java.util.ArrayList;
import java.util.List;

import cap.curso.concierto.anotaciones.Propietario;
import cap.curso.concierto.anotaciones.Vigilante;
import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Instrumento;

// @Component("federico")
public class HombreOrquesta extends Musico
{
	
	private List<Instrumento> instrumentos = new ArrayList<>();
	// private Set<Instrumento> instrumentosSet = new TreeSet<>();

	@Override
	@Propietario
	public void tocar() throws SinSonidoException
	{
		System.out.println("--- Instrumentos de su lista ---");
		for(Instrumento i : this.getInstrumentos()) {
			if(i.getSonido().equals("nada")) {
				throw new SinSonidoException("El instrumento " + i.getClass().getSimpleName() + " esta roto");
			}
			System.out.println(i.sonar());
		}
		
		/*
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		Instrumento g1 = (Instrumento) ctx.getBean("tambor");
		Instrumento g2 = (Instrumento) ctx.getBean("guitarra");
		Instrumento g3 = (Instrumento) ctx.getBean("trompeta");
		Instrumento g4 = (Instrumento) ctx.getBean("trompeta");
		Instrumento g5 = (Instrumento) ctx.getBean("trompeta");

		this.instrumentosSet.add(g1);
		this.instrumentosSet.add(g2);
		this.instrumentosSet.add(g3);
		this.instrumentosSet.add(g4);
		this.instrumentosSet.add(g5);
		*/

		/*
		System.out.println();

		System.out.println("--- Instrumentos de su set ---");
		for(Instrumento i : this.getInstrumentosSet()) {
			System.out.println(i.sonar());
		}
		*/
	}
	
	public List<Instrumento> getInstrumentos()
	{
		return this.instrumentos;
	}
	
	
	// @Autowired
	// @Qualifier("tocame a mi")
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

	@Autowired
	@Qualifier("tocame a mi")
	public void setInstrumentosSet(Set<Instrumento> instrumentosSet)
	{
		this.instrumentosSet = instrumentosSet;
	}
	*/
	

}
