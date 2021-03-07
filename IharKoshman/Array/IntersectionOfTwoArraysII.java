package IharKoshman.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Given two arrays, write a function to compute their intersection.
 */

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] numbers1 = {4, 9, 5};
        int[] numbers2 = {9, 4, 9, 8, 4};

        int[] res = intersect(numbers1, numbers2);
        System.out.println(Arrays.toString(res));
    }
    public static int[] intersect(int[] numbers1, int[] numbers2) {
        int size=numbers1.length>numbers2.length?numbers2.length:numbers1.length;
        ArrayList<Integer> arr=new ArrayList<>();
        int cnt=0;
        HashMap<Integer,Integer> hash=new HashMap<>();
        if(size==numbers1.length){
            for(int i=0;i<size;i++){
                if(hash.containsKey(numbers1[i])){
                    hash.put(numbers1[i],hash.get(numbers1[i])+1);
                }
                else{
                    hash.put(numbers1[i],1);
                }
            }

            for(int i=0;i<numbers2.length;i++){
                if(cnt<size){
                    if(hash.containsKey(numbers2[i])&&hash.get(numbers2[i])>0){
                        arr.add(numbers2[i]);
                        hash.put(numbers2[i],hash.get(numbers2[i])-1);
                    }
                }
                else{
                    break;
                }
            }
        }
        else{
            for(int i=0;i<size;i++){
                if(hash.containsKey(numbers2[i])){
                    hash.put(numbers2[i],hash.get(numbers2[i])+1);
                }
                else{
                    hash.put(numbers2[i],1);
                }
            }
            for(int i=0;i<numbers1.length;i++){
                if(cnt<size){
                    if(hash.containsKey(numbers1[i])&&hash.get(numbers1[i])>0){
                        arr.add(numbers1[i]);
                        hash.put(numbers1[i],hash.get(numbers1[i])-1);
                    }
                }
                else{
                    break;
                }
            }
        }
        int[] res = new int[arr.size()];
        for(int itr = 0; itr < arr.size(); itr++){
            res[itr] = arr.get(itr);
        }
        return res;
    }
}
