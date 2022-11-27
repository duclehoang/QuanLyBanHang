/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "statistics", catalog = "market2", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Statistics.findAll", query = "SELECT s FROM Statistics s"),
    @NamedQuery(name = "Statistics.findById", query = "SELECT s FROM Statistics s WHERE s.id = :id"),
    @NamedQuery(name = "Statistics.findByTotalOrder", query = "SELECT s FROM Statistics s WHERE s.totalOrder = :totalOrder"),
    @NamedQuery(name = "Statistics.findByTotalMoney", query = "SELECT s FROM Statistics s WHERE s.totalMoney = :totalMoney")})
public class Statistics implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "TotalOrder", nullable = false)
    private int totalOrder;
    @Basic(optional = false)
    @Column(name = "TotalMoney", nullable = false)
    private float totalMoney;
    @JoinColumn(name = "OrderID", referencedColumnName = "OrderID", nullable = false)
    @ManyToOne(optional = false)
    private Order orderID;

    public Statistics() {
    }

    public Statistics(Integer id) {
        this.id = id;
    }

    public Statistics(Integer id, int totalOrder, float totalMoney) {
        this.id = id;
        this.totalOrder = totalOrder;
        this.totalMoney = totalMoney;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(int totalOrder) {
        this.totalOrder = totalOrder;
    }

    public float getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(float totalMoney) {
        this.totalMoney = totalMoney;
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
        if (!(object instanceof Statistics)) {
            return false;
        }
        Statistics other = (Statistics) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DTO.Statistics[ id=" + id + " ]";
    }
    
}
