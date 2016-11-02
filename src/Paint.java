import javax.swing.*;
import java.awt.*;

/**
 * Created by yusuf77kenan on 01.11.2016.
 */
public class Paint extends JFrame{

    private RenkPaletiPanel renkPaletiPanel;
    private Background background;
    private KalinlikPaleti kalinlikPaleti;
    private Container container;

    public Paint(){

        container = getContentPane();
        container.setLayout(null);

        setSize(1000 , 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Paint");
        setLocationRelativeTo(null);

        renkPaletiPanel = new RenkPaletiPanel();
        background = new Background();
        kalinlikPaleti = new KalinlikPaleti();

        container.add(renkPaletiPanel);
        container.add(kalinlikPaleti);
        container.add(background);

        add(background);

    }

    public static void main(String[] args){

        Paint paint = new Paint();
        paint.setVisible(true);

    }

}
