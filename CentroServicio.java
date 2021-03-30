
package SecretariaSalud;

import javax.swing.JOptionPane;

public class CentroServicio {
    
    private String nombre;
    private String ciudad;
    private String direccion;
    private String tipo;
    
    public CentroServicio() {
    }

    public CentroServicio(String nombre, String ciudad, String direccion, String tipo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String definirTipoCentro(int tipo){        
        String tipoCentro="";
        
        do {            
           switch(tipo){
            case 1:
                tipoCentro="Clinica";
                break;
            case 2:
                tipoCentro="Hospital";
                break;
            case 3:
                tipoCentro="Centro de Salud";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Numero Invalido");
                break;
            } 
        } while (tipo<1 || tipo>3);
                        
        return tipoCentro;
    }
    
    public CentroServicio ingresarDatosCentroServicio(){
        CentroServicio nuevoCentroServicio = new CentroServicio();
        Persona leerDato = new Persona();
        
        String nombre="";
        String ciudad="";
        String direccion="";
        String tipo="";
        
        nombre=leerDato.leerDatoTipoCadena("Ingrese el nombre del centro de servicio:");
        ciudad=leerDato.leerDatoTipoCadena("Ingrese la ciudad donde se encuentra el centro de servicio:");
        direccion=leerDato.leerDatoTipoCadena("Ingrese la direccion del centro de servicio: ");
        tipo=definirTipoCentro(leerDato.leerDatoTipoEntero("Ingrese el numero correspondiente:"+"\n"+"Que tipo de centro de servicio es?:"+"\n"+"1. Clinica"+"\n"+"2. Hospital"+"\n"+"3. Centro de salud"));
        
        nuevoCentroServicio.setNombre(nombre);
        nuevoCentroServicio.setCiudad(ciudad);
        nuevoCentroServicio.setDireccion(direccion);
        nuevoCentroServicio.setTipo(tipo);
        
        return(nuevoCentroServicio);
    }
    
    public void imprimirDatosCentro(){
        String datosCentro="";
        datosCentro="Nombre: "+nombre+"\n"+"Ciudad: "+ciudad+"\n"+"Direccion: "+direccion+"\n"+"Tipo: "+tipo;
        JOptionPane.showMessageDialog(null, "Centro de Servicio:"+"\n"+datosCentro);
    }
    
}
