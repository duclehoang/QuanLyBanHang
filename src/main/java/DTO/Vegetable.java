/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nguye
 */
@Entity
@Table(name = "vegetable", catalog = "market2", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vegetable.findAll", query = "SELECT v FROM Vegetable v"),
    @NamedQuery(name = "Vegetable.findByVegetableID", query = "SELECT v FROM Vegetable v WHERE v.vegetableID = :vegetableID"),
    @NamedQuery(name = "Vegetable.findByCatagoryID", query = "SELECT v FROM Vegetable v WHERE v.catagoryID = :catagoryID"),
    @NamedQuery(name = "Vegetable.findByVegetableName", query = "SELECT v FROM Vegetable v WHERE v.vegetableName = :vegetableName"),
    @NamedQuery(name = "Vegetable.findByUnit", query = "SELECT v FROM Vegetable v WHERE v.unit = :unit"),
    @NamedQuery(name = "Vegetable.findByAmount", query = "SELECT v FROM Vegetable v WHERE v.amount = :amount"),
    @NamedQuery(name = "Vegetable.findByImage", query = "SELECT v FROM Vegetable v WHERE v.image = :image"),
    @NamedQuery(name = "Vegetable.findByPrice", query = "SELECT v FROM Vegetable v WHERE v.price = :price")})
public class Vegetable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VegetableID", nullable = false)
    private Integer vegetableID;
    @Basic(optional = false)
    @Column(name = "CatagoryID", nullable = false)
    private int catagoryID;
    @Basic(optional = false)
    @Column(name = "VegetableName", nullable = false, length = 30)
    private String vegetableName;
    @Basic(optional = false)
    @Column(name = "Unit", nullable = false, length = 20)
    private String unit;
    @Basic(optional = false)
    @Column(name = "Amount", nullable = false)
    private int amount;
    @Basic(optional = false)
    @Column(name = "Image", nullable = false, length = 50)
    private String image;
    @Basic(optional = false)
    @Column(name = "Price", nullable = false)
    private float price;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "vegetable")
    private Category category;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vegetableID")
    private List<Orderdetail> orderdetailList;

    public Vegetable() {
    }

    public Vegetable(Integer vegetableID) {
        this.vegetableID = vegetableID;
    }

    public Vegetable(Integer vegetableID, int catagoryID, String vegetableName, String unit, int amount, String image, float price) {
        this.vegetableID = vegetableID;
        this.catagoryID = catagoryID;
        this.vegetableName = vegetableName;
        this.unit = unit;
        this.amount = amount;
        this.image = image;
        this.price = price;
    }

    public Integer getVegetableID() {
        return vegetableID;
    }

    public void setVegetableID(Integer vegetableID) {
        this.vegetableID = vegetableID;
    }

    public int getCatagoryID() {
        return catagoryID;
    }

    public void setCatagoryID(int catagoryID) {
        this.catagoryID = catagoryID;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @XmlTransient
    public List<Orderdetail> getOrderdetailList() {
        return orderdetailList;
    }

    public void setOrderdetailList(List<Orderdetail> orderdetailList) {
        this.orderdetailList = orderdetailList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vegetableID != null ? vegetableID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vegetable)) {
            return false;
        }
        Vegetable other = (Vegetable) object;
        if ((this.vegetableID == null && other.vegetableID != null) || (this.vegetableID != null && !this.vegetableID.equals(other.vegetableID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DTO.Vegetable[ vegetableID=" + vegetableID + " ]";
    }
    
}
