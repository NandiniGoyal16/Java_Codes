import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/** <applet code = "uicomp" height = 500 width = 500> </applet> */
// Applet demonstrating basic UI components
public class uicomp extends Applet implements ActionListener, ItemListener {
    // UI Components
    TextField textField;
    Button button;
    Label label;
    Checkbox checkbox1, checkbox2;
    Choice choice;
    List list;
    TextArea textArea;

    public void init() {
        setLayout(new FlowLayout());

        // Label
        label = new Label("Enter text and click the button:");
        add(label);

        // TextField
        textField = new TextField(20);
        add(textField);

        // Button
        button = new Button("Submit");
        button.addActionListener(this);
        add(button);

        // Checkboxes
        checkbox1 = new Checkbox("Option 1");
        checkbox2 = new Checkbox("Option 2");
        add(checkbox1);
        add(checkbox2);

        // Choice Dropdown
        choice = new Choice();
        choice.add("Select an option");
        choice.add("Choice 1");
        choice.add("Choice 2");
        choice.add("Choice 3");
        choice.addItemListener(this);
        add(choice);

        // List
        list = new List(4, false);
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.addItemListener(this);
        add(list);

        // TextArea
        textArea = new TextArea(5, 30);
        add(textArea);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            textArea.setText("Button clicked!\nYou entered: " + textField.getText());
        }
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == choice) {
            textArea.setText("Selected: " + choice.getSelectedItem());
        } else if (e.getSource() == list) {
            textArea.setText("Selected: " + list.getSelectedItem());
        }
    }
}