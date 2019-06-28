package com.company;

public class Main {

    public static void main(String[] args) {
        String[] wizN = {"Ринсвинд", "Макс", "Гарри"};
        for (int w =1; w < 4; w++){
            switch (w){
                case 1:
                    System.out.println("Доброе утро "+ wizN[0]);
                    break;
                case 2:
                    System.out.println("Добрый день "+ wizN[1]);
                    break;
                case 3:
                    System.out.println("Добрый вечер "+ wizN[2]);
                    break;
            }
        }


    }
}
