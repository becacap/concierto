package cap.curso.concierto.teatros;

import java.util.Set;
import java.util.TreeSet;

import cap.curso.concierto.instrumentos.Instrumento;

public class PruebaSet
{

	public static void main(String[] args)
	{
		Instrumento a = new Instrumento();
		Instrumento b = new Instrumento();
		Instrumento c = new Instrumento();
		a.setSonido("a");
		b.setSonido("b");
		c.setSonido("c");

		Set<Instrumento> i = new TreeSet();

		i.add(a);
		i.add(b);
		i.add(c);
		
		for (Instrumento instrumento : i)
		{
			System.out.println(instrumento.getSonido());
		}

	}

}
