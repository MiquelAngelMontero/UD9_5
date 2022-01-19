
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
	
}
