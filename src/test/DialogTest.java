/*
 * @(#)DialogTest.java  1.0  August 1, 2007
 *
 * Copyright (c) 2007 Werner Randelshofer
 * Staldenmattweg 2, CH-6405 Immensee, Switzerland
 * All rights reserved.
 *
 * The copyright of this software is owned by Werner Randelshofer. 
 * You may not use, copy or modify this software, except in  
 * accordance with the license agreement you entered into with  
 * Werner Randelshofer. For details see accompanying license terms. 
 */

package test;

import java.awt.GridBagLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 * DialogTest.
 *
 * @author Werner Randelshofer
 * @version 1.0 August 1, 2007 Created.
 */
public class DialogTest extends javax.swing.JPanel {
    private JDialog modalDialog;
    private JDialog modelessDialog;
    private JFrame frame;
    
    
    /** Creates new instance. */
    public DialogTest() {
        initComponents();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {
                        try {
                            UIManager.setLookAndFeel("ch.randelshofer.quaqua.QuaquaLookAndFeel");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        JFrame f = new JFrame("Dialog Test");
                        f.getContentPane().add(new DialogTest());
                        f.pack();
                        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        f.setVisible(true);
                    }
                });
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        modalDialogButton = new javax.swing.JButton();
        openModelessDialogButton = new javax.swing.JButton();
        openFrameButton = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        modalDialogButton.setText("Open modal dialog");
        modalDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openModalDialog(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        add(modalDialogButton, gridBagConstraints);

        openModelessDialogButton.setText("Open modeless dialog");
        openModelessDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openModelessDialog(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        add(openModelessDialogButton, gridBagConstraints);

        openFrameButton.setText("Open frame");
        openFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFrame(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        add(openFrameButton, gridBagConstraints);

    }// </editor-fold>//GEN-END:initComponents

    private void openFrame(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFrame
 if (frame == null) {
            frame = new JFrame();
            frame.setTitle("Frame");
            frame.getContentPane().setLayout(new GridBagLayout());
            frame.getContentPane().add(new JTextField(9));
            JButton closeButton = new JButton("Close");
            closeButton.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent evt) {
                   frame.hide();
               } 
            });
            frame.getContentPane().add(closeButton);
            frame.getRootPane().setDefaultButton(closeButton);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.pack();
        }
        frame.setVisible(true);
    }//GEN-LAST:event_openFrame
    
    private void openModelessDialog(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openModelessDialog
        if (modelessDialog == null) {
            modelessDialog = new JDialog();
            modelessDialog.setTitle("Modeless Dialog");
            modelessDialog.getContentPane().setLayout(new GridBagLayout());
            
            modelessDialog.getContentPane().add(new JTextField(9));
            modelessDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
            JButton closeButton = new JButton("Close");
            closeButton.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent evt) {
                   modelessDialog.hide();
               } 
            });
            modelessDialog.getContentPane().add(closeButton);
            modelessDialog.getRootPane().setDefaultButton(closeButton);
            modelessDialog.pack();
            modelessDialog.setModal(false);
        }
        modelessDialog.setVisible(true);        
    }//GEN-LAST:event_openModelessDialog
    
    private void openModalDialog(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openModalDialog
        if (modalDialog == null) {
            modalDialog = new JDialog();
            modalDialog.setTitle("Modal Dialog");
            modalDialog.getContentPane().setLayout(new GridBagLayout());
            modalDialog.getContentPane().add(new JTextField(9));
            modalDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
            JButton closeButton = new JButton("Close");
            closeButton.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent evt) {
                   modalDialog.hide();
               } 
            });
            modalDialog.getContentPane().add(closeButton);
            modalDialog.getRootPane().setDefaultButton(closeButton);
            modalDialog.pack();
            modalDialog.setModal(true);
        }
        modalDialog.setVisible(true);
    }//GEN-LAST:event_openModalDialog
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton modalDialogButton;
    private javax.swing.JButton openFrameButton;
    private javax.swing.JButton openModelessDialogButton;
    // End of variables declaration//GEN-END:variables
    
}