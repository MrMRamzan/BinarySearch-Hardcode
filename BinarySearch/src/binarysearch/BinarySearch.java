/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;
/**
 *
 * @author Muhammad Ramzan
 */
public class BinarySearch {

    /**
     * @param arr
     * @param key
     * @param L
     * @param R
     * @return it will return the search key if it is found 
     */
    public static int BinarySearch(int[] arr,int key,int L,int R)
    {
       if(L > R){
           return -1;
        }
       int m = (L+R)/2;
       
       if(arr[m] == key){
           return m;
        }
       else if(arr[m] > key){
           return BinarySearch(arr,key,L,m-1);
       }else {
           return BinarySearch(arr,key,m+1,R);
       } 
        
    }
    public static void main(String[] args) {
        // TODO code application logic here      
        int[] arr ={1,2,3,4,5,6,7,8};
        int a = BinarySearch(arr,5,0,7);
        System.out.println(a);

    }//main is ended
    
}// class is ended;
