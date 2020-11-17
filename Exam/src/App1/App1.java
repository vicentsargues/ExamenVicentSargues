import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class App1 {

    public static void main(String[] args) throws IOException {
        String texto2="";
        Scanner entrada = null;
        String linea;
        int numeroDeLinea = 1;
        boolean contiene = false;
        Scanner sc = new Scanner(System.in);


        File destino = new File("destino.txt");


        try {

            String ruta = System.getProperty("user.dir") + "\\src\\origen.txt";
            File f = new File(ruta);
            entrada = new Scanner(f);
            System.out.println("Archivo: " + f.getName());
            System.out.println("Texto a buscar: (x) y (z)" );
            while (entrada.hasNext()) {
                linea = entrada.nextLine();
                if (!(linea.contains("x")||(linea.contains("z")))) {
                    System.out.println("Linea " + numeroDeLinea + ": " + linea);
                    contiene = true;
                    texto2=texto2+linea+"\n";
                }


                numeroDeLinea++;
            }
            if(!contiene){
                System.out.println("No se han encontrado en el archivo");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (NullPointerException e) {
            System.out.println(e.toString() + "No ha seleccionado ningún archivo");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
        System.out.println(texto2);


        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("destino.txt");
            pw = new PrintWriter(fichero);


            pw.println(texto2);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }
}