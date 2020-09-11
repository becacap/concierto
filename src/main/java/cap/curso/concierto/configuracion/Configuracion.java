package cap.curso.concierto.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import cap.curso.concierto.instrumentos.Guitarra;
import cap.curso.concierto.instrumentos.Tambor;
import cap.curso.concierto.instrumentos.Trompeta;
import cap.curso.concierto.musicos.HombreOrquesta;
import cap.curso.concierto.musicos.Solista;

@Configuration
@ComponentScan({"cap.curso.concierto.instrumentos",
				"cap.curso.concierto.musicos",
				"cap.curso.concierto.aspectos"})
@EnableAspectJAutoProxy
public class Configuracion
{

	// Esto sustituye el autowire del metodo set de la clase HombreOrquesta
	@Bean(name = "federico")
	public HombreOrquesta getHombreOrquesta() {
		HombreOrquesta hombreOrquesta = new HombreOrquesta();
		
		hombreOrquesta.getInstrumentos().add(getGuitarra());
		hombreOrquesta.getInstrumentos().add(getTambor());			
		hombreOrquesta.getInstrumentos().add(getTrompeta());
		
		return hombreOrquesta;
	}
	
	@Bean//("tambor") no hace falta ponerlo porque por defecto es el nombre de la clase en minuscula
	public Tambor getTambor() {
		Tambor t = new Tambor();
		t.setSonido("sonido de tambor");
		return t;
	}
	
	@Bean
	public Guitarra getGuitarra() {
		Guitarra g = new Guitarra();
		g.setSonido("nada");
		return g;
	}
	
	// si no ponemos @Bean esta anotacion crea un objeto null si llamamos a este metodo
	@Bean
	public Trompeta getTrompeta() {
		Trompeta t = new Trompeta();
		t.setSonido("sonido de trompeta");
		return t;
	}
	
	
}
