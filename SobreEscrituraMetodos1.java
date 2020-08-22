/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreescriturametodos1;
/**
 *
 * @author Chango Merdado
 * @author Fernando Padilla
 */
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Vehiculo{
private String marca;
private String tecnologia;
private int modelo;
private String nombre;
private String cedula;
private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
public Vehiculo(){
tecnologia = "";
modelo = 0;
}

    public Vehiculo(String marca, String tecnologia, int modelo, String nombre, String cedula, int edad) {
        this.marca = marca;
        this.tecnologia = tecnologia;
        this.modelo = modelo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

public String getMarca(){
return marca;
}
public String getTecnologia(){
return tecnologia;
}
public int getModelo(){
return modelo;
}
}
class Automovil extends Vehiculo {
private String matriculaAutomovil;

public Automovil() {
super();
matriculaAutomovil = "Desconocido";
}
public Automovil(String marca, String tecnologia, int modelo,String nombre,String cedula,int edad) {
super(marca, tecnologia, modelo, nombre, cedula, edad);
matriculaAutomovil = "Desconocido";
}
public void setMatriculaAutomovil(String matriculaAutomovil) {
this.matriculaAutomovil = matriculaAutomovil;
}
public String getMatriculaAutomovil(){
return matriculaAutomovil;
}
public void mostrarDatos(){
System.out.println("Datos del Automovil:\nMARCA DEL AUTOMOVIL: " +getMarca() + "\nTecnologia" 
        + getTecnologia() + "\nMATRICULA DEL AUTOMOVIL:" + getMatriculaAutomovil() );
}
public void mostrarDueño(){
System.out.println("Datos del dueño: \n"+"Nombre: " +getNombre() + "\nCedula: " + getCedula()+"\nEdad: "+getEdad());
}
}
class AutomovilAutonomo extends Automovil{
private Date fechaComienzoFabricacionAutonomia;
public AutomovilAutonomo(Date fechaComienzoFabricacionAutonomia) {
super();
fechaComienzoFabricacionAutonomia = fechaComienzoFabricacionAutonomia;
}
public AutomovilAutonomo(String marca, String tecnologia,int modelo,String nombre,String cedula,int edad, Date fechaComienzo){
super(marca, tecnologia, modelo, nombre, cedula, edad);
fechaComienzoFabricacionAutonomia=fechaComienzo;
}
public Date getFechaComienzoFabricacionAutonomia(){
return fechaComienzoFabricacionAutonomia;
}
public void mostrarDatos() {

System.out.println("Datos del Automovil Autonomo:\nFECHA DE FABRICACION:"+getFechaComienzoFabricacionAutonomia()+"\nMarca:"
        + getMarca()+ "\nTecnologia: " + getTecnologia() +"\nModelo: "+ getModelo() );
}
public void mostrarDueño(){
System.out.println("Datos del dueño: \n"+"Nombre: " +getNombre() + "\nCedula: " + getCedula()+"\nEdad: "+getEdad());
}
}
class ListadoAutomoviles{
private ArrayList<Automovil>listadoAutomoviles;
//Constructor
public ListadoAutomoviles(){
listadoAutomoviles = new ArrayList<Automovil>();
}
//Métodos
public void addAutomovil(Automovil automovil) {
listadoAutomoviles.add(automovil);
} // Cierre método addAutomovil
public void Listar(int op2){
//System.out.println ("DATOS DE LOS AUTOMOVILES EXISTENTES EN EL LISTADO:");
for (Automovil Objetotmp: listadoAutomoviles){//Uso de for extendido
if (op2==1){
    Objetotmp.mostrarDatos();
}else{
    Objetotmp.mostrarDueño();
}
   }
  }
}

public class SobreEscrituraMetodos1 {
 
public static void main(String[] args) throws IOException {
    
    System.out.println("       UNIVERDIDAD DE LAS FUERZAS ARMADAS ");
        System.out.println("                ESPE-L            ");
        System.out.println("             PROGRAMACION");
        System.out.println("DOCENTE: ING LUIS GUERRA");
        System.out.println("FECHA: 21/08/2020");
        System.out.println("ESTUDIANTES  - MEDARDO CHANGO");
        System.out.println("             - FERNANDO PADILLA\n");
    
    
    int op,op2;
      Scanner input = new Scanner(System.in);
ListadoAutomoviles listado1 = new ListadoAutomoviles();
ListadoAutomoviles listado2 = new ListadoAutomoviles();

         Automovil automovil1 = new Automovil("Ford --","TECNOLOGIA: Canadiense",2018,"Medardo Chango","1804726949",23);
            automovil1.setMatriculaAutomovil("Ontario ABZM-264-20");
            
            Date fecha1;
fecha1 = StringToDate("2017-10-06 17:03:00");
             AutomovilAutonomo autonomo1 = new AutomovilAutonomo("Nissan","TECNOLOGIA EUROPEA",2025,"Fernando Padilla","0550348379",23,fecha1);
           
             listado2.addAutomovil(autonomo1);
              listado1.addAutomovil(automovil1);
  
    do{
        System.out.println("------MENU-----\n1.Datos Vehiculo\n2.Datos Propietario\n3.Salir");
         System.out.println("****************************************************");
          System.out.println("Elija opcion: ");
    op=input.nextInt();
    
    switch(op){
       
        case 1:
             System.out.println("****************************************************");
        System.out.println("1.Automovil\n2.Automovil Autonomo\nElija opcion: ");
            op2=input.nextInt();
            switch(op2){
                case 1:
                    System.out.println("****************************************************");
                    listado1.Listar(op2);
                    System.out.println("****************************************************");
                    System.in.read();
                    break;
                case 2:
                    System.out.println("****************************************************");
                    listado2.Listar(1);
                    System.out.println("****************************************************");
                    System.in.read();
                    break;
            }
            break;
        case 2: 
           
             System.out.println("1.Automovil\n2.Automovil Autonomo\nElija opcion: ");
            op2=input.nextInt();
            switch(op2){
                case 1:
                    listado1.Listar(2);
                    System.out.println("Dueño: ");
                    listado1.Listar(1);
                    System.in.read();
                    break;
                case 2:
                    listado2.Listar(2);
                    System.out.println("Dueño del vehiculo: ");
                    listado2.Listar(1);
                    System.in.read();
                    break;
            }
            break;
        case 3:
            System.out.println("GRACIAS");
            break;
    }
    }while(op!=3);

}
   public static Date StringToDate(String s){

    Date result = null;
    try{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        result  = dateFormat.parse(s);
    }

    catch(ParseException e){
        e.printStackTrace();

    }
    return result ;
}
}