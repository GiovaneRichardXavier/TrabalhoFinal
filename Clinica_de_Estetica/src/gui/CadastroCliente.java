/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entity.Usuario;
import dao.UsuarioDao;
import com.sun.security.ntlm.Client;
import entity.Cliente;
import dao.ClienteDao;
import entity.ClienteTableModel;
import entity.ModeloTabela;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author giovane richard
 */
public class CadastroCliente extends javax.swing.JFrame {
    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
        txtCodigo.setEnabled(false);
        
       preencheTabela();
       
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
        jPanel2 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jcSexo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jfNascimento = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jcCidade = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jcUf = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jfCpf = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jfTelefone = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados Pessoais"));

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jcSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));

        jLabel1.setText("Nome");

        jLabel2.setText("Sexo");

        try {
            jfNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## / ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfNascimento.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel3.setText("Nascimento");

        jLabel4.setText("CPF");

        jLabel5.setText("RG");

        txtRg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setText("Endereço");

        txtEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setText("Bairro");

        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setText("Cidade");

        jcCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Montezuma", "Mato Verde", "Mortugaba", "St Antônio do Retiro", "Rio Pardo de Minas", "Vargem Grande", "Montes Claros", "Salinas ", "Taiobeiras", "Janaúba" }));
        jcCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCidadeActionPerformed(evt);
            }
        });

        jLabel11.setText("UF");

        jcUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));

        jLabel12.setText("Código");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        try {
            jfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfCpf.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel6.setText("Telefone");

        try {
            jfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfTelefone.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfTelefoneActionPerformed(evt);
            }
        });

        jLabel7.setText("Email");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setText("Pesquisar");

        txtBusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jcSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jfNascimento)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addGap(451, 451, 451)
                        .addComponent(jLabel13))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jcUf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(327, 327, 327)
                                .addComponent(jLabel5)
                                .addGap(190, 190, 190)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBairro)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jfNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcUf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar2.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/apagar.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setMaximumSize(new java.awt.Dimension(115, 57));
        btnExcluir.setMinimumSize(new java.awt.Dimension(115, 57));
        btnExcluir.setPreferredSize(new java.awt.Dimension(115, 57));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "telefone", "Email", "CPF", "RG", "Endereço", "Bairro", "Cidade", "UF", "Sexo", "Data Nasc"
            }
        ));
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jTableClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableClientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCidadeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        Cliente cliente = new Cliente();
        ClienteDao cd = new ClienteDao();
        
        
        try {
            
//            // Conversão data para salvar no banco 
//            String dia = jfNascimento.getText().substring(0,2);
//            String mes = jfNascimento.getText().substring(3,5);
//            String ano = jfNascimento.getText().substring(6);
//            String dataBanco = ano + "-" +  mes + "-" + dia;
//            
//            cliente.setDtnascimento(dataBanco);
            cliente.setNome(txtNome.getText());
            cliente.setCpf(jfCpf.getText());     
            cliente.setSexo(jcSexo.getSelectedItem().toString());
            cliente.setRua(txtEndereco.getText());
            cliente.setBairro(txtBairro.getText());
            cliente.setCidade(jcCidade.getSelectedItem().toString());
            cliente.setUf(jcUf.getSelectedItem().toString());
            cliente.setTelefone(jfTelefone.getText());
            cliente.setEmail(txtEmail.getText());
            
            if(cliente.getId() == null)
                 cliente.setId(0);

            
            // Salva os dados no banco
            cd.salvar(cliente);
            
           
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso! ");
            
            // Limpando os campos
            txtNome.setText("");
            jfNascimento.setText("");
            jfCpf.setText("");
            txtRg.setText("");
            jcSexo.setToolTipText("selecione");
            txtEndereco.setText("");
            txtBairro.setText("");
            jcCidade.setToolTipText("selecione");
            jcUf.setToolTipText("AC");
            jfTelefone.setText("");
            txtEmail.setText("");
            
            // passando o focus
            txtNome.requestFocus();
            
        } catch (Exception e) {
            
            System.out.println("Erro ao cadastrar o cliente!");
        }
        
       
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfTelefoneActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        preencheTabela();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        
        int indiceAtual =  jTableClientes.getSelectedRow();
        
        txtCodigo.setText(jTableClientes.getValueAt(indiceAtual, 0).toString());
        txtNome.setText(jTableClientes.getValueAt(indiceAtual, 1).toString());
        jfTelefone.setText(jTableClientes.getValueAt(indiceAtual, 2).toString());
        txtEmail.setText(jTableClientes.getValueAt(indiceAtual, 3).toString());
        jfCpf.setText(jTableClientes.getValueAt(indiceAtual, 4).toString());
        txtEndereco.setText(jTableClientes.getValueAt(indiceAtual, 6).toString());
        txtBairro.setText(jTableClientes.getValueAt(indiceAtual, 7).toString());
       // jcCidade.setText(jTableClientes.getValueAt(indiceAtual, 8).toString());
       // jcUf.setText(jTableClientes.getValueAt(indiceAtual, 9).toString());
       // jcSexo.setText(jTableClientes.getValueAt(indiceAtual, 10).toString());
         
         
        // jcCidade.add("Montezuma", this);
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jTableClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableClientesKeyReleased
            
         int indiceAtual =  jTableClientes.getSelectedRow();
        
        txtCodigo.setText(jTableClientes.getValueAt(indiceAtual, 0).toString());
        txtNome.setText(jTableClientes.getValueAt(indiceAtual, 1).toString());
        jfTelefone.setText(jTableClientes.getValueAt(indiceAtual, 2).toString());
        txtEmail.setText(jTableClientes.getValueAt(indiceAtual, 3).toString());
        jfCpf.setText(jTableClientes.getValueAt(indiceAtual, 4).toString());
        txtEndereco.setText(jTableClientes.getValueAt(indiceAtual, 6).toString());
        txtBairro.setText(jTableClientes.getValueAt(indiceAtual, 7).toString());
       // jcCidade.setText(jTableClientes.getValueAt(indiceAtual, 8).toString());
       // jcUf.setText(jTableClientes.getValueAt(indiceAtual, 9).toString());
       // jcSexo.setText(jTableClientes.getValueAt(indiceAtual, 10).toString());
         jfNascimento.setText(jTableClientes.getValueAt(indiceAtual, 11).toString());
         
        
    }//GEN-LAST:event_jTableClientesKeyReleased

    // Preenche tabela com dados vindo do banco
    //public void preencherTabela(String Sql){
