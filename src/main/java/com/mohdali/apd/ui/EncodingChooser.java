/*
 * EncodingChooser.java
 *
 * Created on February 6, 2006, 9:03 PM
 */

package com.mohdali.apd.ui;

/**
 *
 * @author  Ali
 */
@SuppressWarnings("serial")
public class EncodingChooser extends javax.swing.JPanel {

    /** Creates new form EncodingChooser */
    public EncodingChooser() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();

        jLabel1.setText("Encoding:");

        jComboBox1.setModel(
                new javax.swing.DefaultComboBoxModel<String>(new String[] { "cp1256", "iso8859-6", "UTF-8" }));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup().add(23, 23, 23).add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 83,
                                org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(layout
                .createSequentialGroup().addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE).add(jLabel1).add(jComboBox1,
                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
                        org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    public String getChoice() {
        return (String) jComboBox1.getSelectedItem();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
