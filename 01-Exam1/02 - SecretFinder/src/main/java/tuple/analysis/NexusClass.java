package tuple.analysis;

public class NexusClass {

	public static void main(String[] args) {
		
		SecretFinder detective=new SecretFinder();

        char[][] triplets = {
                {'t','u','p'},
                {'w','h','i'},
                {'t','s','u'},
                {'a','t','s'},
                {'h','a','p'},
                {'t','i','s'},
                {'w','h','s'}
        };
        
        System.out.println("Recovered String is \t \t"+detective.recoverSecret(triplets));

	}

}
