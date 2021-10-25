/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.List;
import model.*;

/**
 * This panel contains the design of navigation screen to show the list information.
 * 
 */
public class NavPanel extends javax.swing.JPanel {

    /**
     * Creates new form MenuPanel
     */
    public NavPanel() {
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

        empTypeLabelShow = new javax.swing.JLabel();
        nameLabelShow = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        salaryLabelShow = new javax.swing.JLabel();
        entryDateLabelShow = new javax.swing.JLabel();
        plusExtraLabelShow = new javax.swing.JLabel();
        otherLabelShow = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        goBackButton = new javax.swing.JButton();
        forwardButton = new javax.swing.JButton();
        otherFieldShow = new javax.swing.JTextField();
        plusExtraFieldShow = new javax.swing.JTextField();
        entryDateFieldShow = new javax.swing.JTextField();
        salaryFieldShow = new javax.swing.JTextField();
        nameFieldShow = new javax.swing.JTextField();
        updateSalaryButton = new javax.swing.JButton();
        numberLabelShow = new javax.swing.JLabel();
        numberFieldShow = new javax.swing.JTextField();
        maxSalaryLabelShow = new javax.swing.JLabel();
        maxSalaryFieldShow = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));

        empTypeLabelShow.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        empTypeLabelShow.setForeground(new java.awt.Color(0, 0, 0));
        empTypeLabelShow.setText("Type");

        nameLabelShow.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        nameLabelShow.setForeground(new java.awt.Color(0, 0, 0));
        nameLabelShow.setText("Nombre:");

        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        salaryLabelShow.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        salaryLabelShow.setForeground(new java.awt.Color(0, 0, 0));
        salaryLabelShow.setText("Sueldo:");

        entryDateLabelShow.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        entryDateLabelShow.setForeground(new java.awt.Color(0, 0, 0));
        entryDateLabelShow.setText("Fecha Alta:");

        plusExtraLabelShow.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        plusExtraLabelShow.setForeground(new java.awt.Color(0, 0, 0));
        plusExtraLabelShow.setText("Plus/Extra:");

        otherLabelShow.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        otherLabelShow.setForeground(new java.awt.Color(0, 0, 0));
        otherLabelShow.setText("Other:");

        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));

        goBackButton.setBackground(new java.awt.Color(204, 204, 204));
        goBackButton.setForeground(new java.awt.Color(0, 0, 0));
        goBackButton.setText("< Retroceder");
        goBackButton.setBorder(null);
        goBackButton.setBorderPainted(false);
        goBackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBackButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        goBackButton.setMargin(new java.awt.Insets(20, 20, 20, 20));
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        forwardButton.setBackground(new java.awt.Color(204, 204, 204));
        forwardButton.setForeground(new java.awt.Color(0, 0, 0));
        forwardButton.setText("Avanzar >");
        forwardButton.setBorder(null);
        forwardButton.setBorderPainted(false);
        forwardButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forwardButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        forwardButton.setMargin(new java.awt.Insets(20, 20, 20, 20));
        forwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardButtonActionPerformed(evt);
            }
        });

        otherFieldShow.setEditable(false);
        otherFieldShow.setBackground(new java.awt.Color(204, 204, 204));

        plusExtraFieldShow.setEditable(false);
        plusExtraFieldShow.setBackground(new java.awt.Color(204, 204, 204));

        entryDateFieldShow.setEditable(false);
        entryDateFieldShow.setBackground(new java.awt.Color(204, 204, 204));

        salaryFieldShow.setEditable(false);
        salaryFieldShow.setBackground(new java.awt.Color(204, 204, 204));
        salaryFieldShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryFieldShowActionPerformed(evt);
            }
        });

        nameFieldShow.setEditable(false);
        nameFieldShow.setBackground(new java.awt.Color(204, 204, 204));
        nameFieldShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldShowActionPerformed(evt);
            }
        });

        updateSalaryButton.setBackground(new java.awt.Color(204, 204, 204));
        updateSalaryButton.setForeground(new java.awt.Color(0, 0, 0));
        updateSalaryButton.setText("Subir sueldo");
        updateSalaryButton.setBorder(null);
        updateSalaryButton.setBorderPainted(false);
        updateSalaryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateSalaryButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateSalaryButton.setMargin(new java.awt.Insets(20, 20, 20, 20));
        updateSalaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSalaryButtonActionPerformed(evt);
            }
        });

        numberLabelShow.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        numberLabelShow.setForeground(new java.awt.Color(0, 0, 0));
        numberLabelShow.setText("Número:");

        numberFieldShow.setEditable(false);
        numberFieldShow.setBackground(new java.awt.Color(204, 204, 204));
        numberFieldShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFieldShowActionPerformed(evt);
            }
        });

        maxSalaryLabelShow.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        maxSalaryLabelShow.setForeground(new java.awt.Color(0, 0, 0));
        maxSalaryLabelShow.setText("Sueldo máximo:");

        maxSalaryFieldShow.setEditable(false);
        maxSalaryFieldShow.setBackground(new java.awt.Color(204, 204, 204));
        maxSalaryFieldShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxSalaryFieldShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateSalaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(forwardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empTypeLabelShow, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maxSalaryLabelShow, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLabelShow, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numberLabelShow, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salaryLabelShow, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(entryDateLabelShow, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(plusExtraLabelShow, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(otherLabelShow, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(otherFieldShow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(plusExtraFieldShow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(entryDateFieldShow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salaryFieldShow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numberFieldShow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maxSalaryFieldShow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameFieldShow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(empTypeLabelShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberLabelShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberFieldShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabelShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameFieldShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryLabelShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaryFieldShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxSalaryLabelShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxSalaryFieldShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryDateLabelShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryDateFieldShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plusExtraLabelShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusExtraFieldShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otherLabelShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherFieldShow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forwardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateSalaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        //Definition of the back button pulsation perform.
        Object obj = myList.getCurrent().getData();
        
        myList.goBack();
        showEmployee(obj);
        enableUpdateSalaryButton(obj);

    }//GEN-LAST:event_goBackButtonActionPerformed

    private void forwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardButtonActionPerformed
        //Definition of the forward button pulsation perform.
        Object obj = myList.getCurrent().getData();
        
        myList.moveForward();
        showEmployee(myList.getCurrent().getData());
        enableUpdateSalaryButton(obj);

    }//GEN-LAST:event_forwardButtonActionPerformed
    
    private void salaryFieldShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryFieldShowActionPerformed
        //UNUSED ELEMENT
    }//GEN-LAST:event_salaryFieldShowActionPerformed

    private void nameFieldShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldShowActionPerformed
        //UNUSED ELEMENT
    }//GEN-LAST:event_nameFieldShowActionPerformed

    private void enableUpdateSalaryButton(Object obj){
        boolean enable = false; // Default value to enable update salary button.
        
        Employee emp = (Employee)obj;
        
        if(emp instanceof Analyst){
            /**Firstly, if the input object was an analyst 
             * and one year has passed since the entry date, 
             * enable will switch true.
             */
            Analyst auxA = (Analyst)emp;
            enable = auxA.passedOneYear();
            
        } else if(emp instanceof Programmer){
            /**Secondly, if the input object was a programmer 
             * and one month has passed since the entry date, 
             * enable will switch true.
             */
            Programmer auxP = (Programmer)emp;
            enable = auxP.passedOneMonth();
            
        }
        
        updateSalaryButton.setEnabled(enable);
    }
    
    private void updateSalaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSalaryButtonActionPerformed
        /**
         * When the update salary button is enable, according to the instance of currect object of the list,
         * the corresponding method of analyst or programmer class, is called to update the salary.
         */
        
        Employee emp = (Employee)myList.getCurrent().getData();
        
        if(emp instanceof Analyst){
            Analyst auxA = (Analyst)emp;
            auxA.updateSalary();
            
        }else if (emp instanceof Programmer){
            Programmer auxP = (Programmer)emp;
            auxP.updateSalary();   
        }
    }//GEN-LAST:event_updateSalaryButtonActionPerformed

    private void numberFieldShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFieldShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberFieldShowActionPerformed

    private void maxSalaryFieldShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxSalaryFieldShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxSalaryFieldShowActionPerformed
    
    private void showEmployee(Object obj){
        Employee emp = (Employee) obj;
        
        if(emp instanceof Analyst) {
            Analyst auxA = (Analyst) obj;
            empTypeLabelShow.setText("Analista");
            plusExtraFieldShow.setText(String.valueOf(auxA.getPlusSalary()));   // This method must be implements in Analyst class.
            //otherFieldShow.setText((Analyst)emp.);                            // This method must be declare and implements in Analyst class.
            
            
        }else if(emp instanceof Programmer){
            Programmer auxP = (Programmer) obj;
            empTypeLabelShow.setText("Programador");
            plusExtraFieldShow.setText(String.valueOf(auxP.getExtraSalary()));  // This method must be implements in Analyst class.
            //otherFieldShow.setText((Analyst)emp.);                            // This method must be declare and implements in Programmer class.
        }
        
        showCommonAtributes(emp);
    }
    
    private void showCommonAtributes(Employee emp){
        numberFieldShow.setText(String.valueOf(emp.getIdEmployee()));
        nameFieldShow.setText(emp.getName());
        salaryFieldShow.setText(String.valueOf(emp.getSalary()));
        maxSalaryFieldShow.setText(String.valueOf(emp.getMaxSalary()));
        entryDateFieldShow.setText(emp.getEntryDate());                     // This method must be declare and implements in Employee class.
    }
    
    // Attributes //////////////////////////////////////////////////////////////
    private List myList = FrameMain.getMainList(); // Main list get from FramenMain class. 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel empTypeLabelShow;
    private javax.swing.JTextField entryDateFieldShow;
    private javax.swing.JLabel entryDateLabelShow;
    private javax.swing.JButton forwardButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField maxSalaryFieldShow;
    private javax.swing.JLabel maxSalaryLabelShow;
    private javax.swing.JTextField nameFieldShow;
    private javax.swing.JLabel nameLabelShow;
    private javax.swing.JTextField numberFieldShow;
    private javax.swing.JLabel numberLabelShow;
    private javax.swing.JTextField otherFieldShow;
    private javax.swing.JLabel otherLabelShow;
    private javax.swing.JTextField plusExtraFieldShow;
    private javax.swing.JLabel plusExtraLabelShow;
    private javax.swing.JTextField salaryFieldShow;
    private javax.swing.JLabel salaryLabelShow;
    private javax.swing.JButton updateSalaryButton;
    // End of variables declaration//GEN-END:variables
}
