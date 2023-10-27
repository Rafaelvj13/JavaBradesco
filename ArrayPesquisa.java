import java.util.Arrays;

public class ArrayPesquisa {
    public static void main(String[] args) {
        String[] paises = {"BRASIL", "CHINA", "ARGENTINA", "BOLIVIA", "USA"};
        System.out.println(paises[3]);
        System.out.println(Arrays.toString(paises));

        int posicao = Arrays.binarySearch (paises, "USA");
        System.out.println(posicao);
    }
    
}
