package cap.curso.concierto;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cap.curso.concierto.configuracion.Configuracion;
import cap.curso.concierto.instrumentos.Trompeta;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configuracion.class)
public class TrompetaTest
{
	
	@Autowired
	private Trompeta trompeta;
	
	public Trompeta getTrompeta() {
		return trompeta;
	}

	@Test
	public void test()
	{
		System.out.println("Ejecuto el test");
		
		int a = 10;
		int b = 10;
		
		Assert.assertEquals(a, b);
		
	}

}
