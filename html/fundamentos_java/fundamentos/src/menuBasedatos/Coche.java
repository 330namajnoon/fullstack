/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
public interface WindowListener{

public void windowOpened(WindowEvent e);
public void windowClosed(WindowEvent e);
public void windowClosing(WindowEvent e);
public void windowActivated(WindowEvent e);
public void windowDeactivated(WindowEvent e);
public void windowIconified(WindowEvent e);
public void windowDeiconified(WindowEvent e);

 */
package menuBasedatos;

import com.mysql.jdbc.exceptions.MySQLDataException;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.omg.CosNaming.IstringHelper;
import java.awt.*;
import java.awt.image.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import static menuBasedatos.MenuBasedatos.con;
import static menuBasedatos.MenuBasedatos.st;


/**
 *
 * @author tarde
 */
public class Coche extends javax.swing.JFrame {

   
    ArrayList<Coche1> coches;
    ArrayList<Coche1> coches2;

    URL url;
    ImageProducer ip;
    Image img;

    public void windowOpened(WindowEvent e) {

    }

    /**
     * Creates new form Coche
     */
    public Coche() {
        System.out.println(con);
        initComponents();
        coches = new ArrayList();
        coches2 = new ArrayList();
        try {
            url = new URL("file:///C:\\fulstack sina\\projectofundomentos\\fullstack\\html\\fundamentos_java\\fundamentos\\src\\images\\coche.png");
        } catch (Exception e) {

        }
        try {

            ip = (ImageProducer) url.getContent();
            img = createImage(ip);
            this.setIconImage(img);
        } catch (Exception e) {
        }
        
       

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardar = new javax.swing.JButton();
        matriculaT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        modelT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        motorT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        marcaT = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        guardar.setBackground(new java.awt.Color(255, 102, 102));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardarcoche.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Matricula:");

        jLabel2.setText("Model:");

        jLabel3.setText("Motor:");

        motorT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorTActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/basrdatos.png"))); // NOI18N
        jButton2.setText("SERIALIZAR COCHE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Marca:");

        jButton4.setBackground(new java.awt.Color(255, 153, 153));
        jButton4.setForeground(new java.awt.Color(255, 51, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/basrdatos.png"))); // NOI18N
        jButton4.setText("DES-SERIALIZAR COCHE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(matriculaT, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(marcaT, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(modelT, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(motorT, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matriculaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motorT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(guardar)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
         try {
            //Class.forName("com.mysql.jdbc.Driver");
            ResultSet rs = null;
            String sql3 = "select * from coches";
            st = con.createStatement();
            rs = st.executeQuery(sql3);
            while (rs.next()) {
                coches.add(new Coche1(rs.getString(1), rs.getString(2), rs.getString(3), Integer.parseInt(rs.getString(4))));
            }
        } catch (SQLException sqe) {
        }
        
        String marca = "";
        String matricula = "";
        String model = "";
        int motor = 0;

        boolean t = true;
        boolean tm = true;
        marca = marcaT.getText();
        model = modelT.getText();

        try {
            motor = Integer.parseInt(motorT.getText());
        } catch (Exception e) {
            t = false;
            JOptionPane.showMessageDialog(this, "Motor no vale ! escribe numeros!");
        }
        for (int i = 0; i < coches.size(); i++) {
            Coche1 c = (Coche1) coches.get(i);
            String cm = c.matricula;
            String mm = matriculaT.getText();
            System.out.println(mm + cm);

            if (mm.equals(cm)) {
                tm = false;
                t = false;
                System.out.println(c.matricula);
            }

        }
        if (tm == true) {
            matricula = matriculaT.getText();
        } else {
            JOptionPane.showMessageDialog(this, "No vale Matricula!!");
            matriculaT.setText("");
        }
        if (t == true) {
           
            Coche1 coche = new Coche1(matricula, marca, model, motor);
            coches2.add(coche);
            marcaT.setText("");
            modelT.setText("");
            motorT.setText("");
            matriculaT.setText("");
            JOptionPane.showMessageDialog(this, "Coche guardado");
        }
        
    }//GEN-LAST:event_guardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream("coches.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(coches);
            JOptionPane.showMessageDialog(this, "ArrayList Guardado");
        } catch (Exception e) {
            System.out.println("No se puede crear el fichero");
        }
         */
        

        if (coches2.size() > 0) {
            try {
                
                for (int i = 0; i < coches2.size(); i++) {
                    Coche1 c = (Coche1) coches2.get(i);
                    String sql1 = "insert into coches values ('" + c.matricula + "','" + c.marca + "','" + c.modelo + "'," + c.motor + ")";
                    Class.forName("com.mysql.jdbc.Driver");
                    con.setAutoCommit(false);
                    st = con.createStatement();
                    System.out.println("ssss");
                    int n = st.executeUpdate(sql1);
                    System.out.println("" + n);
                    if (n == 1) {
                        System.out.println("registro borrado");
                    } else if (n == -1) {
                        System.out.println("registros borrados");
                    } else {
                        System.out.println("registro no borrado");
                    }
                }

            } catch (SQLException sqe) {
                System.out.println("Nooo!");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Coche.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            JOptionPane.showMessageDialog(this, "ha serializado!");
            coches2 = new ArrayList();
        }else {
            JOptionPane.showMessageDialog(this, "crea un coche");
        }

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void motorTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motorTActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream("coches.dat");
            ois = new ObjectInputStream(fis);
            coches = (ArrayList) ois.readObject();
            System.out.println((ArrayList) ois.readObject());

        } catch (Exception e) {
            System.out.println("No se puede crear el fichero");
        }
        System.out.println(coches);
        new CocheDatos(coches).setVisible(true);


    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Coche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Coche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    protected static javax.swing.JTextField marcaT;
    protected static javax.swing.JTextField matriculaT;
    protected static javax.swing.JTextField modelT;
    protected static javax.swing.JTextField motorT;
    // End of variables declaration//GEN-END:variables
}
