/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dealermobil;

import database.conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public final class utama extends javax.swing.JPanel {

    /**
     * Creates new form utama
     */
    private final Connection conn;
    
    public utama() {
        initComponents();
        conn = conection.getConnection();
        setTabel();
        setTombol(false);
        loadData();
        bt_Batal.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        main_pn = new javax.swing.JPanel();
        control_pn = new javax.swing.JPanel();
        tambah_pn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        text_harga = new javax.swing.JTextField();
        text_tipe = new javax.swing.JTextField();
        bt_Batal = new javax.swing.JButton();
        text_nama = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        text_warna = new javax.swing.JTextField();
        text_id = new javax.swing.JTextField();
        text_tahun = new javax.swing.JTextField();
        bt_tambah1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        data_pn = new javax.swing.JPanel();
        bt_ubah = new javax.swing.JButton();
        bt_hapus = new javax.swing.JButton();
        bt_batal = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DATA BARANG");

        setLayout(new java.awt.CardLayout());

        control_pn.setLayout(new java.awt.CardLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("TAMBAH BARANG");

        jLabel100.setText("Id Mobil");

        jLabel104.setText("Tipe");

        jLabel101.setText("Nama Mobil");

        jLabel105.setText("Harga");

        text_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_hargatext_hargaActionPerformed(evt);
            }
        });

        text_tipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tipetext_tipeActionPerformed(evt);
            }
        });

        bt_Batal.setBackground(new java.awt.Color(255, 255, 255));
        bt_Batal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_Batal.setText("BATAL");
        bt_Batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_BatalMouseClicked(evt);
            }
        });
        bt_Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_BataljButton1ActionPerformed(evt);
            }
        });

        jLabel102.setText("Tahun Produksi");

        jLabel103.setText("Warna");

        text_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_idtext_kodeActionPerformed(evt);
            }
        });

        text_tahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_tahuntext_tahunActionPerformed(evt);
            }
        });

        bt_tambah1.setBackground(new java.awt.Color(255, 255, 255));
        bt_tambah1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_tambah1.setText("TAMBAH");
        bt_tambah1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_tambah1MouseClicked(evt);
            }
        });
        bt_tambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tambah1jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Rp.");

        javax.swing.GroupLayout tambah_pnLayout = new javax.swing.GroupLayout(tambah_pn);
        tambah_pn.setLayout(tambah_pnLayout);
        tambah_pnLayout.setHorizontalGroup(
            tambah_pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambah_pnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tambah_pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tambah_pnLayout.createSequentialGroup()
                        .addGroup(tambah_pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel100)
                            .addComponent(jLabel101)
                            .addComponent(jLabel102)
                            .addComponent(jLabel103)
                            .addComponent(jLabel104)
                            .addComponent(jLabel105))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(text_tipe, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_warna, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_tahun, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_nama, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_id, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambah_pnLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_harga))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambah_pnLayout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(bt_tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_Batal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        tambah_pnLayout.setVerticalGroup(
            tambah_pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambah_pnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_warna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel104)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_tipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel105)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambah_pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(tambah_pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Batal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        control_pn.add(tambah_pn, "card2");

        data_pn.setPreferredSize(new java.awt.Dimension(0, 0));

        bt_ubah.setText("UBAH");
        bt_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ubahActionPerformed(evt);
            }
        });

        bt_hapus.setText("HAPUS");
        bt_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hapusActionPerformed(evt);
            }
        });

        bt_batal.setText("BATAL");
        bt_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_batalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("DATA BARANG");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));

        tbldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbldata);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout data_pnLayout = new javax.swing.GroupLayout(data_pn);
        data_pn.setLayout(data_pnLayout);
        data_pnLayout.setHorizontalGroup(
            data_pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_pnLayout.createSequentialGroup()
                .addGroup(data_pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(data_pnLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(bt_ubah)
                        .addGap(18, 18, 18)
                        .addComponent(bt_hapus)
                        .addGap(18, 18, 18)
                        .addComponent(bt_batal))
                    .addGroup(data_pnLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(167, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );
        data_pnLayout.setVerticalGroup(
            data_pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_pnLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(data_pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_batal)
                    .addComponent(bt_ubah)
                    .addComponent(bt_hapus))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout main_pnLayout = new javax.swing.GroupLayout(main_pn);
        main_pn.setLayout(main_pnLayout);
        main_pnLayout.setHorizontalGroup(
            main_pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_pnLayout.createSequentialGroup()
                .addComponent(control_pn, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data_pn, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
        );
        main_pnLayout.setVerticalGroup(
            main_pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(control_pn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(data_pn, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        add(main_pn, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void text_hargatext_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_hargatext_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_hargatext_hargaActionPerformed

    private void text_tipetext_tipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tipetext_tipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_tipetext_tipeActionPerformed

    private void bt_BatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_BatalMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_bt_BatalMouseClicked

    private void bt_BataljButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_BataljButton1ActionPerformed
        // TODO add your handling code here:
        setTombol(false);
        back();
    }//GEN-LAST:event_bt_BataljButton1ActionPerformed

    private void text_idtext_kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_idtext_kodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_idtext_kodeActionPerformed

    private void text_tahuntext_tahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_tahuntext_tahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_tahuntext_tahunActionPerformed

    private void bt_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_batalActionPerformed
        // TODO add your handling code here:
        setTombol(false);
        back();
        loadData();
    }//GEN-LAST:event_bt_batalActionPerformed

    private void tbldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldataMouseClicked
        // TODO add your handling code here:
        setTombol(true);
    }//GEN-LAST:event_tbldataMouseClicked

    private void bt_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ubahActionPerformed
        // TODO add your handling code here:
       dataTabel();
    }//GEN-LAST:event_bt_ubahActionPerformed

    private void bt_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hapusActionPerformed
        // TODO add your handling code here:
        hapusData();
    }//GEN-LAST:event_bt_hapusActionPerformed

    private void bt_tambah1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_tambah1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_tambah1MouseClicked

    private void bt_tambah1jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tambah1jButton1ActionPerformed
        // TODO add your handling code here:
        if(bt_tambah1.getText().equals("TAMBAH")){
            insertData();
        }else if(bt_tambah1.getText().equals("SIMPAN")){
            updateData();
        }
        
    }//GEN-LAST:event_bt_tambah1jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Batal;
    private javax.swing.JButton bt_batal;
    private javax.swing.JButton bt_hapus;
    private javax.swing.JButton bt_tambah1;
    private javax.swing.JButton bt_ubah;
    private javax.swing.JPanel control_pn;
    private javax.swing.JPanel data_pn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main_pn;
    private javax.swing.JPanel tambah_pn;
    private javax.swing.JTable tbldata;
    private javax.swing.JTextField text_harga;
    private javax.swing.JTextField text_id;
    private javax.swing.JTextField text_nama;
    private javax.swing.JTextField text_tahun;
    private javax.swing.JTextField text_tipe;
    private javax.swing.JTextField text_warna;
    // End of variables declaration//GEN-END:variables
    private void back(){
        jLabel3.setText("TAMBAH BARANG");
        text_id.setEnabled(true);
        bt_tambah1.setText("TAMBAH");
        bt_Batal.setVisible(false);
        resetForm();
        
    }
    private void resetForm() {
        text_id.setText("");
        text_nama.setText("");
        text_tahun.setText("");
        text_warna.setText("");
        text_tipe.setText("");
        text_harga.setText("");
    }
    public void loadData() {
        getData((DefaultTableModel)tbldata.getModel());
        bt_batal.setVisible(false);
        bt_hapus.setVisible(false);
    }
    private void setTombol(boolean stat) {
        bt_ubah.setVisible(stat);
        bt_hapus.setVisible(stat);
        bt_batal.setVisible(stat);
    }
    private void setTabel() {
        DefaultTableModel model = (DefaultTableModel) tbldata.getModel();
        model.addColumn("Kode");
        model.addColumn("Nama");
        model.addColumn("Tahun"); 
        model.addColumn("Warna"); 
        model.addColumn("Tipe");
        model.addColumn("Harga");
        
    }
    private void insertData() {
        String  id       = text_id.getText();
        String  nama     = text_nama.getText();
        String  tahun    = text_tahun.getText();
        String  warna    = text_warna.getText();
        String  tipe     = text_tipe.getText();
        String  hrga     = text_harga.getText();
        Integer harga    = Integer.valueOf(hrga);
        
        if (id.isEmpty() || nama.isEmpty() || tahun.isEmpty() || warna.isEmpty() || tipe.isEmpty()|| hrga.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus di isi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            String sql = "INSERT INTO barang(id_mobil, nama, tahun, warna, tipe, harga) VALUES (?,?,?,?,?,?)";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, id);
                st.setString(2, nama);
                st.setString(3, tahun);
                st.setString(4, warna);
                st.setString(5, tipe);
                st.setInt   (6, harga);
                int rowInserted = st.executeUpdate();    
                if (rowInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil di tambahkan!");
                }
                resetForm();
                loadData();
                
            } 
        } catch (SQLException e) {
            Logger.getLogger(utama.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Koneksi gagal");
        }  
    }
    
    
    private void getData(DefaultTableModel model) {
       model.setRowCount(0);
        try {
            String sql = "SELECT * FROM barang";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                
                while(rs.next()){
                    String id       = rs.getString("id_mobil");
                    String nama     = rs.getString("nama");
                    String tahun    = rs.getString("tahun");
                    String warna    = rs.getString("warna");
                    String tipe     = rs.getString("tipe");
                    int harga       = rs.getInt("harga");
                    model.addRow(new Object[]{id, nama, tahun, warna, tipe, harga});
                }
            } 
        } catch (SQLException e) {
            Logger.getLogger(utama.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    private void hapusData() {
        int selectedRow = tbldata.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, 
                "Apakah yakin ingin menghapus data ini ?",
                "Konfirmasi Hapus Data", 
                JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION){
            String id = tbldata.getValueAt(selectedRow, 0).toString();
            try {
                String sql =  "DELETE FROM barang WHERE id_mobil=?";
                try(PreparedStatement st = conn.prepareStatement(sql)){
                    st.setString(1, id);
                    
                    int rowDeleted = st.executeUpdate();
                    if(rowDeleted > 0){
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                        
                    }else{
                        JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                    }
                }
            } catch (SQLException e) {
                Logger.getLogger(utama.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        loadData();
        setTombol(false);
    }
    private void dataTabel() {
       jLabel3.setText("UBAH DATA BARANG");
       bt_tambah1.setText("SIMPAN");
       bt_Batal.setVisible(true);
       int row = tbldata.getSelectedRow();       
       text_id.setEnabled(false);
       
       text_id.setText(tbldata.getValueAt(row, 0).toString());
       text_nama.setText(tbldata.getValueAt(row, 1).toString());
       text_tahun.setText(tbldata.getValueAt(row, 2).toString());
       text_warna.setText(tbldata.getValueAt(row, 3).toString());
       text_tipe.setText(tbldata.getValueAt(row, 4).toString());
       text_harga.setText(tbldata.getValueAt(row, 5).toString());
    }
    private void updateData() {
        
        String  id       = text_id.getText();
        String  nama     = text_nama.getText();
        String  tahun    = text_tahun.getText();
        String  warna    = text_warna.getText();
        String  tipe     = text_tipe.getText();
        String  hrga     = text_harga.getText();
        Integer harga    = Integer.valueOf(hrga);
        
        if (id.isEmpty() || nama.isEmpty() || tahun.isEmpty() || warna.isEmpty() || tipe.isEmpty()|| hrga.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus di isi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            String sql = "UPDATE barang SET nama=?, tahun=?, warna=?, tipe=?, harga=? WHERE id_mobil=?";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, nama);
                st.setString(2, tahun);
                st.setString(3, warna);
                st.setString(4, tipe);
                st.setInt(5, harga);
                st.setString(6, id);
                int rowUpdeted = st.executeUpdate();    
                if (rowUpdeted > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
                    resetForm();
                    loadData();
                    back();
                    setTombol(false);
                }
            } 
        } catch (SQLException e) {
            Logger.getLogger(utama.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Koneksi gagal");
        }  
    }
}