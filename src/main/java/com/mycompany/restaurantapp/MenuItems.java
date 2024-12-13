package com.mycompany.restaurantapp;

import java.awt.TextArea;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class MenuItems extends javax.swing.JFrame {

    String newAddress1;
    Order order=new Order();
    List<Item> orderItems = new ArrayList<>();
    ArrayList<Integer> quantity = new ArrayList<>();

    public MenuItems() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn2 = new javax.swing.JButton();
        sp2 = new javax.swing.JSpinner();
        HotDogLabel = new javax.swing.JLabel();
        HotDogPriceLabel = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ShawermaLabel = new javax.swing.JLabel();
        ShawermaPriceLabel = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        sp1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn4 = new javax.swing.JButton();
        sp4 = new javax.swing.JSpinner();
        PizzaLabel = new javax.swing.JLabel();
        PizzaPriceLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn5 = new javax.swing.JButton();
        sp5 = new javax.swing.JSpinner();
        FriedChickenMealLabel = new javax.swing.JLabel();
        FriedChickenMealPriceLabel = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        sp3 = new javax.swing.JSpinner();
        ChickenBurgerLabel = new javax.swing.JLabel();
        ChickenBurgerPriceLabel = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn8 = new javax.swing.JButton();
        sp8 = new javax.swing.JSpinner();
        BeafBurgerLabel = new javax.swing.JLabel();
        BeafBurgerPriceLabel = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btn9 = new javax.swing.JButton();
        sp9 = new javax.swing.JSpinner();
        SeaFoodPastaLabel = new javax.swing.JLabel();
        SeaFoodPastaPriceLabel = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn10 = new javax.swing.JButton();
        sp10 = new javax.swing.JSpinner();
        ComboMealLabel = new javax.swing.JLabel();
        ComboMealPriceLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        sp7 = new javax.swing.JSpinner();
        ChickenPopsLabel = new javax.swing.JLabel();
        ChickenPopsPriceLabel = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btn6 = new javax.swing.JButton();
        sp6 = new javax.swing.JSpinner();
        FrenchFriesLabel = new javax.swing.JLabel();
        FrenchFriesPriceLabel = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        btn11 = new javax.swing.JButton();
        sp11 = new javax.swing.JSpinner();
        OrangeJuiceLabel = new javax.swing.JLabel();
        OrangeJuicePriceLabel = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        btn12 = new javax.swing.JButton();
        sp12 = new javax.swing.JSpinner();
        MangoJuiceLabel = new javax.swing.JLabel();
        MangoJuicePriceLabel = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        btn13 = new javax.swing.JButton();
        sp13 = new javax.swing.JSpinner();
        ColaLabel = new javax.swing.JLabel();
        ColaPriceLabel = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        btn14 = new javax.swing.JButton();
        sp14 = new javax.swing.JSpinner();
        LemonJuiceLabel = new javax.swing.JLabel();
        LemonJuicePriceLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTextArea = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ProfileLabel = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Signout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Drinks");

        jPanel2.setForeground(new java.awt.Color(255, 153, 153));
        jPanel2.setOpaque(false);

        btn2.setBackground(new java.awt.Color(102, 102, 0));
        btn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn2.setText("Add To Cart");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        sp2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sp2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        sp2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        HotDogLabel.setBackground(new java.awt.Color(255, 255, 255));
        HotDogLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        HotDogLabel.setForeground(new java.awt.Color(255, 255, 255));
        HotDogLabel.setText("Hot Dog Sandwich");
        HotDogLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ItemsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        HotDogPriceLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        HotDogPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        HotDogPriceLabel.setText("Price : 50 LE");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Hot Dog Sandwich.jpg"))); // NOI18N
        jLabel19.setText("jLabel7");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HotDogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn2)
                        .addGap(27, 27, 27)
                        .addComponent(sp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HotDogPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HotDogLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HotDogPriceLabel)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2)
                    .addComponent(sp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setOpaque(false);

        ShawermaLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        ShawermaLabel.setForeground(new java.awt.Color(255, 255, 255));
        ShawermaLabel.setText("Shawerma");
        ShawermaLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ItemsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        ShawermaPriceLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ShawermaPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        ShawermaPriceLabel.setText("Price : 70 LE");

        btn1.setBackground(new java.awt.Color(102, 102, 0));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn1.setText("Add to cart");
        btn1.setActionCommand("Add To Cart");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        sp1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sp1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        sp1.setAlignmentX(1.0F);
        sp1.setAlignmentY(1.0F);
        sp1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Shawerma.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(ShawermaPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(ShawermaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(ShawermaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ShawermaPriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(sp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setOpaque(false);

        btn4.setBackground(new java.awt.Color(102, 102, 0));
        btn4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn4.setText("Add to cart");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        sp4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sp4.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        sp4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PizzaLabel.setBackground(new java.awt.Color(255, 255, 255));
        PizzaLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        PizzaLabel.setForeground(new java.awt.Color(255, 255, 255));
        PizzaLabel.setText("Pizza");
        PizzaLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ItemsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        PizzaPriceLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        PizzaPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        PizzaPriceLabel.setText("Price : 50 LE");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Chicken Pops.jpg"))); // NOI18N
        jLabel24.setText("jLabel7");

        jPanel7.setOpaque(false);

        btn5.setBackground(new java.awt.Color(102, 102, 0));
        btn5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn5.setText("Add to cart");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        sp5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sp5.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        sp5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        FriedChickenMealLabel.setBackground(new java.awt.Color(255, 255, 255));
        FriedChickenMealLabel.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        FriedChickenMealLabel.setForeground(new java.awt.Color(255, 255, 255));
        FriedChickenMealLabel.setText("Fried Chicken Meal");
        FriedChickenMealLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ItemsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        FriedChickenMealPriceLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        FriedChickenMealPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        FriedChickenMealPriceLabel.setText("Price : 50 LE");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Fried Chicken Meal.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn5)
                .addGap(18, 18, 18)
                .addComponent(sp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FriedChickenMealPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(FriedChickenMealLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(FriedChickenMealLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FriedChickenMealPriceLabel)
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5)
                    .addComponent(sp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(sp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(PizzaLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(PizzaPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(39, 39, 39)))))
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PizzaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PizzaPriceLabel)
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4)
                    .addComponent(sp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setOpaque(false);

        btn3.setBackground(new java.awt.Color(102, 102, 0));
        btn3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn3.setText("Add to cart");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        sp3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sp3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        sp3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ChickenBurgerLabel.setBackground(new java.awt.Color(255, 255, 255));
        ChickenBurgerLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        ChickenBurgerLabel.setForeground(new java.awt.Color(255, 255, 255));
        ChickenBurgerLabel.setText("Chicken Burger");
        ChickenBurgerLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ItemsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        ChickenBurgerPriceLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ChickenBurgerPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        ChickenBurgerPriceLabel.setText("Price : 50 LE");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Chicken Burger.jpg"))); // NOI18N
        jLabel18.setText("jLabel7");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(ChickenBurgerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChickenBurgerPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(ChickenBurgerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChickenBurgerPriceLabel)
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3)
                    .addComponent(sp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setOpaque(false);

        btn8.setBackground(new java.awt.Color(102, 102, 0));
        btn8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn8.setText("Add to cart");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        sp8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sp8.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        sp8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BeafBurgerLabel.setBackground(new java.awt.Color(255, 255, 255));
        BeafBurgerLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        BeafBurgerLabel.setForeground(new java.awt.Color(255, 255, 255));
        BeafBurgerLabel.setText("Beaf Burger");
        BeafBurgerLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ItemsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        BeafBurgerPriceLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BeafBurgerPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        BeafBurgerPriceLabel.setText("Price : 50 LE");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Beaf Burger.jpg"))); // NOI18N
        jLabel27.setText("jLabel7");

        jPanel9.setOpaque(false);

        btn9.setBackground(new java.awt.Color(102, 102, 0));
        btn9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn9.setText("Add to cart");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        sp9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sp9.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        sp9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SeaFoodPastaLabel.setBackground(new java.awt.Color(255, 255, 255));
        SeaFoodPastaLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        SeaFoodPastaLabel.setForeground(new java.awt.Color(255, 255, 255));
        SeaFoodPastaLabel.setText("Sea Food Pasta");
        SeaFoodPastaLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ItemsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        SeaFoodPastaPriceLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        SeaFoodPastaPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        SeaFoodPastaPriceLabel.setText("Price : 50 LE");

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Sea Food Pasta.jpg"))); // NOI18N
        jLabel30.setText("jLabel7");

        jPanel6.setOpaque(false);

        btn10.setBackground(new java.awt.Color(102, 102, 0));
        btn10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn10.setText("Add to cart");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        sp10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sp10.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        sp10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ComboMealLabel.setBackground(new java.awt.Color(255, 255, 255));
        ComboMealLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        ComboMealLabel.setForeground(new java.awt.Color(255, 255, 255));
        ComboMealLabel.setText(" Combo Meal");
        ComboMealLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ItemsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        ComboMealPriceLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ComboMealPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        ComboMealPriceLabel.setText("Price : 50 LE");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Combo Meal.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(sp10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ComboMealPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ComboMealLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(ComboMealLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(ComboMealPriceLabel)
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn10)
                    .addComponent(sp10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SeaFoodPastaPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn9)
                        .addGap(18, 18, 18)
                        .addComponent(sp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SeaFoodPastaLabel))))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SeaFoodPastaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeaFoodPastaPriceLabel)
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn9)
                    .addComponent(sp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(sp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BeafBurgerPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BeafBurgerLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BeafBurgerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BeafBurgerPriceLabel)
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn8)
                    .addComponent(sp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.setOpaque(false);

        btn7.setBackground(new java.awt.Color(102, 102, 0));
        btn7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn7.setText("Add to cart");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        sp7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sp7.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        sp7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ChickenPopsLabel.setBackground(new java.awt.Color(255, 255, 255));
        ChickenPopsLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        ChickenPopsLabel.setForeground(new java.awt.Color(255, 255, 255));
        ChickenPopsLabel.setText("Chicken Pops");
        ChickenPopsLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ItemsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        ChickenPopsPriceLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ChickenPopsPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        ChickenPopsPriceLabel.setText("Price : 50 LE");

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Chicken Pops.jpg"))); // NOI18N
        jLabel33.setText("jLabel7");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ChickenPopsPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ChickenPopsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ChickenPopsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChickenPopsPriceLabel)
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7)
                    .addComponent(sp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel11.setOpaque(false);

        btn6.setBackground(new java.awt.Color(102, 102, 0));
        btn6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn6.setText("Add to cart");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        sp6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sp6.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        sp6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        FrenchFriesLabel.setBackground(new java.awt.Color(255, 255, 255));
        FrenchFriesLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        FrenchFriesLabel.setForeground(new java.awt.Color(255, 255, 255));
        FrenchFriesLabel.setText("French Fries");
        FrenchFriesLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ItemsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        FrenchFriesPriceLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        FrenchFriesPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        FrenchFriesPriceLabel.setText("Price : 50 LE");

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/French Fries.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FrenchFriesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(sp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FrenchFriesPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(11, 11, 11)))
                .addGap(58, 58, 58))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FrenchFriesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FrenchFriesPriceLabel)
                .addGap(12, 12, 12)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6)
                    .addComponent(sp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Main Dishs");

        jPanel16.setOpaque(false);

        btn11.setBackground(new java.awt.Color(102, 102, 0));
        btn11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn11.setText("Add to cart");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        sp11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sp11.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        sp11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        OrangeJuiceLabel.setBackground(new java.awt.Color(255, 255, 255));
        OrangeJuiceLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        OrangeJuiceLabel.setForeground(new java.awt.Color(255, 255, 255));
        OrangeJuiceLabel.setText("Orange Juice");
        OrangeJuiceLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ItemsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        OrangeJuicePriceLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        OrangeJuicePriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        OrangeJuicePriceLabel.setText("Price : 50 LE");

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Orange Juice.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sp11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OrangeJuiceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OrangeJuicePriceLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OrangeJuiceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrangeJuicePriceLabel)
                .addGap(12, 12, 12)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn11)
                    .addComponent(sp11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel15.setOpaque(false);

        btn12.setBackground(new java.awt.Color(102, 102, 0));
        btn12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn12.setText("Add to cart");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        sp12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sp12.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        sp12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        MangoJuiceLabel.setBackground(new java.awt.Color(255, 255, 255));
        MangoJuiceLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        MangoJuiceLabel.setForeground(new java.awt.Color(255, 255, 255));
        MangoJuiceLabel.setText("Mango Juice");
        MangoJuiceLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ItemsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        MangoJuicePriceLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        MangoJuicePriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        MangoJuicePriceLabel.setText("Price : 50 LE");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Mango Juice.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sp12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MangoJuiceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MangoJuicePriceLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel48)
                .addGap(53, 53, 53))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MangoJuiceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(MangoJuicePriceLabel)
                .addGap(12, 12, 12)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn12)
                    .addComponent(sp12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel14.setOpaque(false);

        btn13.setBackground(new java.awt.Color(102, 102, 0));
        btn13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn13.setText("Add to cart");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        sp13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sp13.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        sp13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ColaLabel.setBackground(new java.awt.Color(255, 255, 255));
        ColaLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        ColaLabel.setForeground(new java.awt.Color(255, 255, 255));
        ColaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ColaLabel.setText("Cola");
        ColaLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ItemsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        ColaPriceLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ColaPriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        ColaPriceLabel.setText("Price : 50 LE");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Cola.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btn13)
                .addGap(18, 18, 18)
                .addComponent(sp13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(ColaPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(ColaLabel))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ColaLabel)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ColaPriceLabel)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn13)
                    .addComponent(sp13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jPanel13.setOpaque(false);

        btn14.setBackground(new java.awt.Color(102, 102, 0));
        btn14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn14.setText("Add to cart");
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        sp14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sp14.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        sp14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sp14.setMaximumSize(new java.awt.Dimension(100, 100));
        sp14.setMinimumSize(new java.awt.Dimension(1, 1));

        LemonJuiceLabel.setBackground(new java.awt.Color(255, 255, 255));
        LemonJuiceLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LemonJuiceLabel.setForeground(new java.awt.Color(255, 255, 255));
        LemonJuiceLabel.setText("Lemon Juice");
        LemonJuiceLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ItemsAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        LemonJuicePriceLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        LemonJuicePriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        LemonJuicePriceLabel.setText("Price : 50 LE");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Lemon Juice.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn14)
                .addGap(18, 18, 18)
                .addComponent(sp14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LemonJuiceLabel)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LemonJuicePriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LemonJuiceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LemonJuicePriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn14)
                    .addComponent(sp14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        orderTextArea.setBackground(new java.awt.Color(51, 51, 51));
        orderTextArea.setColumns(20);
        orderTextArea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        orderTextArea.setForeground(new java.awt.Color(255, 255, 255));
        orderTextArea.setRows(5);
        orderTextArea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        orderTextArea.setCaretColor(new java.awt.Color(51, 51, 51));
        orderTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(orderTextArea);

        jButton2.setBackground(new java.awt.Color(153, 51, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Place Your Order");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ProfileLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user1.png"))); // NOI18N
        ProfileLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ProfileLabelAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 51, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Reset");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Signout.setBackground(new java.awt.Color(153, 51, 0));
        Signout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Signout.setForeground(new java.awt.Color(255, 255, 255));
        Signout.setText("Sign Out");
        Signout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(527, 527, 527)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProfileLabel)
                .addGap(42, 42, 42)
                .addComponent(jLabel10)
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Signout, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(536, 536, 536)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(Signout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ProfileLabel)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemsAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ItemsAncestorAdded
        // TODO add your handling code here:
        try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] itemDetails = line.split(",");
                switch (Integer.parseInt(itemDetails[0])) {
                    case 1:
                        ShawermaLabel.setText(itemDetails[1]);
                        ShawermaPriceLabel.setText(itemDetails[2]+itemDetails[3]+itemDetails[4]);
                    case 2:
                        HotDogLabel.setText(itemDetails[1]);
                        HotDogPriceLabel.setText(itemDetails[2]+itemDetails[3]+itemDetails[4]);
                        break;
                    case 3:
                        ChickenBurgerLabel.setText(itemDetails[1]);
                        ChickenBurgerPriceLabel.setText(itemDetails[2]+itemDetails[3]+itemDetails[4]);
                        break;
                    case 4:
                        PizzaLabel.setText(itemDetails[1]);
                        PizzaPriceLabel.setText(itemDetails[2]+itemDetails[3]+itemDetails[4]);
                        break;
                    case 5:
                        FriedChickenMealLabel.setText(itemDetails[1]);
                        FriedChickenMealPriceLabel.setText(itemDetails[2]+itemDetails[3]+itemDetails[4]);
                        break;
                    case 6:
                        FrenchFriesLabel.setText(itemDetails[1]);
                        FrenchFriesPriceLabel.setText(itemDetails[2]+itemDetails[3]+itemDetails[4]);
                        break;
                    case 7:
                        ChickenPopsLabel.setText(itemDetails[1]);
                        ChickenPopsPriceLabel.setText(itemDetails[2]+itemDetails[3]+itemDetails[4]);
                        break;
                    case 8:
                        BeafBurgerLabel.setText(itemDetails[1]);
                        BeafBurgerPriceLabel.setText(itemDetails[2]+itemDetails[3]+itemDetails[4]);
                        break;
                    case 9:
                        SeaFoodPastaLabel.setText(itemDetails[1]);
                        SeaFoodPastaPriceLabel.setText(itemDetails[2]+itemDetails[3]+itemDetails[4]);
                        break;
                    case 10:
                        ComboMealLabel.setText(itemDetails[1]);
                        ComboMealPriceLabel.setText(itemDetails[2]+itemDetails[3]+itemDetails[4]);
                        break;
                    case 11:
                        OrangeJuiceLabel.setText(itemDetails[1]);
                        OrangeJuicePriceLabel.setText(itemDetails[2]+itemDetails[3]+itemDetails[4]);
                        break;
                    case 12:
                        MangoJuiceLabel.setText(itemDetails[1]);
                        MangoJuicePriceLabel.setText(itemDetails[2]+itemDetails[3]+itemDetails[4]);
                        break;
                    case 13:
                        ColaLabel.setText(itemDetails[1]);
                        ColaPriceLabel.setText(itemDetails[2]+itemDetails[3]+itemDetails[4]);
                        break;
                    case 14:
                        LemonJuiceLabel.setText(itemDetails[1]);
                        LemonJuicePriceLabel.setText(itemDetails[2]+itemDetails[3]+itemDetails[4]);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ItemsAncestorAdded

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
       if (evt.getSource() == btn1) {
            try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
                String line;
                boolean itemFound = false;

                while ((line = reader.readLine()) != null) {
                    String[] itemDetails = line.split(",");
                    if (itemDetails.length < 6) {
                        continue; // Skip invalid lines
                    }

                    if (Integer.parseInt(itemDetails[0]) == 1) {
                        itemFound = true;

                        // Create a new item from the menu
                        Item item = new Item(
                                Integer.parseInt(itemDetails[0]),
                                itemDetails[1],
                                Double.parseDouble(itemDetails[3]),
                                itemDetails[5]
                        );

                        // Get the quantity from the spinner
                        int quantityToAdd = (int) sp1.getValue();

                        // Check if the item is already in the order
                        boolean itemExists = false;
                        for (int i = 0; i < orderItems.size(); i++) {
                            if (orderItems.get(i).getItemID() == item.getItemID()) {
                                // Item exists, update its quantity
                                quantity.set(i, (int) quantity.get(i) + quantityToAdd);
                                itemExists = true;
                                break;
                            }
                        }

                        if (!itemExists) {
                            // Item does not exist, add it to the lists
                            orderItems.add(item);
                            order.addItemToOrder(item);
                            quantity.add(quantityToAdd);
                        }

                        // Update the order summary display
                        StringBuilder displayText = new StringBuilder();
                        for (int i = 0; i < orderItems.size(); i++) {
                            displayText.append(orderItems.get(i).getName())
                                    .append(" x")
                                    .append(quantity.get(i))
                                    .append("\n");
                        }
                        orderTextArea.setText(displayText.toString());

                        break; // Exit the loop after processing the item
                    }
                }

                if (!itemFound) {
                    JOptionPane.showMessageDialog(null, "Item ID 1 not found in menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid format in menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else if (evt.getSource() == btn2) {
            try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
                String line;
                boolean itemFound = false;

                while ((line = reader.readLine()) != null) {
                    String[] itemDetails = line.split(",");
                    if (itemDetails.length < 6) {
                        continue; // Skip invalid lines
                    }

                    if (Integer.parseInt(itemDetails[0]) == 2) {
                        itemFound = true;

                        // Create a new item from the menu
                        Item item = new Item(
                                Integer.parseInt(itemDetails[0]),
                                itemDetails[1],
                                Double.parseDouble(itemDetails[3]),
                                itemDetails[5]
                        );

                        // Get the quantity from the spinner
                        int quantityToAdd = (int) sp2.getValue();

                        // Check if the item is already in the order
                        boolean itemExists = false;
                        for (int i = 0; i < orderItems.size(); i++) {
                            if (orderItems.get(i).getItemID() == item.getItemID()) {
                                // Item exists, update its quantity
                                quantity.set(i, (int) quantity.get(i) + quantityToAdd);
                                itemExists = true;
                                break;
                            }
                        }

                        if (!itemExists) {
                            // Item does not exist, add it to the lists
                            orderItems.add(item);
                            order.addItemToOrder(item);
                            quantity.add(quantityToAdd);
                        }

                        // Update the order summary display
                        StringBuilder displayText = new StringBuilder();
                        for (int i = 0; i < orderItems.size(); i++) {
                            displayText.append(orderItems.get(i).getName())
                                    .append(" x")
                                    .append(quantity.get(i))
                                    .append("\n");
                        }
                        orderTextArea.setText(displayText.toString());

                        break; // Exit the loop after processing the item
                    }
                }

                if (!itemFound) {
                    JOptionPane.showMessageDialog(null, "Item ID 2 not found in menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid format in menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else if (evt.getSource() == btn3) {
            try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
                String line;
                boolean itemFound = false;

                while ((line = reader.readLine()) != null) {
                    String[] itemDetails = line.split(",");
                    if (itemDetails.length < 6) {
                        continue; // Skip invalid lines
                    }

                    if (Integer.parseInt(itemDetails[0]) == 3) {
                        itemFound = true;

                        // Create a new item from the menu
                        Item item = new Item(
                                Integer.parseInt(itemDetails[0]),
                                itemDetails[1],
                                Double.parseDouble(itemDetails[3]),
                                itemDetails[5]
                        );

                        // Get the quantity from the spinner
                        int quantityToAdd = (int) sp3.getValue();

                        // Check if the item is already in the order
                        boolean itemExists = false;
                        for (int i = 0; i < orderItems.size(); i++) {
                            if (orderItems.get(i).getItemID() == item.getItemID()) {
                                // Item exists, update its quantity
                                quantity.set(i, (int) quantity.get(i) + quantityToAdd);
                                itemExists = true;
                                break;
                            }
                        }

                        if (!itemExists) {
                            // Item does not exist, add it to the lists
                            orderItems.add(item);
                            order.addItemToOrder(item);
                            quantity.add(quantityToAdd);
                        }

                        // Update the order summary display
                        StringBuilder displayText = new StringBuilder();
                        for (int i = 0; i < orderItems.size(); i++) {
                            displayText.append(orderItems.get(i).getName())
                                    .append(" x")
                                    .append(quantity.get(i))
                                    .append("\n");
                        }
                        orderTextArea.setText(displayText.toString());

                        break; // Exit the loop after processing the item
                    }
                }

                if (!itemFound) {
                    JOptionPane.showMessageDialog(null, "Item ID 3 not found in menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid format in menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else if (evt.getSource() == btn4) {
            try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
                String line;
                boolean itemFound = false;

                while ((line = reader.readLine()) != null) {
                    String[] itemDetails = line.split(",");
                    if (itemDetails.length < 6) {
                        continue; // Skip invalid lines
                    }

                    if (Integer.parseInt(itemDetails[0]) == 4) {
                        itemFound = true;

                        // Create a new item from the menu
                        Item item = new Item(
                                Integer.parseInt(itemDetails[0]),
                                itemDetails[1],
                                Double.parseDouble(itemDetails[3]),
                                itemDetails[5]
                        );

                        // Get the quantity from the spinner
                        int quantityToAdd = (int) sp4.getValue();

                        // Check if the item is already in the order
                        boolean itemExists = false;
                        for (int i = 0; i < orderItems.size(); i++) {
                            if (orderItems.get(i).getItemID() == item.getItemID()) {
                                // Item exists, update its quantity
                                quantity.set(i, (int) quantity.get(i) + quantityToAdd);
                                itemExists = true;
                                break;
                            }
                        }

                        if (!itemExists) {
                            // Item does not exist, add it to the lists
                            orderItems.add(item);
                            order.addItemToOrder(item);
                            quantity.add(quantityToAdd);
                        }

                        // Update the order summary display
                        StringBuilder displayText = new StringBuilder();
                        for (int i = 0; i < orderItems.size(); i++) {
                            displayText.append(orderItems.get(i).getName())
                                    .append(" x")
                                    .append(quantity.get(i))
                                    .append("\n");
                        }
                        orderTextArea.setText(displayText.toString());

                        break; // Exit the loop after processing the item
                    }
                }

                if (!itemFound) {
                    JOptionPane.showMessageDialog(null, "Item ID 4 not found in menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid format in menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else if (evt.getSource() == btn5) {
            try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
                String line;
                boolean itemFound = false;

                while ((line = reader.readLine()) != null) {
                    String[] itemDetails = line.split(",");
                    if (itemDetails.length < 6) {
                        continue; // Skip invalid lines
                    }

                    if (Integer.parseInt(itemDetails[0]) == 5) {
                        itemFound = true;

                        // Create a new item from the menu
                        Item item = new Item(
                                Integer.parseInt(itemDetails[0]),
                                itemDetails[1],
                                Double.parseDouble(itemDetails[3]),
                                itemDetails[5]
                        );

                        // Get the quantity from the spinner
                        int quantityToAdd = (int) sp5.getValue();

                        // Check if the item is already in the order
                        boolean itemExists = false;
                        for (int i = 0; i < orderItems.size(); i++) {
                            if (orderItems.get(i).getItemID() == item.getItemID()) {
                                // Item exists, update its quantity
                                quantity.set(i, (int) quantity.get(i) + quantityToAdd);
                                itemExists = true;
                                break;
                            }
                        }

                        if (!itemExists) {
                            // Item does not exist, add it to the lists
                            orderItems.add(item);
                            order.addItemToOrder(item);
                            quantity.add(quantityToAdd);
                        }

                        // Update the order summary display
                        StringBuilder displayText = new StringBuilder();
                        for (int i = 0; i < orderItems.size(); i++) {
                            displayText.append(orderItems.get(i).getName())
                                    .append(" x")
                                    .append(quantity.get(i))
                                    .append("\n");
                        }
                        orderTextArea.setText(displayText.toString());

                        break; // Exit the loop after processing the item
                    }
                }

                if (!itemFound) {
                    JOptionPane.showMessageDialog(null, "Item ID 5 not found in menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid format in menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else if (evt.getSource() == btn6) {
            try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
                String line;
                boolean itemFound = false;

                while ((line = reader.readLine()) != null) {
                    String[] itemDetails = line.split(",");
                    if (itemDetails.length < 6) {
                        continue; // Skip invalid lines
                    }

                    if (Integer.parseInt(itemDetails[0]) == 6) {
                        itemFound = true;

                        // Create a new item from the menu
                        Item item = new Item(
                                Integer.parseInt(itemDetails[0]),
                                itemDetails[1],
                                Double.parseDouble(itemDetails[3]),
                                itemDetails[5]
                        );

                        // Get the quantity from the spinner
                        int quantityToAdd = (int) sp6.getValue();

                        // Check if the item is already in the order
                        boolean itemExists = false;
                        for (int i = 0; i < orderItems.size(); i++) {
                            if (orderItems.get(i).getItemID() == item.getItemID()) {
                                // Item exists, update its quantity
                                quantity.set(i, (int) quantity.get(i) + quantityToAdd);
                                itemExists = true;
                                break;
                            }
                        }

                        if (!itemExists) {
                            // Item does not exist, add it to the lists
                            orderItems.add(item);
                            order.addItemToOrder(item);
                            quantity.add(quantityToAdd);
                        }

                        // Update the order summary display
                        StringBuilder displayText = new StringBuilder();
                        for (int i = 0; i < orderItems.size(); i++) {
                            displayText.append(orderItems.get(i).getName())
                                    .append(" x")
                                    .append(quantity.get(i))
                                    .append("\n");
                        }
                        orderTextArea.setText(displayText.toString());

                        break; // Exit the loop after processing the item
                    }
                }

                if (!itemFound) {
                    JOptionPane.showMessageDialog(null, "Item ID 6 not found in menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid format in menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else if (evt.getSource() == btn7) {
            try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
                String line;
                boolean itemFound = false;

                while ((line = reader.readLine()) != null) {
                    String[] itemDetails = line.split(",");
                    if (itemDetails.length < 6) {
                        continue; // Skip invalid lines
                    }

                    if (Integer.parseInt(itemDetails[0]) == 7) {
                        itemFound = true;

                        // Create a new item from the menu
                        Item item = new Item(
                                Integer.parseInt(itemDetails[0]),
                                itemDetails[1],
                                Double.parseDouble(itemDetails[3]),
                                itemDetails[5]
                        );

                        // Get the quantity from the spinner
                        int quantityToAdd = (int) sp7.getValue();

                        // Check if the item is already in the order
                        boolean itemExists = false;
                        for (int i = 0; i < orderItems.size(); i++) {
                            if (orderItems.get(i).getItemID() == item.getItemID()) {
                                // Item exists, update its quantity
                                quantity.set(i, (int) quantity.get(i) + quantityToAdd);
                                itemExists = true;
                                break;
                            }
                        }

                        if (!itemExists) {
                            // Item does not exist, add it to the lists
                            orderItems.add(item);
                            order.addItemToOrder(item);
                            quantity.add(quantityToAdd);
                        }

                        // Update the order summary display
                        StringBuilder displayText = new StringBuilder();
                        for (int i = 0; i < orderItems.size(); i++) {
                            displayText.append(orderItems.get(i).getName())
                                    .append(" x")
                                    .append(quantity.get(i))
                                    .append("\n");
                        }
                        orderTextArea.setText(displayText.toString());

                        break; // Exit the loop after processing the item
                    }
                }

                if (!itemFound) {
                    JOptionPane.showMessageDialog(null, "Item ID 7 not found in menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid format in menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else if (evt.getSource() == btn8) {
            try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
                String line;
                boolean itemFound = false;

                while ((line = reader.readLine()) != null) {
                    String[] itemDetails = line.split(",");
                    if (itemDetails.length < 6) {
                        continue; // Skip invalid lines
                    }

                    if (Integer.parseInt(itemDetails[0]) == 8) {
                        itemFound = true;

                        // Create a new item from the menu
                        Item item = new Item(
                                Integer.parseInt(itemDetails[0]),
                                itemDetails[1],
                                Double.parseDouble(itemDetails[3]),
                                itemDetails[5]
                        );

                        // Get the quantity from the spinner
                        int quantityToAdd = (int) sp8.getValue();

                        // Check if the item is already in the order
                        boolean itemExists = false;
                        for (int i = 0; i < orderItems.size(); i++) {
                            if (orderItems.get(i).getItemID() == item.getItemID()) {
                                // Item exists, update its quantity
                                quantity.set(i, (int) quantity.get(i) + quantityToAdd);
                                itemExists = true;
                                break;
                            }
                        }

                        if (!itemExists) {
                            // Item does not exist, add it to the lists
                            orderItems.add(item);
                            order.addItemToOrder(item);
                            quantity.add(quantityToAdd);
                        }

                        // Update the order summary display
                        StringBuilder displayText = new StringBuilder();
                        for (int i = 0; i < orderItems.size(); i++) {
                            displayText.append(orderItems.get(i).getName())
                                    .append(" x")
                                    .append(quantity.get(i))
                                    .append("\n");
                        }
                        orderTextArea.setText(displayText.toString());

                        break; // Exit the loop after processing the item
                    }
                }

                if (!itemFound) {
                    JOptionPane.showMessageDialog(null, "Item ID 8 not found in menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid format in menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else if (evt.getSource() == btn9) {
            try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
                String line;
                boolean itemFound = false;

                while ((line = reader.readLine()) != null) {
                    String[] itemDetails = line.split(",");
                    if (itemDetails.length < 6) {
                        continue; // Skip invalid lines
                    }

                    if (Integer.parseInt(itemDetails[0]) == 9) {
                        itemFound = true;

                        // Create a new item from the menu
                        Item item = new Item(
                                Integer.parseInt(itemDetails[0]),
                                itemDetails[1],
                                Double.parseDouble(itemDetails[3]),
                                itemDetails[5]
                        );

                        // Get the quantity from the spinner
                        int quantityToAdd = (int) sp9.getValue();

                        // Check if the item is already in the order
                        boolean itemExists = false;
                        for (int i = 0; i < orderItems.size(); i++) {
                            if (orderItems.get(i).getItemID() == item.getItemID()) {
                                // Item exists, update its quantity
                                quantity.set(i, (int) quantity.get(i) + quantityToAdd);
                                itemExists = true;
                                break;
                            }
                        }

                        if (!itemExists) {
                            // Item does not exist, add it to the lists
                            orderItems.add(item);
                            order.addItemToOrder(item);
                            quantity.add(quantityToAdd);
                        }

                        // Update the order summary display
                        StringBuilder displayText = new StringBuilder();
                        for (int i = 0; i < orderItems.size(); i++) {
                            displayText.append(orderItems.get(i).getName())
                                    .append(" x")
                                    .append(quantity.get(i))
                                    .append("\n");
                        }
                        orderTextArea.setText(displayText.toString());

                        break; // Exit the loop after processing the item
                    }
                }

                if (!itemFound) {
                    JOptionPane.showMessageDialog(null, "Item ID 9 not found in menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid format in menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else if (evt.getSource() == btn10) {
            try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
                String line;
                boolean itemFound = false;

                while ((line = reader.readLine()) != null) {
                    String[] itemDetails = line.split(",");
                    if (itemDetails.length < 6) {
                        continue; // Skip invalid lines
                    }

                    if (Integer.parseInt(itemDetails[0]) == 10) {
                        itemFound = true;

                        // Create a new item from the menu
                        Item item = new Item(
                                Integer.parseInt(itemDetails[0]),
                                itemDetails[1],
                                Double.parseDouble(itemDetails[3]),
                                itemDetails[5]
                        );

                        // Get the quantity from the spinner
                        int quantityToAdd = (int) sp10.getValue();

                        // Check if the item is already in the order
                        boolean itemExists = false;
                        for (int i = 0; i < orderItems.size(); i++) {
                            if (orderItems.get(i).getItemID() == item.getItemID()) {
                                // Item exists, update its quantity
                                quantity.set(i, (int) quantity.get(i) + quantityToAdd);
                                itemExists = true;
                                break;
                            }
                        }

                        if (!itemExists) {
                            // Item does not exist, add it to the lists
                            orderItems.add(item);
                            order.addItemToOrder(item);
                            quantity.add(quantityToAdd);
                        }

                        // Update the order summary display
                        StringBuilder displayText = new StringBuilder();
                        for (int i = 0; i < orderItems.size(); i++) {
                            displayText.append(orderItems.get(i).getName())
                                    .append(" x")
                                    .append(quantity.get(i))
                                    .append("\n");
                        }
                        orderTextArea.setText(displayText.toString());

                        break; // Exit the loop after processing the item
                    }
                }

                if (!itemFound) {
                    JOptionPane.showMessageDialog(null, "Item ID 10 not found in menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid format in menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else if (evt.getSource() == btn11) {
            try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
                String line;
                boolean itemFound = false;

                while ((line = reader.readLine()) != null) {
                    String[] itemDetails = line.split(",");
                    if (itemDetails.length < 6) {
                        continue; // Skip invalid lines
                    }

                    if (Integer.parseInt(itemDetails[0]) == 11) {
                        itemFound = true;

                        // Create a new item from the menu
                        Item item = new Item(
                                Integer.parseInt(itemDetails[0]),
                                itemDetails[1],
                                Double.parseDouble(itemDetails[3]),
                                itemDetails[5]
                        );

                        // Get the quantity from the spinner
                        int quantityToAdd = (int) sp11.getValue();

                        // Check if the item is already in the order
                        boolean itemExists = false;
                        for (int i = 0; i < orderItems.size(); i++) {
                            if (orderItems.get(i).getItemID() == item.getItemID()) {
                                // Item exists, update its quantity
                                quantity.set(i, (int) quantity.get(i) + quantityToAdd);
                                itemExists = true;
                                break;
                            }
                        }

                        if (!itemExists) {
                            // Item does not exist, add it to the lists
                            orderItems.add(item);
                            order.addItemToOrder(item);
                            quantity.add(quantityToAdd);
                        }

                        // Update the order summary display
                        StringBuilder displayText = new StringBuilder();
                        for (int i = 0; i < orderItems.size(); i++) {
                            displayText.append(orderItems.get(i).getName())
                                    .append(" x")
                                    .append(quantity.get(i))
                                    .append("\n");
                        }
                        orderTextArea.setText(displayText.toString());

                        break; // Exit the loop after processing the item
                    }
                }

                if (!itemFound) {
                    JOptionPane.showMessageDialog(null, "Item ID 11 not found in menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid format in menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else if (evt.getSource() == btn12) {
            try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
                String line;
                boolean itemFound = false;

                while ((line = reader.readLine()) != null) {
                    String[] itemDetails = line.split(",");
                    if (itemDetails.length < 6) {
                        continue; // Skip invalid lines
                    }

                    if (Integer.parseInt(itemDetails[0]) == 12) {
                        itemFound = true;

                        // Create a new item from the menu
                        Item item = new Item(
                                Integer.parseInt(itemDetails[0]),
                                itemDetails[1],
                                Double.parseDouble(itemDetails[3]),
                                itemDetails[5]
                        );

                        // Get the quantity from the spinner
                        int quantityToAdd = (int) sp12.getValue();

                        // Check if the item is already in the order
                        boolean itemExists = false;
                        for (int i = 0; i < orderItems.size(); i++) {
                            if (orderItems.get(i).getItemID() == item.getItemID()) {
                                // Item exists, update its quantity
                                quantity.set(i, (int) quantity.get(i) + quantityToAdd);
                                itemExists = true;
                                break;
                            }
                        }

                        if (!itemExists) {
                            // Item does not exist, add it to the lists
                            orderItems.add(item);
                            order.addItemToOrder(item);
                            quantity.add(quantityToAdd);
                        }

                        // Update the order summary display
                        StringBuilder displayText = new StringBuilder();
                        for (int i = 0; i < orderItems.size(); i++) {
                            displayText.append(orderItems.get(i).getName())
                                    .append(" x")
                                    .append(quantity.get(i))
                                    .append("\n");
                        }
                        orderTextArea.setText(displayText.toString());

                        break; // Exit the loop after processing the item
                    }
                }

                if (!itemFound) {
                    JOptionPane.showMessageDialog(null, "Item ID 12 not found in menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid format in menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else if (evt.getSource() == btn13) {
            try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
                String line;
                boolean itemFound = false;

                while ((line = reader.readLine()) != null) {
                    String[] itemDetails = line.split(",");
                    if (itemDetails.length < 6) {
                        continue; // Skip invalid lines
                    }

                    if (Integer.parseInt(itemDetails[0]) == 13) {
                        itemFound = true;

                        // Create a new item from the menu
                        Item item = new Item(
                                Integer.parseInt(itemDetails[0]),
                                itemDetails[1],
                                Double.parseDouble(itemDetails[3]),
                                itemDetails[5]
                        );

                        // Get the quantity from the spinner
                        int quantityToAdd = (int) sp13.getValue();

                        // Check if the item is already in the order
                        boolean itemExists = false;
                        for (int i = 0; i < orderItems.size(); i++) {
                            if (orderItems.get(i).getItemID() == item.getItemID()) {
                                // Item exists, update its quantity
                                quantity.set(i, (int) quantity.get(i) + quantityToAdd);
                                itemExists = true;
                                break;
                            }
                        }

                        if (!itemExists) {
                            // Item does not exist, add it to the lists
                            orderItems.add(item);
                            order.addItemToOrder(item);
                            quantity.add(quantityToAdd);
                        }

                        // Update the order summary display
                        StringBuilder displayText = new StringBuilder();
                        for (int i = 0; i < orderItems.size(); i++) {
                            displayText.append(orderItems.get(i).getName())
                                    .append(" x")
                                    .append(quantity.get(i))
                                    .append("\n");
                        }
                        orderTextArea.setText(displayText.toString());

                        break; // Exit the loop after processing the item
                    }
                }

                if (!itemFound) {
                    JOptionPane.showMessageDialog(null, "Item ID 13 not found in menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid format in menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else if (evt.getSource() == btn14) {
            try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
                String line;
                boolean itemFound = false;

                while ((line = reader.readLine()) != null) {
                    String[] itemDetails = line.split(",");
                    if (itemDetails.length < 6) {
                        continue; // Skip invalid lines
                    }

                    if (Integer.parseInt(itemDetails[0]) == 14) {
                        itemFound = true;

                        // Create a new item from the menu
                        Item item = new Item(
                                Integer.parseInt(itemDetails[0]),
                                itemDetails[1],
                                Double.parseDouble(itemDetails[3]),
                                itemDetails[5]
                        );

                        // Get the quantity from the spinner
                        int quantityToAdd = (int) sp14.getValue();

                        // Check if the item is already in the order
                        boolean itemExists = false;
                        for (int i = 0; i < orderItems.size(); i++) {
                            if (orderItems.get(i).getItemID() == item.getItemID()) {
                                // Item exists, update its quantity
                                quantity.set(i, (int) quantity.get(i) + quantityToAdd);
                                itemExists = true;
                                break;
                            }
                        }

                        if (!itemExists) {
                            // Item does not exist, add it to the lists
                            orderItems.add(item);
                            order.addItemToOrder(item);
                            quantity.add(quantityToAdd);
                        }

                        // Update the order summary display
                        StringBuilder displayText = new StringBuilder();
                        for (int i = 0; i < orderItems.size(); i++) {
                            displayText.append(orderItems.get(i).getName())
                                    .append(" x")
                                    .append(quantity.get(i))
                                    .append("\n");
                        }
                        orderTextArea.setText(displayText.toString());

                        break; // Exit the loop after processing the item
                    }
                }

                if (!itemFound) {
                    JOptionPane.showMessageDialog(null, "Item ID 14 not found in menu.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid format in menu file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }

        
            //add the order for the current user
           RestaurantApp.currentUser.placeOrder(order);
    }//GEN-LAST:event_btnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == jButton2) {

            if (orderItems.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Your cart is empty. Please add items to place an order.");
                return;
            }
            // Display a confirmation dialog for the address
            int choice = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to deliver to a new address?",
                    "Delivery Address",
                    JOptionPane.YES_NO_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {
                // Prompt user to enter a new address
                do {
                    newAddress1 = JOptionPane.showInputDialog("Enter New Address");

                    if (!newAddress1.isEmpty()) {
                        Order o1 = new Order();
                        o1.updateDeliveryAddress(newAddress1);

                        JOptionPane.showMessageDialog(this, "New address saved successfully!\n\n");
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid address! Using existing address.\n\n");
                    }
                } while (newAddress1.isEmpty());

                StringBuilder orderSummary = new StringBuilder();
                orderSummary.append("Your Order:\n");
                orderSummary.append("---------------------\n");

                List<Item> processedItems = new ArrayList<>();
                double totalPrice = 0;

                for (Item item : orderItems) {
                    if (!processedItems.contains(item)) {
                        int q = 0;
                        double itemTotalPrice = 0;

                        // Count occurrences of the item in orderItems
                        for (int m = 0; m < orderItems.size(); m++) {
                            if (orderItems.get(m).equals(item)) {
                                q += quantity.get(m); // Sum the quantities for the item
                                itemTotalPrice += orderItems.get(m).getPrice() * quantity.get(m); // Sum the price
                            }
                        }

                        processedItems.add(item);
                        totalPrice += itemTotalPrice;

                        // Append item details to the summary
                        orderSummary.append(item.getName())
                                .append(" (x").append(q).append(")")
                                .append(": $").append(itemTotalPrice).append("\n");
                    }
                }

                orderSummary.append("---------------------\n");
                orderSummary.append("Total Price: $").append(totalPrice).append("\n");

                // Show the order summary in a dialog box
                JOptionPane.showMessageDialog(this, orderSummary.toString());

            } else {
                StringBuilder orderSummary = new StringBuilder();
                orderSummary.append("Your Order:\n");
                orderSummary.append("---------------------\n");

                List<Item> processedItems = new ArrayList<>();
                double totalPrice = 0;

                for (Item item : orderItems) {
                    if (!processedItems.contains(item)) {
                        int q = 0;
                        double itemTotalPrice = 0;

                        // Count occurrences of the item in orderItems
                        for (int m = 0; m < orderItems.size(); m++) {
                            if (orderItems.get(m).equals(item)) {
                                q += quantity.get(m); // Sum the quantities for the item
                                itemTotalPrice += orderItems.get(m).getPrice() * quantity.get(m); // Sum the price
                            }
                        }

                        processedItems.add(item);
                        totalPrice += itemTotalPrice;

                        // Append item details to the summary
                        orderSummary.append(item.getName())
                                .append(" (x").append(q).append(")")
                                .append(": $").append(itemTotalPrice).append("\n");
                    }
                }

                orderSummary.append("---------------------\n");
                orderSummary.append("Total Price: $").append(totalPrice).append("\n");
                order.calculateTotal();
                // Show the order summary in a dialog box
                JOptionPane.showMessageDialog(this, orderSummary.toString());

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        orderTextArea.setText(" ");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ProfileLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ProfileLabelAncestorAdded
        // TODO add your handling code here:
             ProfileLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Open the Profile frame when the label is clicked
                    Profile profileFrame = new Profile(); 
                    profileFrame.setVisible(true); 
                    profileFrame.pack(); 
                    profileFrame.setLocationRelativeTo(null);
                    SwingUtilities.getWindowAncestor(ProfileLabel).dispose();
                }
        });
    }//GEN-LAST:event_ProfileLabelAncestorAdded

    private void SignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignoutActionPerformed
        // TODO add your handling code here:
            Login LoginFrame= new Login();
            LoginFrame.setVisible(true);
            LoginFrame.pack();
            LoginFrame.setLocationRelativeTo(null);
            this.dispose();
    }//GEN-LAST:event_SignoutActionPerformed

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BeafBurgerLabel;
    private javax.swing.JLabel BeafBurgerPriceLabel;
    private javax.swing.JLabel ChickenBurgerLabel;
    private javax.swing.JLabel ChickenBurgerPriceLabel;
    private javax.swing.JLabel ChickenPopsLabel;
    private javax.swing.JLabel ChickenPopsPriceLabel;
    private javax.swing.JLabel ColaLabel;
    private javax.swing.JLabel ColaPriceLabel;
    private javax.swing.JLabel ComboMealLabel;
    private javax.swing.JLabel ComboMealPriceLabel;
    private javax.swing.JLabel FrenchFriesLabel;
    private javax.swing.JLabel FrenchFriesPriceLabel;
    private javax.swing.JLabel FriedChickenMealLabel;
    private javax.swing.JLabel FriedChickenMealPriceLabel;
    private javax.swing.JLabel HotDogLabel;
    private javax.swing.JLabel HotDogPriceLabel;
    private javax.swing.JLabel LemonJuiceLabel;
    private javax.swing.JLabel LemonJuicePriceLabel;
    private javax.swing.JLabel MangoJuiceLabel;
    private javax.swing.JLabel MangoJuicePriceLabel;
    private javax.swing.JLabel OrangeJuiceLabel;
    private javax.swing.JLabel OrangeJuicePriceLabel;
    private javax.swing.JLabel PizzaLabel;
    private javax.swing.JLabel PizzaPriceLabel;
    private javax.swing.JLabel ProfileLabel;
    private javax.swing.JLabel SeaFoodPastaLabel;
    private javax.swing.JLabel SeaFoodPastaPriceLabel;
    private javax.swing.JLabel ShawermaLabel;
    private javax.swing.JLabel ShawermaPriceLabel;
    private javax.swing.JButton Signout;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea orderTextArea;
    private javax.swing.JSpinner sp1;
    private javax.swing.JSpinner sp10;
    private javax.swing.JSpinner sp11;
    private javax.swing.JSpinner sp12;
    private javax.swing.JSpinner sp13;
    private javax.swing.JSpinner sp14;
    private javax.swing.JSpinner sp2;
    private javax.swing.JSpinner sp3;
    private javax.swing.JSpinner sp4;
    private javax.swing.JSpinner sp5;
    private javax.swing.JSpinner sp6;
    private javax.swing.JSpinner sp7;
    private javax.swing.JSpinner sp8;
    private javax.swing.JSpinner sp9;
    // End of variables declaration//GEN-END:variables
}
