package org.example.practice.Assigment;

import java.io.*;
import java.util.*;

public class Assignment {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        try {
            BufferedReader file = new BufferedReader(new FileReader("K:\\Programming\\Java\\Java_Learning\\src\\main\\java\\org\\example\\practice\\Assigment\\input.txt"));
            String s;

            while((s=file.readLine()) != null){
                input.add(s);
                Collections.sort(input, new Comparator<String>() {
                    public int compare(String s1, String s2) {
                        int num1 = Integer.parseInt(s1.split("\\|")[0]);
                        int num2 = Integer.parseInt(s2.split("\\|")[0]);
                        // Reverse the comparison for decreasing order
                        return Integer.compare(num2, num1);
                    }
                });
            }
            System.out.println(input);

//            System.out.println("Hello");
//            HashMap<Integer, String[]> uniqueEntries = new HashMap<>();
//
//            // Iterate through the input and store unique entries in the HashMap
//            for (String entry : input) {
//                String[] components = entry.split("\\|");
//                int num = Integer.parseInt(components[0]);
//                String cityState = components[1] + "\nInterstates: " + components[2];
//                String interstates = components[3];
//
//                // If the number is not already in the HashMap, add it
//                if (!uniqueEntries.containsKey(num)) {
//                    uniqueEntries.put(num, new String[]{cityState, interstates});
//                } else {
//                    // If the number is already in the HashMap, update the interstates
//                    uniqueEntries.get(num)[1] += ", " + interstates;
//                }
//            }
//            for (int num : uniqueEntries.keySet()) {
//                System.out.println(num);
//                for (String component : uniqueEntries.get(num)) {
//                    System.out.println(component);
//                }
//                System.out.println();
//            }
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




        try {
            BufferedWriter output = new BufferedWriter(new FileWriter("K:\\Programming\\Java\\Java_Learning\\src\\main\\java\\org\\example\\practice\\Assigment\\Cities_By_Population.txt"));
            for(int i=0;i< input.size();i++) {
                String[] components = input.get(i).split("\\|");
                int num = Integer.parseInt(components[0]);
                String cityState = components[1];
                String interstates = components[2];

                String value = components[3];
                // Print in the required order
                output.write("\n"+num);
                output.write("\n"+cityState+","+interstates);
                output.write("\nInterstates "+value+"\n");
            }
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println();
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter("K:\\Programming\\Java\\Java_Learning\\src\\main\\java\\org\\example\\practice\\Assigment\\Interstates_By_City.txt"));
            TreeMap<String, Integer> interstateCounts = new TreeMap<>();
            for (String s : input) {
                String[] parts = s.split("\\|");
                String[] interstates = parts[3].split(";"); // Split interstates using the special character

                System.out.println(Arrays.toString(interstates));
                System.out.println();
                // Count the occurrences of each interstate
                for (String interstate : interstates) {
                    interstateCounts.put(interstate.trim(), interstateCounts.getOrDefault(interstate.trim(), 0) + 1);
                }
            }
            for (String interstate : interstateCounts.keySet()) {
                output.write(interstate + " " + interstateCounts.get(interstate)+"\n");
            }
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
