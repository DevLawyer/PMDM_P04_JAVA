package view;

/**
 *
 * @author migva
 */

import controller.List;
import controller.SortLists;
import controller.updateSaveData;
import javax.swing.JPanel;
import model.*;


public class FrameMain extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMain
     */
    public FrameMain() {
        initComponents();
        changePanel(aboutPanel);
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        mainMenuBar = new javax.swing.JMenuBar();
        menuButton = new javax.swing.JMenu();
        loadListButton = new javax.swing.JMenuItem();
        saveListButton = new javax.swing.JMenuItem();
        addButton = new javax.swing.JMenu();
        addAnalystButton = new javax.swing.JMenuItem();
        addProgrammerButton = new javax.swing.JMenuItem();
        listButton = new javax.swing.JMenu();
        showList = new javax.swing.JMenuItem();
        sortList = new javax.swing.JMenuItem();
        navButton = new javax.swing.JMenu();
        aboutButton = new javax.swing.JMenu();

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar3.add(jMenu8);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación");
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setName("JFrameMain"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        mainMenuBar.setBackground(new java.awt.Color(204, 204, 204));
        mainMenuBar.setForeground(new java.awt.Color(0, 0, 0));
        mainMenuBar.setPreferredSize(new java.awt.Dimension(222, 40));

        menuButton.setText("Menú");

        loadListButton.setBackground(new java.awt.Color(204, 204, 204));
        loadListButton.setForeground(new java.awt.Color(0, 0, 0));
        loadListButton.setText("Cargar Lista");
        loadListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadListButtonActionPerformed(evt);
            }
        });
        menuButton.add(loadListButton);

        saveListButton.setBackground(new java.awt.Color(204, 204, 204));
        saveListButton.setForeground(new java.awt.Color(0, 0, 0));
        saveListButton.setText("Guardar Lista");
        saveListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveListButtonActionPerformed(evt);
            }
        });
        menuButton.add(saveListButton);

        mainMenuBar.add(menuButton);

        addButton.setText("Añadir");

        addAnalystButton.setBackground(new java.awt.Color(204, 204, 204));
        addAnalystButton.setForeground(new java.awt.Color(0, 0, 0));
        addAnalystButton.setText("Analista");
        addAnalystButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAnalystButtonActionPerformed(evt);
            }
        });
        addButton.add(addAnalystButton);

        addProgrammerButton.setBackground(new java.awt.Color(204, 204, 204));
        addProgrammerButton.setForeground(new java.awt.Color(0, 0, 0));
        addProgrammerButton.setText("Programador");
        addProgrammerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProgrammerButtonActionPerformed(evt);
            }
        });
        addButton.add(addProgrammerButton);

        mainMenuBar.add(addButton);

        listButton.setText("Listar");
        listButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listButtonMouseClicked(evt);
            }
        });

        showList.setText("Mostrar Lista");
        showList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showListActionPerformed(evt);
            }
        });
        listButton.add(showList);

        sortList.setText("Ordenar Lista");
        sortList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortListActionPerformed(evt);
            }
        });
        listButton.add(sortList);

        mainMenuBar.add(listButton);

        navButton.setText("Navegar");
        navButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navButtonMouseClicked(evt);
            }
        });
        mainMenuBar.add(navButton);

        aboutButton.setText("Sobre App");
        aboutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutButtonMouseClicked(evt);
            }
        });
        mainMenuBar.add(aboutButton);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMenuButtonMouseClicked
        
    }//GEN-LAST:event_listMenuButtonMouseClicked

    private void addAnalystButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAnalystButtonActionPerformed
        changePanel(addPanel);
        addPanel.optionSelectedAnalyst();
    }//GEN-LAST:event_addAnalystButtonActionPerformed

    private void addProgrammerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProgrammerButtonActionPerformed
        this.setContentPane(addPanel);
        this.pack();
        addPanel.optionSelectedProgrammer();
    }//GEN-LAST:event_addProgrammerButtonActionPerformed

    private void aboutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutButtonMouseClicked
        changePanel(aboutPanel);
    }//GEN-LAST:event_aboutButtonMouseClicked

    private void loadListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadListButtonActionPerformed
        updateSaveData.updateFromFile();
    }//GEN-LAST:event_loadListButtonActionPerformed

    private void navButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navButtonMouseClicked
        changePanel(new NavPanel());

    }//GEN-LAST:event_navButtonMouseClicked

    private void saveListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveListButtonActionPerformed
        updateSaveData.saveInFile();
    }//GEN-LAST:event_saveListButtonActionPerformed

    private void showListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showListActionPerformed
        changePanel(new ListPanel());        
    }//GEN-LAST:event_showListActionPerformed

    private void sortListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortListActionPerformed
        sortDialog = new sortJDialog(this, true);
        SortLists sort = new SortLists();
        sortDialog.setMessageSortedList(Long.toString(SortLists.getOwnListTime())+" milisegundos.");
        sortDialog.setMessageSortedArrayList(Long.toString(SortLists.getCollectionTime())+" milisegundos.");
        sortDialog.setVisible(true);
    }//GEN-LAST:event_sortListActionPerformed

    private void listButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listButtonMouseClicked

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
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    
        Analyst al1 = new Analyst("1","Paco", "1500", "2000","01/01/2020");
        myList.addNode(al1, al1.getIdEmployee());
        Programmer pro1 = new Programmer("5","Pepe", "1500", "2000","01/01/2020");
        myList.addNode(pro1, pro1.getIdEmployee());
        Analyst al2 = new Analyst("2","Maria", "1500", "2000","01/01/2020");
        myList.addNode(al2, al2.getIdEmployee());
        Programmer pro2 = new Programmer("4","Andrés", "1500", "2000", "01/01/2020");
        myList.addNode(pro2, pro2.getIdEmployee());
        Programmer pro3 = new Programmer("3","Luis","1500", "2000", "01/01/2020");
        myList.addNode(pro3, pro3.getIdEmployee());
        Analyst al3 = new Analyst("6","Marta","1500", "2000","01/01/2020");
        myList.addNode(al3, al3.getIdEmployee());
    
    }
    
    public static List getMainList(){
        return myList;
    }
    
    public void changePanel(JPanel showPanel){
        setContentPane(showPanel);
        pack();        
    }
    
    
    // Attributes //////////////////////////////////////////////////////////////
    private static List myList = new List();
    private AddPanel addPanel = new AddPanel();
    private AboutPanel aboutPanel = new AboutPanel();
    public static sortJDialog sortDialog;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutButton;
    private javax.swing.JMenuItem addAnalystButton;
    private javax.swing.JMenu addButton;
    private javax.swing.JMenuItem addProgrammerButton;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenu listButton;
    private javax.swing.JMenuItem loadListButton;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JMenu menuButton;
    private javax.swing.JMenu navButton;
    private javax.swing.JMenuItem saveListButton;
    private javax.swing.JMenuItem showList;
    private javax.swing.JMenuItem sortList;
    // End of variables declaration//GEN-END:variables
}