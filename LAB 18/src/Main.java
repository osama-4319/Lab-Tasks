import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class ProductFrame extends JFrame {

    private ProductDAO productDAO; // Instance of ProductDAO for database interaction
    private JTextField idField;
    private JTextField nameField;
    private JTextField priceField;
    private JTextField quantityField;
    private JTextArea productListArea;

    public ProductFrame() {
        super("Product Management");
        productDAO = ProductDAOImp.getInstance(); // Initialize ProductDAO

        // Create UI components and layout
        idField = new JTextField(20);
        nameField = new JTextField(20);
        priceField = new JTextField(20);
        quantityField = new JTextField(20);
        productListArea = new JTextArea(10, 30);
        productListArea.setEditable(false);

        // Create labels for the text fields
        JLabel idLabel = new JLabel("ID:");
        JLabel nameLabel = new JLabel("Name:");
        JLabel priceLabel = new JLabel("Price:");
        JLabel quantityLabel = new JLabel("Quantity:");

        // Create buttons for CRUD operations
        JButton createButton = new JButton("Create Product");
        JButton showButton = new JButton("Show Products");
        JButton updateButton = new JButton("Update Product");
        JButton deleteButton = new JButton("Delete Product");

        // Add action listeners for buttons
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get user input from text fields
                String name = nameField.getText();
                double price = Double.parseDouble(priceField.getText());
                int quantity = Integer.parseInt(quantityField.getText());

                // Create a new product object
                Product product = new Product(0, name, price, quantity);

                // Call createProduct method from ProductDAO
                productDAO.createProduct(product);

                // Update UI or display success message
                JOptionPane.showMessageDialog(ProductFrame.this, "Product created successfully!");
            }
        });

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fetch all products and display them
                List<Product> products = productDAO.getAllProducts();
                productListArea.setText("");
                for (Product product : products) {
                    //productListArea.append(product.toString() + "\n");
                    System.out.println(product.toString() + "\n");
                }
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get user input from text fields
                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                double price = Double.parseDouble(priceField.getText());
                int quantity = Integer.parseInt(quantityField.getText());

                // Create a new product object
                Product product = new Product(id, name, price, quantity);

                // Call updateProduct method from ProductDAO
                productDAO.updateProduct(product);

                // Update UI or display success message
                JOptionPane.showMessageDialog(ProductFrame.this, "Product updated successfully!");
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get product ID to delete
                int id = Integer.parseInt(idField.getText());

                // Call deleteProduct method from ProductDAO
                productDAO.deleteProduct(id);

                // Update UI or display success message
                JOptionPane.showMessageDialog(ProductFrame.this, "Product deleted successfully!");
            }
        });

        // Set layout and add components to the frame using GridBagLayout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(idLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(idField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(priceLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(priceField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(quantityLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(quantityField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(createButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        add(showButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        add(updateButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        add(deleteButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        add(new JScrollPane(productListArea), gbc);

        pack(); // Adjust frame size based on components
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the frame is closed
        setVisible(true); 
    }
}

public class Main {
    public static void main(String[] args) {
        ProductFrame frame = new ProductFrame();
    }
}
