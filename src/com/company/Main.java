package com.company;

public class Main {

    public static void main(String[] args) {
        String[] wizN = new String[3];
        wizN[0] = "Ринсвинд";
        wizN[1] = "Макс";
        wizN[2] = "Гарри";

        wizN = new String[4];
        wizN[0] = "Ринсвинд";
        wizN[1] = "Макс";
        wizN[2] = "Гарри";
        wizN[3] = "Гэндальф";

        for (int w = 0; w < wizN.length; w++){
            switch (w){
                case 0:
                    System.out.println("Доброе утро "+ wizN[0]);
                    break;
                case 1:
                    System.out.println("Добрый день "+ wizN[1]);
                    break;
                case 2:
                    System.out.println("Добрый вечер "+ wizN[2]);
                    break;
                case 3:
                    System.out.println("Спокойной ночи "+ wizN[3]);
                    break;
            }
        }


    }
}
