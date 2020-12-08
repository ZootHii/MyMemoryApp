
package memoryapp;

import Memory.Alzheimer;
import Memory.Amnesia;
import Memory.MemoryDeficit;
import java.util.ArrayList;

public class MemoryApp extends javax.swing.JFrame {

    /**
     * Creates new form MemoryApp
     */

    private static String deficit_id;
    private static String memory_loss;
    private static String amnesia_type;
    private static String declining_area;
    private static String cause;
    private static String location;
    private static String patient_id;
    private static String patient_name;
    private static String patient_surname;
    private static int age;
    private static String gender;
    String[] name_surname;

    ArrayList<Integer> indexesofAmnesia = new ArrayList<>(); // we cant change the length of array after initializing so I used arraylist
    ArrayList<Integer> indexesofAlzheimer = new ArrayList<>(); //because I want them to grow when I add value to them
    

    public MemoryApp() {
        initComponents();
        ftext_area_display_deficit.setEditable(false);
        ftext_area_display_total_deficits.setEditable(false);
        ftext_area_search_by_deficit_id.setEditable(false);
        fpanel_amnesia.setVisible(false);
        fpanel_alzheimer.setVisible(false);

    }

    public void addAmnesia() {
        
        // THAT DID NOT WORK AT FIRST(I DONT KNOW WHY) SO I USED SECOND WAY***
        deficit_id = fdeficit_id.getText();
        memory_loss = fmemory_loss.getItemAt(WIDTH);
        patient_id = fpatient_id.getText();
        //SPLIT NAME AND SURNAME BY ","    
        name_surname = fpatient_name_surname.getText().split(",");
        patient_name = name_surname[0];
        patient_surname = name_surname[1];
        age = Integer.parseInt(fage.getText());
        gender = fgender.getText();
        amnesia_type = famnesia_type.getItemAt(WIDTH);
        cause = famnesia_cause.getItemAt(WIDTH);
        location = famnesia_brain_location.getItemAt(WIDTH);
        
        Amnesia amnesia = new Amnesia(deficit_id, memory_loss, amnesia_type, cause, location, patient_id, patient_name, patient_surname, age, gender);
        //ADD DEFICIT TO ARRAYLIST
        int a = InfoClass.addMemory(amnesia);
        indexesofAmnesia.add(a);

        ftext_area_display_deficit.append("Amnesia is added.\n");
        
        
        // SECOND WAY 
        /*Amnesia amnesia = new Amnesia(deficit_id, memory_loss, amnesia_type, cause, location, patient_id, patient_name, patient_surname, age, gender);
        amnesia.setDeficit_id(fdeficit_id.getText());
        amnesia.setMemory_loss(fmemory_loss.getItemAt(WIDTH));

        amnesia.getClin().setPatient_id(fpatient_id.getText());
        //SPLIT NAME AND SURNAME BY ","    
        name_surname = fpatient_name_surname.getText().split(",");
        amnesia.getClin().setPatient_name(name_surname[0]);
        amnesia.getClin().setPatient_surname(name_surname[1]);

        amnesia.getClin().setAge(Integer.parseInt(fage.getText()));
        amnesia.getClin().setGender(fgender.getText());

        amnesia.setAmnesia_type(famnesia_type.getItemAt(WIDTH));
        amnesia.setCause(famnesia_cause.getItemAt(WIDTH));
        amnesia.setLocation(famnesia_brain_location.getItemAt(WIDTH));
        //ADD DEFICIT TO ARRAYLIST
        int a = InfoClass.addMemory(amnesia);
        indexesofAmnesia.add(a);

        ftext_area_display_deficit.append("Amnesia is added.\n");*/
    }

