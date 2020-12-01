package Day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Iryna Gnatenko
 * Date 12/1/2020
 * Time 3:58 PM
 * Project AdventOfCode
 */
public class PuzzleDay1 {

    List<Integer> allNumbers = new ArrayList();

    public PuzzleDay1() {

        readFile();
        part1(allNumbers);
        part2(allNumbers);

    }

    public void readFile() {

        try {
            BufferedReader in = new BufferedReader(new FileReader("src\\Day1\\numbers.txt"));
            while (in.readLine() != null) {
                int num = Integer.parseInt(in.readLine());
                allNumbers.add(num);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void part1(List<Integer> allNumbers) {
        System.out.println("ett");
        Collections.sort(allNumbers);
        int sum = 2020;

        for (int i = 0; i < allNumbers.size() - 1; i++) {
            System.out.println("part 1");
            for (int j = allNumbers.size() - 1; j > 0; j--) {
                while (i < j) {
                   if (allNumbers.get(i) + allNumbers.get(j) < sum) {
                       i++;
                       System.out.println("tva"); // skrivs inte ut
                   }else if (allNumbers.get(i)+ allNumbers.get(j) > sum) {
                       j--;
                       System.out.println("tre");
                   }
                    if ((allNumbers.get(i) + allNumbers.get(j)) == sum) {
                        System.out.println("fyra"); // skrivs inte ut
                        System.out.println(allNumbers.get(i) + "+" + allNumbers.get(j) + "= 2020");
                        int multiply = allNumbers.get(i) * allNumbers.get(j);
                        System.out.println(multiply);
                    }

                }
            }
        }
    }
    public static void part2(List<Integer> allNumbers) {
        System.out.println("part 2");
        for (int i = 0; i < allNumbers.size(); i++) {
           for (int j = i + 1; j < allNumbers.size(); j++) {
                for (int k = j + 1; k < allNumbers.size(); k++) {
                    System.out.println("fem");
                    Integer int1 = (allNumbers.get(i));
                    Integer int2 = (allNumbers.get(j));
                    Integer int3 = (allNumbers.get(k));
                    if (int1 + int2 + int3 == 2020) {
                        System.out.println("Answer: " + int1 * int2 * int3);
                        return;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        new PuzzleDay1();

    }
}






/*
        for (int i = 0; i < allNumbers.size(); i++) {
        for (int j = 1; j < allNumbers.size()-1; j++) {
                num1 = allNumbers.get(i);
                num2 = allNumbers.get(j);
                sum = num1 + num2;
                System.out.println(sum);
                if (sum == 2020) {
                    System.out.println(num1 + "+" + num2 + "= 2020");
                    int multiply = num1 * num2;
                    System.out.println(multiply);
                    break;
                } else {
                    continue;
                }
*/






