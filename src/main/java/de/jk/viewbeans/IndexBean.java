package de.jk.viewbeans;

import javax.faces.bean.SessionScoped;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class IndexBean implements Serializable {
 //changed
        private static final long serialVersionUID = 1L;
 
        private String name;
 
        public String getName() {
                return name+"hdfdf";
        }
        public void setName(String name) {
                this.name = name;
        }

}
