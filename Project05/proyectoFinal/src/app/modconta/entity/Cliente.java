package app.modconta.entity;
public class Cliente 
{
    private int IdCliente;
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String Telefono;
    private String Direccion;
    private String Sexo;
    private String DNI;
    private String RUC;
    private String Estado;
    
    

    public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    
    public String getApellidoP() {
		return ApellidoP;
	}

	public void setApellidoP(String apellidoP) {
		ApellidoP = apellidoP;
	}

	public String getApellidoM() {
		return ApellidoM;
	}

	public void setApellidoM(String apellidoM) {
		ApellidoM = apellidoM;
	}

	public Cliente() {
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
       this.IdCliente = IdCliente;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }
    
    
}
