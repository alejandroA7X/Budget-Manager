package com.budgetmanage.ui;

import com.budgetmanage.entities.BudgetUser;
import com.budgetmanage.modeler.UserJpaController;
import com.budgetmanage.ui.consulting.MainPanel;
import com.budgetmanage.ui.maintenance.RegisterFrm;
import com.budgetmanage.util.Constant;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class LoginFrm extends javax.swing.JPanel implements Constant {

    Container con;
    private JFrame frame;

    public LoginFrm(Container con, JFrame frame) {
        this.con = con;
        this.frame = frame;
        initComponents();
        this.lblValidatorMessage.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContainerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lblValidatorMessage = new javax.swing.JLabel();

        setBackground(BKG);

        ContainerPanel.setBackground(BKG);
        ContainerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sistema De Prespuestos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, TITLE_FONT, java.awt.Color.black));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Usuario");

        txtPassword.setName(""); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnAceptar.setMnemonic(KeyEvent.VK_ENTER);
        btnAceptar.setText("Ingresar");
        btnAceptar.setBorder(null);
        btnAceptar.setMaximumSize(new java.awt.Dimension(57, 17));
        btnAceptar.setMinimumSize(new java.awt.Dimension(57, 17));
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Clave");

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 204));
        btnRegistrar.setText("Crear Usuario");
        btnRegistrar.setBorder(null);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ContainerPanelLayout = new javax.swing.GroupLayout(ContainerPanel);
        ContainerPanel.setLayout(ContainerPanelLayout);
        ContainerPanelLayout.setHorizontalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(btnAceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        ContainerPanelLayout.setVerticalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 204));
        jLabel13.setText("Finanzas Amigables");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel13)
                .addContainerGap(336, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        lblValidatorMessage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblValidatorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblValidatorMessage.setText("MessageValidator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValidatorMessage)
                    .addComponent(ContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(ContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValidatorMessage)
                .addContainerGap(198, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        lblValidatorMessage.setVisible(false);
        boolean isOk = true;
        //Validate if the field was Empty 
        if (txtUsuario.getText().trim().isEmpty()) {
            lblValidatorMessage.setText(USER_ERROR_MSG);
            txtUsuario.setFocusable(true);
            isOk = false;

        } else if (txtPassword.getText().isEmpty()) {
            lblValidatorMessage.setText(PASS_ERROR_MSG);
            txtPassword.setFocusable(true);
            isOk = false;
        }
        //if all is correct [No empty fields] next step is
        //is to verify in the DataBase
        if (isOk == true) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("BudgeManagePU");
            UserJpaController ujc = new UserJpaController(emf);

            BudgetUser Currentuser = null;
            try {
                Currentuser = ujc.isUserValid(txtUsuario.getText().trim(),txtPassword.getText());
            } catch (Exception ex) {
                isOk = false;
            }

            if (isOk) {
                Main.setUser(Currentuser);
                frame.getJMenuBar().setVisible(true);
                MainPanel main = new MainPanel((JPanel)con);
                com.budgetmanage.util.Util.addPanel((JPanel)con,main);
            } else {
                JOptionPane.showMessageDialog(this, INVALID_USER_ERROR, "Error", JOptionPane.ERROR_MESSAGE);
                clean();
            }

        } else {
            lblValidatorMessage.setVisible(true);
        }
    }//GEN-LAST:event_btnAceptarMouseClicked
    
    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        RegisterFrm register = new RegisterFrm(con, frame);
        com.budgetmanage.util.Util.addPanel((JPanel)con, register);
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode() == 10){
           btnAceptarMouseClicked(null);
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void clean(){
        txtPassword.setText("");
        txtUsuario.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContainerPanel;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblValidatorMessage;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}