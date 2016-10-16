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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "pracovnici")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pracovnici.findAll", query = "SELECT p FROM Pracovnici p"),
    @NamedQuery(name = "Pracovnici.findById", query = "SELECT p FROM Pracovnici p WHERE p.id = :id"),
    @NamedQuery(name = "Pracovnici.findByMeno", query = "SELECT p FROM Pracovnici p WHERE p.meno = :meno"),
    @NamedQuery(name = "Pracovnici.findByPriezvisko", query = "SELECT p FROM Pracovnici p WHERE p.priezvisko = :priezvisko"),
    @NamedQuery(name = "Pracovnici.findByIdVeduci", query = "SELECT p FROM Pracovnici p WHERE p.idVeduci = :idVeduci"),
    @NamedQuery(name = "Pracovnici.findByIdSkupina", query = "SELECT p FROM Pracovnici p WHERE p.idSkupina = :idSkupina"),
    @NamedQuery(name = "Pracovnici.findByTelC", query = "SELECT p FROM Pracovnici p WHERE p.telC = :telC"),
    @NamedQuery(name = "Pracovnici.findByInfo", query = "SELECT p FROM Pracovnici p WHERE p.info = :info")})
public class Pracovnici implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "meno")
    private String meno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "priezvisko")
    private String priezvisko;
    @Column(name = "id_veduci")
    private Integer idVeduci;
    @Column(name = "id_skupina")
    private Integer idSkupina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "tel_c")
    private String telC;
    @Size(max = 500)
    @Column(name = "info")
    private String info;
    /*
    @ManyToOne      
    @JoinColumn(name = "id_veduci")
    private Veduci idVeduciFK;
*/

    public Pracovnici() {
    }

    public Pracovnici(Integer id) {
        this.id = id;
    }

    public Pracovnici(Integer id, String meno, String priezvisko, String telC) {
        this.id = id;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.telC = telC;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
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

    public String getTelC() {
        return telC;
    }

    public void setTelC(String telC) {
        this.telC = telC;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pracovnici)) {
            return false;
        }
        Pracovnici other = (Pracovnici) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Pracovnici[ id=" + id + " ]";
    }
    
}
