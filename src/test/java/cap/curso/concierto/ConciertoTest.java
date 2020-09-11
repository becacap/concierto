package cap.curso.concierto;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cap.curso.concierto.configuracion.Configuracion;
import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Guitarra;
import cap.curso.concierto.instrumentos.Tambor;
import cap.curso.concierto.instrumentos.Trompeta;
import cap.curso.concierto.musicos.MusicoInterface;
import cap.curso.concierto.musicos.Solista;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Configuracion.class})
public class ConciertoTest
{
	
	/******************  TROMPETA  *********************************/
	@Autowired
	private Trompeta trompeta;
	
	public Trompeta getTrompeta() {
		return trompeta;
	}

	@Test
	public void trompetaConSonidoNoNuloTest()
	{
		System.out.println("Ejecuto test trompeta 1");
		trompeta.setSonido("sonido de guitarra");
		Assert.assertNotNull(trompeta.getSonido());
	}
	
	@Test
	public void trompetaConSonidoNuloTest()
	{
		System.out.println("Ejecuto test trompeta 2");
		trompeta.setSonido(null);
		Assert.assertNull(trompeta.getSonido());
	}
	/***************************************************************/
	
	/******************  GUITARRA  *********************************/
	@Autowired
	private Guitarra guitarra;
	
	public Guitarra getGuitarra() {
		return guitarra;
	}

	@Test
	public void guitarraConSonidoNoNuloTest()
	{
		System.out.println("Ejecuto test guitarra 1");
		guitarra.setSonido("sonido guitarra");
		Assert.assertNotNull(guitarra.getSonido());
	}
	
	@Test
	public void guitarraConSonidoNuloTest()
	{
		System.out.println("Ejecuto test guitarra 2");
		guitarra.setSonido(null);
		Assert.assertNull(guitarra.getSonido());
	}
	/***************************************************************/
	
	/******************  TAMBOR  *********************************/
	@Autowired
	private Tambor tambor;
	
	public Tambor getTambor() {
		return tambor;
	}

	@Test
	public void tamborConSonidoNoNuloTest()
	{
		System.out.println("Ejecuto test tambor 1");
		tambor.setSonido("sonido tambor");
		Assert.assertNotNull(tambor.getSonido());
	}
	
	@Test
	public void tamborConSonidoNuloTest()
	{
		System.out.println("Ejecuto test tambor 2");
		tambor.setSonido(null);
		Assert.assertNull(tambor.getSonido());
	}
	/***************************************************************/
	
	
	/***************************************************************/
	
	@Autowired
	@Qualifier("solista")
	private MusicoInterface solista;
	
	public MusicoInterface getSolista() {
		return solista;
	}
	
	
	@Test
	public void sonarSolistaCorrectoTest() throws SinSonidoException {
		solista.tocar();
		System.out.println("Ejecuto test solista 1");
	}
	
	

}
