/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package catalogobombonera1;

import java.io.File;
import java.io.FileFilter;
import javax.swing.DefaultListModel;
import java.util.Arrays;

/**
 *
 * @author admin
 */
public class Imagenes {

    public File directorio = new File("D:\\Ventas1");
    public File directorioAgotados = new File("D:\\AGOTADOS1");
    private FileFilter filefilter = new FileFilter() {
        @Override
        public boolean accept(File file) {
            String nombreImagen = file.getName();
            String[] extension = nombreImagen.split("-");
            System.out.println(extension[1]);
            return file.getName().endsWith(extension[1]);
        }
    };

    public String[] buscar() {
        //DefaultListModel defaultListModel = new DefaultListModel ();
        // Si es un directorio valido
        if (directorio.isDirectory()) {
            // obtenemos su contenido
            String[] nombres = directorio.list();
            Arrays.sort(nombres);
            //y lo llenamos en un DefaultListModel
            return nombres;
        } else {
            String [] a = {""};
            return a;
        }
        
    };
    
    public String[] buscarAgotados() {
        //DefaultListModel defaultListModel = new DefaultListModel ();
        // Si es un directorio valido
        if (directorioAgotados.isDirectory()) {
            // obtenemos su contenido
            String[] nombres = directorioAgotados.list();
            Arrays.sort(nombres);
            //y lo llenamos en un DefaultListModel
            return nombres;
        } else {
            String [] a = {""};
            return a;
        }
        
    }

}
