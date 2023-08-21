
package inmuebles.herencia;

import javax.swing.JOptionPane;


public class InmueblesHerencia {

    public static void pedirDatos(){
    
        Inmueble inmueble1=null;
        
        int opc=0;
        
        do{
            System.out.println("Elija una opcion:\n");
            System.out.println("1---->CASA");
            System.out.println("2---->DEPARTAMENTO");
            System.out.println("3---->SALIR");
            opc=Integer.parseInt(JOptionPane.showInputDialog("opcion"));
            switch(opc){
                case 1:
                        int id=Integer.parseInt(JOptionPane.showInputDialog("ingreae el id del articulo"));
                        int nroHabitacion=Integer.parseInt(JOptionPane.showInputDialog("¿cuantas habitaciones tiene?"));
                        int nropiso=Integer.parseInt(JOptionPane.showInputDialog("¿cuantas pisos tiene?"));
                        double areaMetros=Double.parseDouble(JOptionPane.showInputDialog("¿cuantas metros cuadrados tiene?"));
                        double avaluoFiscal=Double.parseDouble(JOptionPane.showInputDialog("¿cual es el valor fiscal de la propiedad?"));
                        inmueble1=new casa(nroHabitacion, nropiso, id, areaMetros, avaluoFiscal);
                        System.out.println("Se creo con exito el items!!");
                        break;
                case 2:
                        id=Integer.parseInt(JOptionPane.showInputDialog("ingreae el id del articulo"));
                        int nroDepto=Integer.parseInt(JOptionPane.showInputDialog("¿cual es el numero del departamento?"));
                        double expensa=Double.parseDouble(JOptionPane.showInputDialog("¿cuanto es el valor de expensas?"));
                        areaMetros=Double.parseDouble(JOptionPane.showInputDialog("¿cuantas metros cuadrados tiene?"));
                        avaluoFiscal=Double.parseDouble(JOptionPane.showInputDialog("¿cual es el valor fiscal de la propiedad?"));
                        inmueble1=new Departamentos(nroDepto, expensa, true, id, areaMetros, avaluoFiscal);
                        System.out.println("Se creo con exito el items!!");
                        break;
                case 3:
                        System.out.println("ADIOS!!!!");
                        break;
                default:
                    System.out.println("ERROR-reingrese opcion!!!");
            }
        }while(opc!=3);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        InmueblesHerencia.pedirDatos();
    }
    
}

abstract class Inmueble{
    private int id;
    private double areaMetros;
    private double avaluoFiscal;

    public Inmueble(int id, double areaMetros, double avaluoFiscal) {
        this.id = id;
        this.areaMetros = areaMetros;
        this.avaluoFiscal = avaluoFiscal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAreaMetros() {
        return areaMetros;
    }

    public void setAreaMetros(double areaMetros) {
        this.areaMetros = areaMetros;
    }

    public double getAvaluoFiscal() {
        return avaluoFiscal;
    }

    public void setAvaluoFiscal(double avaluoFiscal) {
        this.avaluoFiscal = avaluoFiscal;
    }
    
    public abstract String mostrarDatos();
}
class casa extends Inmueble {
    private int nroHabitacion;
    private int nroPisos;

    public casa(int nroHabitacion, int nroPisos, int id, double areaMetros, double avaluoFiscal) {
        super(id, areaMetros, avaluoFiscal);
        this.nroHabitacion = nroHabitacion;
        this.nroPisos = nroPisos;
    }

    @Override
    public String mostrarDatos() {
        return "Datos: ("+" ID: "+super.getId()+" Metros cuadrados: "+super.getAreaMetros()+" Valor Fiscal: "+super.getAvaluoFiscal()+"\n"+" Nro de habitaciones: "+nroHabitacion+" Nro de pisos; "+nroPisos+" )";
    }
    
    
}
class Departamentos extends Inmueble{
    private int nroDepto;
    private double expensas;
    private boolean tieneCochera;

    public Departamentos(int nroDepto, double expensas, boolean tieneCochera, int id, double areaMetros, double avaluoFiscal) {
        super(id, areaMetros, avaluoFiscal);
        this.nroDepto = nroDepto;
        this.expensas = expensas;
        this.tieneCochera = tieneCochera;
    }

    @Override
    public String mostrarDatos() {
        return "Datos: ("+" ID: "+super.getId()+" Metros cuadrados: "+super.getAreaMetros()+" Valor Fiscal: "+super.getAvaluoFiscal()+"\n"+"Nro de Depto: "+nroDepto+" Valor de Expensa: "+expensas+" Cochera: "+tieneCochera+" )";
    }
    
    
}