    public void addAlzheimer() {
        
        
        // THAT DID NOT WORK AT FIRST(I DONT KNOW WHY) SO I USED SECOND WAY***
        deficit_id = fdeficit_id.getText();
        memory_loss = fmemory_loss.getItemAt(WIDTH);
        patient_id = fpatient_id.getText();
        //SPLIT NAME AND SURNAME BY ","    
        name_surname = fpatient_name_surname.getText().split(",");
        patient_name = name_surname[0];
        patient_surname = name_surname[1];
        age = Integer.parseInt(fage.getText());
        gender = fgender.getText();
        declining_area = falzheimer_affected_area.getItemAt(WIDTH);
        
        Alzheimer alzheimer = new Alzheimer(deficit_id, memory_loss, declining_area, patient_id, patient_name, patient_surname, age, gender);
        //ADD DEFICIT TO ARRAYLIST
        int a = InfoClass.addMemory(alzheimer);
        indexesofAlzheimer.add(a);

        ftext_area_display_deficit.append("Alzheimer is added.\n");
        
        
        // SECOND WAY 
        /*Alzheimer alzheimer = new Alzheimer(deficit_id, memory_loss, declining_area, patient_id, patient_name, patient_surname, age, gender);

        alzheimer.setDeficit_id(fdeficit_id.getText());
        alzheimer.setMemory_loss(fmemory_loss.getItemAt(WIDTH));

        alzheimer.getClin().setPatient_id(fpatient_id.getText());
        //SPLIT NAME AND SURNAME BY ","    
        name_surname = fpatient_name_surname.getText().split(",");
        alzheimer.getClin().setPatient_name(name_surname[0]);
        alzheimer.getClin().setPatient_surname(name_surname[1]);

        alzheimer.getClin().setAge(Integer.parseInt(fage.getText()));
        alzheimer.getClin().setGender(fgender.getText());

        alzheimer.setDeclining_area(falzheimer_affected_area.getItemAt(WIDTH));
        //ADD DEFICIT TO ARRAYLIST
        int a = InfoClass.addMemory(alzheimer);
        indexesofAlzheimer.add(a);

        ftext_area_display_deficit.append("Alzheimer is added.\n");*/

    }

