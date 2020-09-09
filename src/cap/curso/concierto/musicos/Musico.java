package cap.curso.concierto.musicos;

import org.springframework.stereotype.Component;

@Component
public abstract class Musico implements MusicoInterface
{
	
	@Override
	public abstract void tocar();


}
