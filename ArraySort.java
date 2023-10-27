import java.util.Arrays;

public class ArraySort {
public static void main(String[] args) {
    String[] nomes = {"RAFAEL", "JULIANO", "ABEL", "JORGE"};
    System.out.println(nomes[3]);
    System.out.println(Arrays.toString (nomes));
    
    Arrays.sort (nomes);
    System.out.println(Arrays.toString(nomes));  

    int posicao = Arrays.binarySearch(nomes, "ABEL");
    System.out.println(posicao);

    }
    
}
