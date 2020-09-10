package cap.curso.concierto.aspectos;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*
 * Las anotaciones siempre están sujetas a algo, ya sea una clase, método, propiedad...
 * el punto de corte, en este caso va a estar sujeto a un método.
 *
 * Cuando queramos llamar al punto de corte llamaremos a ese método, así podemos tener 
 * múltiples puntos de corte.
 * 
 */

@Aspect
@Component
public class VigilanteDeAudiencia
{
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_CYAN = "\u001B[36m";

	//@Pointcut("execution(* *.*.*(..))") cualquier paquete.clase.metodo
	//@Pointcut()
	//@Pointcut("execution(* *.Solista.tocar(..))")
	/*public void sujetador1() {
		
	}*/
	
	//@Pointcut("execution(* cap.curso.concierto.musicos.Musico.tocar(..))")
	@Pointcut("execution(@cap.curso.concierto.anotaciones.Vigilante * *.*(..))")
	public void sujetador() {
		
	}
	
	
	// Marcamos que queremos que pase antes del punto de corte marcado en 
	// sujetador
	@Before("sujetador()")
	public void apagarMoviles() {
		System.out.println(ANSI_CYAN + "Señores, por favor apaguen sus móviles." + ANSI_RESET);
	}
	
	
	// Después del método sujetador, marcado como punto de corte, se ejecuta.
	// Podriamos usar After, AfterThrowing, AfterReturn, dependiendo de lo que
	// queramos
	@After("sujetador()")
	public void encenderMoviles() {
		System.out.println(ANSI_CYAN + "Señores, pueden encender sus móviles" + ANSI_RESET);
	}
	
	
	
	
	
	
	
}
