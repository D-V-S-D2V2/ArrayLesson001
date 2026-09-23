/*

*/

import java.util.*;

public class FartCanister {
    public static void main(String[] args){
        System.out.println("Welcome.");
        int[] nums;
        nums = new int[5];
        nums[0] = 3;
        System.out.println(nums[0]);
        System.out.println(nums[2]);
        System.out.println(nums[4]);
        String[] names = new String[3];
        names[2] = "Darsh";
        System.out.println(names[2]);
        double[] points = {2,5.1,3,8,12};
        System.out.println(points.length);
        System.out.println(points[3]);
        points[3] = 0;
        System.out.println(points[3]);
        System.out.println(points[points.length-1]);
        points[points.length-1] = points[points.length-1] * 2;
        System.out.println(points[points.length-1]);
        System.out.println(names[names.length-1]);
    }
}