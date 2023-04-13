/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author rledesma
 */
public class Mavenproject2 {

     public static void main(String args[]){
        Path origenPath = FileSystems.getDefault().getPath("C:\\hola.txt");
        Path destinoPath = FileSystems.getDefault().getPath("C:\\Drivers\\hola.txt");

        try {
            Files.move(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println(e);
        }
   
    }
}
