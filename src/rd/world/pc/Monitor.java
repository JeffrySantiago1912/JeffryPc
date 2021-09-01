package rd.world.pc;

public class Monitor {

    private int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores; //Inicializa la variable idMonitor//
    }

    public Monitor(String marca, double tamaño) {
        this();//Hace una llamada al constructor privado y inicializa la variable idMonitor//
        this.marca = marca;
        this.tamaño = tamaño;
    }
    
    public int getIdMonitor(){
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamaño + '}';
    }
    

}
