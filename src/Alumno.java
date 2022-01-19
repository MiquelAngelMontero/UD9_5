
public class Alumno extends Persona {
	
	//Atributos
	private int nota;
	
	//Constructor
	public Alumno(String nombre, int edad, char sexo, int nota) {
		super(nombre, edad, sexo);
		// TODO Auto-generated constructor stub
		this.nota=nota;	
		this.falta=falta();
	}

	//Metodos
	@Override
	public boolean falta() {

		int random = (int) Math.random() * (2-1)+1;
		if(random == 1) {
			return true;
		}else {
			return false;
		}
		
	}

}
