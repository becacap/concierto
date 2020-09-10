package cap.curso.concierto.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.ast.Instanceof;
import org.springframework.stereotype.Component;

import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Instrumento;
import cap.curso.concierto.musicos.HombreOrquesta;
import cap.curso.concierto.musicos.Musico;
import cap.curso.concierto.musicos.Solista;

@Aspect
@Component
public class PropietarioDelTeatro
{

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";

	@Pointcut("execution (@cap.curso.concierto.anotaciones.Propietario * *.*(..))")
	public void sujetador()
	{

	}

	/*
	 * Al cargar los aspectos, se crea la clase joinPoint y lo pone en memoria. De
	 * modo que al lanzar arreglar, se inyecta ese joinPoint. Nos dará justo la
	 * informacion en el punto de corte.
	 * 
	 * El origen es la clase que está siendo interceptada
	 * 
	 */

	@SuppressWarnings("finally")
	@Around("sujetador()")
	public Object arreglar(ProceedingJoinPoint joinPoint) throws SinSonidoException
	{

		Musico musico = (Musico) joinPoint.getTarget();
		Object salida = null;
		
		try
		{

			// BEFORE
			System.out.println(ANSI_GREEN + "Before, lo dicel propietario" + ANSI_RESET);
			// Proceed ejecuta el método, de modo que todo lo de antes es @before
			salida = joinPoint.proceed();
			return salida;
			
			// Cuando termino de ejecutar y es correcto, After Returning, si es incorrecto
			// y lanza una excepción, After Throwing, e independientemente del resultado, un After

			// AFTER RETURNING

		} catch (Throwable e)
		{
			System.err.println(e.getMessage());
			
			// AFTER THROWING
			if (musico instanceof Solista)
			{
				Musico solista = (Musico) musico;
				solista.getInstrumento().setSonido("Sonido arreglado");
			} else
			{
				Musico hombreOrquesta = (Musico) musico;
				for (Instrumento instrumento : hombreOrquesta.getInstrumentos())
				{
					if (instrumento.getSonido().equals("nada"))
						instrumento.setSonido("Sonido arreglado " + instrumento.getClass().getSimpleName());
				}				
			}
			
		} finally
		{
			
		}
		
		// AFTER
					System.out.println(ANSI_GREEN + "AFTER" + ANSI_RESET);
					musico.tocar();
					return salida;
	}

}