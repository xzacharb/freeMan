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
@Table(name = "spravy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Spravy.findAll", query = "SELECT s FROM Spravy s"),
    @NamedQuery(name = "Spravy.findByIdSpravy", query = "SELECT s FROM Spravy s WHERE s.idSpravy = :idSpravy"),
    @NamedQuery(name = "Spravy.findByIdOdosielatel", query = "SELECT s FROM Spravy s WHERE s.idOdosielatel = :idOdosielatel"),
    @NamedQuery(name = "Spravy.findByIdPrijmatel", query = "SELECT s FROM Spravy s WHERE s.idPrijmatel = :idPrijmatel"),
    @NamedQuery(name = "Spravy.findBySprava", query = "SELECT s FROM Spravy s WHERE s.sprava = :sprava")})
public class Spravy implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_spravy")
    private Integer idSpravy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_odosielatel")
    private int idOdosielatel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_prijmatel")
    private int idPrijmatel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "sprava")
    private String sprava;

    public Spravy() {
    }

    public Spravy(Integer idSpravy) {
        this.idSpravy = idSpravy;
    }

    public Spravy(Integer idSpravy, int idOdosielatel, int idPrijmatel, String sprava) {
        this.idSpravy = idSpravy;
        this.idOdosielatel = idOdosielatel;
        this.idPrijmatel = idPrijmatel;
        this.sprava = sprava;
    }

    public Integer getIdSpravy() {
        return idSpravy;
    }

    public void setIdSpravy(Integer idSpravy) {
        this.idSpravy = idSpravy;
    }

    public int getIdOdosielatel() {
        return idOdosielatel;
    }

    public void setIdOdosielatel(int idOdosielatel) {
        this.idOdosielatel = idOdosielatel;
    }

    public int getIdPrijmatel() {
        return idPrijmatel;
    }

    public void setIdPrijmatel(int idPrijmatel) {
        this.idPrijmatel = idPrijmatel;
    }

    public String getSprava() {
        return sprava;
    }

    public void setSprava(String sprava) {
        this.sprava = sprava;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSpravy != null ? idSpravy.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Spravy)) {
            return false;
        }
        Spravy other = (Spravy) object;
        if ((this.idSpravy == null && other.idSpravy != null) || (this.idSpravy != null && !this.idSpravy.equals(other.idSpravy))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Spravy[ idSpravy=" + idSpravy + " ]";
    }
    
}
