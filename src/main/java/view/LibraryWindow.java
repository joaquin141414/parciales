package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import controller.LibraryController;

public class LibraryWindow {

	public LibraryWindow(final LibraryController libraryController) {
		JFrame frame = new JFrame("Sistema de Gestión de Biblioteca");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final JTextArea textArea = new JTextArea();
		textArea.setPreferredSize(new Dimension(900, 600));

		// Crear un panel para los botones
		JPanel buttonPanel = new JPanel();

		JButton btLoanReport = new JButton("Mostrar préstamos otorgados");
		btLoanReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(libraryController.getLoanReport());
			}
		});
		buttonPanel.add(btLoanReport); // Añadir el botón al panel de botones

		JButton btUserReport = new JButton("Mostrar usuario que más libros alquiló");
		btUserReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(libraryController.getUserWithMostRentalsReport());
			}
		});
		buttonPanel.add(btUserReport); // Añadir el botón al panel de botones

		JButton btBookReport = new JButton("Mostrar libro más alquilado");
		btBookReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(libraryController.getMostRentedBookReport());
			}
		});
		buttonPanel.add(btBookReport); // Añadir el botón al panel de botones

		JButton btExpenseReport = new JButton("Mostrar usuario que más gastó");
		btExpenseReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(libraryController.getUserWithMostExpensesReport());
			}
		});
		buttonPanel.add(btExpenseReport); // Añadir el botón al panel de botones

		frame.getContentPane().add(buttonPanel, BorderLayout.NORTH); // Añadir el panel de botones en la parte superior de la ventana
		frame.getContentPane().add(textArea, BorderLayout.CENTER);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
