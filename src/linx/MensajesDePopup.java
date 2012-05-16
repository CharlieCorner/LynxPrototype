package linx;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MensajesDePopup {

    public static ImageIcon iconoError = new ImageIcon(MensajesDePopup.class.getResource("/resources/error2.png"));
    public static ImageIcon iconoInformativo = new ImageIcon(MensajesDePopup.class.getResource("/resources/info2.png"));
    public static ImageIcon iconoAdvertencia = new ImageIcon(MensajesDePopup.class.getResource("/resources/alerta2.png"));

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
