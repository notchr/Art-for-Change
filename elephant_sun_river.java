public class ArtForChange {

public static void main(String[] args) {
	
	// Initialize the Frame to hold the artwork
	JFrame frame = new JFrame("Art For Change");
	frame.setSize(500, 500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	// Create the artwork to display in the frame
	JPanel panel = new JPanel();
	panel.setBackground(Color.WHITE);
	
	// Create and add the artwork's components to the panel
	JLabel label1 = new JLabel("Creating Change Through Art");
	label1.setFont(new Font("SansSerif", Font.BOLD, 18));
	label1.setForeground(Color.BLUE);
	panel.add(label1);
	
	JLabel label2 = new JLabel("The power of art can go beyond just creating beauty,");
	panel.add(label2);
	
	JLabel label3 = new JLabel("it can open your eyes and heart to new ways of thinking,");
	panel.add(label3);
	
	JLabel label4 = new JLabel("encouraging us to create meaningful change in our lives.");
	panel.add(label4);
	
	// Add the artwork to the frame
	frame.add(panel);
	frame.setVisible(true);
	
	// Create a button to share the message
	JButton btnShare = new JButton("Share");
	btnShare.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			// Open up a window with the message and link
			JFrame shareFrame = new JFrame("Share Our Message");
			shareFrame.setSize(500, 200);
			shareFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			// Create the share panel
			JPanel sharePanel = new JPanel();
			sharePanel.setBackground(Color.WHITE);
			
			// Add the message to the share panel
			JLabel shareLabel = new JLabel("Spread the message! Join us in using art to create meaningful change: ");
			shareLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
			shareLabel.setForeground(Color.BLUE);
			sharePanel.add(shareLabel);
			
			// Add the link to the share panel
			JLabel linkLabel = new JLabel("http://www.artforchange.org");
			sharePanel.add(linkLabel);
			
			// Add the share panel to the frame
			shareFrame.add(sharePanel);
			shareFrame.setVisible(true);
			
			// Create a confirmation window
			JOptionPane.showMessageDialog(null, "Your message has been shared!", "Share Confirmation", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
	// Add the button to the frame
	frame.add(btnShare, BorderLayout.SOUTH);
	
	// Create the menu bar
	JMenuBar menuBar = new JMenuBar();
	
	// Create the file menu
	JMenu fileMenu = new JMenu("File");
	
	// Create the exit option
	JMenuItem exitItem = new JMenuItem("Exit");
	exitItem.setToolTipText("Exit the application");
	exitItem.addActionListener((ActionEvent event) -> {
		System.exit(0);
	});
	fileMenu.add(exitItem);
	
	// Create the about option
	JMenuItem aboutItem = new JMenuItem("About");
	aboutItem.setToolTipText("About Art For Change");
	aboutItem.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			// Show a message dialog
			JOptionPane.showMessageDialog(frame, "Art For Change is an organization that seeks to use art to create meaningful change in our lives.");
		}
	});
	fileMenu.add(aboutItem);
	
	// Add the file menu to the menu bar
	menuBar.add(fileMenu);
	
	// Add the menu bar to the frame
	frame.setJMenuBar(menuBar);
	
	// Make the frame visible
	frame.setVisible(true);
  }

}