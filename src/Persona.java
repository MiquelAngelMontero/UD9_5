
public abstract class Persona {
	
	//Atributos
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected boolean falta;
	
	//Constructor
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.falta = falta();
	}
	
	//Metodos
	public boolean comprovarSexo() {
		
		if ((sexo == 'H') || (sexo == 'M')) {
			return true;
		}else {
			return false;
		}
		
	}
	
	

	public abstract boolean falta();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
}
