/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Ivan
 */
public class VisorFacturas extends javax.swing.JFrame {

    /**
     * Creates new form VisorFacturas
     * @param a
     */
    public VisorFacturas(String a) {
        initComponents();
        bills.setText(a);
        this.setResizable(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        bills = new javax.swing.JTextArea();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Factura");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(null);

        bills.setEditable(false);
        bills.setColumns(20);
        bills.setRows(5);
        bills.setBorder(null);
        jScrollPane1.setViewportView(bills);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 204));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("MogLog");
        title.setOpaque(true);
        jPanel1.add(title, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Icon.png"));
            setIconImage(icon);
            setVisible(true);
        this.setSize(625, 500);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bills;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
