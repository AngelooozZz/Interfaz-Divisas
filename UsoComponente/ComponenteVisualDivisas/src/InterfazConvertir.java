import intentodelibreria3.IntentodeLibreria33;
import javax.swing.JOptionPane;

/**
 * Clase principal del proyecto DivisasTAP.
 *
 * Esta interfaz gráfica permite al usuario seleccionar divisas,
 * ingresar un monto y visualizar el resultado de la conversión,
 * utilizando una API externa y una biblioteca personalizada.
 *
 * @author Angel
 */
public class InterfazConvertir extends javax.swing.JFrame {

    /**
     * Instancia del conversor que utiliza una biblioteca externa para obtener
     * símbolos de divisas y tasas de cambio actualizadas.
     */
    private final IntentodeLibreria33 conversorAPI;

    /**
     * Constructor de la clase.
     * 
     * Inicializa la interfaz gráfica, crea una instancia del conversor
     * basado en una biblioteca personalizada, carga las divisas disponibles
     * en los ComboBox y asigna el comportamiento al botón de conversión.
     */
    public InterfazConvertir() {
        initComponents();
        this.conversorAPI = new IntentodeLibreria33();
        cargarDivisas();

        // Acción que se ejecuta al presionar el botón "Convertir"
        panelConversorDivisas1.getBotonConvertir().addActionListener(e -> {
            try {
                // Obtener las divisas seleccionadas por el usuario
                String DivOrigen = panelConversorDivisas1.getComboDivisaOrigen().getSelectedItem().toString();
                String DivDestino = panelConversorDivisas1.getComboDivisaDestino().getSelectedItem().toString();

                // Obtener y validar el monto ingresado
                String MontoInicial = txtMonto.getText().toString();
                if (MontoInicial.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor ingrese un monto", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Convertir el valor ingresado a tipo numérico
                double montoI = Double.parseDouble(MontoInicial);

                // Obtener la tasa de conversión y calcular el resultado
                double equivalencia = convertir(montoI);
                double resultado = equivalencia * montoI;

                // Mostrar resultados al usuario
                etiquetaResultados1.setText("Moneda de origen: " + DivOrigen);
                etiquetaResultados2.setText("Equivalencia en: " + DivDestino + " = " + resultado);

            } catch (NumberFormatException ex) {
                // Si el usuario no ingresó un número válido
                JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                // Si ocurre algún otro error en la conversión
                JOptionPane.showMessageDialog(this, "Error al realizar la conversión: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    /**
     * Carga los símbolos de divisas desde la API mediante la biblioteca personalizada
     * y los añade a los ComboBox de divisa origen y divisa destino.
     *
     * Este método limpia los ítems anteriores y actualiza los disponibles
     * según lo devuelto por la API.
     */
    public void cargarDivisas() {
        try {
            // Obtener lista de divisas desde la biblioteca externa
            String[] divisas = conversorAPI.obtenerSimbolosDivisas();

            // Limpiar ComboBox antes de actualizar
            panelConversorDivisas1.getComboDivisaOrigen().removeAllItems();
            panelConversorDivisas1.getComboDivisaDestino().removeAllItems();

            // Agregar cada divisa a los ComboBox
            for (String divisa : divisas) {
                panelConversorDivisas1.getComboDivisaOrigen().addItem(divisa);
                panelConversorDivisas1.getComboDivisaDestino().addItem(divisa);
            }

        } catch (Exception e) {
            // Mostrar error si falla la conexión o respuesta de la API
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error al cargar las divisas", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Calcula la tasa de conversión entre las divisas seleccionadas.
     *
     * Este método no realiza la conversión del monto, sino que devuelve la
     * tasa de cambio actual, que luego será multiplicada por el monto en otra parte.
     *
     * @param monto El monto que el usuario desea convertir (aunque aquí no se usa directamente).
     * @return Tasa de conversión entre la divisa origen y destino.
     * @throws Exception Si ocurre un error al consultar la API.
     */
    public double convertir(double monto) throws Exception {
        String origen = panelConversorDivisas1.getComboDivisaOrigen().getSelectedItem().toString();
        String destino = panelConversorDivisas1.getComboDivisaDestino().getSelectedItem().toString();
        return conversorAPI.euroaUSD(origen, destino);
    }

    /**
     * Inicializa los componentes gráficos de la ventana.
     *
     * Este método es generado automáticamente por NetBeans y
     * no se recomienda modificarlo directamente.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miComboBox1 = new MiComboBox();
        miComboBox2 = new MiComboBox();
        miComboBox3 = new MiComboBox();
        miComboBox4 = new MiComboBox();
        etiquetaResultados1 = new EtiquetaResultados();
        etiquetaResultados2 = new EtiquetaResultados();
        miEtiquetaTitle2 = new MiEtiquetaTitle();
        txtMonto = new javax.swing.JTextField();
        panelConversorDivisas1 = new PanelConversorDivisas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(miEtiquetaTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(etiquetaResultados2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaResultados1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelConversorDivisas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(miEtiquetaTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConversorDivisas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaResultados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaResultados2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazConvertir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private EtiquetaResultados etiquetaResultados1;
    private EtiquetaResultados etiquetaResultados2;
    private MiComboBox miComboBox1;
    private MiComboBox miComboBox2;
    private MiComboBox miComboBox3;
    private MiComboBox miComboBox4;
    private MiEtiquetaTitle miEtiquetaTitle2;
    private PanelConversorDivisas panelConversorDivisas1;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables

}