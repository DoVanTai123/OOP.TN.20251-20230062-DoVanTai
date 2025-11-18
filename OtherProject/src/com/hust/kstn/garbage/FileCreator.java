package com.hust.kstn.garbage;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCreator {
    public static void main(String[] args) throws IOException {
        String filename = "large_test_file.txt";
        int lines = 500000;

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int i = 0; i < lines; i++) {
                writer.println("ABCDE");
            }
        }
        System.out.println("File created: " + filename + " with " + lines + " lines.");
        System.out.println("NOW, run the GarbageCreator.java class.");
    }
}