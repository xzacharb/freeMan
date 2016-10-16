/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pernikar
 */
@Entity
@Table(name = "pracovna_doba")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PracovnaDoba.findAll", query = "SELECT p FROM PracovnaDoba p"),
    @NamedQuery(name = "PracovnaDoba.findById", query = "SELECT p FROM PracovnaDoba p WHERE p.id = :id"),
    @NamedQuery(name = "PracovnaDoba.findByIdPracovnik", query = "SELECT p FROM PracovnaDoba p WHERE p.idPracovnik = :idPracovnik"),
    @NamedQuery(name = "PracovnaDoba.findByDatum", query = "SELECT p FROM PracovnaDoba p WHERE p.datum = :datum"),
    @NamedQuery(name = "PracovnaDoba.findByCasOd", query = "SELECT p FROM PracovnaDoba p WHERE p.casOd = :casOd"),
    @NamedQuery(name = "PracovnaDoba.findByCasDo", query = "SELECT p FROM PracovnaDoba p WHERE p.casDo = :casDo")})
public class PracovnaDoba implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_pracovnik")
    private int idPracovnik;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datum")
    @Temporal(TemporalType.DATE)
    private Date datum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cas_od")
    @Temporal(TemporalType.TIME)
    private Date casOd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cas_do")
    @Temporal(TemporalType.TIME)
    private Date casDo;

    public PracovnaDoba() {
    }

    public PracovnaDoba(Integer id) {
        this.id = id;
    }

    public PracovnaDoba(Integer id, int idPracovnik, Date datum, Date casOd, Date casDo) {
        this.id = id;
        this.idPracovnik = idPracovnik;
        this.datum = datum;
        this.casOd = casOd;
        this.casDo = casDo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdPracovnik() {
        return idPracovnik;
    }

    public void setIdPracovnik(int idPracovnik) {
        this.idPracovnik = idPracovnik;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Date getCasOd() {
        return casOd;
    }

    public void setCasOd(Date casOd) {
        this.casOd = casOd;
    }

    public Date getCasDo() {
        return casDo;
    }

    public void setCasDo(Date casDo) {
        this.casDo = casDo;
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
        if (!(object instanceof PracovnaDoba)) {
            return false;
        }
        PracovnaDoba other = (PracovnaDoba) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.PracovnaDoba[ id=" + id + " ]";
    }
    
}
