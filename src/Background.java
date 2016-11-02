import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by yusuf77kenan on 01.11.2016.
 */

public class Background extends JPanel implements MouseListener , MouseMotionListener , ActionListener{

    private static int DELAY = 20;
    private Timer timer;
    private static boolean temizle;
    private RenkPaletiPanel renkPaletiPanel;
    private KalinlikPaleti kalinlikPaleti;
    private int x=0 , y=0;

    public Background(){

        timer = new Timer(DELAY , this);
        timer.start();

        setSize(900 , 700);
        setLocation(100 , 0);

        renkPaletiPanel = new RenkPaletiPanel();
        kalinlikPaleti = new KalinlikPaleti();

        addMouseListener(this);
        addMouseMotionListener(this);

        repaint();

    }

    public Background(boolean temizle){
        this.temizle = temizle;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {

        int x = mouseEvent.getX();
        int y = mouseEvent.getY();

        this.x = x;
        this.y = y;

        repaint();

    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }

    @Override
    protected void paintComponent(Graphics graphics) {

        doDrawing(graphics);

        //super.paintComponent(graphics);

        if (temizle){
            super.paintComponent(graphics);
            temizle = false;
        }



    }

    public void doDrawing(Graphics graphics){

        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setColor(renkPaletiPanel.getColorCode());
        graphics2D.setStroke(new BasicStroke(kalinlikPaleti.getKalinlik()));
        graphics2D.drawLine(x , y , x , y);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (temizle){
            repaint();
        }

    }

}
