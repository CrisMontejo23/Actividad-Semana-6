
package SecretariaSalud;

import javax.swing.JOptionPane;

public class Persona {
    
    protected String codigo;
    protected String nombres;
    protected String apellidos;
    protected String sexo;
    protected String lugarAtencion;

    public Persona() {
    }

    public Persona(String codigo, String nombres, String apellidos, String sexo, String lugarAtencion) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.lugarAtencion = lugarAtencion;
    }   

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getLugarAtencion() {
        return lugarAtencion;
    }
    public void setLugarAtencion(String lugarAtencion) {
        this.lugarAtencion = lugarAtencion;
    }
    
    public void imprimirDatosPersona(){
        String datosPersona="";
        datosPersona="Codigo: "+codigo+"\n"+"Nombres: "+nombres+"\n"+"Apellidos: "+apellidos+"\n"+"Sexo: "+sexo;
        JOptionPane.showMessageDialog(null, datosPersona);
    }
    
    public String leerDatoTipoCadena (String mensaje){
        String valor = "";
        valor = JOptionPane.showInputDialog(null,mensaje);
        return (valor);
    }
    
    public int leerDatoTipoEntero (String mensaje){
        int valor = 0;
        try{
            valor = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
            return (valor);
        }
        catch (Exception errorIngreso){
            errorIngreso.printStackTrace();
            return (0);
        }
    }
            
}
