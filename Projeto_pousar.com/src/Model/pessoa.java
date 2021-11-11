package Model;

import java.util.Date;

public class pessoa {

    private int pes_id;
    private String pes_nome;
    private String pes_rg;
    private String pes_cpf;
    private String pes_tel;
    private Date pes_dtcadastro;
    private int pes_status;

    public pessoa() {

    }

    public pessoa(int pes_id, String pes_rg, String pes_cpf, String pes_tel, Date pes_dtcadastro, int pes_status) {
        this.pes_id = pes_id;
        this.pes_rg = pes_rg;
        this.pes_cpf = pes_cpf;
        this.pes_tel = pes_tel;
        this.pes_dtcadastro = pes_dtcadastro;
        this.pes_status = pes_status;
    }

    public int getPes_id() {
        return pes_id;
    }

    public void setPes_id(int pes_id) {
        this.pes_id = pes_id;
    }

    public String getPes_nome() {
        return pes_nome;
    }

    public void setPes_nome(String pes_nome) {
        this.pes_nome = pes_nome;
    }

    public String getPes_rg() {
        return pes_rg;
    }

    public void setPes_rg(String pes_rg) {
        this.pes_rg = pes_rg;
    }

    public String getPes_cpf() {
        return pes_cpf;
    }

    public void setPes_cpf(String pes_cpf) {
        this.pes_cpf = pes_cpf;
    }

    public String getPes_tel() {
        return pes_tel;
    }

    public void setPes_tel(String pes_tel) {
        this.pes_tel = pes_tel;
    }

    public Date getPes_dtcadastro() {
        return pes_dtcadastro;
    }

    public void setPes_dtcadastro(Date pes_dtcadastro) {
        this.pes_dtcadastro = pes_dtcadastro;
    }

    public int getPes_status() {
        return pes_status;
    }

    public void setPes_status(int pes_status) {
        this.pes_status = pes_status;
    }

}/*Fim da classe pessoa*/
