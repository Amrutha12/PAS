/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Fine-Tune
 */
public class frm_userreg extends javax.swing.JFrame {
    generalclass ob=new generalclass();

    /**
     * Creates new form frm_userreg
     */
    public frm_userreg() {
        initComponents();
        this.office();
        this.date();
        this.year();
        this.month();
        cmbpo.setSelectedItem(null);
        cmbdate.setSelectedItem(null);
        cmbmonth.setSelectedItem(null);
        cmbyear.setSelectedItem(null);
        cmbhq.setSelectedItem(null);
        
    }
    public void office()
    {
        try
        {
           Connection con=ob.getconnect();
           Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select pasofname from passoffice_table");
            while(rs.next())
                
            {
                cmbpo.addItem(rs.getString("pasofname"));
               
            }
        }
        catch(Exception ex)
        {
            
        }
    }
    public void date()
    {
        try
        {
           Connection con=ob.getconnect();
           int i;
           for(i=1;i<=31;i++)
           {
               cmbdate.addItem(i);
           }
       
               }
        catch(Exception ex)
        {
            
        }
    }
    public void month()
    {
        try
        {
            Connection con=ob.getconnect();
            int i;
            for(i=1;i<=12;i++)
            {
                cmbmonth.addItem(i);
                
            }
        }
        catch(Exception ex)
        {
            
        }
    }
    public void year()
    {
        try
        {
           Connection con=ob.getconnect();
           int i;
           for(i=1950;i<=2014;i++)
           {
               cmbyear.addItem(i);
               
           }
        }
        catch(Exception ex)
        {
            
        }
    }
           
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblpo = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblsur = new javax.swing.JLabel();
        lbldob = new javax.swing.JLabel();
        lbleid = new javax.swing.JLabel();
        lbldo = new javax.swing.JLabel();
        lbllogin = new javax.swing.JLabel();
        lblpwd = new javax.swing.JLabel();
        lblcpwd = new javax.swing.JLabel();
        lblhq = new javax.swing.JLabel();
        lblha = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        cmbpo = new javax.swing.JComboBox();
        txtname = new javax.swing.JTextField();
        txtsur = new javax.swing.JTextField();
        cmbdate = new javax.swing.JComboBox();
        cmbmonth = new javax.swing.JComboBox();
        cmbyear = new javax.swing.JComboBox();
        txteid = new javax.swing.JTextField();
        rbyes = new javax.swing.JRadioButton();
        rbno = new javax.swing.JRadioButton();
        txtlogin = new javax.swing.JTextField();
        txtpwd = new javax.swing.JPasswordField();
        txtcpwd = new javax.swing.JPasswordField();
        cmbhq = new javax.swing.JComboBox();
        txtha = new javax.swing.JTextField();
        btnexit = new javax.swing.JButton();
        lblval = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lbllo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setText("USER REGISTRATION");

        lblpo.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblpo.setText("Passport Office");

        lblname.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblname.setText("Name");

        lblsur.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblsur.setText("Surname");

        lbldob.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lbldob.setText("Date Of Birth");

        lbleid.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lbleid.setText("Email ID");

        lbldo.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lbldo.setText("Do you want your Login ID\nto be same as Email ID?");

        lbllogin.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lbllogin.setText("Login ID");

        lblpwd.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblpwd.setText("Password");

        lblcpwd.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblcpwd.setText("Confirm Password");

        lblhq.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblhq.setText("Hint Question");

        lblha.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        lblha.setText("Hint Answer");

