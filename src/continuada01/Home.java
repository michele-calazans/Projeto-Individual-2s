/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continuada01;

import java.util.Random;

/**
 *
 * @author mi1
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        
        //Centralizando o frame na tela
        this.setLocationRelativeTo(null);
        
        //Setando o layout do Panel
        jPanel1.setLayout(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMaxDisco = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblMaxMemoria = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblMinMemoria = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblMediaMemoria = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblMinCpu = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblMediaCpu = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        lblMaxCpu = new javax.swing.JLabel();
        lblMemoria1 = new javax.swing.JLabel();
        lblCpu2 = new javax.swing.JLabel();
        lblDisco1 = new javax.swing.JLabel();
        lblMinDisco = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblMediaDisco = new javax.swing.JLabel();
        lblMediaCpu3 = new javax.swing.JLabel();
        jButton = new javax.swing.JButton();
        lblTitle1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        pbMemoria = new javax.swing.JProgressBar();
        pbCpu = new javax.swing.JProgressBar();
        pbDisco = new javax.swing.JProgressBar();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(173, 177, 179));
        jLabel5.setText("GB");

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(173, 177, 179));
        jLabel19.setText("GB");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de tarefas");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(39, 39, 54));
        jPanel1.setForeground(new java.awt.Color(173, 177, 179));

        lblMaxDisco.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblMaxDisco.setForeground(new java.awt.Color(173, 177, 179));
        lblMaxDisco.setText("000");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(173, 177, 179));
        jLabel12.setText("Máximo:");

        lblMaxMemoria.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblMaxMemoria.setForeground(new java.awt.Color(173, 177, 179));
        lblMaxMemoria.setText("00");

        jLabel24.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(173, 177, 179));
        jLabel24.setText("Máximo:");

        lblMinMemoria.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblMinMemoria.setForeground(new java.awt.Color(173, 177, 179));
        lblMinMemoria.setText("00");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(173, 177, 179));
        jLabel8.setText("Mínimo:");

        lblMediaMemoria.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblMediaMemoria.setForeground(new java.awt.Color(173, 177, 179));
        lblMediaMemoria.setText("00");

        jLabel25.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(173, 177, 179));
        jLabel25.setText("Média:");

        lblMinCpu.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblMinCpu.setForeground(new java.awt.Color(173, 177, 179));
        lblMinCpu.setText("000");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(173, 177, 179));
        jLabel13.setText("Mínimo:");

        lblMediaCpu.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblMediaCpu.setForeground(new java.awt.Color(173, 177, 179));
        lblMediaCpu.setText("000");

        jLabel100.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(173, 177, 179));
        jLabel100.setText("Média:");

        lblMaxCpu.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblMaxCpu.setForeground(new java.awt.Color(173, 177, 179));
        lblMaxCpu.setText("000");

        lblMemoria1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lblMemoria1.setForeground(new java.awt.Color(192, 12, 39));
        lblMemoria1.setText("Memória");

        lblCpu2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lblCpu2.setForeground(new java.awt.Color(192, 12, 39));
        lblCpu2.setText("CPU");

        lblDisco1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        lblDisco1.setForeground(new java.awt.Color(192, 12, 39));
        lblDisco1.setText("Disco");

        lblMinDisco.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblMinDisco.setForeground(new java.awt.Color(173, 177, 179));
        lblMinDisco.setText("000");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(173, 177, 179));
        jLabel15.setText("Mínimo:");

        jLabel16.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(173, 177, 179));
        jLabel16.setText("Máximo:");

        lblMediaDisco.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblMediaDisco.setForeground(new java.awt.Color(173, 177, 179));
        lblMediaDisco.setText("000");

        lblMediaCpu3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lblMediaCpu3.setForeground(new java.awt.Color(173, 177, 179));
        lblMediaCpu3.setText("Média:");

        jButton.setBackground(new java.awt.Color(153, 153, 153));
        jButton.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jButton.setBorder(null);
        jButton.setFocusPainted(false);
        jButton.setFocusable(false);
        jButton.setLabel("Gerenciar recursos");
        jButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        lblTitle1.setFont(new java.awt.Font("Aharoni", 0, 32)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(204, 204, 204));
        lblTitle1.setText("Gerenciador de tarefas");

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(173, 177, 179));
        jLabel1.setText("%");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(173, 177, 179));
        jLabel6.setText("GB");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(173, 177, 179));
        jLabel10.setText("GB");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(173, 177, 179));
        jLabel11.setText("%");

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(173, 177, 179));
        jLabel17.setText("GB");

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(173, 177, 179));
        jLabel18.setText("%");

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(173, 177, 179));
        jLabel20.setText("GB");

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(173, 177, 179));
        jLabel21.setText("GB");

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(173, 177, 179));
        jLabel22.setText("GB");

        pbMemoria.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        pbMemoria.setForeground(new java.awt.Color(192, 12, 39));
        pbMemoria.setMinimum(1);
        pbMemoria.setBorderPainted(false);
        pbMemoria.setFocusable(false);

        pbCpu.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        pbCpu.setForeground(new java.awt.Color(192, 12, 39));
        pbCpu.setMinimum(1);
        pbCpu.setBorderPainted(false);
        pbCpu.setFocusable(false);

        pbDisco.setFont(new java.awt.Font("Segoe UI Light", 2, 16)); // NOI18N
        pbDisco.setForeground(new java.awt.Color(192, 12, 39));
        pbDisco.setMinimum(1);
        pbDisco.setBorderPainted(false);
        pbDisco.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pbDisco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblMemoria1)
                                            .addComponent(lblCpu2)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(104, 104, 104)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel100)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblMediaCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(lblMaxCpu))
                                            .addComponent(lblDisco1)
                                            .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblMinCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblMinDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addGap(26, 26, 26)
                                        .addComponent(lblMediaCpu3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblMediaDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMaxDisco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMinMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMediaMemoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMaxMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21))
                            .addComponent(pbCpu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pbMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblCpu2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinCpu)
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMediaCpu)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaxCpu)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(lblDisco1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinDisco)
                    .addComponent(lblMediaCpu3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMediaDisco)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaxDisco)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pbDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblMemoria1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinMemoria)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMediaMemoria)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaxMemoria)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        //Sorteando valores aleatórios do tipo INT
        valueCpu = new Random().nextInt(100) + 1;
        valueDisco = new Random().nextInt(500) + 1;
        valueMemoria = new Random().nextInt(16) + 1;
        //Fim

        //Chamando as funções de funcionalidades
        mudaWidth();
        mudaTexto();
        mediaValores();
        //Fim

        //Incrementando o contador
        contador++;
    }//GEN-LAST:event_jButtonActionPerformed
        
    Integer minCpu, minDisco, minMemoria, maxMemoria, maxDisco, maxCpu;
    
    Integer valueCpu, valueDisco, valueMemoria;
    
    Integer contador = 1;

          
    private void mudaWidth(){
        //Setando WIDTH das label's com os valores sorteados
        //Setando eixos x e y e heigth
        pbCpu.setValue(valueCpu);
        pbDisco.setValue(valueDisco);
        pbMemoria.setValue(valueMemoria);
        //Fim
        
        
        pbCpu.setStringPainted(true);
        pbDisco.setStringPainted(true);
        pbMemoria.setStringPainted(true);
    }
    
    private void mudaTexto(){
        //Inicializando as variáveis e setando o texto das label's
        if(contador == 1){
            minCpu = valueCpu;
            maxCpu = valueCpu;
           
            minDisco = valueDisco;
            maxDisco = valueDisco;
            
            maxMemoria = valueMemoria;
            minMemoria = valueMemoria;
            
            lblMaxCpu.setText(String.valueOf(maxCpu));
            lblMinCpu.setText(String.valueOf(minCpu));
            
            lblMaxDisco.setText(String.valueOf(maxDisco));
            lblMinDisco.setText(String.valueOf(minDisco));
            
            lblMaxMemoria.setText(String.valueOf(maxMemoria));
            lblMinMemoria.setText(String.valueOf(minMemoria));
            //Fim
        }else{
            //Comparando os valores para encontrar o méximo e o mínimo entre eles
            //CPU
            if(valueCpu>maxCpu){
                maxCpu = valueCpu;
                lblMaxCpu.setText(String.valueOf(maxCpu));
            }else if(valueCpu<minCpu){
                minCpu = valueCpu;
                lblMinCpu.setText(String.valueOf(minCpu));
            }
            
            //DISCO
            if(valueDisco>maxDisco){
                maxDisco = valueDisco;
                lblMaxDisco.setText(String.valueOf(maxDisco));
            }else if(valueDisco<minDisco){
                minDisco = valueDisco;
                lblMinDisco.setText(String.valueOf(minDisco));
            }
            
            //MEMORIA
            if(valueMemoria>maxMemoria){
                maxMemoria = valueMemoria;
                lblMaxMemoria.setText(String.valueOf(maxMemoria));
            }else if(valueMemoria<minMemoria){
                minMemoria = valueMemoria;
                lblMinMemoria.setText(String.valueOf(minMemoria));
            }
        }
        
                //Apresentando os valores sorteados de cada recurso em sua respectiva barra de progresso;
        //Convertendo os valores integers sorteados para string
        pbMemoria.setString(String.valueOf(valueCpu)+"%");
        pbDisco.setString(String.valueOf(valueDisco)+" GB");
        pbMemoria.setString(String.valueOf(valueMemoria)+" GB");
        //Fim
        
    }
         

    //Declarando variáveis para a comparação de valor MÉDIO
    //MEDIA
         Integer mediaCpu = 0;
         Integer mediaMemoria = 0;
         Integer mediaDisco = 0;
    //Fim
         
    private void mediaValores(){
             mediaCpu = (mediaCpu + valueCpu);
             mediaMemoria = (mediaMemoria + valueMemoria);
             mediaDisco = (mediaDisco + valueDisco);
        
             lblMediaCpu.setText(String.valueOf(mediaCpu/contador));
             lblMediaMemoria.setText(String.valueOf(mediaMemoria/contador));
             lblMediaDisco.setText(String.valueOf(mediaDisco/contador));
    }
    
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCpu2;
    private javax.swing.JLabel lblDisco1;
    private javax.swing.JLabel lblMaxCpu;
    private javax.swing.JLabel lblMaxDisco;
    private javax.swing.JLabel lblMaxMemoria;
    private javax.swing.JLabel lblMediaCpu;
    private javax.swing.JLabel lblMediaCpu3;
    private javax.swing.JLabel lblMediaDisco;
    private javax.swing.JLabel lblMediaMemoria;
    private javax.swing.JLabel lblMemoria1;
    private javax.swing.JLabel lblMinCpu;
    private javax.swing.JLabel lblMinDisco;
    private javax.swing.JLabel lblMinMemoria;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JProgressBar pbCpu;
    private javax.swing.JProgressBar pbDisco;
    private javax.swing.JProgressBar pbMemoria;
    // End of variables declaration//GEN-END:variables

}
