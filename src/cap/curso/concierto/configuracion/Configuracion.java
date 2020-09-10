package cap.curso.concierto.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import cap.curso.concierto.instrumentos.Guitarra;
import cap.curso.concierto.instrumentos.Tambor;
import cap.curso.concierto.instrumentos.Trompeta;
import cap.curso.concierto.musicos.HombreOrquesta;

@Configuration
@ComponentScan(
{ "cap.curso.concierto.instrumentos", "cap.curso.concierto.instrumentos" })

public class Configuracion
{
	@Bean(name = "federico")
	public HombreOrquesta geHombreOrquesta()
	{
		HombreOrquesta ho = new HombreOrquesta();
		ho.getInstrumentos().add(getTambor());
		ho.getInstrumentos().add(getGuitarra());
		ho.getInstrumentos().add(getTrompeta());

		return ho;
	}

	@Bean
	public Tambor getTambor()
	{
		return new Tambor();
	}

	@Bean
	public Guitarra getGuitarra()
	{
		Guitarra guitarra = new Guitarra();
		guitarra.setSonido("bSonido de clase");
		return guitarra;
	}
	
	@Bean
	public Trompeta getTrompeta()
	{
		return new Trompeta();
	}
}
