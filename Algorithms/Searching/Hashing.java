package Algorithms.Searching;

import java.util.Hashtable;

public class Hashing {
    public static void main(String[] args) {
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        hashtable.put("İbrahim",23);
        hashtable.put("Mert",34);
        hashtable.put("Deniz",19);

        String target = "Deniz";

        int result = hashing(hashtable,target);

        if (result != -1){
            System.out.println("This hashtable target value:" + result);
        }else {
            System.out.println("This hashtable don't have target");
        }
    }

    private static int hashing(Hashtable<String,Integer> hashtable,String  target){
        for (String key: hashtable.keySet()){
            if (key.equals(target)){
                return hashtable.get(key);
            }
        }
        return -1;
    }
}
