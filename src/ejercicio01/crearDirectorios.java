package ejercicio01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class crearDirectorios {
    public static void main() throws InterruptedException, IOException {
        String path;
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique la ruta y el nombre de la carpeta:");
        path=sc.nextLine();
        String comandos[] = {"cmd", "/C", "md", path};
        ProcessBuilder pb=new ProcessBuilder(comandos);
        pb.inheritIO();
        Process process = pb.start();
        process.waitFor();
    }
}
