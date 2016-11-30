/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import classes.*;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Eduardo
 */
public class Player extends javax.swing.JFrame {
    
    App app = new App();

    /**
     * Creates new form Player
     */
    public Player() {
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

        btnPlayPause = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        pbSongProgress = new javax.swing.JProgressBar();
        spPlaylists = new javax.swing.JScrollPane();
        lbPlaylists = new javax.swing.JList<>();
        spSongs = new javax.swing.JScrollPane();
        lbSongs = new javax.swing.JList<>();
        lblUsersPhoto = new javax.swing.JLabel();
        lblUsersName = new javax.swing.JLabel();
        lblPlaylists = new javax.swing.JLabel();
        lblSongs = new javax.swing.JLabel();
        btnNewPlaylist = new javax.swing.JButton();
        btnAddFile = new javax.swing.JButton();
        btnAddDirectory = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnRepeat = new javax.swing.JButton();
        mnuBar = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuExit = new javax.swing.JMenuItem();
        mnuUsers = new javax.swing.JMenu();
        mnuNewUser = new javax.swing.JMenuItem();
        mnuViewUsers = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Music Player");
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setName("Player"); // NOI18N
        setResizable(false);

        btnPlayPause.setText("P");
        btnPlayPause.setPreferredSize(new java.awt.Dimension(60, 60));
        btnPlayPause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPlayPauseMouseReleased(evt);
            }
        });

        btnNext.setText("N");
        btnNext.setPreferredSize(new java.awt.Dimension(45, 45));

        btnPrevious.setText("PR");
        btnPrevious.setPreferredSize(new java.awt.Dimension(45, 45));

        lbPlaylists.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        spPlaylists.setViewportView(lbPlaylists);

        lbSongs.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        spSongs.setViewportView(lbSongs);

        lblUsersPhoto.setText("User's photo");

        lblUsersName.setText("User's name");

        lblPlaylists.setText("Playlists:");

        lblSongs.setText("Songs:");

        btnNewPlaylist.setText("New Playlist");

        btnAddFile.setText("Add File");
        btnAddFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAddFileMouseReleased(evt);
            }
        });
        btnAddFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFileActionPerformed(evt);
            }
        });

        btnAddDirectory.setText("Add Directory");

        btnStop.setText("S");
        btnStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnStopMouseReleased(evt);
            }
        });

        btnRepeat.setText("R");

        mnuFile.setText("File");

        mnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        mnuFile.add(mnuExit);

        mnuBar.add(mnuFile);

        mnuUsers.setText("Users");

        mnuNewUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnuNewUser.setText("New user...");
        mnuNewUser.setToolTipText("");
        mnuUsers.add(mnuNewUser);

        mnuViewUsers.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        mnuViewUsers.setText("View users");
        mnuViewUsers.setToolTipText("");
        mnuUsers.add(mnuViewUsers);

        mnuBar.add(mnuUsers);

        setJMenuBar(mnuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUsersPhoto)
                                    .addComponent(lblUsersName)))
                            .addComponent(lblPlaylists)
                            .addComponent(spPlaylists, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSongs)
                            .addComponent(spSongs, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNewPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAddFile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddDirectory, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(pbSongProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRepeat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlayPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStop)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsersPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsersName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPlaylists)
                        .addGap(3, 3, 3)
                        .addComponent(spPlaylists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblSongs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spSongs, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddDirectory)
                                .addGap(50, 50, 50)
                                .addComponent(btnNewPlaylist)))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlayPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStop)
                    .addComponent(btnRepeat))
                .addGap(18, 18, 18)
                .addComponent(pbSongProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuExitActionPerformed

    private void btnStopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStopMouseReleased
        app.Stop();
        btnPlayPause.setText("P");
    }//GEN-LAST:event_btnStopMouseReleased

    private void btnPlayPauseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayPauseMouseReleased
        app.PlayPause("C:\\Users\\Eduardo\\Desktop\\Musicas\\Músicas\\005. Calvin Harris feat. Rihanna - This Is What You Came For.mp3");
        if (app.playing){
            btnPlayPause.setText("PA");
        }
        else{
            btnPlayPause.setText("P");
        }
    }//GEN-LAST:event_btnPlayPauseMouseReleased

    private void btnAddFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddFileActionPerformed

    private void btnAddFileMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddFileMouseReleased
        FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3 Files", "mp3", "mpeg3");
        JFileChooser chooser = new JFileChooser("C:\\");
        chooser.addChoosableFileFilter(filter);
        
        int returnVal = chooser.showOpenDialog(null);
        
        if (returnVal == JFileChooser.APPROVE_OPTION){
            File myFile = chooser.getSelectedFile();
            String song = myFile + "";
            String name = chooser.getSelectedFile().getName();
            //Display.setText(name);
            app.PlayPause(song);
        }
    }//GEN-LAST:event_btnAddFileMouseReleased

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
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Player().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDirectory;
    private javax.swing.JButton btnAddFile;
    private javax.swing.JButton btnNewPlaylist;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPlayPause;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnRepeat;
    private javax.swing.JButton btnStop;
    private javax.swing.JList<String> lbPlaylists;
    private javax.swing.JList<String> lbSongs;
    private javax.swing.JLabel lblPlaylists;
    private javax.swing.JLabel lblSongs;
    private javax.swing.JLabel lblUsersName;
    private javax.swing.JLabel lblUsersPhoto;
    private javax.swing.JMenuBar mnuBar;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuNewUser;
    private javax.swing.JMenu mnuUsers;
    private javax.swing.JMenuItem mnuViewUsers;
    private javax.swing.JProgressBar pbSongProgress;
    private javax.swing.JScrollPane spPlaylists;
    private javax.swing.JScrollPane spSongs;
    // End of variables declaration//GEN-END:variables
}
