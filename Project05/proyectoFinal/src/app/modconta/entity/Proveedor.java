/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modconta.entity;

public class Proveedor {
    private int IdProveedor;
    private String Nombre;
    private String Telefono;
    private String Direccion;
    private String RUC;
    private String CTA;
    private String Estado;

    public Proveedor() {
    }

	public Proveedor(int idProveedor, String nombre, String telefono, String direccion, String rUC, String cTA, String estado) {
		IdProveedor = idProveedor;
		Nombre = nombre;
		Telefono = telefono;
		Direccion = direccion;
		RUC = rUC;
		CTA = cTA;
		Estado = estado;
	}

	public int getIdProveedor() {
		return IdProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		IdProveedor = idProveedor;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getRUC() {
		return RUC;
	}

	public void setRUC(String rUC) {
		RUC = rUC;
	}

	public String getCTA() {
		return CTA;
	}

	public void setCTA(String cTA) {
		CTA = cTA;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
	
	

   
    

    
}
