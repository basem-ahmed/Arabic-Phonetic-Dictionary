/*
 * DictionaryListModel.java
 *
 * Created on February 8, 2006, 9:31 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.mohdali.apd.ui;

import java.util.Map;
import com.mohdali.apd.lib.*;
/**
 *
 * @author Ali
 */
public class DictionaryListModel extends javax.swing.AbstractListModel{
    private Map<String,PhoneticDictionaryEntry> dict;
    private String[] keyArray;
    /** Creates a new instance of DictionaryListModel */
    
    public DictionaryListModel(Map<String,PhoneticDictionaryEntry> dict) {
        this.dict=dict;        
        keyArray=dict.keySet().toArray(new String[0]);
        //fireIntervalAdded(this,1,dict.size());
    }

    public int getSize() {
        return keyArray.length;
    }

    public Object getElementAt(int index) {
        return keyArray[index];
    }
    
    public void addElement(PhoneticDictionaryEntry e){
        dict.put(e.getKey(),e);
        keyArray=dict.keySet().toArray(new String[0]);
        for(int i=0;i<keyArray.length;i++){
            if(e.equals(keyArray[i])){
                fireIntervalAdded(this,i,i);
                break;
            }
        }
    }
    
    public void removeElement(PhoneticDictionaryEntry e){
        int i;
        for(i=0;i<keyArray.length;i++){
            if(e.equals(keyArray[i])){
                break;
            }
        }
        dict.remove(e);
        keyArray=dict.keySet().toArray(new String[0]);
        fireIntervalRemoved(this,i,i);     
    }    
}
