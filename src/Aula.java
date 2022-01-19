
public class Aula {
	
	//Atributos
	private int identificador;
	private int maxAlumn;
	private String materia;
	private Profesor profe;
	private Alumno[] alumnos = new Alumno[maxAlumn];
	private boolean hayClase;
	
	//Constructor
	public Aula(int identificador, int maxAlumn, String materia, Profesor profe, Alumno[] alumnos) {
		this.identificador = identificador;
		this.maxAlumn = maxAlumn;
		this.materia = materia;
		this.profe = profe;
		this.alumnos = alumnos;
		this.hayClase = aulaDisp();
	}
	
	//Metodos
	//Metodo para comprovar si la clase esta disponible
	public boolean aulaDisp() {
		
		if(profDisp() && alumnDisp()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//Metodo para comprovar si el profesor esta disponible
	public boolean profDisp() {
		
		if(profe.falta) {
			return false;
		}else if(!profe.getMateria().equals(materia)) {
			return false;
		}else {
			return true;
		}
		
	}
	
	//Metodo para comprovar si mas del 50% de los alumnos estan disponibles
	public boolean alumnDisp() {
		
		int cont = 0;
		for(int i = 0; i<maxAlumn; i++) {
			
			if (alumnos[i].falta) {
				cont++;
			}
			
		}
		
		int porcentaje = (cont / maxAlumn) * 100;
		
		if (porcentaje >= 50) {
			return false;
		}else {
			return true;
		}
		
	}
	
}
