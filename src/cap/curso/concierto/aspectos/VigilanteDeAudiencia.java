package cap.curso.concierto.aspectos;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class VigilanteDeAudiencia
{
//	Sin anotaciones
//	@Pointcut("execution(* cap.curso.concierto.musicos.Musico.tocar(..)) ")
//	Con anotaciones
	@Pointcut("execution(@cap.curso.concierto.anotaciones.Vigilante * *.*(..))")
	public void sujetador()
	{

	}

	@Before(value = "sujetador()")
	public void apagarMoviles()
	{
		System.out.println("Señores apaguen los móviles que va a empezar el concierto");
	}

	@After(value = "sujetador()")
	public void encenderMoviles()
	{
		System.out.println("Señores el concierto ha terminado, pueden encender sus móviles");
	}
}
