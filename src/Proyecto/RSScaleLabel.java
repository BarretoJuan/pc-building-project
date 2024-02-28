package Proyecto;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RSScaleLabel {
   public static void setScaleLabel(JLabel label, String ruta) {
      ImageIcon fot = new ImageIcon(ruta);
      Icon icono = new ImageIcon(fot.getImage().getScaledInstance(label.getWidth(), label.getHeight(), 1));
      label.setIcon(icono);
      System.out.println("Label colocado");
      System.out.println(label);
      System.out.println(ruta);
   }
}