//    public void preencherTabela(){
//        ClienteDao clienteD = new ClienteDao();
//        Cliente cliente = new Cliente();
//        
//        ArrayList dados =  new ArrayList();
//        
//        String [] colunas = new String []{"id", "nome", "telefone", "email", "cpf", "rg", "rua", "bairro", "cidade", "uf", "sexo","dtnascimento"};
//       
//        ModeloTabela modelo = new ModeloTabela((ArrayList) clienteD.buscarPorNomeInicial(cliente), colunas);
        
//        jTableClientes.setModel(modelo);
//        jTableClientes.getColumnModel().getColumn(0).setPreferredWidth(23);
//        jTableClientes.getColumnModel().getColumn(0).setResizable(false);
//        jTableClientes.getColumnModel().getColumn(1).setPreferredWidth(180);
//        jTableClientes.getColumnModel().getColumn(1).setResizable(false);
//        jTableClientes.getColumnModel().getColumn(2).setPreferredWidth(80);
//        jTableClientes.getColumnModel().getColumn(2).setResizable(false);
//        jTableClientes.getColumnModel().getColumn(3).setPreferredWidth(80);
//        jTableClientes.getColumnModel().getColumn(3).setResizable(false);
//        jTableClientes.getColumnModel().getColumn(4).setPreferredWidth(80);
//        jTableClientes.getColumnModel().getColumn(4).setResizable(false);
//        jTableClientes.getColumnModel().getColumn(5).setPreferredWidth(80);
//        jTableClientes.getColumnModel().getColumn(5).setResizable(false);
//        jTableClientes.getColumnModel().getColumn(6).setPreferredWidth(80);
//        jTableClientes.getColumnModel().getColumn(6).setResizable(false);
//        jTableClientes.getColumnModel().getColumn(7).setPreferredWidth(80);
//        jTableClientes.getColumnModel().getColumn(7).setResizable(false);
//        jTableClientes.getColumnModel().getColumn(8).setPreferredWidth(80);
//        jTableClientes.getColumnModel().getColumn(8).setResizable(false);
//        jTableClientes.getColumnModel().getColumn(9).setPreferredWidth(80);
//        jTableClientes.getColumnModel().getColumn(9).setResizable(false);
//        jTableClientes.getColumnModel().getColumn(10).setPreferredWidth(80);
//        jTableClientes.getColumnModel().getColumn(10).setResizable(false);
//        jTableClientes.getColumnModel().getColumn(11).setPreferredWidth(80);
//        jTableClientes.getColumnModel().getColumn(11).setResizable(false);
//        jTableClientes.getColumnModel().getColumn(12).setPreferredWidth(80);
//        jTableClientes.getColumnModel().getColumn(12).setResizable(false);
//        
//        jTableClientes.getTableHeader().setReorderingAllowed(false);
//        jTableClientes.setAutoResizeMode(jTableClientes.AUTO_RESIZE_OFF);
//        jTableClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//    }
    
    /**
     * preenche a jTable com todos os dados vindo do banco
     */
    public void preencheTabela(){
        ClienteDao clienteD = new ClienteDao();
        Cliente clientes = new Cliente();
        
        List<Cliente> listaClientes = clienteD.buscar(clientes);
        
        DefaultTableModel modelo = (DefaultTableModel) jTableClientes.getModel();
        
        if(modelo.getRowCount() > 0){
            modelo.setRowCount(0);
        }
        
        if(clientes.getId() == null)
            clientes.setId(1);
        
        for(Cliente a: listaClientes){
            Object[] objeto = new Object[11];
            
            objeto[0] = a.getId();
            objeto[1] = a.getNome();
            objeto[2] = a.getTelefone();
            objeto[3] = a.getEmail();
            objeto[4] = a.getCpf();
            objeto[6] = a.getRua();
            objeto[7] = a.getBairro();
            objeto[8] = a.getCidade();
            objeto[9] = a.getUf();
            objeto[10] = a.getSexo();
   
            
            
            modelo.addRow(objeto);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JComboBox<String> jcCidade;
    private javax.swing.JComboBox<String> jcSexo;
    private javax.swing.JComboBox<String> jcUf;
    private javax.swing.JFormattedTextField jfCpf;
    private javax.swing.JFormattedTextField jfNascimento;
    private javax.swing.JFormattedTextField jfTelefone;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRg;
    // End of variables declaration//GEN-END:variables
}
