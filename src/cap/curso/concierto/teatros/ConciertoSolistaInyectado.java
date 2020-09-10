package cap.curso.concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cap.curso.concierto.configuracion.Configuracion;
import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.musicos.Musico;
import cap.curso.concierto.musicos.MusicoInterface;

public class ConciertoSolistaInyectado
{

	public static void main(String[] args) throws SinSonidoException
	{
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuracion.class);
		MusicoInterface solista = (MusicoInterface) ctx.getBean("solista");
		solista.tocar();
	}

}
