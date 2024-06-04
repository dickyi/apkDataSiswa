/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package datasiswa;

import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Irawa
 */
public class app extends javax.swing.JFrame {

    public app() {
        initComponents();
        reset();

        tNis.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        KeyAdapter onlyTextAdapter = new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) && c != ' ') {
                    e.consume();
                }
            }
        };

        tTempatLahir.addKeyListener(onlyTextAdapter);
        tNama.addKeyListener(onlyTextAdapter);
    }

    void reset() {
        tNis.setText("");
        tNama.setText("");
        tTempatLahir.setText("");
        tAlamat.setText("");
        vNis.setText("");

        vNama.setText("");
        vAlamat.setText("");
        vNis.setText("");
        vKelamin.setText("");
        vTtl.setText("");
        vFoto.setText("");
        vJurusan.setText("");

        Kelamin.clearSelection();
        tTanggalLahir.setCalendar(null);
        tJurusan.setSelectedItem(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kelamin = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tNis = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        rLaki = new javax.swing.JRadioButton();
        rPer = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        tTempatLahir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tTanggalLahir = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        tJurusan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlamat = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        pFoto = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        tFoto = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        vNis = new javax.swing.JLabel();
        vNama = new javax.swing.JLabel();
        vKelamin = new javax.swing.JLabel();
        vTtl = new javax.swing.JLabel();
        vJurusan = new javax.swing.JLabel();
        vAlamat = new javax.swing.JLabel();
        vFoto = new javax.swing.JLabel();
        bSimpan = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(18, 137, 167));
        jPanel3.setForeground(new java.awt.Color(18, 137, 167));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("NIS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("NAMA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("JENIS KELAMIN");

        tNis.setBackground(new java.awt.Color(232, 240, 254));
        tNis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tNis.setForeground(new java.awt.Color(30, 39, 46));

        tNama.setBackground(new java.awt.Color(232, 240, 254));
        tNama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        Kelamin.add(rLaki);
        rLaki.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rLaki.setText("LAKI-LAKI");

        Kelamin.add(rPer);
        rPer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rPer.setText("PEREMPUAN");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("TEMPAT LAHIR");

        tTempatLahir.setBackground(new java.awt.Color(232, 240, 254));
        tTempatLahir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("TANGGAL LAHIR");

        tTanggalLahir.setBackground(new java.awt.Color(232, 240, 254));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("JURUSAN");

        tJurusan.setBackground(new java.awt.Color(232, 240, 254));
        tJurusan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IPA", "IPS", "BAHASA" }));

        tAlamat.setBackground(new java.awt.Color(232, 240, 254));
        tAlamat.setColumns(20);
        tAlamat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tAlamat.setRows(5);
        jScrollPane1.setViewportView(tAlamat);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("ALAMAT");

        pFoto.setBackground(new java.awt.Color(204, 204, 204));
        pFoto.setForeground(new java.awt.Color(204, 204, 204));
        pFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pFoto.setText("FOTO");
        pFoto.setToolTipText("");
        pFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pFotoMouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(18, 137, 167));

        tFoto.setBackground(new java.awt.Color(18, 137, 167));
        tFoto.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        tFoto.setForeground(new java.awt.Color(18, 137, 167));
        tFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tFoto.setText("SOURCE FOTO");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tFoto)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tFoto)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rLaki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rPer))
                            .addComponent(tNis, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(tNama, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(tTempatLahir))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(pFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tNis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rPer)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(rLaki)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(tTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))))
                    .addComponent(pFoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6))
                    .addComponent(tJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel4.setBackground(new java.awt.Color(18, 137, 167));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vNis.setText("jLabel8");
        jPanel4.add(vNis, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 6, -1, -1));

        vNama.setText("jLabel9");
        jPanel4.add(vNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 28, -1, -1));

        vKelamin.setText("jLabel10");
        jPanel4.add(vKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 50, -1, -1));

        vTtl.setText("jLabel11");
        jPanel4.add(vTtl, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 72, -1, -1));

        vJurusan.setText("jLabel12");
        jPanel4.add(vJurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 94, -1, -1));

        vAlamat.setText("jLabel13");
        jPanel4.add(vAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 116, -1, -1));

        vFoto.setText("jLabel14");
        jPanel4.add(vFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 138, -1, 28));

        bSimpan.setBackground(new java.awt.Color(27, 20, 100));
        bSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bSimpan.setForeground(new java.awt.Color(255, 255, 255));
        bSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasiswa/save-file.png"))); // NOI18N
        bSimpan.setText("SIMPAN");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });

        bReset.setBackground(new java.awt.Color(234, 32, 39));
        bReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bReset.setForeground(new java.awt.Color(255, 255, 255));
        bReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datasiswa/loading.png"))); // NOI18N
        bReset.setText("RESET");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bSimpan)
                .addGap(18, 18, 18)
                .addComponent(bReset)
                .addGap(50, 50, 50))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSimpan)
                    .addComponent(bReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        jPanel1.setBackground(new java.awt.Color(0, 98, 102));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(0, 98, 102));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DATA SISWA");
        jPanel5.add(jLabel8, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pFotoMouseClicked
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File file = chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(file.toString());
            Image image = icon.getImage().getScaledInstance(pFoto.getWidth(), pFoto.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ic = new ImageIcon(image);
            pFoto.setText("");
            pFoto.setIcon(ic);
            String filename = file.getAbsolutePath();
            tFoto.setText(filename);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Upload eror" + e);
        }

        {
        }

    }//GEN-LAST:event_pFotoMouseClicked

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        reset();
        pFoto.setText(null);
        pFoto.setIcon(null);
    }//GEN-LAST:event_bResetActionPerformed

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        vNis.setText("NIS: " + tNis.getText());
        vNama.setText("NAMA: " + tNama.getText());
        vJurusan.setText("JURUSAN: " + tJurusan.getSelectedItem().toString());
        vAlamat.setText("ALAMAT :" + tAlamat.getText());
        if (rLaki.isSelected()) {
            vKelamin.setText(("JENIS KELAMIN : LAKI-LAKI"));

        } else if (rPer.isSelected()) {
            vKelamin.setText(("JENIS KELAMIN : PEREMPUAN"));

        } else {
            vKelamin.setText(("JENIS KELAMIN : TIDAK TERDEFINISI"));
        }
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        String tglLahir = String.valueOf(sd.format(tTanggalLahir.getDate()));
        vTtl.setText("TEMPAT,TANGGAL LAHIR : " + tTempatLahir.getText() + "," + tglLahir);

        String filename;
        try {
            filename = tFoto.getText();
            String filepath = "src/foto/";
            File folder = new File(filepath);
            if (!folder.exists()) {
                folder.mkdir();

            }
            File sourceFile = null;
            File destFile = null;
            String ekstensi = filename.substring(filename.lastIndexOf('.') + 1);
            sourceFile = new File(filename);
            Date tglUpload = new Date();
            SimpleDateFormat fr = new SimpleDateFormat("yyyyMMddhhss");
            String tglBaru = String.valueOf(fr.format(tglUpload));
            destFile = new File(filepath + tglBaru.toString() + "." + ekstensi);
            Files.copy(sourceFile.toPath(), destFile.toPath());
            vFoto.setText("FOTO : " + destFile.toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "upload eror" + e);

        }
    }//GEN-LAST:event_bSimpanActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Kelamin;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pFoto;
    private javax.swing.JRadioButton rLaki;
    private javax.swing.JRadioButton rPer;
    private javax.swing.JTextArea tAlamat;
    private javax.swing.JLabel tFoto;
    private javax.swing.JComboBox<String> tJurusan;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tNis;
    private com.toedter.calendar.JDateChooser tTanggalLahir;
    private javax.swing.JTextField tTempatLahir;
    private javax.swing.JLabel vAlamat;
    private javax.swing.JLabel vFoto;
    private javax.swing.JLabel vJurusan;
    private javax.swing.JLabel vKelamin;
    private javax.swing.JLabel vNama;
    private javax.swing.JLabel vNis;
    private javax.swing.JLabel vTtl;
    // End of variables declaration//GEN-END:variables
}
