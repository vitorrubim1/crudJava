/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author BUYMIX
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        tituloLogin = new javax.swing.JLabel();
        msgEmail = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        msgCpf = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        tituloLogin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tituloLogin.setForeground(new java.awt.Color(219, 147, 41));
        tituloLogin.setText("Login");
        getContentPane().add(tituloLogin);
        tituloLogin.setBounds(240, 20, 110, 30);

        msgEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        msgEmail.setForeground(new java.awt.Color(255, 255, 255));
        msgEmail.setText("E-mail:");
        getContentPane().add(msgEmail);
        msgEmail.setBounds(90, 110, 70, 20);
        getContentPane().add(email);
        email.setBounds(170, 110, 270, 30);

        msgCpf.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        msgCpf.setForeground(new java.awt.Color(255, 255, 255));
        msgCpf.setText("CPF:");
        getContentPane().add(msgCpf);
        msgCpf.setBounds(90, 160, 60, 20);

        btnCadastrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCadastrar.setText("Entrar");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(219, 147, 41), 1, true));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(330, 230, 110, 30);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(170, 160, 270, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgroundEdit2.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 610, 340);

        setSize(new java.awt.Dimension(596, 364));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JTextField email;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel msgCpf;
    private javax.swing.JLabel msgEmail;
    private javax.swing.JLabel tituloLogin;
    // End of variables declaration//GEN-END:variables
}