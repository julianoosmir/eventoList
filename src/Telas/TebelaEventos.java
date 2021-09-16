package Telas;

import Model.Evento;
import Telas.Resource.ViewAbstractTableModel;

import java.util.List;

public class TebelaEventos extends ViewAbstractTableModel<Evento> {
    public TebelaEventos(List<Evento> rows) {
        super(rows);
        columns = new String[]{
                "numero",
                "descrição", "local",
                "data de realização",
                "quantidade de convites",
                "custos", "valor da entrada",
                "contato"
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Evento env = rows.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return env.getId();
            case 1:
                return env.getDescricao();
            case 2:
                return env.getLocal();
            case 3:
                return env.getData();
            case 4:
                return env.getQtdConvidados();
            case 5:
                return env.getCusto();
            case 6:
                return env.getValorEntradas();
            case 7:
                return env.getPromoter().getTelefone();
            default:
                return null;
        }
    }

}
