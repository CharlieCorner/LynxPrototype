package linx;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MensajesDePopup {

    public static final ImageIcon iconoError = new ImageIcon("resources/error2.png");
    public static final ImageIcon iconoInformativo = new ImageIcon("resources/info2.png");
    public static final ImageIcon iconoAdvertencia = new ImageIcon("resources/alerta2.png");

    public static void mostrarMensajeError(String mensaje, String titulo, JFrame panelPadre) {
        if (null == titulo) {
            titulo = "Error";
        }
        JOptionPane.showMessageDialog(panelPadre, mensaje, titulo, JOptionPane.ERROR_MESSAGE, iconoError);

    }

    public static void mostrarMensajeInformativo(String mensaje, String titulo, JFrame panelPadre) {
        if (null == titulo) {
            titulo = "Informativo";
        }
        JOptionPane.showMessageDialog(panelPadre, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE, iconoInformativo);
    }

    public static void mostrarMensajeAdvertencia(String mensaje, String titulo, JFrame panelPadre) {
        if (null == titulo) {
            titulo = "Advertencia";
        }
        JOptionPane.showMessageDialog(panelPadre, mensaje, titulo, JOptionPane.WARNING_MESSAGE, iconoAdvertencia);
    }

    private MensajesDePopup() {
    }
}
