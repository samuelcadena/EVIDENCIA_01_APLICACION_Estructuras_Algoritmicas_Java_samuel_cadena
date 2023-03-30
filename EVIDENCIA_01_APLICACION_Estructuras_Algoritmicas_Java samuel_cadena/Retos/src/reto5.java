import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        //declarar variables
        int  producto,i,n,suma=0;
        double subtotal=0,total1,total2,iva=0.19;
        String nombreEmpleado,nombreCliente;
        int documentoCliente;

        //instanciar clase
        Scanner registro=new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado que esta atendiendo: ");
        nombreEmpleado=registro.nextLine();

        System.out.println("Ingrese el nombre del cliente");
        nombreCliente=registro.nextLine();

        System.out.println("Ingrese el documento del cliente ");
        documentoCliente=registro.nextInt();

        System.out.println("Cuantos productos desea digitar");
        n=registro.nextInt();



        //crear el bucle
        for(i=1;i<=n;i++){
            System.out.println("Digite el producto "+i);
            producto=registro.nextInt();
            suma=suma+producto;

        }

        System.out.println("El empleado que atendio su compra es: " +nombreEmpleado);
        System.out.println();
        System.out.println("Cliente " +nombreCliente);
        System.out.println();
        System.out.println("con número de documento : " +documentoCliente);
        System.out.println();

        subtotal=suma;
        System.out.println("Lleva "+n+ "  productos");
        System.out.println(); 
        System.out.println("El subtotal de su compra es "+subtotal);

        total1=subtotal*iva;
        total2=total1+subtotal;
        System.out.println("El total de su compra es: " +total2);
        registro.close();
    }
    }