package cap.curso.concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cap.curso.concierto.musicos.Musico;

public class ConciertoSolistaInyectado
{

	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Musico solista = (Musico) ctx.getBean("solista");
		solista.tocar();
	}

}
