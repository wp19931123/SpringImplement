package cn.test;

public class Test {

    public static void main(String[] args) {
        int left = 1;
        int right = 9;
        int mid1 = left + (right - left)/2;
        int mid2 = left +((right - left) >> 1);
        System.out.println(mid1);
        System.out.println(mid2);
    }
}
