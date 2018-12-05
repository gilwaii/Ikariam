/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.House;

/**
 *
 * @author Dat Ngo
 */
public class IsLandUI extends JFrame{
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17;
    JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10, txt11, txt12, txt13, txt14, txt15, txt16, txt17;
    JLabel lblIsLand;
    public static WaveAttackUI waveattack;
    public static JButton btnWaveAttack;
    public static JButton currentButton;
    public static House currentHouse;
    public static JTextField currentTextField;
    public HouseInfoUI houseInfoUI;
    public static House[] house;
    public static House myHouse;
    public static BattleFieldFightingUI bffUI;
    public static LogBattleFieldFightingUI lbffUI;
    
    public IsLandUI(String title){
        super(title);
        house = new House[18];
        currentHouse = new House();
        currentButton = new JButton();
        for(int i=1; i<18; i++){
            house[i] = new House();
            house[i].setName("Ikariam"+i);
            house[i].setId(i);
        }
            
        houseInfoUI = new HouseInfoUI();
        addControls();
        addEvents();
    }
    
    public void addControls(){
        Container con = getContentPane();
        
        JPanel pnMain = new JPanel();
        pnMain.setLayout(null);
        con.add(pnMain);
        
        btn1 = new MyJButtonFlag();
        btn1.setBounds(165, 151, 60,60);
        txt1 = new JTextField();
        txt1.setBounds(165, 151+60, 60, 14);
        txt1.setFont(new Font(Font.SERIF, Font.BOLD, 13));
        txt1.setEditable(true);
        txt1.setVisible(false);
        pnMain.add(btn1);
        pnMain.add(txt1);
        
        btn2 = new MyJButtonFlag();
        btn2.setBounds(180, 280, 60,60);
        txt2 = new JTextField();
        txt2.setBounds(180, 280+60, 60, 14);
        txt2.setFont(new Font(Font.SERIF, Font.BOLD,13));
        txt2.setEditable(true);
        txt2.setVisible(false);
        pnMain.add(txt2);
        pnMain.add(btn2);
        
        btn3 = new MyJButtonFlag();
        btn3.setBounds(350, 109, 60,60);
        txt3 = new JTextField();
        txt3.setBounds(350, 109+60, 60, 14);
        txt3.setFont(new Font(Font.SERIF, Font.BOLD, 13));
        txt3.setEditable(true);
        txt3.setVisible(false);
        pnMain.add(txt3);
        pnMain.add(btn3);
        
        btn4 = new MyJButtonFlag();
        btn4.setBounds(501, 195, 60,60);
        txt4 = new JTextField();
        txt4.setBounds(501, 195+60, 60, 14);
        txt4.setFont(new Font(Font.SERIF, Font.BOLD, 13));
        txt4.setEditable(true);
        txt4.setVisible(false);
        pnMain.add(txt4);
        pnMain.add(btn4);
        
        btn5 = new MyJButtonFlag();
        btn5.setBounds(825, 112, 60,60);
        txt5 = new JTextField();
        txt5.setBounds(825, 112+60, 60, 14);
        txt5.setFont(new Font(Font.SERIF, Font.BOLD, 13));
        txt5.setEditable(true);
        txt5.setVisible(false);
        pnMain.add(txt5);
        pnMain.add(btn5);
        
        btn6 = new MyJButtonFlag();
        btn6.setBounds(341, 378, 60,60);
        txt6 = new JTextField();
        txt6.setBounds(341, 378+60, 60, 14);
        txt6.setFont(new Font(Font.SERIF, Font.BOLD, 13));
        txt6.setEditable(true);
        txt6.setVisible(false);
        pnMain.add(txt6);
        pnMain.add(btn6);
        
        btn7 = new MyJButtonFlag();
        btn7.setBounds(190, 510, 60,60);
        txt7 = new JTextField();
        txt7.setBounds(190, 510+60, 60, 14);
        txt7.setFont(new Font(Font.SERIF, Font.BOLD, 13));
        txt7.setEditable(true);
        txt7.setVisible(false);
        pnMain.add(txt7);
        pnMain.add(btn7);
        
        btn8 = new MyJButtonFlag();
        btn8.setBounds(260, 640, 60,60);
        txt8 = new JTextField();
        txt8.setBounds(260, 640+60, 60, 14);
        txt8.setFont(new Font(Font.SERIF, Font.BOLD, 13));
        txt8.setEditable(true);
        txt8.setVisible(false);
        pnMain.add(txt8);
        pnMain.add(btn8);
        
        btn9 = new MyJButtonFlag();
        btn9.setBounds(448, 562, 60,60);
        txt9 = new JTextField();
        txt9.setBounds(448, 562+60, 60, 14);
        txt9.setFont(new Font(Font.SERIF, Font.BOLD, 13));
        txt9.setEditable(true);
        txt9.setVisible(false);
        pnMain.add(txt9);
        pnMain.add(btn9);
        
        btn10 = new MyJButtonFlag();
        btn10.setBounds(548, 695, 60,60);
        txt10 = new JTextField();
        txt10.setBounds(548, 695+60, 60, 14);
        txt10.setFont(new Font(Font.SERIF, Font.BOLD, 13));
        txt10.setEditable(true);
        txt10.setVisible(false);
        pnMain.add(txt10);
        pnMain.add(btn10);
        
        btn11 = new MyJButtonFlag();
        btn11.setBounds(730, 791, 60,60);
        txt11 = new JTextField();
        txt11.setBounds(730, 791+60, 60, 14);
        txt11.setFont(new Font(Font.SERIF, Font.BOLD, 13));
        txt11.setEditable(true);
        txt11.setVisible(false);
        pnMain.add(txt11);
        pnMain.add(btn11);
        
        btn12 = new MyJButtonFlag();
        btn12.setBounds(903, 683, 60,60);
        txt12 = new JTextField();
        txt12.setBounds(903, 683+60, 60, 14);
        txt12.setFont(new Font(Font.SERIF, Font.BOLD, 13));
        txt12.setEditable(true);
        txt12.setVisible(false);
        pnMain.add(txt12);
        pnMain.add(btn12);
        
        btn13 = new MyJButtonFlag();
        btn13.setBounds(1063, 640, 60,60);
        txt13 = new JTextField();
        txt13.setBounds(1063, 640+60, 60, 14);
        txt13.setFont(new Font(Font.SERIF, Font.BOLD, 13));
        txt13.setEditable(true);
        txt13.setVisible(false);
        pnMain.add(txt13);
        pnMain.add(btn13);
        
        btn14 = new MyJButtonFlag();
        btn14.setBounds(1205, 550, 60,60);
        txt14 = new JTextField();
        txt14.setBounds(1205, 550+60, 60, 14);
        txt14.setFont(new Font(Font.SERIF, Font.BOLD, 13));
        txt14.setEditable(true);
        txt14.setVisible(false);
        pnMain.add(txt14);
        pnMain.add(btn14);
        
        btn15 = new MyJButtonFlag();
        btn15.setBounds(1225, 400, 60,60);
        txt15 = new JTextField();
        txt15.setBounds(1225, 400+60, 60, 14);
        txt15.setFont(new Font(Font.SERIF, Font.BOLD, 13));
        txt15.setEditable(true);
        txt15.setVisible(false);
        pnMain.add(txt15);
        pnMain.add(btn15);
        
        btn16 = new MyJButtonFlag();
        btn16.setBounds(915, 260,60,60);
        txt16 = new JTextField();
        txt16.setBounds(915, 260+60, 60, 14);
        txt16.setFont(new Font(Font.SERIF, Font.BOLD, 13));
        txt16.setEditable(true);
        txt16.setVisible(false);
        pnMain.add(txt16);
        pnMain.add(btn16);
        
        btn17 = new MyJButtonFlag();
        btn17.setBounds(652, 280, 60,60);
        txt17 = new JTextField();
        txt17.setBounds(652, 280+60, 60, 14);
        txt17.setFont(new Font(Font.SERIF, Font.BOLD, 13));
        txt17.setEditable(true);
        txt17.setVisible(false);
        pnMain.add(txt17);
        pnMain.add(btn17);
        
        btnWaveAttack = new MyJButtonWaveAttack();
        btnWaveAttack.setBounds(560, 10, 90, 108);
        btnWaveAttack.setOpaque(false);
        btnWaveAttack.setContentAreaFilled(false);
        btnWaveAttack.setBorder(null);
        pnMain.add(btnWaveAttack);
        
        lblIsLand = new JLabel();
        lblIsLand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Island_4-0.5.0.jpg")));
        pnMain.add(lblIsLand);
        lblIsLand.setBounds(0, 0, 1350, 900);
        
    }
    
