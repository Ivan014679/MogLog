/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author AULA1
 */
public class Login extends javax.swing.JFrame {

    String StringPass = "";
    
    public Login() {
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
        logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        pass = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        loguear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(2, 0));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MoglogLogo.png"))); // NOI18N
        jPanel1.add(logo);

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setText("              ");
        jPanel6.add(jLabel2);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel3.setLayout(new java.awt.GridBagLayout());

        user.setText("Nombre de usuario:          ");
        jPanel3.add(user, new java.awt.GridBagConstraints());

        username.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel3.add(username, new java.awt.GridBagConstraints());

        jPanel5.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        pass.setText("Contraseña:                        ");
        jPanel4.add(pass, new java.awt.GridBagConstraints());

        password.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel4.add(password, new java.awt.GridBagConstraints());

        jPanel5.add(jPanel4);

        jPanel6.add(jPanel5);

        jLabel1.setText("              ");
        jPanel6.add(jLabel1);

        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel7.setLayout(new java.awt.GridBagLayout());

        loguear.setText("Ingresar");
        loguear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loguearActionPerformed(evt);
            }
        });
        jPanel7.add(loguear, new java.awt.GridBagConstraints());

        jPanel2.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loguearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loguearActionPerformed
        char[] a=password.getPassword();
        String pss=new String(a);        
        
        if((username.getText().equals("Admin"))&&(pss.equals("12345"))){
            java.awt.EventQueue.invokeLater(() -> {
                Invento main = new Invento();
                main.setExtendedState(MAXIMIZED_BOTH);
                main.setVisible(true);
            });
            this.dispose();
        }else{      
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos.", "Usuario y/o contraseña desconocidos", JOptionPane.WARNING_MESSAGE);                    
        }
    }//GEN-LAST:event_loguearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Icon.png"));
            setIconImage(icon);
            setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel logo;
    private javax.swing.JButton loguear;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel user;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
