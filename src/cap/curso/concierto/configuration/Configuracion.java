package cap.curso.concierto.configuration;

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
@ComponentScan({"cap.curso.concierto.instrumentos", "cap.curso.concierto.musicos",
	"cap.curso.concierto.aspectos"})
@EnableAspectJAutoProxy
public class Configuracion {

	@Bean(name = "Federico")
	public HombreOrquesta getHombreOrquesta()
	{
		HombreOrquesta hombreOrquesta = new HombreOrquesta();
		hombreOrquesta.getInstrumentos().add(getTambor());
		hombreOrquesta.getInstrumentos().add(getGuitarra());
		hombreOrquesta.getInstrumentos().add(geTrompeta());
		return hombreOrquesta;
	}
	
	
	@Bean
	public Tambor getTambor()
	{
		return new Tambor();
		
	}
	
	@Bean(name = "guitarra")
	public Guitarra getGuitarra()
	{
		Guitarra guitarra = new Guitarra();
		guitarra.setSonido("tran, tran, tran, sonido desde conf");
		return guitarra;
		
	}
	@Bean
	public Trompeta geTrompeta()
	{
		return new Trompeta();
		
	}
}
