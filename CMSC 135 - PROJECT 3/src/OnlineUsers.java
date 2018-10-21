
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class OnlineUsers extends JFrame
{
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	@SuppressWarnings("rawtypes")
	private JList list;

	@SuppressWarnings("rawtypes")
	public OnlineUsers()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(200, 320);
		setTitle("Online Users");
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		list = new JList();
		list.setForeground(Color.PINK);
		list.setBackground(Color.DARK_GRAY);
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 0;
		JScrollPane p = new JScrollPane();
		p.setViewportView(list);
		contentPane.add(p, gbc_list);
		list.setFont(new Font("Arial", Font.BOLD, 24));
	}

	@SuppressWarnings("unchecked")
	public void update(String[] users)
	{
		list.setListData(users);
	}

}
