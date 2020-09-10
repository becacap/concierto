package cap.curso.concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cap.curso.concierto.configuracion.Configuracion;
import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.musicos.Musico;

public class ConciertoHombreOrquestaInyectado
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuracion.class);
		Musico federico = (Musico) ctx.getBean("federico");
		try
		{
			federico.tocar();
		} catch (SinSonidoException e)
		{
			System.err.println(e.getMessage());
		}

	}
}
