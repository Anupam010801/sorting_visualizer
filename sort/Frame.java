import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
    private static final long serialVersionUID = 1L;
    private SortingPanel mypanel = new SortingPanel();

    public SortingPanel getPanel() {
        return this.mypanel;
    }

    public Frame() {
        this.setTitle("Sorting Visualizer");
        this.setVisible(true);
        this.getContentPane().setPreferredSize(new Dimension(1250, 650));
        this.getContentPane().add(mypanel);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
