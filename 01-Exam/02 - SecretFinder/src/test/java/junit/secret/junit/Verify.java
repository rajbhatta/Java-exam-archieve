package junit.secret.junit;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tuple.analysis.SecretFinder;


public class Verify {
	
	SecretFinder detective;
	
	char[][] triplets = {
            {'t','u','p'},
            {'w','h','i'},
            {'t','s','u'},
            {'a','t','s'},
            {'h','a','p'},
            {'t','i','s'},
            {'w','h','s'}
    };
	
	@Test
	   public void testStringFromSecret() {
		detective=new SecretFinder();
	    assertEquals("whatisup",detective.recoverSecret(triplets));
	   }

}
