/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author asmith86
 */
public class Startup {
    public static void main(String[] args) {
        //Lab 2
        
       
        Movie m0 = new Movie("0000");
        Movie m1 = new Movie("1223");
        Movie m2 = new Movie("0000");
        Movie m3 = new Movie("0451");
        
        Map<String, Movie> movieHashMap = new HashMap<>();
        
        //make sure you are using unique keys for the movies.
        movieHashMap.put("1", m0);
        movieHashMap.put("2", m1);
        movieHashMap.put("3", m2);
        movieHashMap.put("4", m3);
        
        Set<String> keys = movieHashMap.keySet();
        
        for(String s : keys){
            
        }
    }
    
    
}
