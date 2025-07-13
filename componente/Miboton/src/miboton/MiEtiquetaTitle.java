
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class MiEtiquetaTitle extends JLabel {
    
    public MiEtiquetaTitle(){
        this.setOpaque(false);
        this.setBackground(Color.white);
        this.setForeground(Color.black);
        this.setPreferredSize(new Dimension(280 , 35));
        this.setFont(new Font("Tahoma", Font.BOLD, 16));
        this.setText("Conversion Divisas");
        this.setHorizontalAlignment(CENTER);
    }
    
}
