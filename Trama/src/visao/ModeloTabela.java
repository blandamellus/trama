package visao;

import negocio.Matriz;
import javax.swing.table.AbstractTableModel;
import visao.renderizador.RenderizadorTituloLinha;

public class ModeloTabela extends AbstractTableModel {
	private Matriz matriz;
	
	public ModeloTabela( String nome, Matriz matriz ) {
		super();
		this.matriz = matriz;
	}
	
	@Override
	public int getRowCount() {
		return matriz.getQLinhas();
	}
	
	@Override
	public int getColumnCount() {
		return matriz.getQColunas();
	}
	
	@Override
	public Object getValueAt( int rowIndex, int columnIndex ) {
		return matriz.getDadoMatriz( rowIndex, columnIndex );
	}
	
	@Override
	public Class getColumnClass( int columnIndex ) {
		switch( columnIndex ) {
			case 0:
				return RenderizadorTituloLinha.class;
			default:
				return R;
		}
	}
	
	@Override
	public String getColumnName( int columnIndex ) {
		switch( columnIndex ) {
			case 0:
				return "";
			default:
				return matriz.getTituloColuna( columnIndex );
		}
		
	}
	
	public String getNomeMatriz() {
		return matriz.getNomeMatriz();
	}
}
