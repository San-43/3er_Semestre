package pk_employee;

public class Employee {
    private int noEmpleado;
    private String nombre;
    private String departamento;
    private int anio;
    private double[] ventas = new double[12];

    public Employee(int NoEmp, String nombre, String depto, int year){
        this.noEmpleado = NoEmp;
        this.nombre = nombre;
        this.departamento = depto;
        this.anio = year;
        for (int i = 0; i <= 11; i++) {
            this.ventas[i] = -0.1;
        }
    }

    public Employee(){
        this(0, null, null, 2023);
    }

    public void setNoEmpleado(int noEm) {
        this.noEmpleado = noEm;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDepartamento(String depto) {
        this.departamento = depto;
    }
    public void setAnio(int year) {
        this.anio = year;
    }
    public void setVentas(double venta, int mes) {
        this.ventas[mes-1] = venta;
    }

    public int getNoEmpleado() {
        return noEmpleado;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDepartamento() {
        return departamento;
    }
    public int getAnio() {
        return anio;
    }
    public double getVentas(int mes) {
        return ventas[mes-1];
    }

    public String getDatos(){
        String tabla = "\n Mes   | Ventas\n" +
                "------------------------------\n";
        for (int i = 0; i <= 11; i++) {
            if (ventas[i] >= 0)
                tabla += "  " + (i+1) + "   | $" + ventas[i] + "\n";
        }
        return "---Empleado---" +
                "\n No empleado: " + getNoEmpleado() +
                "\n Descripcion: " + getNombre() +
                "\n Marca: " + getDepartamento() +
                "\n Contenido: " + getAnio() + tabla;
    }

    public String getVentasD(int mes){
        return " Venta del empleado " + getNombre() +
                " \n Mes " + mes + ": $" + getVentas(mes);
    }
}
