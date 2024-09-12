package com.formgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class formgui extends JFrame implements ActionListener {
  private JTextField name, roll;
   private JLabel label_name,label_roll;
   private JButton button;
    formgui(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        this.setSize(430,320);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocation(450,200);
        this.add(panel);
        panel.setBackground(Color.pink);
        JLabel labeltitle=new JLabel("Student Record Inserting System");
        labeltitle.setBounds(40,-80,430,200);
        labeltitle.setFont(new Font("",Font.BOLD,22));
        panel.add(labeltitle);
        label_name=new JLabel("Name");
        label_name.setBounds(30,20,300,119);
        label_name.setFont(new Font("",Font.BOLD,21));
        panel.add(label_name);

        name= new JTextField();
        name.setBounds(135,66,130,30);
        name.setBackground(Color.pink);
        panel.add(name);

        label_roll =new JLabel("Roll No");
        label_roll.setBounds(30,70,300,119);
        label_roll.setFont(new Font("",Font.BOLD,21));
        panel.add(label_roll);

        roll= new JTextField();
        roll.setBounds(135,113,130,30);
        roll.setBackground(Color.pink);
        panel.add(roll);

        button=new JButton("SUBMIT");
        button.setBounds(110,162,130,27);
        button.setFocusable(false);
        panel.add(button);
        button.addActionListener(this);

    }
    public static void main(String args[]){
        new formgui();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String na=name.getText();
        String ro=roll.getText();

            if (na.equals("")|| ro.equals("")){
                JOptionPane.showMessageDialog(null,"fill the all fileds");
            }else {
                try {
                    Student student = new Student(na, ro);

                    // Save the student object to the database
                    StudentDAO studentDAO = new StudentDAO();
                    studentDAO.saveStudent(student);

                    JOptionPane.showMessageDialog(null, "Student record inserted successfully!");
                    name.setText("");
                    roll.setText("");
                } catch (Exception ee) {
                    System.out.println(ee);
                    JOptionPane.showMessageDialog(null, "An error occurred while saving the record.");

                }
            }
    }
}
