package cap.curso.concierto.configuracion;

import org.springframework.beans.factory.annotation.Autowire;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import cap.curso.concierto.instrumentos.Guitarra;
import cap.curso.concierto.instrumentos.Tambor;
import cap.curso.concierto.instrumentos.Trompeta;
import cap.curso.concierto.musicos.HombreOrquesta;

@Configuration
@ComponentScan({"cap.curso.concierto.instrumentos",
				"cap.curso.concierto.musicos",
				"cap.curso.concierto.aspectos"})
@EnableAspectJAutoProxy
/*
 * Los aspectos hay que emplearlos en Interfaces, no en una clase
 */
public class Configuracion
{
	@Bean(name = "federico", autowire = Autowire.BY_TYPE)
	public HombreOrquesta getHombreOrquesta() {
		HombreOrquesta hombreOrquesta = new HombreOrquesta();
		hombreOrquesta.getInstrumentos().add(getTambor());
		hombreOrquesta.getInstrumentos().add(getGuitarra());
		hombreOrquesta.getInstrumentos().add(getTrompeta());
		return hombreOrquesta;
	}
	
	@Bean
	public Tambor getTambor() {
		return new Tambor();
	}
	
	@Bean
	public Guitarra getGuitarra() {
		Guitarra g = new Guitarra();
		g.setSonido("Sonido puesto en clase");
		return g;
	}
	
	@Bean(name="instrumentoSolista")
	public Trompeta getTrompeta() {
		return new Trompeta();
	}
	
}
