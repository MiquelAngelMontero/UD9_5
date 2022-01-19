
public abstract class Persona {
	
	//Atributos
	protected String nombre;
	protected int edad;
	protected char sexo;
	
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
