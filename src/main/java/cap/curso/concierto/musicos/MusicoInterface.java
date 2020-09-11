package cap.curso.concierto.musicos;

import cap.curso.concierto.excepciones.SinSonidoException;

public interface MusicoInterface
{
	public void tocar() throws SinSonidoException;

}
