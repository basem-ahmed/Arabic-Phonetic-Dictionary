/*
 * MainFrame.java
 *
 * Created on January 22, 2006, 4:48 AM
 */

package com.mohdali.apd.ui;

import com.sun.jmx.remote.util.EnvHelp;
import com.mohdali.apd.lib.*;
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;

/**
 *
 * @author  Ali
 */
public class MainFrame extends javax.swing.JFrame {
    
    /** Creates new form MainFrame */
    public MainFrame() {
	initComponents();
        //this.applyComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);
        VisualListener e=new VisualListener(this);
        Main.loadConfig();
        Main.statusEvent.addListener(e);
        Main.progressEvent.addListener(e);
        Main.updateEvent.addListener(new DictionaryUpdateListener(this));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buildDictionaryDialog = new javax.swing.JDialog();

        loadFiles = new javax.swing.JFileChooser();
        saveDictionaryDialog = new javax.swing.JDialog();
        saveDictionary = new javax.swing.JFileChooser();
        loadDictionaryDialog = new javax.swing.JDialog();
        loadDictionary = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        dictionarySearchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dictionaryList = new javax.swing.JList();
        setComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);
        jPanel2 = new javax.swing.JPanel();
        dictionaryEntryField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        entryDefField = new javax.swing.JTextArea();
        saveButton = new javax.swing.JButton();
        generateDefsButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        statusLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newDictionaryItem = new javax.swing.JMenuItem();
        openDictionaryItem = new javax.swing.JMenuItem();
        saveDictionaryItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        importFilesItem = new javax.swing.JMenuItem();
        importDictionaryItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        closeItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        addEntryItem = new javax.swing.JMenuItem();
        editEntryItem = new javax.swing.JMenuItem();
        deleteEntryItem = new javax.swing.JMenuItem();

        buildDictionaryDialog.setAlwaysOnTop(true);
        buildDictionaryDialog.setModal(true);
        loadFiles.setAccessory(new EncodingChooser());
        loadFiles.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        loadFiles.setMultiSelectionEnabled(true);

        org.jdesktop.layout.GroupLayout buildDictionaryDialogLayout = new org.jdesktop.layout.GroupLayout(buildDictionaryDialog.getContentPane());
        buildDictionaryDialog.getContentPane().setLayout(buildDictionaryDialogLayout);
        buildDictionaryDialogLayout.setHorizontalGroup(
            buildDictionaryDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(buildDictionaryDialogLayout.createSequentialGroup()
                .addContainerGap()
                .add(loadFiles, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(585, Short.MAX_VALUE))
        );
        buildDictionaryDialogLayout.setVerticalGroup(
            buildDictionaryDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(buildDictionaryDialogLayout.createSequentialGroup()
                .addContainerGap()
                .add(loadFiles, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        saveDictionaryDialog.setModal(true);
        saveDictionary.setAccessory(new EncodingChooser());
        saveDictionary.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);

        org.jdesktop.layout.GroupLayout saveDictionaryDialogLayout = new org.jdesktop.layout.GroupLayout(saveDictionaryDialog.getContentPane());
        saveDictionaryDialog.getContentPane().setLayout(saveDictionaryDialogLayout);
        saveDictionaryDialogLayout.setHorizontalGroup(
            saveDictionaryDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, saveDictionaryDialogLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(saveDictionary, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        saveDictionaryDialogLayout.setVerticalGroup(
            saveDictionaryDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, saveDictionaryDialogLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(saveDictionary, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        loadDictionary.setAccessory(new EncodingChooser());

        org.jdesktop.layout.GroupLayout loadDictionaryDialogLayout = new org.jdesktop.layout.GroupLayout(loadDictionaryDialog.getContentPane());
        loadDictionaryDialog.getContentPane().setLayout(loadDictionaryDialogLayout);
        loadDictionaryDialogLayout.setHorizontalGroup(
            loadDictionaryDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(loadDictionaryDialogLayout.createSequentialGroup()
                .addContainerGap()
                .add(loadDictionary, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loadDictionaryDialogLayout.setVerticalGroup(
            loadDictionaryDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(loadDictionaryDialogLayout.createSequentialGroup()
                .addContainerGap()
                .add(loadDictionary, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dictionary"));
        dictionarySearchField.setText("\u0628\u062d\u062b ...");
        dictionarySearchField.applyComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);

        dictionaryList.applyComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);
        dictionaryList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                dictionaryListValueChanged(evt);
            }
        });

        jScrollPane1.setViewportView(dictionaryList);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, dictionarySearchField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(dictionarySearchField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Entry"));
        dictionaryEntryField.setEnabled(false);
        dictionaryEntryField.applyComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);

        entryDefField.setColumns(20);
        entryDefField.setRows(5);
        entryDefField.setEnabled(false);
        jScrollPane2.setViewportView(entryDefField);

        saveButton.setText("Save");
        saveButton.setEnabled(false);

        generateDefsButton.setText("Generate Definintions");
        generateDefsButton.setEnabled(false);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(19, 19, 19)
                        .add(saveButton))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(generateDefsButton)
                        .add(4, 4, 4)
                        .add(dictionaryEntryField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 219, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(dictionaryEntryField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(generateDefsButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 144, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(saveButton)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        progressBar.setVisible(false);
        progressBar.setStringPainted(true);

        statusLabel.setText("Ready");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(statusLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 368, Short.MAX_VALUE)
                .add(progressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 173, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(progressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(statusLabel))
                .addContainerGap())
        );

        fileMenu.setMnemonic('F');
        fileMenu.setText("File");
        newDictionaryItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newDictionaryItem.setMnemonic('N');
        newDictionaryItem.setText("New Dictionary");
        newDictionaryItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newDictionaryItemActionPerformed(evt);
            }
        });

        fileMenu.add(newDictionaryItem);

        openDictionaryItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openDictionaryItem.setMnemonic('O');
        openDictionaryItem.setText("Open Dicitonary");
        openDictionaryItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openDictionaryItemActionPerformed(evt);
            }
        });

        fileMenu.add(openDictionaryItem);

        saveDictionaryItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveDictionaryItem.setMnemonic('S');
        saveDictionaryItem.setText("Save Dictionary");
        saveDictionaryItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDictionaryItemActionPerformed(evt);
            }
        });

