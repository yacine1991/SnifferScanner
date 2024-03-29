package Fenetres;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Yacine
 */
public class ScannerWindow extends javax.swing.JFrame {

    Integer[] monIP;
    ArrayList<Integer[]> ipSousreseau;
    DefaultListModel dlmAdressesIps;

    /**
     * Creates new form ScannerWindow
     */
    public ScannerWindow() throws InterruptedException, ExecutionException, UnknownHostException, IOException {
        initComponents();
        setTitle("Scanner");
        DefaultListModel dlmAdressesIps = new DefaultListModel();
        getIp();
        chargerAdressesIpsSousReseau(dlmAdressesIps);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        adressesIpjList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        portAdressejList = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ipLabel = new javax.swing.JLabel();
        ipAdressLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomMachinejLabel = new javax.swing.JLabel();
        filtrerBouton = new javax.swing.JButton();
        filtrageBouton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(adressesIpjList);

        jScrollPane2.setViewportView(portAdressejList);

        jButton1.setText("Tester");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Mon IP :");

        ipAdressLabel.setText("ipLabel");

        jLabel2.setText("Name :");

        nomMachinejLabel.setText("nomMachine");

        filtrerBouton.setText("Pinger");
        filtrerBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrerBoutonActionPerformed(evt);
            }
        });

        filtrageBouton.setText("Tout filtrer");
        filtrageBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrageBoutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(ipLabel)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ipAdressLabel)
                    .addComponent(nomMachinejLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filtrerBouton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(filtrageBouton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ipLabel)
                    .addComponent(ipAdressLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nomMachinejLabel))
                        .addGap(99, 99, 99)
                        .addComponent(filtrerBouton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filtrageBouton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int adresseATester = adressesIpjList.getSelectedIndex();
        try {

            testerPorts(ipTabToIpStringWithCustomizedAdress(monIP, adresseATester));
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(ScannerWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void filtrerBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrerBoutonActionPerformed
        pingerIp(ipSousreseau);
    }//GEN-LAST:event_filtrerBoutonActionPerformed

    private void filtrageBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrageBoutonActionPerformed
        int resultat = JOptionPane.showConfirmDialog(this,
                "Cela peut prendre beaucoup de temps ! ",
                "Attention",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (resultat == JOptionPane.YES_OPTION) {
            filtrerIps(ipSousreseau, dlmAdressesIps);
        }
    }//GEN-LAST:event_filtrageBoutonActionPerformed

    private void filtrerIps(ArrayList ipSousreseau, DefaultListModel dlmAdressesIps) {
        dlmAdressesIps = new DefaultListModel();
        for (int i = 169; i < 175; i++) {
            try {
                Integer[] ipChoisie = (Integer[]) ipSousreseau.get(i);
                ipChoisie[3] = i;
                InetAddress inet = null;
                inet = InetAddress.getByAddress(new byte[]{ipChoisie[0].byteValue(), ipChoisie[1].byteValue(),
                    ipChoisie[2].byteValue(), ipChoisie[3].byteValue()});

                System.out.println("Sending Ping Request to " + inet);

                if (inet.isReachable(5000)) {
                    dlmAdressesIps.addElement(ipTabToIpStringWithCustomizedAdress(ipChoisie, i));
                } else {
                    System.out.println("Nein ! " + i);
                }


            } catch (IOException ex) {
                Logger.getLogger(ScannerWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (dlmAdressesIps.isEmpty()) {
            dlmAdressesIps.addElement("Nothing to add");
        }
        adressesIpjList.setModel(dlmAdressesIps);

    }

    private void pingerIp(ArrayList ipSousreseau) {
        int indexAdresse = adressesIpjList.getSelectedIndex();
        System.out.println("indewAdress : " + indexAdresse);
        System.out.println("Araylist " + ipSousreseau.get(indexAdresse));
        Integer[] ipChoisie = (Integer[]) ipSousreseau.get(indexAdresse);
        ipChoisie[3] = indexAdresse;
        try {
            InetAddress inet = null;
            inet = InetAddress.getByAddress(new byte[]{ipChoisie[0].byteValue(), ipChoisie[1].byteValue(),
                ipChoisie[2].byteValue(), ipChoisie[3].byteValue()});
            System.out.println("Sending Ping Request to " + inet);
            JOptionPane.showMessageDialog(this, inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");
        } catch (IOException ex) {
            Logger.getLogger(ScannerWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private String ipTabToIpString(Integer[] ip) {
        String ipString = ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3];
        return ipString;

    }

    private String ipTabToIpStringWithCustomizedAdress(Integer[] ip, int index) {
        String ipString = ip[0] + "." + ip[1] + "." + ip[2] + "." + index;
        return ipString;

    }

    private void chargerAdressesIpsSousReseau(DefaultListModel dlmAdressesIps) {

        ipSousreseau = new ArrayList<>();
        System.out.println(monIP);
        Integer[] newIP = monIP;
        for (int i = 0; i <= 255; i++) {
            newIP[3] = i;
            ipSousreseau.add(newIP);
            dlmAdressesIps.addElement(ipTabToIpString(newIP));
        }
        adressesIpjList.setModel(dlmAdressesIps);

    }

    private void getIp() throws UnknownHostException, IOException {
        monIP = new Integer[4];
        InetAddress thisIp = InetAddress.getLocalHost();
        nomMachinejLabel.setText(thisIp.getCanonicalHostName());
        System.out.println("IP:" + thisIp.getHostAddress());

        StringTokenizer st = new StringTokenizer(thisIp.getHostAddress(), ".");
        int i = 0;
        while (st.hasMoreTokens()) {
            monIP[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        ipAdressLabel.setText(thisIp.getHostAddress());

    }

    private void testerPorts(String ip) throws InterruptedException, ExecutionException {
        final ExecutorService es = Executors.newFixedThreadPool(20);
        DefaultListModel dlmPorts = new DefaultListModel();
        final int timeout = 200;
        final List<Future<Boolean>> futures = new ArrayList<>();

        for (int port = 1; port <= 50; port++) {
            futures.add(portIsOpen(es, ip, port, timeout));
            if (portIsOpen(es, ip, port, timeout).get() == true) {
                dlmPorts.addElement("Port n° " + port + " : " + portIsOpen(es, ip, port, timeout).get());
            } else {
                dlmPorts.addElement("Port n° " + port + " : " + portIsOpen(es, ip, port, timeout).get());
            }
        }

        es.shutdown();
        int openPorts = 0;
        for (final Future<Boolean> f : futures) {
            if (f.get()) {
                openPorts++;

            }
        }
        //portAdressejList.setCellRenderer(new MyCellRenderer());
        portAdressejList.setModel(dlmPorts);
        JOptionPane.showMessageDialog(this, "There are " + openPorts + " open ports on host " + ip + " (probed with a timeout of " + timeout + "ms)");
        //System.out.println("There are " + openPorts + " open ports on host " + ip + " (probed with a timeout of " + timeout + "ms)");
    }

    public static Future<Boolean> portIsOpen(final ExecutorService es, final String ip, final int port, final int timeout) {
        return es.submit(new Callable<Boolean>() {
            @Override
            public Boolean call() {
                try {
                    try (Socket socket = new Socket()) {
                        socket.connect(new InetSocketAddress(ip, port), timeout);
                        System.out.println("inetadress : " + socket.getInetAddress());

                    }
                    return true;
                } catch (Exception ex) {
                    return false;
                }
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScannerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new ScannerWindow().setVisible(true);
                } catch (InterruptedException | ExecutionException | UnknownHostException ex) {
                    Logger.getLogger(ScannerWindow.class.getName()).log(Level.SEVERE, null, ex);

                } catch (IOException ex) {
                    Logger.getLogger(ScannerWindow.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList adressesIpjList;
    private javax.swing.JButton filtrageBouton;
    private javax.swing.JButton filtrerBouton;
    private javax.swing.JLabel ipAdressLabel;
    private javax.swing.JLabel ipLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nomMachinejLabel;
    private javax.swing.JList portAdressejList;
    // End of variables declaration//GEN-END:variables
}
