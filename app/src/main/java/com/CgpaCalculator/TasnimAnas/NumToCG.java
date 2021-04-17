package com.CgpaCalculator.TasnimAnas;

public class NumToCG {
    int CG(int a){
        if(a<40){
            return 0;
        }
        else if(a<50){
            return 5;
        }
        else if(a<60){
            return 6;
        }
        else if(a<70){
            return 7;
        }
        else if(a<80){
            return 8;
        }
        else if(a<90){
            return 9;
        }
        else if(a<=100){
            return 10;
        }
        return 0;
    }

}