        fileMenu.add(saveDictionaryItem);

        fileMenu.add(jSeparator2);

        importFilesItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        importFilesItem.setMnemonic('I');
        importFilesItem.setText("Import Files");
        importFilesItem.setToolTipText("");
        importFilesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importFilesItemActionPerformed(evt);
            }
        });

        fileMenu.add(importFilesItem);
        importFilesItem.getAccessibleContext().setAccessibleParent(this);

        importDictionaryItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        importDictionaryItem.setMnemonic('D');
        importDictionaryItem.setText("Import Dictionary");
        importDictionaryItem.setToolTipText("Merge a previousely created dictionary with the current one");
        importDictionaryItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importDictionaryItemActionPerformed(evt);
            }
        });

        fileMenu.add(importDictionaryItem);

        fileMenu.add(jSeparator1);

        closeItem.setText("Close");
        closeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeItemActionPerformed(evt);
            }
        });

        fileMenu.add(closeItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");
        addEntryItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        addEntryItem.setMnemonic('A');
        addEntryItem.setText("Add Entry");
        editMenu.add(addEntryItem);

        editEntryItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        editEntryItem.setMnemonic('E');
        editEntryItem.setText("Edit Entry");
        editMenu.add(editEntryItem);

        deleteEntryItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        deleteEntryItem.setMnemonic('D');
        deleteEntryItem.setText("Delete Entry");
        editMenu.add(deleteEntryItem);

        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openDictionaryItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openDictionaryItemActionPerformed
// TODO add your handling code here:
        Map dict=(Map)ConfigManager.getProperty("Dictionary");
        if(!dict.isEmpty() && !isSaved){
            int val=javax.swing.JOptionPane.showOptionDialog(this,
               "Current Dictionary not saved. Do you want to save?","Warning",
               javax.swing.JOptionPane.YES_NO_CANCEL_OPTION,
               javax.swing.JOptionPane.QUESTION_MESSAGE,
               null,
               null,
               null);
            if(val==javax.swing.JOptionPane.YES_OPTION){
                saveDictionary();
            }else if(val==javax.swing.JOptionPane.CANCEL_OPTION){
                return;
            }
        }
        Main.clearDict();
        int value=loadDictionary.showOpenDialog(loadDictionaryDialog);
        final String encoding = ((EncodingChooser) loadDictionary.getAccessory()).getChoice();
        if(value==javax.swing.JFileChooser.APPROVE_OPTION){
            new Thread(new Runnable(){
                public void run(){
                        Main.readDict(loadDictionary.getSelectedFile(),encoding);                   
                }
            }).start();
        }        
    }//GEN-LAST:event_openDictionaryItemActionPerformed

    private void newDictionaryItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDictionaryItemActionPerformed
