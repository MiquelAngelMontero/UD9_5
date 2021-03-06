
public class Profesor extends Persona {
	
	//Atributos
	private String materia;
	
	//Constructor
	public Profesor(String nombre, int edad, char sexo, String materia) {
		super(nombre, edad, sexo);
		// TODO Auto-generated constructor stub
		this.materia=comprovarMateria(materia);
		super.falta=falta();
	}
	
	//Metodos
	//Metodo de comprovar materia
	public String comprovarMateria(String param) {
		
		String materiaMin = param.toLowerCase();
		
		switch (materiaMin) {
		
			case "matematicas":
				return param;
			case "filosofia":
				return param;
			case "fisica":
				return param;
			default:
				return "matematicas";
		
		}
		
	}
	
	//Metodo de falta
	@Override
	public boolean falta() {
		int random = (int) (Math.random() * 10);
		if((random <= 2)) {
			return true;
		}else {
			return false;
		}
	}

	public String getMateria() {
		return materia;
	}

	
}
