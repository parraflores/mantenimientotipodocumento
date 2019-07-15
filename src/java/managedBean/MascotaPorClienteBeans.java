/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import dao.ClienteDao;
import dao.ClientepormascotaDao;
import dao.MascotaDao;
import entidades.Clientepormascota;
import entidades.ClientepormascotaId;
import entidades.Mascota;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.hibernate.HibernateException;

/**
 *
 * @author USUARIO
 */
@ManagedBean
//@RequestScoped
@ViewScoped
public class MascotaPorClienteBeans  {

 private boolean banderaSelect=false;
 private   ArrayList listaclientes;
 private   ArrayList listamascotas;
 private int idCliente;
 private int idMascota;
 
 private Clientepormascota mascotaporcliente;
 ClientepormascotaId mascotaclienteid;
 
 
 
    
 public MascotaPorClienteBeans(){
     listaclientes = new ArrayList();
     mascotaporcliente = new Clientepormascota();
     mascotaclienteid = new ClientepormascotaId();
     listarCombos();
     
 }
 public void  listarCombos(){
     ClienteDao clientedao = new ClienteDao();
     MascotaDao mascotadao = new MascotaDao();
     listaclientes = clientedao.listarCliente();
     listamascotas = mascotadao.listarMascotas();
     
     
 }
 public String guardar(){
     ClientepormascotaDao dao =new ClientepormascotaDao();
     mascotaclienteid.setClienteIdCliente(idCliente);
     mascotaclienteid.setMascotaIdMascota(idMascota);
     mascotaporcliente.setId(mascotaclienteid);
     dao.guardarClientepormascota(mascotaporcliente);
     return "/RegistroMascotaporCliente";
 }

    public ArrayList getListaclientes() {
        return listaclientes;
    }

    public void setListaclientes(ArrayList listaclientes) {
        this.listaclientes = listaclientes;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public ArrayList getListamascotas() {
        return listamascotas;
    }

    public void setListamascotas(ArrayList listamascotas) {
        this.listamascotas = listamascotas;
    }

    public Clientepormascota getMascotaporcliente() {
        return mascotaporcliente;
    }

    public void setMascotaporcliente(Clientepormascota mascotaporcliente) {
        this.mascotaporcliente = mascotaporcliente;
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
    

}
