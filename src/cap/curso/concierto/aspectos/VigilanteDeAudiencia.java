package cap.curso.concierto.aspectos;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component // SI NO PONES ESTA NOTACION Y SOLO PONES @ASPECT NO FUNCIONA
public class VigilanteDeAudiencia
{

	// @Pointcut("execution(public void cap.curso.concierto.musicos.Musico.tocar(..))")
	@Pointcut("execution(@cap.curso.concierto.anotaciones.Vigilante * *.*(..))")
	public void sujetador() {
		
	}
	
	@Before("sujetador()") // es importante poner los parentesis
	public void apagarMoviles() {
		System.out.println("· Señores apaguen los moviles que va a empezar el concierto");
	}
	
	@After("sujetador()") 
	public void encenderMoviles() {
		System.out.println("· El concierto ya ha terminado, ya pueden encender sus moviles");
	}
	
	
}
