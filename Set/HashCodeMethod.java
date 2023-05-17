package Set;

import java.io.*;   
import java.util.*;

class HashCodeMethod 
{   
    public static void main(String args[])   
    {   
        Set<Integer> data = new LinkedHashSet<Integer>();   
        data.add(31);   
        data.add(21);   
        data.add(41);   
        data.add(51);   
        data.add(11);   
        data.add(81);   
        System.out.println("data: " + data);  
        System.out.println("\nThe hash code value of set is:"+ data.hashCode());      
    }   
}  