package cap.curso.concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cap.curso.concierto.musicos.Musico;

public class ConciertoHombreOrquestaInyectado
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Musico orquesta = (Musico) ctx.getBean("federico");		
		orquesta.tocar();
	}

}
