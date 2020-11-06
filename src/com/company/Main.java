package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;


public class Main {
    private Address adr;

    public static void main(String[] args) throws IOException {
        //1
        Person first = new Person("Port","Log","Ker");
        Person second = new Person("Lop");
        System.out.println(first.getFCs());
        System.out.println(second.getFCs());

        //2
        Address adr=new Address();
        adr.setSplit(" Russia, Samarskiy_kray, Samara, Dmitriy, 17, 250, 14, 219");
        System.out.println(adr);
        adr.setTokenizer(" Russia, Samarskiy_kray, Samara, Dmitriy, 17, 250, 14, 219");
        System.out.println(adr);

        //3
        String []shirts=new String [11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";



        Shirt[]res=Shirt.toObject(shirts);
        for (Shirt t:res
        ) {
            System.out.println(t);
        }

        //4
        System.out.println(Telephone.toFormat("+79175655655"));
        System.out.println(Telephone.toFormat("89175655655"));

        //5
        String c=new Scanner(System.in).nextLine();
        String words[]=c.split(" ");
        StringBuilder arg=new StringBuilder();
        arg.append(words[0]);
        for (int j = 0; j < words.length; j++) {
            for (int i = 1; i < words.length; i++) {
                if(words[i].length()==0)continue;
                if(arg.toString().toLowerCase().charAt(0) == words[i].toLowerCase().charAt(words[i].length()-1)){
                    arg.insert(0, words[i] + " "); //вставляем в начало
                    words[i] = ""; //1 повторение
                }
                else if(arg.toString().toLowerCase().charAt(arg.length()-1) == words[i].toLowerCase().charAt(0)){ //в конец
                    arg.append(" " + words[i]);
                    words[i] = "";
                }
            }
        }
        System.out.println(arg);
    }
}
