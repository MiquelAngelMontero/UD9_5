
public class Aula {
	
	//Atributos
	private int identificador;
	private int maxAlumn;
	private String materia;
	private Profesor profe;
	private Alumno[] alumnos = new Alumno[maxAlumn];
	private boolean hayClase;
	
	//Constructor
	public Aula(int identificador, int maxAlumn, String materia, Profesor profe, Alumno[] alumnos, boolean hayClase) {
		this.identificador = identificador;
		this.maxAlumn = maxAlumn;
		this.materia = materia;
		this.profe = profe;
		this.alumnos = alumnos;
		this.hayClase = hayClase;
	}
	
	//Metodos
	
	
}
