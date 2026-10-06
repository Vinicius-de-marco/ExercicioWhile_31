
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int i = 0;
        int in = -1;
        int qtde = 0;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite uma quantidade de numeros inteiros ou o numero -1 para encerrar: "));
        while (n != -1) {
            i = i + n;
            qtde = qtde +1;
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite uma quantidade de numeros inteiros ou o numero -1 para encerrar:"));

        }
        JOptionPane.showMessageDialog(null, "quantidade: " + qtde);
        JOptionPane.showMessageDialog(null, "soma: " + i);

    }
}
