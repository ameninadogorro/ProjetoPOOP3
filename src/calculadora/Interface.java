package calculadora;

public class Interface extends javax.swing.JFrame{

    public Interface(){
        initComponents();
        setResizable(false);
    }

    Calculadora calculadora = new Calculadora();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        historico = new javax.swing.JLabel();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        bX = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        bMenos = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bMaisMenos = new javax.swing.JButton();
        bIgual = new javax.swing.JButton();
        bVirgula = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        bMais = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bXAoQuadrado = new javax.swing.JButton();
        bUmSobreX = new javax.swing.JButton();
        bDividir = new javax.swing.JButton();
        bRaizDeX = new javax.swing.JButton();
        bCE = new javax.swing.JButton();
        bPercent = new javax.swing.JButton();
        bApagar = new javax.swing.JButton();
        bC = new javax.swing.JButton();
        display = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MC = new javax.swing.JButton();
        mMais = new javax.swing.JButton();
        MR = new javax.swing.JButton();
        MSeta = new javax.swing.JButton();
        MS = new javax.swing.JButton();
        mMenos = new javax.swing.JButton();
        historico1 = new javax.swing.JLabel();
        memoria = new javax.swing.JLabel();
        ms = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        historico.setForeground(new java.awt.Color(153, 153, 153));
        historico.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 204, 255));
        setForeground(new java.awt.Color(153, 204, 255));

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        bX.setBackground(new java.awt.Color(153, 204, 255));
        bX.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        bX.setForeground(new java.awt.Color(255, 255, 255));
        bX.setText("x");
        bX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bXActionPerformed(evt);
            }
        });

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b5.setText("5");
        b5.setBorder(null);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        bMenos.setBackground(new java.awt.Color(153, 204, 255));
        bMenos.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        bMenos.setForeground(new java.awt.Color(255, 255, 255));
        bMenos.setText("-");
        bMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenosActionPerformed(evt);
            }
        });

        b6.setText("6");
        b6.setBorder(null);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bMaisMenos.setText("+/-");
        bMaisMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMaisMenosActionPerformed(evt);
            }
        });

        bIgual.setBackground(new java.awt.Color(153, 204, 255));
        bIgual.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        bIgual.setForeground(new java.awt.Color(255, 255, 255));
        bIgual.setText("=");
        bIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIgualActionPerformed(evt);
            }
        });

        bVirgula.setText(",");
        bVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVirgulaActionPerformed(evt);
            }
        });

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        bMais.setBackground(new java.awt.Color(153, 204, 255));
        bMais.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        bMais.setForeground(new java.awt.Color(255, 255, 255));
        bMais.setText("+");
        bMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMaisActionPerformed(evt);
            }
        });

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        bXAoQuadrado.setBackground(new java.awt.Color(153, 204, 255));
        bXAoQuadrado.setForeground(new java.awt.Color(255, 255, 255));
        bXAoQuadrado.setText("x²");
        bXAoQuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bXAoQuadradoActionPerformed(evt);
            }
        });

        bUmSobreX.setBackground(new java.awt.Color(153, 204, 255));
        bUmSobreX.setForeground(new java.awt.Color(255, 255, 255));
        bUmSobreX.setText("⅟x");
        bUmSobreX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUmSobreXActionPerformed(evt);
            }
        });

        bDividir.setBackground(new java.awt.Color(153, 204, 255));
        bDividir.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        bDividir.setForeground(new java.awt.Color(255, 255, 255));
        bDividir.setText("÷");
        bDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDividirActionPerformed(evt);
            }
        });

        bRaizDeX.setBackground(new java.awt.Color(153, 204, 255));
        bRaizDeX.setForeground(new java.awt.Color(255, 255, 255));
        bRaizDeX.setText("√x");
        bRaizDeX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRaizDeXActionPerformed(evt);
            }
        });

        bCE.setBackground(new java.awt.Color(153, 204, 255));
        bCE.setForeground(new java.awt.Color(255, 255, 255));
        bCE.setText("CE");
        bCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCEActionPerformed(evt);
            }
        });

        bPercent.setBackground(new java.awt.Color(153, 204, 255));
        bPercent.setForeground(new java.awt.Color(255, 255, 255));
        bPercent.setText("%");
        bPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPercentActionPerformed(evt);
            }
        });

        bApagar.setBackground(new java.awt.Color(153, 204, 255));
        bApagar.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        bApagar.setForeground(new java.awt.Color(255, 255, 255));
        bApagar.setText("⌫");
        bApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bApagarActionPerformed(evt);
            }
        });

        bC.setBackground(new java.awt.Color(153, 204, 255));
        bC.setForeground(new java.awt.Color(255, 255, 255));
        bC.setText("C");
        bC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCActionPerformed(evt);
            }
        });

        display.setBackground(new java.awt.Color(153, 204, 255));
        display.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        display.setForeground(new java.awt.Color(153, 204, 255));
        display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        display.setText("0");
        display.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 255));

        MC.setBackground(new java.awt.Color(153, 204, 255));
        MC.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        MC.setForeground(new java.awt.Color(255, 255, 255));
        MC.setText("MC");
        MC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCActionPerformed(evt);
            }
        });

        mMais.setBackground(new java.awt.Color(153, 204, 255));
        mMais.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        mMais.setForeground(new java.awt.Color(255, 255, 255));
        mMais.setText("M+");
        mMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMaisActionPerformed(evt);
            }
        });

        MR.setBackground(new java.awt.Color(153, 204, 255));
        MR.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        MR.setForeground(new java.awt.Color(255, 255, 255));
        MR.setText("MR");
        MR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRActionPerformed(evt);
            }
        });

        MSeta.setBackground(new java.awt.Color(153, 204, 255));
        MSeta.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        MSeta.setForeground(new java.awt.Color(255, 255, 255));
        MSeta.setText("M^");
        MSeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSetaActionPerformed(evt);
            }
        });

        MS.setBackground(new java.awt.Color(153, 204, 255));
        MS.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        MS.setForeground(new java.awt.Color(255, 255, 255));
        MS.setText("MS");
        MS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSActionPerformed(evt);
            }
        });

        mMenos.setBackground(new java.awt.Color(153, 204, 255));
        mMenos.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        mMenos.setForeground(new java.awt.Color(255, 255, 255));
        mMenos.setText("M-");
        mMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMenosActionPerformed(evt);
            }
        });

        historico1.setForeground(new java.awt.Color(153, 153, 153));
        historico1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        memoria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        ms.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jMenuBar1.setBackground(new java.awt.Color(153, 204, 255));

        jMenu1.setBackground(new java.awt.Color(153, 204, 255));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Menu");
        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(153, 204, 255));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Ajuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bMaisMenos, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(b0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(bVirgula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bMais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(bMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(3, 3, 3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MR, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mMais, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MS, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MSeta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ms, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memoria, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bUmSobreX, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(bPercent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bCE, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bXAoQuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bRaizDeX, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bX, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(historico1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(memoria)
                    .addComponent(ms))
                .addGap(18, 18, 18)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MC)
                    .addComponent(mMais)
                    .addComponent(MR)
                    .addComponent(mMenos)
                    .addComponent(MSeta)
                    .addComponent(MS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCE, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bUmSobreX, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRaizDeX, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bXAoQuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bX, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMais, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bMaisMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(historico1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(433, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        calculadora.mudarDisplay(display, "8", historico);
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        calculadora.mudarDisplay(display, "7", historico);
    }//GEN-LAST:event_b7ActionPerformed

    private void bXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bXActionPerformed
        // TODO add your handling code here:
        calculadora.bX(display, historico);
    }//GEN-LAST:event_bXActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        calculadora.mudarDisplay(display, "9", historico);
    }//GEN-LAST:event_b9ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        calculadora.mudarDisplay(display, "5", historico);
    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        calculadora.mudarDisplay(display, "4", historico);
    }//GEN-LAST:event_b4ActionPerformed

    private void bMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosActionPerformed
        // TODO add your handling code here:
        calculadora.bMenos(display,historico);
    }//GEN-LAST:event_bMenosActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        calculadora.mudarDisplay(display, "6", historico);
    }//GEN-LAST:event_b6ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        // TODO add your handling code here:
        calculadora.mudarDisplay(display, "0", historico);
    }//GEN-LAST:event_b0ActionPerformed

    private void bMaisMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMaisMenosActionPerformed
        // TODO add your handling code here:
        calculadora.MaisMenos(display);
    }//GEN-LAST:event_bMaisMenosActionPerformed

    private void bIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIgualActionPerformed
        // TODO add your handling code here:
        calculadora.bIgual(display, historico);
    }//GEN-LAST:event_bIgualActionPerformed

    private void bVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVirgulaActionPerformed
        // TODO add your handling code here:
        calculadora.mudarVirgula(display, ",", historico);
    }//GEN-LAST:event_bVirgulaActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        calculadora.mudarDisplay(display, "2", historico);
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        calculadora.mudarDisplay(display, "1", historico);
        
    }//GEN-LAST:event_b1ActionPerformed

    private void bMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMaisActionPerformed
        // TODO add your handling code here:
        calculadora.bMais(display, historico);
    }//GEN-LAST:event_bMaisActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        calculadora.mudarDisplay(display, "3", historico);
    }//GEN-LAST:event_b3ActionPerformed

    private void bXAoQuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bXAoQuadradoActionPerformed
        // TODO add your handling code here:
        calculadora.bXAoQuadrado(display, historico);
    }//GEN-LAST:event_bXAoQuadradoActionPerformed

    private void bUmSobreXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUmSobreXActionPerformed
        // TODO add your handling code here:
        calculadora.bUmSobreX(display, historico);
    }//GEN-LAST:event_bUmSobreXActionPerformed

    private void bDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDividirActionPerformed
        // TODO add your handling code here:
        calculadora.bDividir(display, historico);
    }//GEN-LAST:event_bDividirActionPerformed

    private void bRaizDeXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRaizDeXActionPerformed
        // TODO add your handling code here:
        calculadora.bRaizDeX(display, historico);
    }//GEN-LAST:event_bRaizDeXActionPerformed

    private void bCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCEActionPerformed
        // TODO add your handling code here:
        calculadora.bCE(display, historico);
    }//GEN-LAST:event_bCEActionPerformed

    private void bPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPercentActionPerformed
        // TODO add your handling code here:
        calculadora.bPercent(display, historico);
    }//GEN-LAST:event_bPercentActionPerformed

    private void bApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bApagarActionPerformed
        // TODO add your handling code here:
        calculadora.removerCaractere(display, historico);
    }//GEN-LAST:event_bApagarActionPerformed

    private void bCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCActionPerformed
        // TODO add your handling code here:
        calculadora.bC(display, historico);
    }//GEN-LAST:event_bCActionPerformed

    private void mMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMaisActionPerformed
        // TODO add your handling code here:
        calculadora.mMais(memoria, display);
    }//GEN-LAST:event_mMaisActionPerformed

    private void mMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMenosActionPerformed
        // TODO add your handling code here:
        calculadora.mMenos(memoria, display);
    }//GEN-LAST:event_mMenosActionPerformed

    private void MCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCActionPerformed
        // TODO add your handling code here:
        calculadora.mC(memoria, ms);
    }//GEN-LAST:event_MCActionPerformed

    private void MRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRActionPerformed
        // TODO add your handling code here:
        calculadora.mR(memoria, display, historico);
    }//GEN-LAST:event_MRActionPerformed

    private void MSetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSetaActionPerformed
        // TODO add your handling code here:
        calculadora.mSeta(memoria, ms);
    }//GEN-LAST:event_MSetaActionPerformed

    private void MSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSActionPerformed
        // TODO add your handling code here:
        calculadora.mS(memoria, ms);
    }//GEN-LAST:event_MSActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MC;
    private javax.swing.JButton MR;
    private javax.swing.JButton MS;
    private javax.swing.JButton MSeta;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bApagar;
    private javax.swing.JButton bC;
    private javax.swing.JButton bCE;
    private javax.swing.JButton bDividir;
    private javax.swing.JButton bIgual;
    private javax.swing.JButton bMais;
    private javax.swing.JButton bMaisMenos;
    private javax.swing.JButton bMenos;
    private javax.swing.JButton bPercent;
    private javax.swing.JButton bRaizDeX;
    private javax.swing.JButton bUmSobreX;
    private javax.swing.JButton bVirgula;
    private javax.swing.JButton bX;
    private javax.swing.JButton bXAoQuadrado;
    private javax.swing.JLabel display;
    private javax.swing.JLabel historico;
    private javax.swing.JLabel historico1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton mMais;
    private javax.swing.JButton mMenos;
    private javax.swing.JLabel memoria;
    private javax.swing.JLabel ms;
    // End of variables declaration//GEN-END:variables
}
