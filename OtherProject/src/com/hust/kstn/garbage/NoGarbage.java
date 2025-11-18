package com.hust.kstn.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        String filename = "large_test_file.txt";
        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (byte b : inputBytes) {
            sb.append((char) b);
        }

        String outputString = sb.toString();
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken using StringBuilder: " + (endTime - startTime) + " ms");
    }
}