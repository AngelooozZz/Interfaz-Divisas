import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PanelConversorDivisas extends JPanel  {
    
    private MiComboBox comboDivisaOrigen;
    private MiComboBox comboDivisaDestino;
    private MiBoton botonConvertir;
    
    public PanelConversorDivisas() {
        initComponents();
    }
    
    private void initComponents() {
        // Configurar el layout (vertical, con separación de 35px)
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBorder(new EmptyBorder(10, 10, 10, 10)); // Margen opcional
        
        // Crear componentes
        comboDivisaOrigen = new MiComboBox();
        comboDivisaDestino = new MiComboBox();
        botonConvertir = new MiBoton();
        botonConvertir.setText("Convertir");
        
        
        // Añadir al panel con separación de 35px
        this.add(comboDivisaOrigen);
        this.add(Box.createRigidArea(new Dimension(0, 35))); // Espacio vertical
        this.add(comboDivisaDestino);
        this.add(Box.createRigidArea(new Dimension(0, 35))); // Espacio vertical
        this.add(botonConvertir);
    }
    

    // Getters
    public MiComboBox getComboDivisaOrigen() {
        return comboDivisaOrigen;
    }
    
    public MiComboBox getComboDivisaDestino() {
        return comboDivisaDestino;
    }
    
    public MiBoton getBotonConvertir() {
        return botonConvertir;
    }
}