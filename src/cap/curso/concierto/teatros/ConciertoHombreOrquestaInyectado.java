package cap.curso.concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cap.curso.concierto.configuracion.Configuracion;
import cap.curso.concierto.musicos.Musico;

public class ConciertoHombreOrquestaInyectado
{

	public static void main(String[] args)
	{
		// Sin anotaciones para buscar los context en xml
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		// Con una clase de configuracion con anotaciones para quitar ese apartado en el xml
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuracion.class);
		
		Musico hombreOrquesta = (Musico) ctx.getBean("federico");
		hombreOrquesta.tocar();
	}

}
