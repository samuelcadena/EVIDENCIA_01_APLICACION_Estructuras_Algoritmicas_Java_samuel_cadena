/*Se importa la clase Scanner */
import java.util.Scanner;
/*Nombre del documento */
public class reto2 {
    /*Class main para ejecutar */
    public static void main(String[] args) throws Exception {
        /*Scanner para capturar los datos */
        Scanner Lectura = new Scanner(System.in);
        /*Declaración de variables tipo String */
        String nomEnfermera,nomMama,nomBebe;
        /*Declaración de variables tipo decimal */
        double peso,vacuna;
        /*Declaración de variables tipo entero */
        int mesesBebe;
        /*Se imprime un mensaje pidiendo los datos */
        System.out.println("Nombre de la enfermera:");
        nomEnfermera=Lectura.nextLine();

        System.out.println("Nombre de la mamá");
        nomMama=Lectura.nextLine();

        System.out.println("Nombre del bebe:");
        nomBebe=Lectura.nextLine();

        System.out.println("Peso bebe:");
        peso=Lectura.nextDouble();

        System.out.println("Meses del bebe:");
        mesesBebe=Lectura.nextInt();

        /*Se asigna para la variable vacuna la operación para encontrar la dosis de vacuna del bebe */

        vacuna=((peso+10)/(mesesBebe))*8;

        /*Se imprime el resultado final con las variables incluidas */

        System.out.println("\nNombre de la enfermera:"+nomEnfermera+"\nNombre de la mamá:"+nomMama+"\nNombre del bebe:"+nomBebe+"\nvacuna para el bebe:"+vacuna);

        /*Limpiar Buffer */
        Lectura.close();

    }
}