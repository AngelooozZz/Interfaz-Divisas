import intentodelibreria3.IntentodeLibreria33;
import javax.swing.JOptionPane;

public class InterfazConvertir extends javax.swing.JFrame {

    private IntentodeLibreria33 conversorAPI;

    public InterfazConvertir() {
        initComponents();
        this.conversorAPI = new IntentodeLibreria33();
        cargarDivisas();
        
        panelConversorDivisas1.getBotonConvertir().addActionListener(e -> {    
        try { 
            String DivOrigen = panelConversorDivisas1.getComboDivisaOrigen().getSelectedItem().toString();
            String DivDestino = panelConversorDivisas1.getComboDivisaDestino().getSelectedItem().toString();
            String MontoInicial = txtMonto.getText().toString();
            
            if(MontoInicial.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese un monto", "Error", JOptionPane.ERROR_MESSAGE);
                return; 
            }
            
            double montoI = Double.parseDouble(MontoInicial); 
            double equivalencia = convertir(montoI);
            
            etiquetaResultados1.setText("Moneda de origen: " + DivOrigen);
            double resultado =  equivalencia * montoI ;
            etiquetaResultados2.setText("Equivalencia en: " + DivDestino + " = " + resultado);
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al realizar la conversión: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    });
    }
    
    public void cargarDivisas() {
        try {
            String[] divisas = conversorAPI.obtenerSimbolosDivisas();
            
            panelConversorDivisas1.getComboDivisaOrigen().removeAllItems();
            panelConversorDivisas1.getComboDivisaDestino().removeAllItems();
            
            for (String divisa : divisas) {
                panelConversorDivisas1.getComboDivisaOrigen().addItem(divisa);
                panelConversorDivisas1.getComboDivisaDestino().addItem(divisa);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error al cargar las divisas", JOptionPane.ERROR_MESSAGE);
        }
    }

    public double convertir(double monto) throws Exception {
        String origen = panelConversorDivisas1.getComboDivisaOrigen().getSelectedItem().toString();
        String destino = panelConversorDivisas1.getComboDivisaDestino().getSelectedItem().toString();
        return conversorAPI.euroaUSD(origen, destino);
    }
    
    
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
                .addContainerGap(42, Short.MAX_VALUE))
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