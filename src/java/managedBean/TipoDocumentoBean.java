/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import dao.TipoDocumentoDao;
import entidades.Tipodocumento;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.hibernate.HibernateException;

/**
 *
 * @author USUARIO
 */
@ManagedBean
@ViewScoped
public class TipoDocumentoBean{

    private Tipodocumento tipodocumentos;
    private boolean banderaSelect=false;

    public TipoDocumentoBean() {
        this.tipodocumentos = new Tipodocumento();

    }

    public String guardarTipoDocumento() {
        try {

            TipoDocumentoDao tipodocumentoDao = new TipoDocumentoDao();
            boolean respuesta = tipodocumentoDao.guardarTipoDocumento(tipodocumentos);
            if (respuesta) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Se registro con exito"));
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("No se puedo registrar"));
            }
        } catch (HibernateException e) {
            ///transation.rollback();  -- regresa a la anterior
            System.out.println("Error::: " + e);
        }
        return "/RegistroTipoDocumento";
    }

    public String actualizarTipoDocumento() {
        try {
            TipoDocumentoDao tipodocumentoDao = new TipoDocumentoDao();
            boolean respuesta = tipodocumentoDao.actualizarTipoDocumento(tipodocumentos);
            if (respuesta){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Se actualizo con exito"));
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("No se puedo actualizar"));
            }
        } catch (HibernateException e) {
            ///transation.rollback();  -- regresa a la anterior
            System.out.println("Error::: " + e);
        }
        return "/RegistroTipoDocumento";

    }

    public ArrayList<Tipodocumento> listarTipoDocumentos() {
        ArrayList<Tipodocumento> lista = new ArrayList<>();
        TipoDocumentoDao tipodocumentoDao = new TipoDocumentoDao();
        lista = tipodocumentoDao.listarTipoDocumento();
        return lista;
    }

    public String eliminar() {
        TipoDocumentoDao tipodocumentoDao = new TipoDocumentoDao();
        boolean respuesta = tipodocumentoDao.eliminarTipoDocumento(tipodocumentos);
        if (respuesta) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Se elimino con exito"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("No se puedo eliminar"));
        }
        return "/RegistroTipoDocumento";
    }

    public String limpiar() {
        banderaSelect=false;
        return "/RegistroTipoDocumento";
    }
   public void selectBandera(){
    banderaSelect=true;
   }
    public boolean isBanderaSelect() {
        return banderaSelect;
    }

    public void setBanderaSelect(boolean banderaSelect) {
        this.banderaSelect = banderaSelect;
    }

    public Tipodocumento getTipodocumentos() {
        return tipodocumentos;
    }

    public void setTipodocumentos(Tipodocumento tipodocumentos) {
        this.tipodocumentos = tipodocumentos;
    }
    
    

}
