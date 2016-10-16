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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pernikar
 */
@Entity
@Table(name = "vzaty")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vzaty.findAll", query = "SELECT v FROM Vzaty v"),
    @NamedQuery(name = "Vzaty.findByIdPracovnik", query = "SELECT v FROM Vzaty v WHERE v.idPracovnik = :idPracovnik"),
    @NamedQuery(name = "Vzaty.findByIdVeduci", query = "SELECT v FROM Vzaty v WHERE v.idVeduci = :idVeduci")})
public class Vzaty implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_pracovnik")
    private Integer idPracovnik;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_veduci")
    private int idVeduci;

    public Vzaty() {
    }

    public Vzaty(Integer idPracovnik) {
        this.idPracovnik = idPracovnik;
    }

    public Vzaty(Integer idPracovnik, int idVeduci) {
        this.idPracovnik = idPracovnik;
        this.idVeduci = idVeduci;
    }

    public Integer getIdPracovnik() {
        return idPracovnik;
    }

    public void setIdPracovnik(Integer idPracovnik) {
        this.idPracovnik = idPracovnik;
    }

    public int getIdVeduci() {
        return idVeduci;
    }

    public void setIdVeduci(int idVeduci) {
        this.idVeduci = idVeduci;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPracovnik != null ? idPracovnik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vzaty)) {
            return false;
        }
        Vzaty other = (Vzaty) object;
        if ((this.idPracovnik == null && other.idPracovnik != null) || (this.idPracovnik != null && !this.idPracovnik.equals(other.idPracovnik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Vzaty[ idPracovnik=" + idPracovnik + " ]";
    }
    
}
