package cap.curso.concierto.configuracion;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import cap.curso.concierto.instrumentos.Guitarra;
import cap.curso.concierto.instrumentos.Tambor;
import cap.curso.concierto.instrumentos.Trompeta;
import cap.curso.concierto.musicos.HombreOrquesta;

@Configuration
@ComponentScan({"cap.curso.concierto.instrumentos", "cap.curso.concierto.musicos"})
public class Configuracion
{

	// Esto sustituye el autowire del metodo set de la clase HombreOrquesta
	@Bean(name = "federico")
	public HombreOrquesta getHombreOrquesta() {
		return new HombreOrquesta();
	}
	
	@Bean//("tambor") no hace falta ponerlo porque por defecto es el nombre de la clase en minuscula
	public Tambor getTambor() {
		return new Tambor();
	}
	
	@Bean
	public Guitarra getGuitarra() {
		Guitarra guitarra = new Guitarra();
		guitarra.setSonido("sonido puesto en clase");
		return guitarra;
	}
	
	public Trompeta getTrompeta() {
		return new Trompeta();
	}
	
}
