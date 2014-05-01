package models;

public class Usuario {
	private String nombre;
	private String apellido;
	private String eMail;
	private String password;
	
	public static void create (Usuario u){
		
	}
public static void delete (Usuario u){
		
	}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String geteMail() {
	return eMail;
}
public void seteMail(String eMail) {
	this.eMail = eMail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
