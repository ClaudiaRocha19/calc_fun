
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cmrocha
 */
public class calc extends javax.swing.JFrame {

    int num;
    Scanner sc = new Scanner(System.in);

   

    /**
     * Creates new form calc
     */
    public calc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        clc_display = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_num4 = new javax.swing.JLabel();
        btn_num1 = new javax.swing.JLabel();
        btn_num0 = new javax.swing.JLabel();
        btn_num8 = new javax.swing.JLabel();
        btn_num5 = new javax.swing.JLabel();
        btn_num2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_num9 = new javax.swing.JLabel();
        btn_num6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_num3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn_num7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(83, 87, 98));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clc_display.setBackground(new java.awt.Color(171, 179, 158));
        clc_display.setFont(new java.awt.Font("Complex", 0, 14)); // NOI18N
        clc_display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        clc_display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clc_displayActionPerformed(evt);
            }
        });
        jPanel1.add(clc_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 380, 70));

        jLabel2.setBackground(new java.awt.Color(44, 44, 46));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("π");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 70, 30));

        btn_num4.setBackground(new java.awt.Color(163, 164, 168));
        btn_num4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_num4.setForeground(new java.awt.Color(255, 255, 255));
        btn_num4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_num4.setText("4");
        btn_num4.setOpaque(true);
        btn_num4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_num4MouseClicked(evt);
            }
        });
        jPanel1.add(btn_num4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 60, 40));

        btn_num1.setBackground(new java.awt.Color(163, 164, 168));
        btn_num1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_num1.setForeground(new java.awt.Color(255, 255, 255));
        btn_num1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_num1.setText("1");
        btn_num1.setOpaque(true);
        btn_num1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_num1MouseClicked(evt);
            }
        });
        jPanel1.add(btn_num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 60, 40));

        btn_num0.setBackground(new java.awt.Color(163, 164, 168));
        btn_num0.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_num0.setForeground(new java.awt.Color(255, 255, 255));
        btn_num0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_num0.setText("0");
        btn_num0.setOpaque(true);
        btn_num0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_num0MouseClicked(evt);
            }
        });
        jPanel1.add(btn_num0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 60, 40));

        btn_num8.setBackground(new java.awt.Color(163, 164, 168));
        btn_num8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_num8.setForeground(new java.awt.Color(255, 255, 255));
        btn_num8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_num8.setText("8");
        btn_num8.setOpaque(true);
        btn_num8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_num8MouseClicked(evt);
            }
        });
        jPanel1.add(btn_num8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 60, 40));

        btn_num5.setBackground(new java.awt.Color(163, 164, 168));
        btn_num5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_num5.setForeground(new java.awt.Color(255, 255, 255));
        btn_num5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_num5.setText("5");
        btn_num5.setOpaque(true);
        btn_num5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_num5MouseClicked(evt);
            }
        });
        jPanel1.add(btn_num5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 60, 40));

        btn_num2.setBackground(new java.awt.Color(163, 164, 168));
        btn_num2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_num2.setForeground(new java.awt.Color(255, 255, 255));
        btn_num2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_num2.setText("2");
        btn_num2.setOpaque(true);
        btn_num2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_num2MouseClicked(evt);
            }
        });
        jPanel1.add(btn_num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 60, 40));

        jLabel9.setBackground(new java.awt.Color(163, 164, 168));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(".");
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 60, 40));

        btn_num9.setBackground(new java.awt.Color(163, 164, 168));
        btn_num9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_num9.setForeground(new java.awt.Color(255, 255, 255));
        btn_num9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_num9.setText("9");
        btn_num9.setOpaque(true);
        btn_num9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_num9MouseClicked(evt);
            }
        });
        jPanel1.add(btn_num9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 60, 40));

        btn_num6.setBackground(new java.awt.Color(163, 164, 168));
        btn_num6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_num6.setForeground(new java.awt.Color(255, 255, 255));
        btn_num6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_num6.setText("6");
        btn_num6.setOpaque(true);
        btn_num6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_num6MouseClicked(evt);
            }
        });
        jPanel1.add(btn_num6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 60, 40));

        jLabel12.setBackground(new java.awt.Color(163, 164, 168));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("-");
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 60, 40));

        jLabel13.setBackground(new java.awt.Color(163, 164, 168));
        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("=");
        jLabel13.setOpaque(true);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 210, 40));

        btn_num3.setBackground(new java.awt.Color(163, 164, 168));
        btn_num3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_num3.setForeground(new java.awt.Color(255, 255, 255));
        btn_num3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_num3.setText("3");
        btn_num3.setOpaque(true);
        btn_num3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_num3MouseClicked(evt);
            }
        });
        jPanel1.add(btn_num3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 60, 40));

        jLabel15.setBackground(new java.awt.Color(148, 96, 118));
        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("DEL");
        jLabel15.setOpaque(true);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 60, 40));

        jLabel16.setBackground(new java.awt.Color(148, 96, 118));
        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("AC");
        jLabel16.setOpaque(true);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 60, 40));

        jLabel17.setBackground(new java.awt.Color(163, 164, 168));
        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("x");
        jLabel17.setOpaque(true);
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 60, 40));

        jLabel18.setBackground(new java.awt.Color(163, 164, 168));
        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("/");
        jLabel18.setOpaque(true);
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 60, 40));

        jLabel19.setBackground(new java.awt.Color(163, 164, 168));
        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("+");
        jLabel19.setOpaque(true);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 60, 40));

        btn_num7.setBackground(new java.awt.Color(163, 164, 168));
        btn_num7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_num7.setForeground(new java.awt.Color(255, 255, 255));
        btn_num7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_num7.setText("7");
        btn_num7.setOpaque(true);
        btn_num7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_num7MouseClicked(evt);
            }
        });
        jPanel1.add(btn_num7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 60, 40));

        jLabel21.setBackground(new java.awt.Color(44, 44, 46));
        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Log");
        jLabel21.setOpaque(true);
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 70, 30));

        jLabel22.setBackground(new java.awt.Color(44, 44, 46));
        jLabel22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Sin-1");
        jLabel22.setOpaque(true);
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 70, 30));

        jLabel23.setBackground(new java.awt.Color(44, 44, 46));
        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("x^n");
        jLabel23.setOpaque(true);
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 70, 30));

        jLabel24.setBackground(new java.awt.Color(44, 44, 46));
        jLabel24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText(" √ ");
        jLabel24.setOpaque(true);
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 70, 30));

        jLabel25.setBackground(new java.awt.Color(44, 44, 46));
        jLabel25.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Cos-1");
        jLabel25.setOpaque(true);
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 60, 30));

        jLabel26.setBackground(new java.awt.Color(44, 44, 46));
        jLabel26.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("x!");
        jLabel26.setOpaque(true);
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 70, 30));

        jLabel27.setBackground(new java.awt.Color(44, 44, 46));
        jLabel27.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Cos");
        jLabel27.setOpaque(true);
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 70, 30));

        jLabel28.setBackground(new java.awt.Color(44, 44, 46));
        jLabel28.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Tan");
        jLabel28.setOpaque(true);
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 70, 30));

        jLabel29.setBackground(new java.awt.Color(44, 44, 46));
        jLabel29.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Ln");
        jLabel29.setOpaque(true);
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 60, 30));

        jLabel30.setBackground(new java.awt.Color(44, 44, 46));
        jLabel30.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Sin");
        jLabel30.setOpaque(true);
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 70, 30));

        jLabel31.setBackground(new java.awt.Color(44, 44, 46));
        jLabel31.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Tan-1");
        jLabel31.setOpaque(true);
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 70, 30));

        jLabel32.setBackground(new java.awt.Color(44, 44, 46));
        jLabel32.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("e");
        jLabel32.setOpaque(true);
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clc_displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clc_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clc_displayActionPerformed

    private void btn_num7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_num7MouseClicked
        if(clc_display.getText().equals("0")){
           clc_display.setText(" ");
        }
        clc_display.setText(clc_display.getText()+"7");
    }//GEN-LAST:event_btn_num7MouseClicked

    private void btn_num8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_num8MouseClicked
        if(clc_display.getText().equals("0")){
                   clc_display.setText(" ");
                }
        clc_display.setText(clc_display.getText()+"8");
    }//GEN-LAST:event_btn_num8MouseClicked

    private void btn_num9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_num9MouseClicked
        if(clc_display.getText().equals("0")){
           clc_display.setText(" ");
        }
        clc_display.setText(clc_display.getText()+"9");
    }//GEN-LAST:event_btn_num9MouseClicked

    private void btn_num4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_num4MouseClicked
        if(clc_display.getText().equals("0")){
           clc_display.setText(" ");
        }
        clc_display.setText(clc_display.getText()+"4");
    }//GEN-LAST:event_btn_num4MouseClicked

    private void btn_num5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_num5MouseClicked
        if(clc_display.getText().equals("0")){
           clc_display.setText(" ");
        }
        clc_display.setText(clc_display.getText()+"5");
    }//GEN-LAST:event_btn_num5MouseClicked

    private void btn_num6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_num6MouseClicked
        if(clc_display.getText().equals("0")){
           clc_display.setText(" ");
        }
        clc_display.setText(clc_display.getText()+"6");
    }//GEN-LAST:event_btn_num6MouseClicked

    private void btn_num1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_num1MouseClicked
        if(clc_display.getText().equals("0")){
           clc_display.setText(" ");
        }
        clc_display.setText(clc_display.getText()+"1");
    }//GEN-LAST:event_btn_num1MouseClicked

    private void btn_num2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_num2MouseClicked
        if(clc_display.getText().equals("0")){
           clc_display.setText(" ");
        }
        clc_display.setText(clc_display.getText()+"2");
    }//GEN-LAST:event_btn_num2MouseClicked

    private void btn_num3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_num3MouseClicked
        if(clc_display.getText().equals("0")){
           clc_display.setText(" ");
        }
        clc_display.setText(clc_display.getText()+"3");
    }//GEN-LAST:event_btn_num3MouseClicked

    private void btn_num0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_num0MouseClicked
        if(clc_display.getText().equals("0")){
           clc_display.setText(" ");
        }
        clc_display.setText(clc_display.getText()+"0");
    }//GEN-LAST:event_btn_num0MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_num0;
    private javax.swing.JLabel btn_num1;
    private javax.swing.JLabel btn_num2;
    private javax.swing.JLabel btn_num3;
    private javax.swing.JLabel btn_num4;
    private javax.swing.JLabel btn_num5;
    private javax.swing.JLabel btn_num6;
    private javax.swing.JLabel btn_num7;
    private javax.swing.JLabel btn_num8;
    private javax.swing.JLabel btn_num9;
    private javax.swing.JTextField clc_display;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
