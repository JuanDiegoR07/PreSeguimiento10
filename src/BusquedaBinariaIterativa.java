import java.util.Scanner;
public class BusquedaBinariaIterativa {
    public static Scanner lt = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[20];
        System.out.println("numero: ");
        int n = lt.nextInt();
        for (int i = 0; i < array.length-1; i++) {
            int nuevaLongitud = array.length-1/2;
            if (n < nuevaLongitud){
                do {
                    nuevaLongitud = nuevaLongitud/2;
                    if (n == nuevaLongitud){
                        System.out.println("numero encontrado");
                    }
                }while (n<nuevaLongitud);
            }
            if (n > nuevaLongitud){
                do {
                    if (n == nuevaLongitud){
                        System.out.println("numero encontrado");
                    }
                }while (n<nuevaLongitud);
            }
        }
    }
}