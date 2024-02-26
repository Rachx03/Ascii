/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import javax.print.DocFlavor;

/**
 *
 * @author Rachix
 */
public class Ascii {
    public String ConvertirAscii(String n){
        StringBuilder asciiBuilder = new StringBuilder();
       for(int i=0;i<n.length();i++){
        char a=n.charAt(i);
        int numero=(int)a;
         asciiBuilder.append(numero).append(" ");
       }
        
        return asciiBuilder.toString();
        
    }
    public String ConvertirTexto(String n){
     StringBuilder textoBuilder = new StringBuilder();
     String[] valores = n.split(" ");
      for(int i=0;i<valores.length;i++) {
            int asciiValue = Integer.parseInt(valores[i]);
            char caracter = (char) asciiValue;
            textoBuilder.append(caracter);
        }
     return textoBuilder.toString();
    }
}
