/* Universidad Virtual del Estado de Guanajuato UVEG
    Nombre: José Alberto Picasso Martínez.
    Modulo: Tópicos avanzados de programación v1.
    Reto 1: UML y Eventos.
    Fecha de elaboración: 15/03/2023. */

package interfaz;

import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Interfaz extends JFrame implements ActionListener {
    // Declaración de variables globales.
    int operando1, operando2, resultado;
    String operador;
    
     // Declaración variables de tipo JButton y JTextField.                     
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDivision, buttonMultiplicacion, 
            buttonReset,buttonResta, buttonResult, buttonSuma;
    private JTextField inputText;
    
    // Método Constructor.
    public Interfaz() {
        initComponents();
        this.setTitle("Mi Calculadora");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        // Linea para cambiar LookAndFeel
         try {
                    UIManager.setLookAndFeel(new HiFiLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
                
    // Inicializando los componentes de la interfaz.
    private void initComponents() {

        inputText = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button0 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        buttonMultiplicacion = new JButton();
        buttonReset = new JButton();
        button9 = new JButton();
        buttonResta = new JButton();
        button8 = new JButton();
        button7 = new JButton();
        button4 = new JButton();
        buttonSuma = new JButton();
        buttonDivision = new JButton();
        buttonResult = new JButton();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        inputText.setFont(new Font("Times New Roman", 1, 18));
        inputText.setHorizontalAlignment(JTextField.CENTER);

        configButton(button1, "1");
        button1.addActionListener((ActionEvent evt) -> {
            button1ActionPerformed(evt);
        });

        configButton(button2, "2");
        button2.addActionListener((ActionEvent evt) -> {
            button2ActionPerformed(evt);
        });

        configButton(button3, "3");
        button3.addActionListener((ActionEvent evt) -> {
            button3ActionPerformed(evt);
        });

        configButton(button0, "0");
        button0.addActionListener((ActionEvent evt) -> {
            button0ActionPerformed(evt);
        });

        configButton(button5, "5");
        button5.addActionListener((ActionEvent evt) -> {
            button5ActionPerformed(evt);
        });

        configButton(button6, "6");
        button6.addActionListener((ActionEvent evt) -> {
            button6ActionPerformed(evt);
        });

        configButton(buttonMultiplicacion, "*");
        buttonMultiplicacion.addActionListener((ActionEvent evt) -> {
            buttonMultiplicacionActionPerformed(evt);
        });

        configButton(buttonReset, "C");
        buttonReset.addActionListener((ActionEvent evt) -> {
            buttonResetActionPerformed(evt);
        });

        configButton(button9, "9");
        button9.addActionListener((ActionEvent evt) -> {
            button9ActionPerformed(evt);
        });

        configButton(buttonResta, "-");
        buttonResta.addActionListener((ActionEvent evt) -> {
            buttonRestaActionPerformed(evt);
        });

        configButton(button8, "8");
        button8.addActionListener((ActionEvent evt) -> {
            button8ActionPerformed(evt);
        });

        configButton(button7, "7");
        button7.addActionListener((ActionEvent evt) -> {
            button7ActionPerformed(evt);
        });

        configButton(button4, "4");
        button4.addActionListener((ActionEvent evt) -> {
            button4ActionPerformed(evt);
        });

        configButton(buttonSuma, "+");
        buttonSuma.addActionListener((ActionEvent evt) -> {
            buttonSumaActionPerformed(evt);
        });

        configButton(buttonDivision, "/");
        buttonDivision.addActionListener((ActionEvent evt) -> {
            buttonDivisionActionPerformed(evt);
        });

        configButton(buttonResult, "=");
        buttonResult.addActionListener((ActionEvent evt) -> {
            buttonResultActionPerformed(evt);
        });

        
        // Diseño de la Interfaz.
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonResult, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(inputText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(inputText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonResult, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }                       

    
    // Eventos de acción en los JButton y el JTextField.
    private void buttonResetActionPerformed(ActionEvent evt) {                                            
        clean();
    }                                           

    private void button1ActionPerformed(ActionEvent evt) {                                        
        outputText("1");
    }
     
    private void button2ActionPerformed(ActionEvent evt) {                                        
        outputText("2");
    }                                       

    private void button3ActionPerformed(ActionEvent evt) {                                        
        outputText("3");
    }                                       

    private void button4ActionPerformed(ActionEvent evt) {                                        
        outputText("4");
    }                                       

    private void button5ActionPerformed(ActionEvent evt) {                                        
        outputText("5");
    }                                       

    private void button6ActionPerformed(ActionEvent evt) {                                        
        outputText("6");
    }                                       

    private void button7ActionPerformed(ActionEvent evt) {                                        
        outputText("7");
    }                                       

    private void button8ActionPerformed(ActionEvent evt) {                                        
        outputText("8");
    }                                       

    private void button9ActionPerformed(ActionEvent evt) {                                        
        outputText("9");
    }                                       

    private void button0ActionPerformed(ActionEvent evt) {                                        
        outputText("0");
    }                                       

    private void buttonDivisionActionPerformed(ActionEvent evt) {                                               
        operacion("/");
    }                                              

    private void buttonMultiplicacionActionPerformed(ActionEvent evt) {                                                     
        operacion("*");
    }                                                    

    private void buttonRestaActionPerformed(ActionEvent evt) {                                            
        operacion("-");
    }                                           

    private void buttonSumaActionPerformed(ActionEvent evt) {                                           
        operacion("+");
    }                                          

    private void buttonResultActionPerformed(ActionEvent evt) {                                             
        calculate();
    }                                            
    
    
    
    // Métodos Generales.
    
    /**
     * Configura el botón recibido como parámetro, estableciendo el color de fondo como gris claro (RGB 204, 204, 204),
     * el tipo de fuente como Times New Roman con negrita y tamaño 18, y el texto del botón como el caracter especificado.
     * @param button Botón que se va a configurar.
     * @param caracter Caracter que se va a establecer como texto del botón.
    */
    public void configButton( JButton button, String caracter ){
        button.setBackground(new Color(204, 204, 204));
        button.setFont(new Font("Times New Roman", 1, 18));
        button.setText( caracter );
    }
    
    
    /**
     * Concatena un número al texto de entrada que se muestra en la pantalla de la calculadora.
     * Si el texto de entrada actual es un operador matemático o el resultado anterior, se borra antes de agregar el nuevo número. 
     * @param number es una cadena que representa el número que se va a agregar al texto de entrada.
    */
    public void outputText( String number ){
        if ( inputText.getText().equals("/")  || inputText.getText().equals("*") || inputText.getText().equals("-")
            || inputText.getText().equals("+") || inputText.getText().equals(Integer.toString(resultado)) || inputText.getText().equals("Syntax ERROR") ){
                clean();
        }
        inputText.setText(inputText.getText() + number);
    }
    
    
    /**
     * Este método limpia el texto del campo de entrada inputText.
    */
    public void clean(){
        inputText.setText("");
    }
    
    
    /**
     * Este método se encarga de realizar la operación indicada por el usuario.
     * Primero convierte el valor numérico ingresado en el campo de entrada a un entero y lo asigna como el primer operando.
     * Luego, asigna el operador especificado a la variable "operador" y limpia el campo de entrada.
     * Por último, muestra el operador en el campo de entrada junto con cualquier otro carácter que ya se haya ingresado.
     * Si se produce una excepción durante el proceso, se imprime el mensaje de error en la consola.
     * @param op el operador aritmético seleccionado por el usuario.
    */
    public void operacion( String op ){
        try {
            operando1 = Integer.parseInt(inputText.getText());
            operador = op;
            clean();
            inputText.setText(inputText.getText() + op);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Calcula el resultado de una operación matemática basada en los operandos y operador ingresados por el usuario.
     * El método primero analiza el segundo operando del texto de entrada que se muestra en la pantalla de la calculadora, luego utiliza una
     * declaración de cambio para realizar la operación correspondiente en función del operador ingresado por el usuario. 
     * El resultado se muestra en la pantalla de la calculadora como una cadena. Si el segundo operando es cero y el operador es divisor,
     * se muestra un mensaje "Syntax ERROR" en su lugar.
    */
    public void calculate(){
        try {
            operando2 = Integer.parseInt(inputText.getText());
            switch (operador) {
                case "/":
                    if ( operando2 != 0 ) {
                        resultado = operando1 / operando2;
                        inputText.setText(Integer.toString(resultado));
                    } else {
                        inputText.setText("Syntax ERROR");
                    } 
                    break;
                case "*":
                    resultado = operando1 * operando2;
                    inputText.setText(Integer.toString(resultado));
                    break;
                case "-":
                    resultado = operando1 - operando2;
                    inputText.setText(Integer.toString(resultado));
                    break;
                case "+":
                    resultado = operando1 + operando2;
                    inputText.setText(Integer.toString(resultado));
                    break;
                default:
                    inputText.setText("Syntax ERROR");
                    break;
        }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    /**
     * Este método se ejecuta cuando se produce una acción en la interfaz.
     * En este caso, lanza una excepción para indicar que el método no está soportado todavía.
     * @param e un objeto ActionEvent que representa la acción que se ha producido.
     * @throws UnsupportedOperationException si se intenta ejecutar este método
    */
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
