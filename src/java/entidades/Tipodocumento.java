package entidades;
// Generated 14/07/2019 06:13:44 PM by Hibernate Tools 4.3.1



/**
 * Tipodocumento generated by hbm2java
 */
public class Tipodocumento  implements java.io.Serializable {


     private int idTipoDocumento;
     private String discripcion;
     private String tipoDocumentocol;

    public Tipodocumento() {
    }

	
    public Tipodocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }
    public Tipodocumento(int idTipoDocumento, String discripcion, String tipoDocumentocol) {
       this.idTipoDocumento = idTipoDocumento;
       this.discripcion = discripcion;
       this.tipoDocumentocol = tipoDocumentocol;
    }
   
    public int getIdTipoDocumento() {
        return this.idTipoDocumento;
    }
    
    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }
    public String getDiscripcion() {
        return this.discripcion;
    }
    
    public void setDiscripcion(String discripcion) {
        this.discripcion = discripcion;
    }
    public String getTipoDocumentocol() {
        return this.tipoDocumentocol;
    }
    
    public void setTipoDocumentocol(String tipoDocumentocol) {
        this.tipoDocumentocol = tipoDocumentocol;
    }




}

