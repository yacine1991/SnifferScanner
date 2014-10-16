package Fenetres;



import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


class MyCellRenderer extends JLabel implements ListCellRenderer {
  protected static Border noFocusBorder = new EmptyBorder(15, 1, 1, 1);

  protected static TitledBorder focusBorder = new TitledBorder(LineBorder.createGrayLineBorder(),
      "Port");
  
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if (value instanceof MsgLog) {
            MsgLog msgLog = (MsgLog) value;
            setBackground(msgLog.getColor());            
            setText(msgLog.getMessage());
            setBorder(cellHasFocus ? focusBorder : noFocusBorder);
        }
        return this;
    }
}