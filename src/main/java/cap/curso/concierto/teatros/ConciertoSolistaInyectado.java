package main.java.cap.curso.concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.java.cap.curso.concierto.configuracion.Configuracion;
import main.java.cap.curso.concierto.excepciones.SinSonidoException;
import main.java.cap.curso.concierto.musicos.MusicoInterface;

public class ConciertoSolistaInyectado
{

	@SuppressWarnings("resource")
	public static void main(String[] args) throws SinSonidoException
	{
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuracion.class);
		MusicoInterface solista = (MusicoInterface) ctx.getBean("solista");
		solista.tocar();
	}

}
