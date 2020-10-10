package tuple.analysis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SecretFinder {

    private final List<String> resultList = new ArrayList<>();

    public String recoverSecret(char[][] triplets) {
    	findDistinctChar(triplets);
    	orderResultList(triplets);
    	orderResultList(triplets);
        return resultList.stream().collect(Collectors.joining());
    }

    private void findDistinctChar(char[][] tripletsValue) {
        for (char[] triplet : tripletsValue) 
        {
            for (char charValue : triplet) 
            {
                if (!resultList.contains(String.valueOf(charValue)))
                	resultList.add(String.valueOf(charValue));
            }
        }
    }
    
    private void orderResultList(char[][] triplets) {
        for (char[] triplet : triplets)
        {
            for (int i = 0; i < 2; i++) 
            {
                String presentChar = String.valueOf(triplet[i]);
                String nextChar = String.valueOf(triplet[i+1]);
                
                int presentIndexValue = resultList.indexOf(presentChar);
                int nextIndexValue = resultList.indexOf(nextChar);
                
                
                if (presentIndexValue > nextIndexValue) 
                {
                	resultList.remove(presentChar);
                	resultList.add(nextIndexValue, presentChar);
                }
            }
        }
    }

    

}