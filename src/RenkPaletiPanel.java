import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yusuf77kenan on 01.11.2016.
 */
public class RenkPaletiPanel extends JPanel implements ActionListener {

    private ButtonGroup buttonGroup;
    private static Color colorCode;

    private JRadioButton jRadioButtonMavi;
    private JRadioButton jRadioButtonYesil;
    private JRadioButton jRadioButtonKırmızı;
    private JRadioButton jRadioButtonSiyah;
    private JRadioButton jRadioButtonPembe;
    private JRadioButton jRadioButtonPlum;
    private JRadioButton jRadioButtonSari;
    private JRadioButton jRadioButtonKahve;
    private JRadioButton jRadioButtonEflatun;
    private Label label;

    public Color getColorCode() {
        return colorCode;
    }

    public RenkPaletiPanel(){

        setSize(100, 130);

        buttonGroup = new ButtonGroup();

        label = new Label("Renkler");
        label.setFont(new Font("Arial" , Font.BOLD , 18));
        add(label);

        jRadioButtonMavi = new JRadioButton();
        jRadioButtonMavi.setBackground(new Color(68,108,179));
        add(jRadioButtonMavi);

        jRadioButtonYesil = new JRadioButton();
        jRadioButtonYesil.setBackground(new Color(38, 166, 91));
        add(jRadioButtonYesil);

        jRadioButtonKırmızı = new JRadioButton();
        jRadioButtonKırmızı.setBackground(new Color(239, 72, 54));
        add(jRadioButtonKırmızı);

        jRadioButtonSiyah = new JRadioButton();
        jRadioButtonSiyah.setBackground(new Color(0 , 0 , 0));
        add(jRadioButtonSiyah);

        jRadioButtonPembe = new JRadioButton();
        jRadioButtonPembe.setBackground(new Color(246, 36, 89));
        add(jRadioButtonPembe);

        jRadioButtonPlum = new JRadioButton();
        jRadioButtonPlum.setBackground(new Color(145, 61, 136));
        add(jRadioButtonPlum);

        jRadioButtonSari = new JRadioButton();
        jRadioButtonSari.setBackground(new Color(247, 202, 24));
        add(jRadioButtonSari);

        jRadioButtonKahve = new JRadioButton();
        jRadioButtonKahve.setBackground(new Color(78,52,46));
        add(jRadioButtonKahve);

        jRadioButtonEflatun = new JRadioButton();
        jRadioButtonEflatun.setBackground(new Color(38,50,56));
        add(jRadioButtonEflatun);

        jRadioButtonMavi.addActionListener(this);
        jRadioButtonYesil.addActionListener(this);
        jRadioButtonKırmızı.addActionListener(this);
        jRadioButtonSiyah.addActionListener(this);
        jRadioButtonPembe.addActionListener(this);
        jRadioButtonPlum.addActionListener(this);
        jRadioButtonSari.addActionListener(this);
        jRadioButtonKahve.addActionListener(this);
        jRadioButtonEflatun.addActionListener(this);

        buttonGroup.add(jRadioButtonMavi);
        buttonGroup.add(jRadioButtonYesil);
        buttonGroup.add(jRadioButtonKırmızı);
        buttonGroup.add(jRadioButtonSiyah);
        buttonGroup.add(jRadioButtonPembe);
        buttonGroup.add(jRadioButtonPlum);
        buttonGroup.add(jRadioButtonSari);
        buttonGroup.add(jRadioButtonKahve);
        buttonGroup.add(jRadioButtonEflatun);

        setBackground(new Color(224,224,224));

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource() == jRadioButtonSari){
            label.setText("Sarı");
            colorCode = jRadioButtonSari.getBackground();
        }else if (actionEvent.getSource() == jRadioButtonYesil){
            label.setText("Yeşil");
            colorCode = jRadioButtonYesil.getBackground();
        }else if (actionEvent.getSource() == jRadioButtonKırmızı){
            label.setText("Kırmızı");
            colorCode = jRadioButtonKırmızı.getBackground();
        }else if (actionEvent.getSource() == jRadioButtonSiyah){
            label.setText("Siyah");
            colorCode = jRadioButtonSiyah.getBackground();
        }else if (actionEvent.getSource() == jRadioButtonPembe){
            label.setText("Pembe");
            colorCode = jRadioButtonPembe.getBackground();
        }else if (actionEvent.getSource() == jRadioButtonPlum){
            label.setText("Plum");
            colorCode = jRadioButtonPlum.getBackground();
        }else if (actionEvent.getSource() == jRadioButtonSari){
            label.setText("Mavi");
            colorCode = jRadioButtonSari.getBackground();
        }else if (actionEvent.getSource() == jRadioButtonKahve){
            label.setText("Kahve");
            colorCode = jRadioButtonKahve.getBackground();
        }else if (actionEvent.getSource() == jRadioButtonEflatun){
            label.setText("Eflatun");
            colorCode = jRadioButtonEflatun.getBackground();
        }else if (actionEvent.getSource() == jRadioButtonMavi){
            label.setText("Mavi");
            colorCode = jRadioButtonMavi.getBackground();
        }

    }



}
