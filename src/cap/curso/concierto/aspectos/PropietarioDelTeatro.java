package cap.curso.concierto.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
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

	@Pointcut("execution(@cap.curso.concierto.anotaciones.Propietario * *.*(..))")
	public void sujetador() {
		
	}
	
	
	/* CON LA ETIQUETA AROUND CONTROLAMOS TODA LA EJECUCION DEL METODO
	 * POR SI QUEREMOS LLEVAR UN CONTROL MEJOR DEL FLUJO
	 */
	@Around("sujetador()")
	public Object arreglar(ProceedingJoinPoint joinPoint) throws SinSonidoException {
		
		Musico musico = (Musico) joinPoint.getTarget();
		Object salida = null;
		
		try {
			// BEFORE
			System.out.println("· Señores apaguen los moviles que va a empezar el concierto");
			joinPoint.proceed(); // ejecuta el metodo que estamos vigilando
			// AFTER RETURNING
			System.out.println("· El concierto ya ha terminado, ya pueden encender sus moviles");
			return salida;
		} catch ( Throwable e) {
			// AFTER THROWING
			if(musico instanceof Solista) {
				Solista s = (Solista) musico;
				System.out.println(" -> El instrumento " +
						s.getInstrumento().getClass().getSimpleName() + " esta roto");
				s.getInstrumento().setSonido("Sonido arreglado (" + s.getInstrumento().getClass().getSimpleName() + ")");
				// s.tocar();
			} else {
				HombreOrquesta ho = (HombreOrquesta) musico;
				for(Instrumento i : ho.getInstrumentos()) {
					if(i.getSonido().equals("nada")) {
						System.out.println(" -> El instrumento " +
															i.getClass().getSimpleName() + " esta roto");
						i.setSonido("sonido arreglado (" + i.getClass().getSimpleName() + ")");
					}
				}
				// ho.tocar();
			}
			System.out.println(" --> Todos los instrumentos estan arreglados.");
			musico.tocar();
		}
		// AFTER
		System.out.println("· El concierto ha finalizado");
		return salida;
		
	}
	
}
