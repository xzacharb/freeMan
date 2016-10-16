/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pernikar
 */
@Entity
@Table(name = "veduci")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Veduci.findAll", query = "SELECT v FROM Veduci v"),
    @NamedQuery(name = "Veduci.findByIdVeduci", query = "SELECT v FROM Veduci v WHERE v.idVeduci = :idVeduci"),
    @NamedQuery(name = "Veduci.findByIdSkupina", query = "SELECT v FROM Veduci v WHERE v.idSkupina = :idSkupina")})
public class Veduci implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_veduci")
    private Integer idVeduci;
    @Column(name = "id_skupina")
    private Integer idSkupina;
    /*
    @OneToMany(orphanRemoval=true, mappedBy="idVeduciFK")     
    List <Pracovnici> pracovnici;
*/

    public Veduci() {
    }

    public Veduci(Integer idVeduci) {
        this.idVeduci = idVeduci;
    }

    public Integer getIdVeduci() {
        return idVeduci;
    }

    public void setIdVeduci(Integer idVeduci) {
        this.idVeduci = idVeduci;
    }

    public Integer getIdSkupina() {
        return idSkupina;
    }

    public void setIdSkupina(Integer idSkupina) {
        this.idSkupina = idSkupina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVeduci != null ? idVeduci.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veduci)) {
            return false;
        }
        Veduci other = (Veduci) object;
        if ((this.idVeduci == null && other.idVeduci != null) || (this.idVeduci != null && !this.idVeduci.equals(other.idVeduci))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Veduci[ idVeduci=" + idVeduci + " ]";
    }
    
}
