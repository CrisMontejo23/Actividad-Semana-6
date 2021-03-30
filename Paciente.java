
package SecretariaSalud;

import javax.swing.JOptionPane;

public class Paciente extends Persona{
    
    private String direccion;    
    private String motivoConsulta; 
    private String medicoEncargado;
    private String fechaConsulta;

    public Paciente() {
    }

    public Paciente(String direccion, String motivoConsulta, String medicoEncargado, String fechaConsulta, String codigo, String nombres, String apellidos, String sexo, String lugarAtencion) {
        super(codigo, nombres, apellidos, sexo, lugarAtencion);
        this.direccion = direccion;
        this.motivoConsulta = motivoConsulta;
        this.medicoEncargado = medicoEncargado;
        this.fechaConsulta = fechaConsulta;
    }
        
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }    
    public String getMotivoConsulta() {
        return motivoConsulta;
    }
    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }
    public String getMedicoEncargado() {
        return medicoEncargado;
    }
    public void setMedicoEncargado(String medicoEncargado) {
        this.medicoEncargado = medicoEncargado;
    }
    public String getFechaConsulta() {
        return fechaConsulta;
    }
    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }
    
    public Paciente ingresarDatosPaciente(){
        Paciente nuevoPaciente = new Paciente();
        
        String codigo="";
        String nombres="";
        String apellidos="";
        String sexo="";
        String lugarAtencion="";
        String direccion="";    
        String motivoConsulta=""; 
        String medicoEncargado="";
        String fechaConsulta="";
        
        codigo=leerDatoTipoCadena("Ingrese el codigo del paciente:");
        nombres=leerDatoTipoCadena("Ingrese los nombres del paciente:");
        apellidos=leerDatoTipoCadena("Ingrese los apellidos del paciente:");
        sexo=leerDatoTipoCadena("Ingrese el sexo del paciente:");
        lugarAtencion=leerDatoTipoCadena("Ingrese el lugar de atencion del paciente:");
        direccion=leerDatoTipoCadena("Ingrese la direccion del paciente:");
        motivoConsulta=leerDatoTipoCadena("Ingrese el motivo de la consulta del paciente:");
        medicoEncargado=leerDatoTipoCadena("Ingrese el medico engargado del paciente:");
        fechaConsulta=leerDatoTipoCadena("Ingrese la fecha de la consulta:");
        
        nuevoPaciente.setCodigo(codigo);
        nuevoPaciente.setNombres(nombres);
        nuevoPaciente.setApellidos(apellidos);
        nuevoPaciente.setSexo(sexo);
        nuevoPaciente.setLugarAtencion(lugarAtencion);
        nuevoPaciente.setDireccion(direccion);
        nuevoPaciente.setMotivoConsulta(motivoConsulta);
        nuevoPaciente.setMedicoEncargado(medicoEncargado);
        nuevoPaciente.setFechaConsulta(fechaConsulta);
        
        return(nuevoPaciente);                
    }
    
    public void imprimirDatosPaciente(){        
        imprimirDatosPersona();
        
        String datosPaciente1;
        datosPaciente1="Lugar de atencion: "+lugarAtencion+"\n"+"Direccion: "+direccion+"\n"+"Motivo de consulta: "+motivoConsulta+"\n"+"Fecha de la consulta: "+fechaConsulta+"\n"+"Medico encargado: "+medicoEncargado;
        JOptionPane.showMessageDialog(null, "Datos del paciente:"+"\n"+datosPaciente1);               
    }
             
}
