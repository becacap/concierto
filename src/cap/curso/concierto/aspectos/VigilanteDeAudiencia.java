package cap.curso.concierto.aspectos;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class VigilanteDeAudiencia
{
	//@Pointcut("execution(* cap.curso.concierto.musicos.Musico.tocar(..))")
	@Pointcut("execution(@cap.curso.concierto.anotaciones.Vigilante * *.*(..))")
	public void sujetador() {
		
	}
	
	
	@Before("sujetador()")
	public void apagarMoviles() {
		System.err.println("Señores apaguen los moviles que va a empezar el concierto");
	}
	
	@After("sujetador()")
	public void encenderMoviles() {
		System.err.println("Señores el concierto ha terminado, pueden encender sus moviles");
	}
}
