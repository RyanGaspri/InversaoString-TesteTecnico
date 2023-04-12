import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String frase = ler.nextLine();

        String novaMensagem = inverterString(frase);
        System.out.println(novaMensagem);
    }

    public static String inverterString(String mensagem){
        char[] caracter = mensagem.toCharArray();
        int length = caracter.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = caracter[i];
            caracter[i] = caracter[length - i - 1];
            caracter[length - i - 1] = temp;
        }
        return new String(caracter);
    }
}