        btnsubmit.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        btnclear.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        cmbpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbpoActionPerformed(evt);
            }
        });

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtsur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsurActionPerformed(evt);
            }
        });

        cmbdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbdateActionPerformed(evt);
            }
        });

        txteid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteidActionPerformed(evt);
            }
        });

        rbyes.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        rbyes.setText("Yes");
        rbyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbyesActionPerformed(evt);
            }
        });

        rbno.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        rbno.setText("No");
        rbno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnoActionPerformed(evt);
            }
        });

        cmbhq.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        cmbhq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Birth City", "Favourite Food", "Favourite Cricketer", "Favourite Colour", "First School" }));
        cmbhq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbhqActionPerformed(evt);
            }
        });

        btnexit.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        lblid.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        lblid.setForeground(new java.awt.Color(255, 0, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel2.setText("DD");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel3.setText("MM");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel4.setText("YYYY");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pas/user1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblsur)
                            .addComponent(lbldob)
                            .addComponent(lbleid)
                            .addComponent(lbllogin)
                            .addComponent(lblpwd)
                            .addComponent(lblcpwd)
                            .addComponent(lblhq)
                            .addComponent(lblha)
                            .addComponent(lbldo))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(rbyes)
                                        .addGap(55, 55, 55)
                                        .addComponent(rbno))
                                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txteid, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblid, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(lbllo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsur, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbpo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbhq, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblval, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(btnsubmit)
                                .addGap(29, 29, 29)
                                .addComponent(btnclear))
                            .addComponent(lblpo)
                            .addComponent(lblname))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnexit)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnexit))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpo)
                    .addComponent(cmbpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsur)
                    .addComponent(txtsur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbldob))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbleid)
                    .addComponent(txteid)
                    .addComponent(lblid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbyes)
                    .addComponent(rbno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllogin)
                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpwd)
                    .addComponent(txtpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcpwd)
                    .addComponent(txtcpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhq)
                    .addComponent(cmbhq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnsubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txteidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txteidActionPerformed

    private void rbyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbyesActionPerformed
      rbno.setSelected(false);    
      txtlogin.setText(txteid.getText());
// TODO add your handling code here:
    }//GEN-LAST:event_rbyesActionPerformed

    private void rbnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnoActionPerformed
       rbyes.setSelected(false);
       txtlogin.setText(null);
       // TODO add your handling code here:
    }//GEN-LAST:event_rbnoActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
        Connection con=null;
        String pwd=txtpwd.getText();
        String cpwd=txtcpwd.getText();
        String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Boolean b=txteid.getText().matches(emailreg);
        String name="^[A-Za-zs]{1,}[.]{0,1}[A-Za-zs]{0,}$" ;
        Boolean n=txtname.getText().matches(name);       
        if(txtname.getText().equals("")||txtsur.getText().equals("")||txteid.getText().equals("")||txtlogin.getText().equals("")||txtpwd.getText().equals("")||txtcpwd.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Enter all details");
        }
        else if((cmbpo.getSelectedItem()==null)||(cmbdate.getSelectedItem()==null)||(cmbmonth.getSelectedItem()==null)||(cmbyear.getSelectedItem()==null)||(cmbhq.getSelectedItem()==null))
        {
            JOptionPane.showMessageDialog(this,"Select item from the list");
        }
        else if(b==false)
        {
            lblid.setText("Invalid email Id!!!");
        }
        else if(txtlogin.getText().length()<8)
        {
           lbllo.setText("Minimum 8 characters");
        }
        else if(n==false)
        {
            JOptionPane.showMessageDialog(this, "Enter name properly");
        }
        else
        {
            if(pwd.equals(cpwd))
            {
        try
        {
            con=ob.getconnect();
            String pasof=cmbpo.getSelectedItem().toString();
            String dob=cmbdate.getSelectedItem().toString()+"/"+cmbmonth.getSelectedItem().toString()+"/"+cmbyear.getSelectedItem().toString();
            String hq=cmbhq.getSelectedItem().toString();
            Statement st=con.createStatement();
            st.executeUpdate("insert into user_table(passoff,name,surname,dob,mail,login_id,pwd,cpwd,hintq,hinta,status)values('"+pasof+"','"+txtname.getText()+"','"+txtsur.getText()+"','"+dob+"','"+txteid.getText()+"','"+txtlogin.getText()+"','"+txtpwd.getText()+"','"+txtcpwd.getText()+"','"+hq+"','"+txtha.getText()+"','NA')");
            st.executeUpdate("insert into login_table values('"+txtlogin.getText()+"','"+txtpwd.getText()+"','user',0,' ')");        
//          JOptionPane.showMessageDialog(this, "Your account is created.");
            frm_persdetail p=new frm_persdetail(txtname.getText());
            p.show();
            this.hide();
            //frm_application ap=new frm_application(txtname.getText());
           // ap.show();
            
           
            
        }
        catch(Exception ex)
        {
            System.out.print(ex.toString());
        }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Password Mismatch...");
            }
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void cmbpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbpoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbpoActionPerformed

    private void cmbdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbdateActionPerformed

    private void cmbhqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbhqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbhqActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        Connection con=null;
        try
        {
           con=ob.getconnect();
           txtname.setText(null);
           txtsur.setText(null);
           txteid.setText(null);
           txtlogin.setText(null);
           txtpwd.setText(null);
           txtcpwd.setText(null);
           txtha.setText(null);
           cmbpo.setSelectedItem(null);
           cmbdate.setSelectedItem(null);
           cmbmonth.setSelectedItem(null);
           cmbyear.setSelectedItem(null);
           cmbhq.setSelectedItem(null);
           rbyes.setSelected(false);
           rbno.setSelected(false);
                      
        }
        catch(Exception ex)
        {
            
        }
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
        frm_persdetail o=new frm_persdetail(txtname.getText());
        o.show();       
//        frm_application a=new frm_application(txtname.getText());
//        a.show();
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtsurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsurActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtsurActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        frm_login lo=new frm_login();
        lo.show();
        this.hide();
    }//GEN-LAST:event_btnexitActionPerformed

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
            java.util.logging.Logger.getLogger(frm_userreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_userreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_userreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_userreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_userreg().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox cmbdate;
    private javax.swing.JComboBox cmbhq;
    private javax.swing.JComboBox cmbmonth;
    private javax.swing.JComboBox cmbpo;
    private javax.swing.JComboBox cmbyear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcpwd;
    private javax.swing.JLabel lbldo;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lbleid;
    private javax.swing.JLabel lblha;
    private javax.swing.JLabel lblhq;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lbllo;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpo;
    private javax.swing.JLabel lblpwd;
    private javax.swing.JLabel lblsur;
    private javax.swing.JLabel lblval;
    private javax.swing.JRadioButton rbno;
    private javax.swing.JRadioButton rbyes;
    private javax.swing.JPasswordField txtcpwd;
    private javax.swing.JTextField txteid;
    private javax.swing.JTextField txtha;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpwd;
    private javax.swing.JTextField txtsur;
    // End of variables declaration//GEN-END:variables
}
