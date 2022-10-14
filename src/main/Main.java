package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
	JFrame frame= new JFrame();
    DefaultListModel<String> l=new DefaultListModel<>();
    l.addElement("Ali");
    l.addElement("Nacaf");
    JList<String> list=new JList<>(l);
    list.setBounds(100,10,80,80);
    JButton btn=new JButton("Submit");
    btn.setBounds(100,160,80,20);
    btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(list.getSelectedValue());
        }
    });

    frame.setSize(400,400);
    frame.setVisible(true);
    frame.setLayout(null);
    frame.add(list);
    frame.add(btn);

    }
}
