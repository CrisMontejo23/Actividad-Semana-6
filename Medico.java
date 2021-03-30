
package SecretariaSalud;

import javax.swing.JOptionPane;

public class Medico extends Persona{

    private String especialidad;
    
    public Medico() {
    }
        
    public Medico(String especialidad, String codigo, String nombres, String apellidos, String sexo, String lugarAtencion) {
        super(codigo, nombres, apellidos, sexo, lugarAtencion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }        
    
    public Medico ingresarDatosMedico(){
        Medico nuevoMedico = new Medico();
        
        String codigo="";
        String nombres="";
        String apellidos="";
        String especialidad="";
        String lugarAtencion="";
        String sexo="";
        
        codigo=leerDatoTipoCadena("Ingrese el codigo del medico:");
        nombres=leerDatoTipoCadena("Ingrese los nombres del medico:");
        apellidos=leerDatoTipoCadena("Ingrese los apellidos del medico:");        
        especialidad=leerDatoTipoCadena("Ingrese la especialidad del medico:");
        lugarAtencion=leerDatoTipoCadena("Ingrese el lugar de atencion del medico:");
        sexo=leerDatoTipoCadena("Ingrese el sexo del medico:");
        
        nuevoMedico.setCodigo(codigo);
        nuevoMedico.setNombres(nombres);
        nuevoMedico.setApellidos(apellidos);
        nuevoMedico.setEspecialidad(especialidad);
        nuevoMedico.setLugarAtencion(lugarAtencion);
        nuevoMedico.setSexo(sexo);
        
        return(nuevoMedico);
    }
    
    public void imprimirDatosMedico(){
        String datosMedico="";
        datosMedico="Codigo: "+codigo+"\n"+"Nombres: "+nombres+"\n"+"Apellidos: "+apellidos+"\n"+"Especialidad: "+especialidad+"\n"+"Sexo: "+sexo+"\n"+"";
        JOptionPane.showMessageDialog(null, "Datos del medico:"+"\n"+datosMedico);
    }    
}
