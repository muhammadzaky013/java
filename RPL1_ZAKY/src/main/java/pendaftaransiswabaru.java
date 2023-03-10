
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LAB_RPLPC12
 */
public class pendaftaransiswabaru extends javax.swing.JFrame {
    Connection koneksi;
    String id = "";

    /**
     * Creates new form pendaftaransiswabaru
     */
    public pendaftaransiswabaru() {
        initComponents();
        koneksi();
        tampil();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        txtnama = new javax.swing.JTextField();
        laki = new javax.swing.JRadioButton();
        wadon = new javax.swing.JRadioButton();
        agama = new javax.swing.JComboBox<>();
        asal = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("PENDAFTARAN SISWA BARU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel2.setText("Nama                :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 20));

        jLabel3.setText("Alamat              :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, 20));

        jLabel4.setText("Jenis Kelamin   :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel5.setText("Agama              :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel6.setText("Sekolah Asal     :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        txtalamat.setBackground(new java.awt.Color(0, 102, 102));
        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 260, 110));

        txtnama.setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 260, -1));

        laki.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(laki);
        laki.setText("Laki-Laki");
        getContentPane().add(laki, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        wadon.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(wadon);
        wadon.setText("Perempuan");
        getContentPane().add(wadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        agama.setBackground(new java.awt.Color(0, 102, 102));
        agama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Hindu", "Katolik", "Buddha", "Ateis" }));
        getContentPane().add(agama, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 260, -1));

        asal.setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().add(asal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 260, -1));

        simpan.setBackground(new java.awt.Color(0, 102, 102));
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 80, -1));

        edit.setBackground(new java.awt.Color(0, 102, 102));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 80, -1));

        hapus.setBackground(new java.awt.Color(0, 102, 102));
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 80, -1));

        clear.setBackground(new java.awt.Color(0, 102, 102));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 80, -1));

        tabel.setBackground(new java.awt.Color(0, 102, 102));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "Alamat", "Jenis Kelamin", "Agama", "Sekolah Asal"
            }
        ));
        jScrollPane2.setViewportView(tabel);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 570, 100));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 660, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        if(id == "") {
            tambah();
        }else {
            update();
        }
    
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        hapus();
    }//GEN-LAST:event_hapusActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        edit();
    }//GEN-LAST:event_editActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(pendaftaransiswabaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pendaftaransiswabaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pendaftaransiswabaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pendaftaransiswabaru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pendaftaransiswabaru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agama;
    private javax.swing.JTextField asal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton laki;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtnama;
    private javax.swing.JRadioButton wadon;
    // End of variables declaration//GEN-END:variables

private void  koneksi(){
    try {
        String server = "jdbc:mysql://localhost:3306/db_somay";
        String user = "root";
        String pass = "";
        
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        koneksi = DriverManager.getConnection(server, user, pass);
   } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

private void tampil(){
    DefaultTableModel data = (DefaultTableModel) tabel.getModel();
    data.setRowCount(0);
    
    try {
        String sql = "SELECT * FROM tb_pendaftaransiswa";
        ResultSet res = koneksi.createStatement().executeQuery(sql);
        while(res.next()){
                data.addRow(new Object[]{
                    res.getString(1), res.getString(2),
                    res.getString(3), res.getString(4),
                    res.getString(5), res.getString(6)});
                    tabel.setModel(data);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
 
    private void tambah(){
    try {
        String jk = (laki.isSelected()) ? "Laki-Laki" : "Perempuan";
        String sql = "INSERT INTO tb_pendaftaransiswa VALUES (null,"
                + "'" + txtnama.getText() + "',"
                + "'" + txtalamat.getText()+ "',"
                + "'" + jk + "',"
                + "'" + agama.getSelectedItem().toString() + "',"
                + "'" + asal.getText() + "')";
                
        
        int res = koneksi.createStatement().executeUpdate(sql);
        
        if (res > -1) {
            tampil();
            txtnama.setText("");
            txtalamat.setText("");
            laki.setSelected(false);
            wadon.setSelected(false);
            agama.setSelectedIndex(0);
            asal.setText("");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
    
    private void hapus(){
     int row = tabel.getSelectedRow();
    String id = tabel.getValueAt(row, 0).toString();
    
    try {
        String sql = "DELETE FROM tb_pendaftaransiswa WHERE id="+id;
        int res = koneksi.createStatement().executeUpdate(sql);
        
        if (res > -1) {
            tampil();
            
        }
    } catch (Exception e) {
    }
    
}
    
    private void edit(){
    int row = tabel.getSelectedRow();
    String id_siswa = tabel.getValueAt(row, 0).toString();
    
    try {
        String sql = "SELECT * FROM tb_pendaftaransiswa WHERE id="+id_siswa;
        ResultSet res = koneksi.createStatement().executeQuery(sql);
        
        while (res.next()) {
            id = res.getString(1);
            txtnama.setText(res.getString(2));
            txtalamat.setText(res.getString(3));
            if (res.getString(4) == "Laki-Laki") {
                laki.setSelected(true);
            }else {
                wadon.setSelected(true);
            }
            agama.setSelectedItem(res.getString(5));
            asal.setText(res.getString(6));
            edit.setEnabled(false);
            
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }

    private void clear(){
            id = null;
            txtnama.setText("");            
            txtalamat.setText("");
            laki.setSelected(false);
            wadon.setSelected(false);
            agama.setSelectedIndex(0);
            asal.setText("");
            edit.setEnabled(true);
}
    
    private void update(){
    try {
        String jk = (laki.isSelected()) ? "Laki-Laki" : "perempuan";
        String sql = "UPDATE tb_pendaftaransiswa SET "
                + "nama = '" + txtnama.getText() + "'," 
                + "alamat = '" + txtalamat.getText()+ "',"
                + "jenis_kelamin = '" + jk + "',"               
                + "agama = '" + agama.getSelectedItem().toString() + "',"
                + "sekolah_asal = '" + asal.getText() + "'  "
                + "WHERE id = " + id;
        
        int res = koneksi.createStatement().executeUpdate(sql);
        
        if (res > -1) {
            tampil();
            clear();
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        
    }
    }
    
}
