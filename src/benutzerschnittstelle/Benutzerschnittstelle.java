package benutzerschnittstelle;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Benutzerschnittstelle extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea txtMeldungen;
	private JButton btnStarten;
	private JButton btnStoppen;
	private JLabel lblAngemeldeteBenutzer;
	private JTextArea txtAngemeldeteBenutzer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Benutzerschnittstelle frame = new Benutzerschnittstelle();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Benutzerschnittstelle()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtMeldungen = new JTextArea();
		txtMeldungen.setBounds(270, 11, 658, 173);
		contentPane.add(txtMeldungen);
		
		btnStarten = new JButton("start server");
		btnStarten.setBounds(10, 12, 250, 23);
		contentPane.add(btnStarten);
		
		btnStoppen = new JButton("stop server");
		btnStoppen.setBounds(10, 46, 250, 23);
		contentPane.add(btnStoppen);
		
		lblAngemeldeteBenutzer = new JLabel("Angemeldete Benutzer:");
		lblAngemeldeteBenutzer.setBounds(20, 80, 240, 14);
		contentPane.add(lblAngemeldeteBenutzer);
		
		txtAngemeldeteBenutzer = new JTextArea();
		txtAngemeldeteBenutzer.setBounds(10, 105, 250, 79);
		contentPane.add(txtAngemeldeteBenutzer);
	}

}
