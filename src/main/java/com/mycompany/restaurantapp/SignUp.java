
package com.mycompany.restaurantapp;

import javax.swing.*;


public class SignUp extends javax.swing.JFrame {

    String phoneNumber,address,password,email,fullName;
    public SignUp() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FullNameTF = new javax.swing.JTextField();
        SignUPEmail = new javax.swing.JTextField();
        SignUpBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        SignUpPhoneNumber = new javax.swing.JTextField();
        SignUpPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SignUpAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        Right = new javax.swing.JPanel();
        Cover = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SignUP");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 1101, 800));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1100, 710));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1101, 711));
        jPanel2.setLayout(null);

        Left.setBackground(new java.awt.Color(0, 102, 102));
        Left.setForeground(new java.awt.Color(0, 0, 0));
        Left.setAutoscrolls(true);
        Left.setMaximumSize(new java.awt.Dimension(551, 711));
        Left.setMinimumSize(new java.awt.Dimension(550, 711));
        Left.setPreferredSize(new java.awt.Dimension(551, 711));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\university\\Java\\fornow\\icons\\Cover_Image.jpg")); // NOI18N
        jLabel2.setLabelFor(Right);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setMaximumSize(new java.awt.Dimension(680, 700));
        jLabel2.setMinimumSize(new java.awt.Dimension(680, 700));
        jLabel2.setPreferredSize(new java.awt.Dimension(550, 711));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SignUp!");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create Your Account");

        jLabel4.setIcon(new javax.swing.ImageIcon("F:\\university\\Java\\fornow\\icons\\logo.png")); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        FullNameTF.setBackground(new java.awt.Color(51, 51, 51));
        FullNameTF.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        FullNameTF.setForeground(new java.awt.Color(0, 153, 51));
        FullNameTF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FullNameTF.setCaretColor(new java.awt.Color(51, 204, 0));
        FullNameTF.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        FullNameTF.setPreferredSize(new java.awt.Dimension(68, 26));
        FullNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameTFActionPerformed(evt);
            }
        });

        SignUPEmail.setBackground(new java.awt.Color(51, 51, 51));
        SignUPEmail.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SignUPEmail.setForeground(new java.awt.Color(0, 153, 51));
        SignUPEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SignUPEmail.setCaretColor(new java.awt.Color(51, 204, 0));
        SignUPEmail.setPreferredSize(new java.awt.Dimension(68, 26));
        SignUPEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUPEmailActionPerformed(evt);
            }
        });

        SignUpBtn.setBackground(new java.awt.Color(51, 204, 0));
        SignUpBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SignUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignUpBtn.setText("SignUp");
        SignUpBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("F:\\university\\Java\\fornow\\icons\\copyright.png")); // NOI18N
        jLabel7.setText("All Copyright Reserved By Fares Ayman");

        SignUpPhoneNumber.setBackground(new java.awt.Color(51, 51, 51));
        SignUpPhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SignUpPhoneNumber.setForeground(new java.awt.Color(0, 153, 51));
        SignUpPhoneNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SignUpPhoneNumber.setCaretColor(new java.awt.Color(51, 204, 0));
        SignUpPhoneNumber.setPreferredSize(new java.awt.Dimension(68, 26));
        SignUpPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpPhoneNumberActionPerformed(evt);
            }
        });

        SignUpPassword.setBackground(new java.awt.Color(51, 51, 51));
        SignUpPassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SignUpPassword.setForeground(new java.awt.Color(0, 153, 51));
        SignUpPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SignUpPassword.setCaretColor(new java.awt.Color(51, 204, 0));
        SignUpPassword.setPreferredSize(new java.awt.Dimension(68, 26));
        SignUpPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpPasswordActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Full Name ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Address");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Password");

        SignUpAddress.setBackground(new java.awt.Color(51, 51, 51));
        SignUpAddress.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SignUpAddress.setForeground(new java.awt.Color(0, 153, 51));
        SignUpAddress.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SignUpAddress.setCaretColor(new java.awt.Color(51, 204, 0));
        SignUpAddress.setPreferredSize(new java.awt.Dimension(68, 26));
        SignUpAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpAddressActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Phone Number");

        BackBtn.setBackground(new java.awt.Color(51, 204, 0));
        BackBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("Back");
        BackBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(FullNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SignUPEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SignUpPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SignUpPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SignUpAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel4))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel3))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1792, 1792, 1792)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FullNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SignUPEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SignUpPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(78, 78, 78))
        );

        jPanel2.add(Left);
        Left.setBounds(570, 0, 540, 710);

        Right.setBackground(new java.awt.Color(30, 75, 67));
        Right.setMaximumSize(new java.awt.Dimension(551, 711));
        Right.setMinimumSize(new java.awt.Dimension(551, 711));
        Right.setPreferredSize(new java.awt.Dimension(550, 700));

        Cover.setIcon(new javax.swing.ImageIcon("F:\\university\\Java\\fornow\\icons\\Cover_Image.jpg")); // NOI18N
        Cover.setLabelFor(Right);
        Cover.setMaximumSize(new java.awt.Dimension(550, 700));
        Cover.setMinimumSize(new java.awt.Dimension(550, 700));
        Cover.setPreferredSize(new java.awt.Dimension(550, 700));

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Cover, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(Right);
        Right.setBounds(0, -10, 570, 710);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUPEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUPEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUPEmailActionPerformed

    private void FullNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameTFActionPerformed

    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtnActionPerformed
            fullName =  FullNameTF.getText().trim();
            email = SignUPEmail.getText().trim();
            password = SignUpPassword.getText().trim();
            address = SignUpAddress.getText().trim();
           phoneNumber = SignUpPhoneNumber.getText().trim();

           // Input Validation
           if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
               JOptionPane.showMessageDialog(this, "Invalid email format. Please enter a valid email.");
               return;
           }

           if (!fullName.matches("^[a-zA-Z\\s]+$")) {
               JOptionPane.showMessageDialog(this, "Name must contain only letters and spaces.");
               return;
           }

           if (password.isEmpty()) {
               JOptionPane.showMessageDialog(this, "Password cannot be empty.");
               return;
           }

           if (!phoneNumber.matches("^\\d{11}$")) {
               JOptionPane.showMessageDialog(this, "Phone number must contain only numbers.");
               return;
           }

           if (address.isEmpty()) {
               JOptionPane.showMessageDialog(this, "Address cannot be empty.");
               return;
           }

           // Save user data to file
           User u= new User();
           u.SignUp(fullName, email, password, address, phoneNumber);

           JOptionPane.showMessageDialog(this, "Sign Up Successful!");
           // Optionally, clear fields or navigate to another screen
    }//GEN-LAST:event_SignUpBtnActionPerformed

    private void SignUpPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpPhoneNumberActionPerformed

    private void SignUpPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpPasswordActionPerformed

    private void SignUpAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpAddressActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        Login LoginFrame= new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

   
    
    
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel Cover;
    private javax.swing.JTextField FullNameTF;
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JTextField SignUPEmail;
    private javax.swing.JTextField SignUpAddress;
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JTextField SignUpPassword;
    private javax.swing.JTextField SignUpPhoneNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
