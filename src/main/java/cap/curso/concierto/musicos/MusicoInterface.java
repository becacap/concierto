package main.java.cap.curso.concierto.musicos;

import main.java.cap.curso.concierto.excepciones.SinSonidoException;

public interface MusicoInterface
{
	public void tocar() throws SinSonidoException;

}
