import java.util.*;

public class Main{
    private String nombre, apellido, genero;
    private int edad;

    //Constructor
    public Main(String nombre, String apellido, String genero, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }

    //Setter
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setGenero(String genero) {this.genero = genero;}
    public void setEdad(int edad) {this.edad = edad;}

    //Getter
    public String getNombre(){return nombre;}
    public String getApellido() {return apellido;}
    public String getGenero() {return genero;}
    public int getEdad() {return edad;}

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Main[] personas = new Main[5];

        for (int i = 0; i < 5; i++){
            System.out.println("\n==========");

            System.out.print("Nombre: ");
            String nombre = input.next();

            System.out.print("Apellido: ");
            String apellido = input.next();

            System.out.print("Genero (F/M): ");
            String genero = input.next();

            System.out.print("Edad: ");
            int edad = input.nextInt();

            personas[i] = new Main(nombre, apellido, genero, edad);
        }
        double promedioEdades = CalcularEdades(personas);
        int cantidadHombres = CalcularHombres(personas);
        int cantidadMujeres = CalcularMujeres(personas);

        System.out.println("\nPromedio de edades: " + promedioEdades);
        System.out.println("Cantidad de hombres: " + cantidadHombres);
        System.out.println("Cantidad de mujeres: " + cantidadMujeres);
    }

    public static double CalcularEdades(Main[] personas){
        int totalEdades = 0;
        for (Main persona : personas) {
            totalEdades += persona.getEdad();
        }
        return (double) totalEdades / personas.length;
    }

    public static int CalcularHombres(Main[] personas){
        int cantidadHombres = 0;

        for (Main persona : personas) {
            if (persona.getGenero().equalsIgnoreCase("M")) {
                cantidadHombres++;
            }
        }

        return cantidadHombres;
    }

    public static int CalcularMujeres(Main[] personas){
        int cantidadMujeres = 0;

        for (Main persona : personas) {
            if (persona.getGenero().equalsIgnoreCase("F")) {
                cantidadMujeres++;
            }
        }

        return cantidadMujeres;
    }
}
