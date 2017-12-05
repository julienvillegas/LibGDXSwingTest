package com.mygdx.game.desktop;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Created by julienvillegas on 05/12/2017.
 */

public class MainWindow extends javax.swing.JFrame {


    private JPanel topRight;
    private JPanel topLeft;
    private JPanel bottomLeft;
    private JPanel bottomRight;

    public MainWindow(){
        JLabel labelTopLeft = new JLabel("Top Left", SwingConstants.CENTER);
        JLabel labelBottomLeft = new JLabel("Bottom Left", SwingConstants.CENTER);
        JLabel labelBottomRight = new JLabel("Bottom Right", SwingConstants.CENTER);

        topLeft = new JPanel();
        topLeft.setLayout(new java.awt.BorderLayout());
        topLeft.add(labelTopLeft, java.awt.BorderLayout.CENTER);
        topLeft.setBorder(BorderFactory.createLineBorder(Color.black));


        topRight = new JPanel();
        topRight.setLayout(new java.awt.BorderLayout());
        topRight.setBorder(BorderFactory.createLineBorder(Color.black));

        bottomLeft = new JPanel();
        bottomLeft.setLayout(new java.awt.BorderLayout());
        bottomLeft.add(labelBottomLeft, java.awt.BorderLayout.CENTER);
        bottomLeft.setBorder(BorderFactory.createLineBorder(Color.black));

        bottomRight = new JPanel();
        bottomRight.setLayout(new java.awt.BorderLayout());
        bottomRight.add(labelBottomRight, java.awt.BorderLayout.CENTER);
        bottomRight.setBorder(BorderFactory.createLineBorder(Color.black));


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup().addComponent(topLeft).addComponent(bottomLeft))
                    .addGroup(layout.createParallelGroup().addComponent(topRight).addComponent(bottomRight))
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(topLeft).addComponent(topRight))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(bottomLeft).addComponent(bottomRight))
        );

        pack();
    }

    public void addLibGDXapp(Canvas libGDXAppCanvas){
        topRight.add(libGDXAppCanvas, BorderLayout.CENTER);
    }
}
