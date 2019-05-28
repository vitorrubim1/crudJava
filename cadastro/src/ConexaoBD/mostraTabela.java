package ConexaoBD;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class mostraTabela extends AbstractTableModel {

    private ArrayList linhas = null; // armazena dadods
    private String[] colunas = null; // armazena nome das colunas

    public mostraTabela(ArrayList lin, String[] col) {

        setLinhas(lin); //pega quantidade de linhas
        setColunas(col); //pega quantidade de colunas

    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

    public int getColumnCount() {
        return getColunas().length;
    }

    public int getRowCount() {
        return getLinhas().size();
    }

    public String getColumnName(int numCol) {
        return getColunas()[numCol];
    }

    //monta a tabela com a quantidade de linhas e colunas
    public Object getValueAt(int numLin, int numCol) {
        Object[] linha = (Object[]) getLinhas().get(numLin);
        return linha[numCol];
    }

    public Object getColumnModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
