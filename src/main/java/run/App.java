package run;

import java.awt.EventQueue;
import controller.LibraryController;
import view.LibraryWindow;

public class App {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryController libraryController = new LibraryController();
					LibraryWindow window = new LibraryWindow(libraryController);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
