/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Tipodocumento;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author USUARIO
 */
public interface ITipoDocumento {

    public abstract boolean guardarTipoDocumento(Tipodocumento tipodocumento);
    public abstract ArrayList<Tipodocumento> listarTipoDocumento();
    public abstract boolean actualizarTipoDocumento(Tipodocumento tipodocumento);
    public abstract boolean eliminarTipoDocumento(Tipodocumento tipodocumento);

}
