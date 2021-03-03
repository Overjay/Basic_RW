package com.overjay.basic_rw;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try{
            File myFile = new File("C:\\filename.txt");
            if (myFile.createNewFile()){
                System.out.println("New file created. Name - "+myFile.getName());
            } else {
                System.out.println("File already exists.");

            }

            FileWriter newWriter = new FileWriter("C:\\filename.txt");
            newWriter.write("Something about cheese.");
            newWriter.close();
            System.out.println("Written stuff to file.");

        } catch (IOException exception){
            System.out.println("Error occured. BONK");
            exception.printStackTrace();
        }
    }
}
