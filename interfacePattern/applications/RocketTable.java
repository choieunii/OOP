package interfacePattern.applications;
/*컴퓨터 공학과 2018112021 최은지*/

import javax.swing.event.TableModelListener;
import javax.swing.table.*;

public class RocketTable extends AbstractTableModel {
    protected Rocket[] rockets;
    protected String[] columnNames = new String[] { "Name", "Price", "Apogee" };
    public RocketTable(Rocket[] rockets) {
        this.rockets = rockets;
    }
    public int getColumnCount() {
        return columnNames.length;
    }
    public String getColumnName(int i) {
        return columnNames[i];
    }
    public int getRowCount() {
        return rockets.length;
    }
    public Object getValueAt(int row, int col) {
        if(col == 0) return rockets[row].getName();
        else if(col == 1) return rockets[row].getPrice();
        else if(col == 2) return rockets[row].getApogee();
        return row;
    }
}
