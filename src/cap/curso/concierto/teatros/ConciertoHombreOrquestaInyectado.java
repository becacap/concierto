package cap.curso.concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cap.curso.concierto.configuracion.Configuracion;
import cap.curso.concierto.musicos.Musico;

public class ConciertoHombreOrquestaInyectado
{

	public static void main(String[] args)
	{
//		Vamos a hacer que esta clase funcione sin un documento XML
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Configuracion.class);
		Musico federico = (Musico) ctx.getBean("federico");
		federico.tocar();
	}

}
