/**
 * Propiedades
 * 		dni: b�sica, cadena, consultable
 * 		nombre: b�sica, cadena, consultable, modificable
 * 
 * Funcionalidades
 * 		String toString()
 * 		int hashCode()
 * 
 * Interfaz
 * 		//consultores
 * 		String getDni()
 * 		String nombre()
 * 		//modificadores
 * 		void setNombre(String nombre)	
 */
public abstract class Persona {
	//atributos
	private String dni;
	private String nombre;
	//constructor sin par�metros
	public Persona(){
		dni = "";
		nombre = "";
	}
	//constructor con par�metros
	public Persona(String dni,String nombre){
		this.dni=dni;
		this.nombre=nombre;
	}
	//consultores
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	//modificadores
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//funcionalidades
	/**
	 * String toString()
	 */
	@Override
	public String toString(){
		return this.dni+" "+this.nombre;
	}
	/**
	 * abstract int hashCode()
	 */
	@Override
	public abstract int hashCode();
}
