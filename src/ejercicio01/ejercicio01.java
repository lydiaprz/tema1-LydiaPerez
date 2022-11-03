package ejercicio01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ejercicio01 {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws IOException, InterruptedException {
        int opc = menu();

        // Segun la opcion introducida debemos lanzar un proceso u otro.
        // Todos los procesos son comandos de Windows, por lo que deben comenzar con cmd

        switch (opc) {
            // Si elige crear una carpeta, debo pedirle tambien la ruta donde quiere crearla
            // y el nombre de la carpeta
            case 1:
                crearDirectorios.main();
                break;
            // Si elige crear un fichero, debo pedirle tambien la ruta donde quiere crearlo
            // y el nombre del fichero
            case 2:
                break;
            // Si elige mostrar un directorio, debo pedirle tambien la ruta del directorio a
            // mostrar. Si lo deja vacio, debo mostrar el contenido del directorio actual
            case 3:
                break;
            default:
                System.out.println("La opcion introducida no es correcta");
        }

    }
    public static int menu() {
        // En opc guardaremos la opcion seleccionada por el usuario
        int opc;

        // Imprimimos el menu con las diversas opciones
        System.out.println("Elija que comando desea ejecutar:");
        System.out.println("1. Crear carpeta");
        System.out.println("2. Crear fichero");
        System.out.println("3. Mostrar contenido del directorio");

        // Leemos la opcion de teclado
        opc = sc.nextInt();

        return opc;
    }

}
