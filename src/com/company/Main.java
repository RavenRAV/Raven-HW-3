package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] wizN = {"Ринсвинд","Макс","Гарри"};

        wizN = Arrays.copyOf(wizN,wizN.length+1);
        wizN[3] = "Гэндальф";

        for (int w = 0; w < wizN.length; w++){
            switch (w){
                case 0:
                    System.out.println("Доброе утро "+ wizN[w]);
                break;
                case 1:
                    System.out.println("Добрый день "+ wizN[w]);
                    break;
                case 2:
                    System.out.println("Добрый вечер "+ wizN[w]);
                    break;
                case 3:
                    System.out.println("Спокойной ночи "+ wizN[w]);
                    break;
            }
        }


    }
}
