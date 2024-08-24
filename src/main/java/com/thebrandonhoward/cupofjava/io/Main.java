package com.thebrandonhoward.cupofjava.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("temp.txt");
            FileInputStream fileInputStream = new FileInputStream("temp.txt");
            FileInputStream fileInputStream2 = new FileInputStream("javadatatemp.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream2);
            FileOutputStream fileOutputStream2 = new FileOutputStream("javadatatemp.txt");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream2);
            BufferedReader fileReader = new BufferedReader(new FileReader("javadatatemp.txt"));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("javadatatemp.txt"))) {
            fileOutputStream.flush();
            fileOutputStream.write("""
                Hello,
                    Brandon!
                """.getBytes(StandardCharsets.UTF_8));
            fileOutputStream.flush();
            fileOutputStream.close();

            String phoneNumber = "255_6926";
            dataOutputStream.flush();
            dataOutputStream.writeChars(phoneNumber);
            dataOutputStream.flush();
            dataOutputStream.close();

            char c = ' ';

            try {
                do {
                    c = dataInputStream.readChar();
                    System.out.print(c);
                }
                while (c != ' ');
            }
            catch (EOFException eofe) {
                System.out.println('\n' + eofe.getMessage());
            }

            String line = null;
            do {
                line = fileReader.readLine();
                if(Objects.nonNull(line)) System.out.println(line);
            }
            while(Objects.nonNull(line));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
