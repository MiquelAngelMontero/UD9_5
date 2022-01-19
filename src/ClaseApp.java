
public class ClaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos alumnos y profesores
		Profesor p1 = new Profesor("Juan", 30, 'H', "matematicas");
		Profesor p2 = new Profesor("Jorge", 42, 'H', "fisica");
		Profesor p3 = new Profesor("Maria", 27, 'M', "filosofia");
		
		
		
		Alumno a1 = new Alumno("Albert", 27, 'H', 7);
		Alumno a2 = new Alumno("Jordi", 20, 'H', 6);
		Alumno a3 = new Alumno("Alicia", 22, 'M', 5);
		Alumno a4 = new Alumno("Inma", 18, 'M', 8);
		
		
		
		//Creamos el aula
		Alumno[] arrayAlumn = new Alumno[4];
		
		arrayAlumn[0] = a1;
		arrayAlumn[1] = a2;
		arrayAlumn[2] = a3;
		arrayAlumn[3] = a4;
		
		Aula au1 = new Aula(103, 4, "filosofia", p3, arrayAlumn);
		
		au1.MostrarFaltasAlumno();
		
		System.out.println("Falta profesor " + au1.getProfesor().falta);
		System.out.println(au1.aulaDisp());
		
		au1.mostrarNumeroAlumnado();
	}

}