    public void setComponentsEmpty() {
        fdeficit_id.setText("");
        fmemory_loss.setSelectedIndex(-1);
        fpatient_id.setText("");
        fpatient_name_surname.setText("");
        fage.setText("");
        fgender.setText("");
        famnesia_type.setSelectedIndex(-1);
        famnesia_cause.setSelectedIndex(-1);
        famnesia_brain_location.setSelectedIndex(-1);
        falzheimer_affected_area.setSelectedIndex(-1);
        fbutton_alzheimer.setSelected(false);
        fbutton_amnesia.setSelected(false);
        fpanel_alzheimer.setVisible(false);
        fpanel_amnesia.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fpanel_memory_deficits = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fdeficit_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fmemory_loss = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fpatient_id = new javax.swing.JTextField();
        fpatient_name_surname = new javax.swing.JTextField();
        fage = new javax.swing.JTextField();
        fgender = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fbutton_amnesia = new javax.swing.JRadioButton();
        fbutton_alzheimer = new javax.swing.JRadioButton();
        flayered_pane = new javax.swing.JLayeredPane();
        fpanel_alzheimer = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        falzheimer_affected_area = new javax.swing.JComboBox<>();
        fpanel_amnesia = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        famnesia_type = new javax.swing.JComboBox<>();
        famnesia_cause = new javax.swing.JComboBox<>();
        famnesia_brain_location = new javax.swing.JComboBox<>();
        fbutton_add_deficit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        fbutton_display_deficit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ftext_area_display_deficit = new javax.swing.JTextArea();
        fbutton_display_total_deficits = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ftext_area_display_total_deficits = new javax.swing.JTextArea();
        fbutton_search_by_deficit_id = new javax.swing.JButton();
        fsearch_deficit_id = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        ftext_area_search_by_deficit_id = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fpanel_memory_deficits.setBorder(javax.swing.BorderFactory.createTitledBorder("Memory Deficits"));

        jLabel1.setText("Deficit ID:");

        jLabel2.setText("Memory Loss:");

        fmemory_loss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Implicit" }));
        fmemory_loss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmemory_lossActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Clinical Cases");

        jLabel4.setText("Patient ID:");

        jLabel5.setText("Patient Name, Surname:");

        jLabel6.setText("Age:");

        jLabel7.setText("Gender:");

        fage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fageActionPerformed(evt);
            }
        });

        jLabel8.setText("Deficit Type:");

        fbutton_amnesia.setText("Amnesia");
        fbutton_amnesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbutton_amnesiaActionPerformed(evt);
            }
        });

        fbutton_alzheimer.setText("Alzheimer");
        fbutton_alzheimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbutton_alzheimerActionPerformed(evt);
            }
        });

        flayered_pane.setPreferredSize(new java.awt.Dimension(300, 188));

        fpanel_alzheimer.setBorder(javax.swing.BorderFactory.createTitledBorder("Alzheimer"));
        fpanel_alzheimer.setPreferredSize(new java.awt.Dimension(299, 187));

        jLabel9.setText("Affected Area:");

        falzheimer_affected_area.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cognition" }));

        javax.swing.GroupLayout fpanel_alzheimerLayout = new javax.swing.GroupLayout(fpanel_alzheimer);
        fpanel_alzheimer.setLayout(fpanel_alzheimerLayout);
        fpanel_alzheimerLayout.setHorizontalGroup(
            fpanel_alzheimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fpanel_alzheimerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addComponent(falzheimer_affected_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        fpanel_alzheimerLayout.setVerticalGroup(
            fpanel_alzheimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fpanel_alzheimerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fpanel_alzheimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(falzheimer_affected_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        fpanel_amnesia.setBorder(javax.swing.BorderFactory.createTitledBorder("Amnesia"));
        fpanel_amnesia.setPreferredSize(new java.awt.Dimension(299, 187));

        jLabel10.setText("Type:");

        jLabel11.setText("Cause:");

        jLabel12.setText("Brain Location:");

        famnesia_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Retrograde" }));

        famnesia_cause.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Brain Infection" }));

        famnesia_brain_location.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Hippocampus" }));
        famnesia_brain_location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                famnesia_brain_locationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fpanel_amnesiaLayout = new javax.swing.GroupLayout(fpanel_amnesia);
        fpanel_amnesia.setLayout(fpanel_amnesiaLayout);
        fpanel_amnesiaLayout.setHorizontalGroup(
            fpanel_amnesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fpanel_amnesiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fpanel_amnesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fpanel_amnesiaLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(65, 65, 65)
                        .addComponent(famnesia_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(fpanel_amnesiaLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(famnesia_cause, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fpanel_amnesiaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(22, 22, 22)
                        .addComponent(famnesia_brain_location, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        fpanel_amnesiaLayout.setVerticalGroup(
            fpanel_amnesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fpanel_amnesiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fpanel_amnesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(famnesia_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fpanel_amnesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(famnesia_cause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fpanel_amnesiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(famnesia_brain_location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        flayered_pane.setLayer(fpanel_alzheimer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        flayered_pane.setLayer(fpanel_amnesia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout flayered_paneLayout = new javax.swing.GroupLayout(flayered_pane);
        flayered_pane.setLayout(flayered_paneLayout);
        flayered_paneLayout.setHorizontalGroup(
            flayered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flayered_paneLayout.createSequentialGroup()
                .addComponent(fpanel_amnesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(flayered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(flayered_paneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fpanel_alzheimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        flayered_paneLayout.setVerticalGroup(
            flayered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fpanel_amnesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(flayered_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(flayered_paneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fpanel_alzheimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        fbutton_add_deficit.setText("Add Deficit");
        fbutton_add_deficit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbutton_add_deficitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fpanel_memory_deficitsLayout = new javax.swing.GroupLayout(fpanel_memory_deficits);
        fpanel_memory_deficits.setLayout(fpanel_memory_deficitsLayout);
        fpanel_memory_deficitsLayout.setHorizontalGroup(
            fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fpanel_memory_deficitsLayout.createSequentialGroup()
                .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fpanel_memory_deficitsLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fpanel_memory_deficitsLayout.createSequentialGroup()
                                .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(27, 27, 27)
                                .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fpatient_name_surname, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(fpatient_id))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(fpanel_memory_deficitsLayout.createSequentialGroup()
                                .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fgender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))))
                    .addGroup(fpanel_memory_deficitsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fpanel_memory_deficitsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addGroup(fpanel_memory_deficitsLayout.createSequentialGroup()
                                .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(23, 23, 23)
                                .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fdeficit_id)
                                    .addComponent(fmemory_loss, 0, 101, Short.MAX_VALUE)))))
                    .addGroup(fpanel_memory_deficitsLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flayered_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fpanel_memory_deficitsLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(33, 33, 33)
                                .addComponent(fbutton_amnesia)
                                .addGap(18, 18, 18)
                                .addComponent(fbutton_alzheimer))))
                    .addGroup(fpanel_memory_deficitsLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(fbutton_add_deficit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        fpanel_memory_deficitsLayout.setVerticalGroup(
            fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fpanel_memory_deficitsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fdeficit_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fmemory_loss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fpatient_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fpatient_name_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(fpanel_memory_deficitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fbutton_amnesia)
                    .addComponent(fbutton_alzheimer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flayered_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fbutton_add_deficit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Display and Search"));

        fbutton_display_deficit.setText("Display Deficit");
        fbutton_display_deficit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbutton_display_deficitActionPerformed(evt);
            }
        });

        ftext_area_display_deficit.setColumns(20);
        ftext_area_display_deficit.setRows(5);
        jScrollPane1.setViewportView(ftext_area_display_deficit);

        fbutton_display_total_deficits.setText("Display Total Deficits");
        fbutton_display_total_deficits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbutton_display_total_deficitsActionPerformed(evt);
            }
        });

        ftext_area_display_total_deficits.setColumns(20);
        ftext_area_display_total_deficits.setRows(5);
        jScrollPane2.setViewportView(ftext_area_display_total_deficits);

        fbutton_search_by_deficit_id.setText("Search By Deficit ID");
        fbutton_search_by_deficit_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbutton_search_by_deficit_idActionPerformed(evt);
            }
        });

        fsearch_deficit_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fsearch_deficit_idActionPerformed(evt);
            }
        });

        ftext_area_search_by_deficit_id.setColumns(20);
        ftext_area_search_by_deficit_id.setRows(5);
        jScrollPane3.setViewportView(ftext_area_search_by_deficit_id);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fbutton_display_deficit)
                            .addComponent(fbutton_display_total_deficits)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fbutton_search_by_deficit_id)
                                .addGap(55, 55, 55)
                                .addComponent(fsearch_deficit_id, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 122, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fbutton_display_deficit)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fbutton_display_total_deficits)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fbutton_search_by_deficit_id)
                    .addComponent(fsearch_deficit_id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fpanel_memory_deficits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fpanel_memory_deficits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fmemory_lossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmemory_lossActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmemory_lossActionPerformed

    private void fageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fageActionPerformed

    private void fbutton_alzheimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbutton_alzheimerActionPerformed
        fpanel_alzheimer.setVisible(rootPaneCheckingEnabled);
        fpanel_amnesia.setVisible(false);
        fbutton_amnesia.setSelected(false);
        if (!fbutton_alzheimer.isSelected()) {
            fpanel_alzheimer.setVisible(false);
        }
    }//GEN-LAST:event_fbutton_alzheimerActionPerformed

    private void famnesia_brain_locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_famnesia_brain_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_famnesia_brain_locationActionPerformed

    private void fbutton_add_deficitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbutton_add_deficitActionPerformed

        if (fbutton_amnesia.isSelected()) {
            // ADDING AMNESIA
            addAmnesia();
        } else if (fbutton_alzheimer.isSelected()) {
            // ADDING ALZHEIMER
            addAlzheimer();
        }
        // ADDING IDS TO SEARCH
        
        fsearch_deficit_id.addItem(fdeficit_id.getText());

        // SETTING COMPONENTS EMPTY
        setComponentsEmpty();
    }//GEN-LAST:event_fbutton_add_deficitActionPerformed

    private void fbutton_amnesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbutton_amnesiaActionPerformed
        fpanel_amnesia.setVisible(rootPaneCheckingEnabled);
        fpanel_alzheimer.setVisible(false);
        fbutton_alzheimer.setSelected(false);
        if (!fbutton_amnesia.isSelected()) {
            fpanel_amnesia.setVisible(false);
        }
    }//GEN-LAST:event_fbutton_amnesiaActionPerformed

    private void fbutton_display_deficitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbutton_display_deficitActionPerformed

        // I DONT NEED TO SEPERATE THEM I CAN USE GETSPECIFICDEFICIT METHOD IN THE INFOCLASS
        /*if(fbutton_amnesia.isSelected()){
            ftext_area_display_deficit.setText(InfoClass.getAmnesia(indexesofAmnesia) + "\n");
        }
        else if(fbutton_amnesia.isSelected()){
            ftext_area_display_deficit.setText(InfoClass.getAlzheimer(indexesofAlzheimer) + "\n");
        }*/
        if (fbutton_amnesia.isSelected()) {
            ftext_area_display_deficit.setText(InfoClass.getSpecificDeficit(indexesofAmnesia) + "\n");
        } else if (fbutton_alzheimer.isSelected()) {
            ftext_area_display_deficit.setText(InfoClass.getSpecificDeficit(indexesofAlzheimer) + "\n");
        } else {
            ftext_area_display_deficit.setText(InfoClass.getAllMemory() + "\n");
        }

    }//GEN-LAST:event_fbutton_display_deficitActionPerformed

    private void fbutton_display_total_deficitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbutton_display_total_deficitsActionPerformed
        ftext_area_display_total_deficits.setText("Total Deficits: " + MemoryDeficit.getTotalDeficit() + 
                                                  "\nTotal Amnesics: " + Amnesia.getTotalAmnesia() + 
                                                  "\nTotal Alzheimers: " + Alzheimer.getTotalAlzheimer());
    }//GEN-LAST:event_fbutton_display_total_deficitsActionPerformed

    private void fbutton_search_by_deficit_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbutton_search_by_deficit_idActionPerformed
        /*Object search_id = fsearch_deficit_id.getSelectedItem(); // getItemAt doesn't work (i dont know why) so i used selected item get that object 
        ftext_area_search_by_deficit_id.setText(InfoClass.searchMemory(search_id.toString()).toString()); // and convert object to String*/
        
        String search_id = fsearch_deficit_id.getSelectedItem().toString();  // HOCAM YUKARDAKİ ÇALIŞIYORDU SONRA ÇALIŞMAMAYA BAŞLADI BİLMİYORUM NİYE BİR ŞEY DEĞİŞTİRMEDİM BUNUN ÇALIŞMASI GEREKİRDİ
        ftext_area_search_by_deficit_id.setText(InfoClass.searchMemory(search_id).toString());// BU HİÇ ÇALIŞMADI BULAMADIM NEDENİNİ
        
    }//GEN-LAST:event_fbutton_search_by_deficit_idActionPerformed

    private void fsearch_deficit_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fsearch_deficit_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fsearch_deficit_idActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MemoryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemoryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemoryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemoryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemoryApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fage;
    private javax.swing.JComboBox<String> falzheimer_affected_area;
    private javax.swing.JComboBox<String> famnesia_brain_location;
    private javax.swing.JComboBox<String> famnesia_cause;
    private javax.swing.JComboBox<String> famnesia_type;
    private javax.swing.JButton fbutton_add_deficit;
    private javax.swing.JRadioButton fbutton_alzheimer;
    private javax.swing.JRadioButton fbutton_amnesia;
    private javax.swing.JButton fbutton_display_deficit;
    private javax.swing.JButton fbutton_display_total_deficits;
    private javax.swing.JButton fbutton_search_by_deficit_id;
    private javax.swing.JTextField fdeficit_id;
    private javax.swing.JTextField fgender;
    private javax.swing.JLayeredPane flayered_pane;
    private javax.swing.JComboBox<String> fmemory_loss;
    private javax.swing.JPanel fpanel_alzheimer;
    private javax.swing.JPanel fpanel_amnesia;
    private javax.swing.JPanel fpanel_memory_deficits;
    private javax.swing.JTextField fpatient_id;
    private javax.swing.JTextField fpatient_name_surname;
    private javax.swing.JComboBox<String> fsearch_deficit_id;
    private javax.swing.JTextArea ftext_area_display_deficit;
    private javax.swing.JTextArea ftext_area_display_total_deficits;
    private javax.swing.JTextArea ftext_area_search_by_deficit_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
