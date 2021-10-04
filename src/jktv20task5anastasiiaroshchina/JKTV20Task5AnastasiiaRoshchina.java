/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20task5anastasiiaroshchina;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JKTV20Task5AnastasiiaRoshchina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array = new int [5][];
        Random random = new Random();
        array[0] = new int[3];
        array[1] = new int[5];
        array[2] = new int[7];
        array[3] = new int[8];
        array[4] = new int[9];
        for (int i = 0; i < 5; i++){
            switch (i) {
     
            }
          
        }
        
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(100 - 50 + 1) + 50;
            }
        }
        
        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                
                for(int k = 0; k<array.length;k++){
                    for (int m = 0; m < array[k].length; m++) {
                        
                       if(array[i][j]<array[k][m]){
                            array[i][j]=array[i][j] + array[k][m];
                            array[k][m]=array[i][j] - array[k][m];
                            array[i][j] = array[i][j] - array[k][m];
                        }
                        
                    }
                    
                }
                    
            }
        }
        
        System.out.println("сортировка:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(array[i][j]+", ");
            }
            System.out.print("]");
            System.out.println();
            
        }
    }
    
}
    
    

