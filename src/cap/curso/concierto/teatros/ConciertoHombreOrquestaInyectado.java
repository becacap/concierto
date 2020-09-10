package cap.curso.concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cap.curso.concierto.configuracion.Configuracion;
import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.musicos.Musico;
import cap.curso.concierto.musicos.MusicoInterface;

public class ConciertoHombreOrquestaInyectado
{

	public static void main(String[] args)
	{
		// Sin anotaciones para buscar los context en xml
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		// Con una clase de configuracion con anotaciones para quitar ese apartado en el xml
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuracion.class);
		
		MusicoInterface hombreOrquesta = (MusicoInterface) ctx.getBean("federico");
		try
		{
			hombreOrquesta.tocar();
		} catch (SinSonidoException e)
		{
			System.err.println(e.getMessage());
			// e.printStackTrace();
		}
	}

}