    public void addEvents(){
        btnWaveAttack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(myHouse!=null)
                    {
                	waveattack = new WaveAttackUI("WaveAttack", myHouse.getSentRealArmy(), myHouse.getSendingArmy());
                	waveattack.setVisible(true);
                    }
            }
        });
        
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[1];
                currentButton = btn1;
                currentTextField = txt1;
                houseInfoUI.showWindow();
            }
        });
        
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[2];
                currentButton = btn2;
                currentTextField = txt2;
                houseInfoUI.showWindow();
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[3];
                currentButton = btn3;
                currentTextField = txt3;
                houseInfoUI.showWindow();
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[4];
                currentButton = btn4;
                currentTextField = txt4;
                houseInfoUI.showWindow();
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[5];
                currentButton = btn5;
                currentTextField = txt5;
                houseInfoUI.showWindow();
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[6];
                currentButton = btn6;
                currentTextField = txt6;
                houseInfoUI.showWindow();
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[7];
                currentButton = btn7;
                currentTextField = txt7;
                houseInfoUI.showWindow();
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[8];
                currentButton = btn8;
                currentTextField = txt8;
                houseInfoUI.showWindow();
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[9];
                currentButton = btn9;
                currentTextField = txt9;
                houseInfoUI.showWindow();
            }
        });
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[10];
                currentButton = btn10;
                currentTextField = txt10;
                houseInfoUI.showWindow();
            }
        });
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[11];
                currentButton = btn11;
                currentTextField = txt11;
                houseInfoUI.showWindow();
            }
        });
        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[12];
                currentButton = btn12;
                currentTextField = txt12;
                houseInfoUI.showWindow();
            }
        });
        btn13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[13];
                currentButton = btn13;
                currentTextField = txt13;
                houseInfoUI.showWindow();
            }
        });
        btn14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[14];
                currentButton = btn14;
                currentTextField = txt14;
                houseInfoUI.showWindow();
            }
        });
        btn15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[15];
                currentButton = btn15;
                currentTextField = txt15;
                houseInfoUI.showWindow();
            }
        });
        btn16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[16];
                currentButton = btn16;
                currentTextField = txt16;
                houseInfoUI.showWindow();
            }
        });
        btn17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentHouse = house[17];
                currentButton = btn17;
                currentTextField = txt17;
                houseInfoUI.showWindow();
            }
        });
        
        txt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt1.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt1.setText(house[1].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt1.setText(house[1].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[1].setName(txt1.getText());
               }
           }
       });
       
       txt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt2.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt2.setText(house[2].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt2.setText(house[2].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[2].setName(txt2.getText());
               }
           }
       });
       
       txt3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt3.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt3.setText(house[3].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt3.setText(house[3].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[3].setName(txt3.getText());
               }
           }
       });
       
       txt4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt4.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt4.setText(house[4].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt4.setText(house[4].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[4].setName(txt4.getText());
               }
           }
       });
       
       txt5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt5.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt5.setText(house[5].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt5.setText(house[5].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[5].setName(txt5.getText());
               }
           }
       });
       
       txt6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt6.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt6.setText(house[6].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt6.setText(house[6].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[6].setName(txt6.getText());
               }
           }
       });
       
       txt7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt7.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt7.setText(house[7].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt7.setText(house[7].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[7].setName(txt7.getText());
               }
           }
       });
       
       txt8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt8.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt8.setText(house[8].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt8.setText(house[8].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[8].setName(txt8.getText());
               }
           }
       });
       
       txt9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt9.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt9.setText(house[9].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt9.setText(house[9].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[9].setName(txt9.getText());
               }
           }
       });
       
       txt10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt10.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt10.setText(house[10].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt10.setText(house[10].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[10].setName(txt10.getText());
               }
           }
       });
       
       txt11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt11.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt11.setText(house[11].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt11.setText(house[11].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[11].setName(txt11.getText());
               }
           }
       });
       
       txt12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt12.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt12.setText(house[12].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt12.setText(house[12].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[12].setName(txt12.getText());
               }
           }
       });
       
       txt13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt13.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt13.setText(house[13].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt13.setText(house[13].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[13].setName(txt13.getText());
               }
           }
       });
       
       txt14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt14.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt14.setText(house[14].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt14.setText(house[14].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[14].setName(txt14.getText());
               }
           }
       });
       
       txt15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt15.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt15.setText(house[15].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt15.setText(house[15].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[15].setName(txt15.getText());
               }
           }
       });
       
       txt16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt16.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt16.setText(house[16].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt16.setText(house[16].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[16].setName(txt16.getText());
               }
           }
       });
       
       txt17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String textcheck=txt17.getText();
               if(textcheck.length()>20) {
               JOptionPane.showMessageDialog(null, "Too long than 20 character");
                txt17.setText(house[17].getName());
               }
               else if(!isAlphaSpace(textcheck)){
               JOptionPane.showMessageDialog(null, "Name is only letter or space! ");
               txt17.setText(house[17].getName());
               }
               else {
               JOptionPane.showMessageDialog(null, "Name is OK! ");
               house[17].setName(txt17.getText());
               }
           }
       });
    }
    public boolean isAlphaSpace(String str) {
        if (str == null) {
            return false;
        }
        int sz = str.length();
        for (int i = 0; i < sz; i++) {
            if ((Character.isLetter(str.charAt(i)) == false) && (str.charAt(i) != ' ')) {
                return false;
            }
        }
        return true;
    }
    public void showWindow(){
        setSize(1360, 950);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }          
}
