/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author admin
 */
public class SpeechWar extends JDialog {

    JPanel pnMain, pnTitle, pnLvHou, pnButton;
    JLabel lblLvHou, lblIcon, lblName;
    JLabel lblImg, lblTitle, lblImgTitle;
    JSlider sld; 
    JTextField txt;
    JComboBox<String> cbo;
    JButton btnDispose, btnOK;

    public SpeechWar() throws HeadlessException {
        addControls();
        addEvents();
    }

    public void addControls() {
        Container con = getContentPane();
        con.setLayout(null);
        lblImgTitle = new JLabel(new ImageIcon(getClass().getResource("/Image/clock.PNG")));
        lblImgTitle.setBounds(20, 0, 60, 60);
        con.add(lblImgTitle);

        pnMain = new JPanel(null);
        pnMain.setBounds(0, 30, 600, 500);
        pnMain.setBackground(new Color(253, 247, 221));

        pnTitle = new JPanel(null);
        pnTitle.setBounds(0, 0, 600, 20);
        pnTitle.setBackground(new Color(215, 172, 116));
        pnMain.add(pnTitle);
        lblTitle = new JLabel("speed War");
        lblTitle.setBounds(250, 0, 125, 15);
        pnTitle.add(lblTitle);
        btnDispose = new JButton(new ImageIcon(getClass().getResource("/Image/xButton.PNG")));
        btnDispose.setBounds(580, 0, 20, 20);
        pnTitle.add(btnDispose);

        pnLvHou = new JPanel(null);
        pnLvHou.setBounds(0, 50, 600, 50);
        pnLvHou.setBackground(new Color(251, 232, 193));
        pnMain.add(pnLvHou);
        lblIcon = new JLabel(new ImageIcon(getClass().getResource("/image/clock.png")));
        lblIcon.setBounds(10, 5, 50, 45);
        pnLvHou.add(lblIcon);
        lblName = new JLabel("Tốc độ:");
        lblName.setBounds(70, 15, 100, 20);
        pnLvHou.add(lblName);
        sld = new JSlider(1, 500);
        sld.setBounds(170, 15, 300, 20);
        sld.setValue(IsLandUI.speechWar);
        sld.setBackground(new Color(251,232,193));
        pnLvHou.add(sld);
        txt = new JTextField(3);
        txt.setBounds(490, 15, 30, 20);
        pnLvHou.add(txt);
        btnOK = new JButton("OK");
        btnOK.setBounds(520, 15, 60, 20);
        pnLvHou.add(btnOK);
        
        
        con.add(pnMain);

    }
     public void addEvents() {
         sld.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                txt.setText(String.valueOf(sld.getValue()));
            }
        });
        txt.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                Integer intValue = 0;
                try{
                    intValue = Integer.valueOf(txt.getText());
                }catch(Exception ex){
                    txt.setText("0");
                }
                if(intValue < 1)
                    txt.setText("1");
                else if(intValue >= 500)
                    txt.setText("500");
                
                sld.setValue(Integer.valueOf(txt.getText()));
            }
        });
         btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IsLandUI.speech=sld.getValue();
                dispose();
                System.out.println(IsLandUI.speechWar);
            }
        });
     }
    

    //Show the HouseInfoUI dialog
    public void showWindow() {
        this.setSize(600, 530);
        setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //pnTranparent.setOpaque(false);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.setVisible(true);
    }
}
