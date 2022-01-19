
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
		for(int i = 0; i<alumnos.length; i++) {
			
			if (alumnos[i].falta) {
				cont++;
			}
			
		}
		
		if (cont > maxAlumn/2) {
			return false;
		}else if(cont <= maxAlumn/2){
			return true;
		}else {
			System.out.println("no entro a ninguno");
			return false;
		}
		
	}
	
	//Contaqdor de alumnos y alumnas
	
	public void mostrarNumeroAlumnado() {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i].getNota() >= 5) {
				System.out.println("Alumno " + alumnos[i].getNombre() + " tiene de nota " + alumnos[i].getNota());
			}
		}
	}
	
}
