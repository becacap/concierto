package cap.curso.concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cap.curso.concierto.configuracion.Configuracion;
import cap.curso.concierto.musicos.Musico;

public class ConciertoHombreOrquestaInyectado
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		// En el momento en que creamos una clase de configuracion, ya no nos hace falta el xml,
		// solo tenemos que cambiar como funciona el enrutamiento porque ya no busca con el path
		// un xml sino una clase con la anotación configuration
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuracion.class);
		Musico orquesta = (Musico) ctx.getBean("federico");		
		orquesta.tocar();
	}

}
