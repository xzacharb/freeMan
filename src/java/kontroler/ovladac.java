/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kontroler;

import data.Pracovnici;
import java.io.Serializable;
import java.util.Collection;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import session.PracovniciFacade;


/**
 *
 * @author Ondrej
 */
@ManagedBean(name = "ovladac")
@SessionScoped
public class ovladac{
    private Pracovnici akt_pracovnik;
    private Collection<Pracovnici> pracovnici;
    private int poradie=0;
    @EJB
    private PracovniciFacade ejbPracovniciFacade;

    public Pracovnici getAkt_pracovnik() {
        return akt_pracovnik;
    }
  

    public void setAkt_Pracovnik(Pracovnici akt_pracovnik) {
        this.akt_pracovnik = akt_pracovnik;
    }

    public Collection<Pracovnici> getPracovnici() {
        return pracovnici;
    }
    public void setPracovnici(Collection<Pracovnici> pracovnici) {
        this.pracovnici = pracovnici;
    }

    public PracovniciFacade getEjbPracovniciFacade() {
        return ejbPracovniciFacade;
    }

    public void setEjbPracovniciFacade(PracovniciFacade ejbPracovniciFacade) {
        this.ejbPracovniciFacade = ejbPracovniciFacade;
    }
// moj KOD.................
    public String chodNaPracovnikov(String akcia){
        setPracovnici(getEjbPracovniciFacade().findAll());
    return akcia;
    }
    public String chodNaEditPracovnika(Pracovnici zvoleny, String akcia){
        akt_pracovnik=zvoleny;
        return akcia;
    }
    public String chodNaVytvorPracovnika(String akcia){
        akt_pracovnik = new Pracovnici();
        return akcia;
    }

    public String edituj(String akcia){
        getEjbPracovniciFacade().edit(akt_pracovnik);
        setPracovnici(getEjbPracovniciFacade().findAll());
        return akcia;
    }    
    public String vymaz(Pracovnici zvoleny, String akcia){
        getEjbPracovniciFacade().remove(zvoleny);
        setPracovnici(getEjbPracovniciFacade().findAll());
        return akcia;
    }
    public String vytvor(String akcia){
        getEjbPracovniciFacade().create(akt_pracovnik);
        setPracovnici(getEjbPracovniciFacade().findAll());
        return akcia;
    }
    public String hladajPodlaMena(String akcia, String meno){
        setPracovnici(getEjbPracovniciFacade().vyhladavaniePodlaMena(meno));
        return akcia;
    }
    public String hladajPodlaPriezviska(String akcia, String priezvisko){
        setPracovnici(getEjbPracovniciFacade().vyhladavaniePodlaPriezviska(priezvisko));
        return akcia;
    }
    public String sortujPodlaMena(String akcia){
        poradie++;
        if(poradie%2==0)
            setPracovnici(getEjbPracovniciFacade().SortByMeno(0));
        else
        {
            setPracovnici(getEjbPracovniciFacade().SortByMeno(1));
            poradie=1;
        }
        return akcia;
    }
    public String sortujPodlaPriezviska(String akcia){
        poradie++;
        if(poradie%2==0)
            setPracovnici(getEjbPracovniciFacade().SortByPriezvisko(0));
        else
        {
            setPracovnici(getEjbPracovniciFacade().SortByPriezvisko(1));
            poradie=1;
        }
        return akcia;
    }
}
