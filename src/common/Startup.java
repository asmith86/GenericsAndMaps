/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

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
        movieHashMap.put("4", m0);
        movieHashMap.put("2", m1);
        movieHashMap.put("1", m2);
        movieHashMap.put("3", m3);
        
        Set<String> keys = movieHashMap.keySet();
        
        for(String s : keys){
            Movie m = movieHashMap.get(s);
            System.out.println(s + " " + m.getMovieId());
            
        }
        
        //Lab 3
        TreeMap<String,Movie> movieTree = new TreeMap<>(movieHashMap);
        keys = movieTree.keySet();
        
        System.out.println("");
        for(String s : keys){
            Movie m = movieTree.get(s);
            System.out.println(s + " " + m.getMovieId());
        }
        
        Collection<Movie> mc = movieTree.values();
        List<Movie> movieList = new ArrayList<>(mc);
        Collections.sort(movieList);
        
        System.out.println("");
        for(Movie m : movieList){
            System.out.println(m.getMovieId());
        }
        //Lab 4
        m0.setDirector("Stanley Kubrick");
        m1.setDirector("David Fincher");
        m2.setDirector("Quentin Tarantino");
        m3.setDirector("Martin Scorsese");
        
        Collections.sort(movieList, new MovieByDirector());
        
         System.out.println("");
        for(Movie m : movieList){
            System.out.println(m.getMovieId() + " " + m.getDirector());
        }
        
        //Lab 5
        TreeSet<Movie> movieTreeSet = new TreeSet<>(movieList);
        System.out.println("");
        for(Movie m : movieTreeSet){
            System.out.println(m);
        }
    }
    
    
}
