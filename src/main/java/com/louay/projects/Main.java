package com.louay.projects;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please input number of element in array: ");
        int length = input.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            System.out.printf("please enter element number %d:",(i+1));
            map.put(i,input.nextInt());
        }

        Number [] tempArray = new Integer[3];
        Number [] maximumPerimeter = new Integer[3];

        for (int i = 0; i < map.size() ; i++) {
            if (tempArray[tempArray.length-1] == null){
                tempArray[i] = map.get(i);
                if (isNonDegenerateTriangle(tempArray)){
                    saveMaximumParameter(tempArray,maximumPerimeter);
                    swapAndInsert(tempArray,map,i);
                }
            }else if (isNonDegenerateTriangle(tempArray)){
                saveMaximumParameter(tempArray,maximumPerimeter);
                swapAndInsert(tempArray,map,i);
            }else {
                swapAndInsert(tempArray,map,i);
                if (isNonDegenerateTriangle(tempArray)) {
                    saveMaximumParameter(tempArray, maximumPerimeter);
                }
            }
        }

        if (maximumPerimeter[0] == null){
            System.out.println("-1");
        }else {
            for (Number n : maximumPerimeter) {
                System.out.print(n + " ");
            }
        }


    }

    public static void swapAndInsert(Number [] arr ,Map <Integer,Integer> map, Integer key){
        for (int i = 1; i < arr.length; i++) {
            Number temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
        }
        arr[arr.length-1] = map.get(key);
    }

    public static void saveMaximumParameter(Number [] temp, Number [] parameter) {
        int sum1 = 0;
        int sum2 = 0;
        if (parameter[0] == null) {
            System.arraycopy(temp, 0, parameter, 0, temp.length);
        } else {
            for (int i = 0; i < temp.length; i++) {
                sum1 += temp[i].intValue();
                sum2 += parameter[i].intValue();
            }

            if (sum1 > sum2) {
                System.arraycopy(temp, 0, parameter, 0, temp.length);
            }
        }

    }

    public static boolean isNonDegenerateTriangle(Number [] arr){
        if (arr[arr.length-1] != null) {
            int a = arr[0].intValue();
            int b = arr[1].intValue();
            int c = arr[2].intValue();
            int aPlusB = a + b;
            int aPlusC = a + c;
            int bPlusC = b + c;

            return aPlusB > c && aPlusC > b && bPlusC > a;
        }else {
            return false;
        }
    }
}
