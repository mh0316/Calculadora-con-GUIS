import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCalculadora extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel etiquetaPedirNumeros;
    private JLabel etiquetaResultado;
    private JTextField cajaNumero1;
    private JTextField cajaNumero2;
    private JButton botonSumar;
    private JButton botonRestar;
    private JButton botonMultiplicar;
    private JButton botonDividir;
    private JButton botonPotencia;
    Calculadora calculadora;

    public VentanaCalculadora(){
        this.setTitle("Calculadora");
        this.setSize(600,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        agregarPartes();
    }

    public void agregarPartes(){
        agregarPanel();
        agregarBotones();
        agregarEtiquetas();
        agregarCajasDeTexto();
    }

    public void agregarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    public void agregarEtiquetas(){
        etiquetaPedirNumeros = new JLabel("Ingrese los números:");
        etiquetaPedirNumeros.setBounds(30,30,200,30);
        etiquetaPedirNumeros.setFont(new Font("arial",Font.BOLD,20));
        etiquetaPedirNumeros.setForeground(Color.BLACK);
        panel.add(etiquetaPedirNumeros);

        etiquetaResultado = new JLabel();
        etiquetaResultado.setBounds(500,100,100,30);
        etiquetaResultado.setFont(new Font("arial",Font.BOLD,20));
        panel.add(etiquetaResultado);
    }

    /*public void mostrarResultadoSuma(){
        calculadora.obtenerResultadoSuma();
    }*/

    public void agregarCajasDeTexto(){
        cajaNumero1 = new JTextField();
        cajaNumero1.setBounds(30,100,100,30);
        panel.add(cajaNumero1);

        cajaNumero2 = new JTextField();
        cajaNumero2.setBounds(200,100,100,30);
        panel.add(cajaNumero2);
    }

    public void agregarBotones(){
        botonSumar = new JButton("Sumar");
        botonSumar.setBounds(30,200,100,30);
        panel.add(botonSumar);
        botonSumar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonSumar){

        }
    }
}