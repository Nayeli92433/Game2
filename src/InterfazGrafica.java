import javax.swing.*;
import java.awt.*;

public class InterfazGrafica {
    private JFrame frame = new JFrame();
    private JPanel contenedor;
    private JTextField ingresado;
    private JButton comprobar;
    private JLabel generado;
    private JLabel ganado;
    private JLabel perdido;
    private PrimerNivel primerNivel = new PrimerNivel();
    private SegundoNivel segundoNivel = new SegundoNivel();
    private TercerNivel tercerNivel = new TercerNivel();
    private CuartoNivel cuartoNivel = new CuartoNivel();
    private  int ganadas=0, perdidas1 =0;
    public InterfazGrafica(){
        setupFrame();
        frame.add(contenedor);
        addActionListeners();
    }
    private void setupFrame() {
        frame.setTitle("JUEGO");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(300, 200);
    }
    private void addActionListeners(){
        comprobar.addActionListener(e -> {
            if(perdidas1 == 3){
                ingresado.setEnabled(false);
                comprobar.setEnabled(false);
                generado.setText("<PERDISTE>");
            }
            char c = ingresado.getText().charAt(0);
            comparar(c);
            ganado.setText(String.valueOf(ganadas));
            perdido.setText(String.valueOf(perdidas1));
        });
    }
    private void comparar(char c){
        if(ganadas<=10){
            char b = primerNivel.generarLetra();
            generado.setText(String.valueOf(b));
            if(c==b){
                ganadas++;
            }else{
                perdidas1++;
            }
        } else if (ganadas<=20) {
            int a = Integer.parseInt(String.valueOf(c));
            int b = segundoNivel.generarNumero();
            generado.setText(String.valueOf(b));
            if(a==b){
                ganadas++;
            }else{
                perdidas1++;
            }
        } else if (ganadas<=30) {
            int a = Integer.parseInt(String.valueOf(c));
            int b = tercerNivel.generarNumero();
            generado.setText(String.valueOf(b));
            if(a==b){
                ganadas++;
            }else{
                perdidas1++;
            }
        } else if (ganadas<=40) {
            int a = Integer.parseInt(String.valueOf(c));
            int b = tercerNivel.generarNumero();
            generado.setText(String.valueOf(b));
            if(a==b){
                ganadas++;
            }else{
                perdidas1++;
            }
        }
    }
}
