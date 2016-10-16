/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pernikar
 */
@Entity
@Table(name = "skupiny")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Skupiny.findAll", query = "SELECT s FROM Skupiny s"),
    @NamedQuery(name = "Skupiny.findByIdSkupiny", query = "SELECT s FROM Skupiny s WHERE s.idSkupiny = :idSkupiny"),
    @NamedQuery(name = "Skupiny.findByIdVeduci", query = "SELECT s FROM Skupiny s WHERE s.idVeduci = :idVeduci"),
    @NamedQuery(name = "Skupiny.findByNazov", query = "SELECT s FROM Skupiny s WHERE s.nazov = :nazov"),
    @NamedQuery(name = "Skupiny.findByInfo", query = "SELECT s FROM Skupiny s WHERE s.info = :info")})
public class Skupiny implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_skupiny")
    private Integer idSkupiny;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_veduci")
    private int idVeduci;
    @Size(max = 30)
    @Column(name = "nazov")
    private String nazov;
    @Size(max = 300)
    @Column(name = "info")
    private String info;

    public Skupiny() {
    }

    public Skupiny(Integer idSkupiny) {
        this.idSkupiny = idSkupiny;
    }

    public Skupiny(Integer idSkupiny, int idVeduci) {
        this.idSkupiny = idSkupiny;
        this.idVeduci = idVeduci;
    }

    public Integer getIdSkupiny() {
        return idSkupiny;
    }

    public void setIdSkupiny(Integer idSkupiny) {
        this.idSkupiny = idSkupiny;
    }

    public int getIdVeduci() {
        return idVeduci;
    }

    public void setIdVeduci(int idVeduci) {
        this.idVeduci = idVeduci;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSkupiny != null ? idSkupiny.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Skupiny)) {
            return false;
        }
        Skupiny other = (Skupiny) object;
        if ((this.idSkupiny == null && other.idSkupiny != null) || (this.idSkupiny != null && !this.idSkupiny.equals(other.idSkupiny))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Skupiny[ idSkupiny=" + idSkupiny + " ]";
    }
    
}
