
public class ClaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos alumnos y profesores
		Profesor p1 = new Profesor("Juan", 30, 'H', "matematicas");
		Profesor p2 = new Profesor("Jorge", 42, 'H', "fisica");
		Profesor p3 = new Profesor("Maria", 27, 'M', "filosofia");
		

		System.out.println("Faltan profesores?");
		System.out.println(p1.falta+ " " +p2.falta+ " " +p3.falta);

		
		Alumno a1 = new Alumno("Albert", 27, 'H', 7);
		Alumno a2 = new Alumno("Jordi", 20, 'H', 6);
		Alumno a3 = new Alumno("Alicia", 22, 'M', 5);
		Alumno a4 = new Alumno("Inma", 18, 'M', 8);
		

		System.out.println("\nFaltan alumnos?");
		System.out.println(a1.falta+ " " +a2.falta+ " " +a3.falta+ " " +a4.falta);
		
		//Creamos el aula
		Alumno[] arrayAlumn = new Alumno[4];
		
		arrayAlumn[0] = a1;
		arrayAlumn[1] = a2;
		arrayAlumn[2] = a3;
		arrayAlumn[3] = a4;
		
		Aula au1 = new Aula(103, 4, "filosofia", p3, arrayAlumn);
		

		System.out.println("\nHay clase?");	
		System.out.println(au1.aulaDisp());
		
		System.out.println("\n");
		
		if(au1.aulaDisp()) {
			au1.mostrarNumeroAlumnado();
		}
	}

}
