package com.saiketsystems;

import java.util.Scanner;

import static com.saiketsystems.TextFileAnalyzer.analyzeFile;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name (with extension): ");
        String fileName = sc.nextLine();
        System.out.print("Enter the word you want to search for: ");
        String searchWord = sc.nextLine();
        analyzeFile(fileName, searchWord);
    }
}