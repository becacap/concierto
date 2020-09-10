package cap.curso.concierto.musicos;

import org.springframework.stereotype.Component;

import cap.curso.concierto.excepciones.SinSonidoException;

@Component
public abstract class Musico implements MusicoInterface
{
	
	@Override
	public abstract void tocar() throws SinSonidoException;


}
