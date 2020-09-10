package cap.curso.concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cap.curso.concierto.configuracion.Configuracion;
import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.musicos.Musico;

public class ConciertoSolistaInyectado
{

	public static void main(String[] args)
	{
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuracion.class);
		Musico solista = (Musico) ctx.getBean("solista");
		try
		{
			solista.tocar();
		} catch (SinSonidoException e)
		{
			System.err.println(e.getMessage());
		}
	}

}
