/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nguye
 */
@Entity
@Table(name = "orderdetail", catalog = "market2", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderdetail.findAll", query = "SELECT o FROM Orderdetail o"),
    @NamedQuery(name = "Orderdetail.findById", query = "SELECT o FROM Orderdetail o WHERE o.id = :id"),
    @NamedQuery(name = "Orderdetail.findByVegetableName", query = "SELECT o FROM Orderdetail o WHERE o.vegetableName = :vegetableName"),
    @NamedQuery(name = "Orderdetail.findByQuantity", query = "SELECT o FROM Orderdetail o WHERE o.quantity = :quantity"),
    @NamedQuery(name = "Orderdetail.findByPrice", query = "SELECT o FROM Orderdetail o WHERE o.price = :price")})
public class Orderdetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "VegetableName", nullable = false, length = 50)
    private String vegetableName;
    @Basic(optional = false)
    @Column(name = "Quantity", nullable = false)
    private short quantity;
    @Basic(optional = false)
    @Column(name = "Price", nullable = false)
    private float price;
    @JoinColumn(name = "VegetableID", referencedColumnName = "VegetableID", nullable = false)
    @ManyToOne(optional = false)
    private Vegetable vegetableID;
    @JoinColumn(name = "OrderID", referencedColumnName = "OrderID", nullable = false)
    @ManyToOne(optional = false)
    private Order orderID;

    public Orderdetail() {
    }

    public Orderdetail(Integer id) {
        this.id = id;
    }

    public Orderdetail(Integer id, String vegetableName, short quantity, float price) {
        this.id = id;
        this.vegetableName = vegetableName;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Vegetable getVegetableID() {
        return vegetableID;
    }

    public void setVegetableID(Vegetable vegetableID) {
        this.vegetableID = vegetableID;
    }

    public Order getOrderID() {
        return orderID;
    }

    public void setOrderID(Order orderID) {
        this.orderID = orderID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderdetail)) {
            return false;
        }
        Orderdetail other = (Orderdetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DTO.Orderdetail[ id=" + id + " ]";
    }
    
}
