package cap.curso.concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import cap.curso.concierto.configuracion.Configuracion;
import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.musicos.Musico;
import cap.curso.concierto.musicos.MusicoInterface;

public class ConciertoHombreOrquestaInyectado
{

	private static ApplicationContext ctx;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		ctx = new AnnotationConfigApplicationContext(Configuracion.class);
		MusicoInterface orquesta = (MusicoInterface) ctx.getBean("federico");		
		try
		{
			orquesta.tocar();
		} catch (SinSonidoException e)
		{
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}

}
