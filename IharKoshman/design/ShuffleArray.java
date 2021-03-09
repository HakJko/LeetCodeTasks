//package IharKoshman.dуsign;
//
//import java.awt.*;
//import java.util.ArrayList;
//import java.util.Random;
//
///**
// * Given an integer array nums, design an algorithm to randomly shuffle the array.
// *
// * Implement the Solution class:
// *
// * Solution(int[] nums) Initializes the object with the integer array nums.
// * int[] reset() Resets the array to its original configuration and returns it.
// * int[] shuffle() Returns a random shuffling of the array.
// */
//
//class Solution {
//    //Approach #1 Brute Force [Accepted]
//    private int[] array;
//    private int[] original;
//
//    private Random rand = new Random();
//
//    private List<Integer> getArrayCopy() {
//        List<Integer> asList = new ArrayList<Integer>();
//        for (int i = 0; i < array.length; i++) {
//            asList.add(array[i]);
//        }
//        return asList;
//    }
//
//    public Solution(int[] nums) {
//        array = nums;
//        original = nums.clone();
//    }
//
//    public int[] reset() {
//        array = original;
//        original = original.clone();
//        return array;
//    }
//
//    public int[] shuffle() {
//        List<Integer> aux = getArrayCopy();
//
//        for (int i = 0; i < array.length; i++) {
//            int removeIdx = rand.nextInt(aux.size());
//            array[i] = aux.get(removeIdx);
//            aux.remove(removeIdx);
//        }
//
//        return array;
//    }
//
//    /////////////////////////////////////
//    //Approach #2 Fisher-Yates Algorithm [Accepted]
////    private int[] array;
////    private int[] original;
////
////    Random rand = new Random();
////
////    private int randRange(int min, int max) {
////        return rand.nextInt(max - min) + min;
////    }
////
////    private void swapAt(int i, int j) {
////        int temp = array[i];
////        array[i] = array[j];
////        array[j] = temp;
////    }
////
////    public Solution(int[] nums) {
////        array = nums;
////        original = nums.clone();
////    }
////
////    public int[] reset() {
////        array = original;
////        original = original.clone();
////        return original;
////    }
////
////    public int[] shuffle() {
////        for (int i = 0; i < array.length; i++) {
////            swapAt(i, randRange(i, array.length));
////        }
////        return array;
////    }
//}
