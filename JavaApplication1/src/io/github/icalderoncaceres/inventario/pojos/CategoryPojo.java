/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.icalderoncaceres.inventario.pojos;

/**
 *
 * @author Iván Calderon / https://icalderoncaceres.github.io
 */
public class CategoryPojo {
    private int id;
    private String description;
    private boolean state;

    public CategoryPojo(String description) {
        this.description = description;
        this.state=true;
        this.id=1;
    }

    public CategoryPojo(String description,boolean state) {
        this.description = description;
        this.state=state;
        this.id=1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        

    /**
     *
     * @return the Category Description
     */
    @Override
    public String toString() {
        return description;
    }
    
    
    
}