// TODO add your handling code here:
        Map dict=(Map) ConfigManager.getProperty("Dictionary");
        if(!dict.isEmpty() && !isSaved){
            int val=javax.swing.JOptionPane.showOptionDialog(this,
               "Current Dictionary not saved. Do you want to save?","Warning",
               javax.swing.JOptionPane.YES_NO_CANCEL_OPTION,
               javax.swing.JOptionPane.QUESTION_MESSAGE,
               null,
               null,
               null);
            if(val==javax.swing.JOptionPane.YES_OPTION){
                saveDictionary();
            }else if(val==javax.swing.JOptionPane.CANCEL_OPTION){
                return;
            }
        }
        Main.clearDict();
        Main.updateList();        
    }//GEN-LAST:event_newDictionaryItemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
// TODO add your handling code here:
       Main.stopThreads=true;
       /*javax.swing.JOptionPane.showOptionDialog(this,
               "Do you want to save?","Warning",
               javax.swing.JOptionPane.YES_NO_CANCEL_OPTION,
               javax.swing.JOptionPane.QUESTION_MESSAGE,
               null,
               null,
               null);*/
       
    }//GEN-LAST:event_formWindowClosing

    private void dictionaryListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_dictionaryListValueChanged
// TODO add your handling code here:
        if(dictionaryList.getSelectedIndex()!= -1){
            String key=(String) dictionaryList.getSelectedValue();
            dictionaryEntryField.setText(key);
            Map<String,PhoneticDictionaryEntry> dict= (Map<String,PhoneticDictionaryEntry>)ConfigManager.getProperty("Dictionary");
            PhoneticDictionaryEntry e = dict.get(key);
            ArrayList<String> list =e.getDefs();
            entryDefField.setText("");
            for(String def:list){
                entryDefField.setText(entryDefField.getText()+def+"\n");
            }
        }
        
    }//GEN-LAST:event_dictionaryListValueChanged

    private void importDictionaryItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importDictionaryItemActionPerformed
// TODO add your handling code here:
        int value=loadDictionary.showOpenDialog(loadDictionaryDialog);
        final String encoding = ((EncodingChooser) loadDictionary.getAccessory()).getChoice();
        if(value==javax.swing.JFileChooser.APPROVE_OPTION){
            new Thread(new Runnable(){
                public void run(){
                        Main.readDict(loadDictionary.getSelectedFile(),encoding);                   
                }
            }).start();
        }
    }//GEN-LAST:event_importDictionaryItemActionPerformed

    private void closeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeItemActionPerformed
// TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeItemActionPerformed

    private void saveDictionaryItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDictionaryItemActionPerformed
// TODO add your handling code here:
        saveDictionary();
    }//GEN-LAST:event_saveDictionaryItemActionPerformed
           
    private void importFilesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importFilesItemActionPerformed
// TODO add your handling code here:
        int value=loadFiles.showOpenDialog(buildDictionaryDialog);
        final String encoding = ((EncodingChooser) loadFiles.getAccessory()).getChoice();
        if(value==javax.swing.JFileChooser.APPROVE_OPTION){
            new Thread(new Runnable(){
                public void run(){
                   for(java.io.File f: loadFiles.getSelectedFiles()){
                        Main.importFiles(f,encoding);
                   }
                }
            }).start();
        }
    }//GEN-LAST:event_importFilesItemActionPerformed
    
    private void saveDictionary(){
        int value=saveDictionary.showSaveDialog(saveDictionaryDialog);
        final String encoding = ((EncodingChooser) saveDictionary.getAccessory()).getChoice();
        if(value==javax.swing.JFileChooser.APPROVE_OPTION){
            new Thread(new Runnable(){
                public void run(){
                   Main.writeDict(saveDictionary.getSelectedFile(),encoding);
                }
            }).start();
        }        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });       
    }
    private boolean isSaved=true;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addEntryItem;
    private javax.swing.JDialog buildDictionaryDialog;
    private javax.swing.JMenuItem closeItem;
    private javax.swing.JMenuItem deleteEntryItem;
    public javax.swing.JTextField dictionaryEntryField;
    public javax.swing.JList dictionaryList;
    private javax.swing.JTextField dictionarySearchField;
    private javax.swing.JMenuItem editEntryItem;
    private javax.swing.JMenu editMenu;
    public javax.swing.JTextArea entryDefField;
    private javax.swing.JMenu fileMenu;
    public javax.swing.JButton generateDefsButton;
    private javax.swing.JMenuItem importDictionaryItem;
    private javax.swing.JMenuItem importFilesItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JFileChooser loadDictionary;
    private javax.swing.JDialog loadDictionaryDialog;
    private javax.swing.JFileChooser loadFiles;
    private javax.swing.JMenuItem newDictionaryItem;
    private javax.swing.JMenuItem openDictionaryItem;
    public javax.swing.JProgressBar progressBar;
    public javax.swing.JButton saveButton;
    private javax.swing.JFileChooser saveDictionary;
    private javax.swing.JDialog saveDictionaryDialog;
    private javax.swing.JMenuItem saveDictionaryItem;
    public javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
    
}


