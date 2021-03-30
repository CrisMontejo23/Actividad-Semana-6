
package SecretariaSalud;

import javax.swing.JOptionPane;

public class Aplicacion {

    public Aplicacion() {
    }        
    
    public static void main(String[] args) {
        int opcion=0;
        
        Persona aplicacion1 = new Persona(); 
        Paciente manejadorPaciente = new Paciente();
        Medico manejadorMedico = new Medico();
        CentroServicio manejadorCentro = new CentroServicio();
                
        try {
            do {            
                opcion= aplicacion1.leerDatoTipoEntero("Ingrese la opcion correspondiente:"+"\n"+"Que desea hacer?:"+"\n"+"1.Registrar"+"\n"+"2.Consultar"+"\n"+"3.Salir de la aplicacion");
                
                switch(opcion){
                    
                    //Registro de la aplicacion
                    case 1:
                        int opcion1=0; 
                        
                        opcion1=aplicacion1.leerDatoTipoEntero("Ingrese la opcion correspondiente:"+"\n"+"1.Registrar Paciente"+"\n"+"2.Registrar Medico"+"\n"+"3.Registrar Centro de Servicio");
                        
                        switch(opcion1){
                            case 1:
                                JOptionPane.showMessageDialog(null, "Registrando datos del paciente");
                                                                        
                                manejadorPaciente = manejadorPaciente.ingresarDatosPaciente();
                                JOptionPane.showMessageDialog(null, "Paciente Registrado");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Registrando datos del medico");
                                                                        
                                manejadorMedico = manejadorMedico.ingresarDatosMedico();
                                JOptionPane.showMessageDialog(null, "Medico Registrado");
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Registrando datos del centro de servicio");                                    
                                    
                                manejadorCentro = manejadorCentro.ingresarDatosCentroServicio();
                                JOptionPane.showMessageDialog(null, "Centro de servicio Registrado");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion Invalida");
                                break;                                    
                        }                      
                        break;
                    
                    //Consulta de la aplicacion
                    case 2:
                        int opcion2=0; 
                        
                        opcion2=aplicacion1.leerDatoTipoEntero("Ingrese la opcion correspondiente:"+"\n"+"1.Consultar Paciente"+"\n"+"2.Constultar Medico"+"\n"+"3.Consultar Centro de Servicio");
                        
                        switch(opcion2){
                            case 1:
                                JOptionPane.showMessageDialog(null, "Consultando Paciente");
                                    
                                manejadorPaciente.imprimirDatosPaciente(); 
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Consultando Medico");
                                    
                                manejadorMedico.imprimirDatosMedico();
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Consultando Centro de Servicio");
                                    
                                manejadorCentro.imprimirDatosCentro();
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion Invalida");
                                break;
                        }
                        break;
                    
                    //Salir de la aplicacion
                    case 3:
                        JOptionPane.showMessageDialog(null, "Saliendo del Sistema");
                        break;                         
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Invalida");
                        break; 
                }              
            } while (opcion != 3);  //opcion <= 1 || opcion >= 3 || opcion ==2
            
        } catch (Exception errorMain) {
            JOptionPane.showMessageDialog(null,"Error en la digitación: ");
            errorMain.printStackTrace();
        }                
    }    
}
