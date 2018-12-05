package profin;

import java.io.*;
import java.util.*;

public class ProFin {
    
    public static ArrayList<String> leer(String path){
        
        ArrayList<String> lista = new ArrayList<String>(); 
            try {
                FileReader fr =new FileReader(path);
                BufferedReader  are = new BufferedReader(fr);
                
                String linea;
                while((linea = are.readLine())!= null){ //ciclo en la cual el arreglo entra 	
                    StringTokenizer st = new StringTokenizer(linea, ";/./ /\n/:", true); //muestra hasta donde quiero separar por partes
                    while (st.hasMoreTokens()){ 
			String token = st.nextToken();
			lista.add(token);     
                    }         
                    }
              } catch (FileNotFoundException ex) {                 
              } catch (IOException ex) {             
              }
                  return (lista);//retorno la lista
    	}	
    public static void main(String[] args) {
        
        Stack<String> pila = new Stack<>();
        
        ArrayList<String> lista = new ArrayList<>();
        lista = leer("C:\\Users\\yulis\\Desktop\\Prueba.txt");
        System.out.println("Codigo en python:"+"\n");
        for(int i=0;i<lista.size();i++){
            String e = lista.get(i);
            switch (e) {
                
                case "println":
                    if (lista.contains("println")) {
                        String s="println";
                        int in = -1;
                        if(lista.get(i).equals(s)){
                            in=i;
                            System.out.println("print"+" "+lista.get(in+2));
                        }
                    }
                    break;
                case "for":
                    if (lista.contains("for")) {
                        String f="for";
                        int in = -1;
                        if(lista.get(i).equals(f)){
                            in=i;
                            System.out.println(lista.get(in)+" "+lista.get(in+6)+" range("+lista.get(in+18)+"):"); 
                    break;
                        }
                    }
                case "class":
                   if (lista.contains("class")) {
                        String p="class";
                        int in = -1;
                        if(lista.get(i).equals(p)){
                            in=i;
                            System.out.println("def "+lista.get(in+2)+":"); 
                    break;
                        }
                    } 
                case "=":
                   if (lista.contains("=")) {
                        String g="=";
                        int in = -1;
                        if(lista.get(i).equals(g)){
                            in=i;
                            System.out.println(lista.get(in-2)+lista.get(in)+lista.get(in+2)); 
                    break;
                        }
                    } 
            }
        }
    }
}


    