
public class FormMenu extends javax.swing.JFrame {

    public FormMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JFormBarang = new javax.swing.JMenuItem();
        JKeluarFormBarang = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JMenuTransaksi = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Data Barang");

        JFormBarang.setText("Form Barang");
        JFormBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFormBarangActionPerformed(evt);
            }
        });
        jMenu1.add(JFormBarang);

        JKeluarFormBarang.setText("Keluar");
        JKeluarFormBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JKeluarFormBarangActionPerformed(evt);
            }
        });
        jMenu1.add(JKeluarFormBarang);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaksi Barang");

        JMenuTransaksi.setText("Form Transaksi");
        JMenuTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuTransaksiActionPerformed(evt);
            }
        });
        jMenu2.add(JMenuTransaksi);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JFormBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFormBarangActionPerformed
        new FormBarang().setVisible(true);
    }//GEN-LAST:event_JFormBarangActionPerformed

    private void JMenuTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuTransaksiActionPerformed
        new FormTransaksi().setVisible(true);
    }//GEN-LAST:event_JMenuTransaksiActionPerformed

    private void JKeluarFormBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JKeluarFormBarangActionPerformed
        dispose();
    }//GEN-LAST:event_JKeluarFormBarangActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JFormBarang;
    private javax.swing.JMenuItem JKeluarFormBarang;
    private javax.swing.JMenuItem JMenuTransaksi;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    // End of variables declaration//GEN-END:variables
}
