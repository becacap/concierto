package main.java.cap.curso.concierto.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import main.java.cap.curso.concierto.instrumentos.Guitarra;
import main.java.cap.curso.concierto.instrumentos.Tambor;
import main.java.cap.curso.concierto.instrumentos.Trompeta;
import main.java.cap.curso.concierto.musicos.HombreOrquesta;

@Configuration
@ComponentScan({"main.java.cap.curso.concierto.instrumentos",
				"main.java.cap.curso.concierto.musicos",
				"main.java.cap.curso.concierto.aspectos"})
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
		t.setSonido("nada");
		return t;
	}
	
	@Bean
	public Guitarra getGuitarra() {
		Guitarra guitarra = new Guitarra();
		guitarra.setSonido("nada");
		return guitarra;
	}
	
	@Bean // si no ponemos esta anotacion crea un objeto null si llamamos a este metodo
	public Trompeta getTrompeta() {
		return new Trompeta();
	}
	
}
