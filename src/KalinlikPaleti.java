import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by yusuf77kenan on 02.11.2016.
 */
public class KalinlikPaleti extends JPanel{

    private Label label;
    private static int kalinlik = 3;
    private JButton btnTemizle;

    public KalinlikPaleti(){

        setSize(100 , 700);
        setBackground(new Color(224,224,224));
        label = new Label("Kalınlık");
        label.setFont(new Font("Arial" , Font.BOLD , 18));

        btnTemizle = new JButton("Temizle");

        add(label);
        setLocation(0 , 130);

        String[]  items = new String[]{"İnce", "Orta",  "Kalın",  "Çok Kalın"};
        JList<String> list = new JList<>(items);
        list.setBackground(new Color(224,224,224));
        add(list);
        btnTemizle.setLocation(0 , 200);
        add(btnTemizle);

        btnTemizle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                // Temizleye Basıldığı An

                Background background = new Background(true);
                background.repaint();

            }
        });



        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                if (!listSelectionEvent.getValueIsAdjusting()){
                    label.setText(list.getSelectedValue().toString());

                    if (list.getSelectedValue().toString().equals("İnce")){
                        kalinlik = 5;
                    }else if (list.getSelectedValue().toString().equals("Orta")){
                        kalinlik = 8;
                    }else if (list.getSelectedValue().toString().equals("Kalın")){
                        kalinlik = 13;
                    }else if (list.getSelectedValue().toString().equals("Çok Kalın")){
                        kalinlik = 18;
                    }

                }
            }
        });

    }


    public int getKalinlik() {
        return kalinlik;
    }

}
