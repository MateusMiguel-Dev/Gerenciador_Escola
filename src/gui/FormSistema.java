package gui;
import dao.*;
//----- PACOTE DAO: UTILIZADO PARA REALIZAR CONEXÃO COM O BANCO DE DADOS E SUAS TAREFAS, CONTENDO AS CLASSES ALUNODAO, TECADMINDAO E PROFESSORDAO
import javax.swing.JOptionPane;
import pacote_classes_abstratas.Indices_Frames; 
//----- CLASSE INDICES FRAMES: UTILIZADA PARA TRANSFERIR OS INDICES DOS OBJETOS [ALUNO, TEC ADMIN E PROFESSOR] ENTRE AS JANELAS

/*
    ATIVIDADE AVALIATIVA 02 - PROGRAMAÇÃO ORIENTADA A OBJETOS - 02/07/2023
    DISCENTES: MATEUS SILVA MIGUEL E PAULO CÉSAR OLIVEIRA LARA
    DOCENTE RESPONSÁVEL: ALESSANDRO DE CASTRO BORGES
    
    FUNÇÃO GLOBAL DO PROGRAMA: REALIZAR O CADASTRO DE USUÁRIOS DE UM SISTEMA ESCOLAR, FAZENDO USO DE HERANÇA E IMPORTAÇÃO DE CLASSE, UTILIZANDO BANCO DE DADOS E JFRAMES, CONTENDO TIPOS DE USUÁRIOS COMO: 
    ALUNO - TÉCNICO ADMNISTRATIVO - PROFESSOR
    
    REQUISITOS DO SISTEMA: CADASTRAR OS USUÁRIOS - EDITAR OS USUÁRIOS - CONSULTAR OS USUÁRIOS - EXCLUIR OS USUÁRIOS - TODAS AS ITERAÇÕES SÃO ARMAZENADAS EM UM BANCO DE DADOS
    REQUISITOS ADICIONAIS: REALIZAR UM LOGIN ELEMENTAR/SIMPLES COM GERAÇÃO DE SENHA A PARTIR DO NOME E DATA ATUAL

    DESCRIÇÃO DOS TIPOS DE USUÁRIOS DO SISTEMA: 
    1. TODOS SÃO EXTENSÕES DA CLASSE ABSTRATA PESSOA - CLASSE QUE TAMBÉM CONTEM MÉTODOS A SEREM UTILIZADOS AO DECORRER DO PROGRAMA
    2. ALUNO 
        2.1. CONTÉM ATRIBUTOS PRÓPRIOS DE RA[STRING] E IRA[FLOAT];
    3. FUNCIONÁRIO
        3.1. CLASSE QUE SERÁ A EXTENSÃO DOS DOIS SEGUINTES TIPOS DE USUÁRIOS, CONTENDO O ATRIBUTO DE CÓDIGO FUNCIONAL[STRING]
    4. TÉCNICO ADMNISTRATIVO
        4.1. CONTÉM ATRIBUTO PRÓPRIO - DEPARTAMENTO[STRING]
    5. PROFESSOR
        5.1. CONTÉM ATRIBUTO PRÓPRIO - ÁREA DE ATUAÇÃO[STRING]

    DESCRIÇÃO DOS REQUISITOS DO SISTEMA:
    A. LOGIN 
        a. INSERÇÃO DO NOME, E REALIZADO A GERAÇÃO DE UMA SENHA A PARTIR DO NOME INICIAL COM TRANSFORMAÇÃO [UPPERCASE] E A DATA DO DIA ATUAL DE ACORDO COM A EXECUÇÃO DO PROGRAMA
        b. VERIFICAÇÃO DA SENHA SER REFERENTE AO NOME E DATA ATUAIS
        c. CASO A SENHA FOR INCORRETA, RETORNA AS OPÇÕES DE TENTAR NOVAMENTE OU SAIR DO PROGRAMA
    B. CADASTRAR USUÁRIOS
        a. PARA CONTINUAR COM O CADASTRO, O SISTEMA REALIZA A VERIFICAÇÃO DO CPF INSERIDO, E COMPARA SE ESTÁ CORRETO; CASO CONTRÁRIO, RETORNA O ERRO DO CPF
        b. REALIZADO O CADASTRO DE CADA TIPO DE USUÁRIO SEPARADAMENTE
    C. EDITAR USUÁRIOS
        a. CASO A EDIÇÃO TENHA RELAÇÃO COM O CPF, O SISTEMA REALIZA A MESMA VERIFICAÇÃO FEITA NO REQUISITO [A]
        b. REALIZA A EDIÇÃO SEPARADA DE CADA UM DOS ATRIBUTOS, SENDO OFERTADA A EDIÇÃO SEM NECESSIDADE DE RECADASTRAR TUDO NOVAMENTE
        c. ATUALIZA O CADASTRO DO USUÁRIO SELECIONADO
    D. CONSULTAR USUÁRIOS
        a. SENDO A PARTE MAIS SIMPLES DO SISTEMA, A CONSULTA PODE SER REALIZADA APENAS PARA UM USUÁRIO REFERENTE AS CATEGORIAS DE USUÁRIOS
        b. APENAS REALIZA A CONSULTA INDIVIDUTAL, TENDO EM VISTA QUE OS OUTROS TIPOS DE USUÁRIOS PODEM NÃO TER SIDO CADASTRADOS
*/
public class FormSistema extends javax.swing.JFrame {

    public FormSistema() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plCadastrar2 = new javax.swing.JPanel();
        btnSair15 = new javax.swing.JButton();
        lbOpcao6 = new javax.swing.JLabel();
        btnSair16 = new javax.swing.JButton();
        btnSair17 = new javax.swing.JButton();
        PlLogin = new javax.swing.JPanel();
        lbSistema = new javax.swing.JLabel();
        lbOp = new javax.swing.JLabel();
        plCadastrar = new javax.swing.JPanel();
        btnCadProfessor = new javax.swing.JButton();
        lbCadastrar = new javax.swing.JLabel();
        btnCadAluno = new javax.swing.JButton();
        btnCadTec = new javax.swing.JButton();
        plConsultar = new javax.swing.JPanel();
        btnConsProfessor = new javax.swing.JButton();
        lbConsultar = new javax.swing.JLabel();
        btnConsAluno = new javax.swing.JButton();
        btnConsTec = new javax.swing.JButton();
        plEditar = new javax.swing.JPanel();
        btnEditarProfessor = new javax.swing.JButton();
        lbEditar = new javax.swing.JLabel();
        btnEditarAluno = new javax.swing.JButton();
        btnEditarTec = new javax.swing.JButton();
        plExcluir = new javax.swing.JPanel();
        btnExcluirProfessor = new javax.swing.JButton();
        lbExcluir = new javax.swing.JLabel();
        btnExcluirTec = new javax.swing.JButton();
        btnExcluirAluno = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        plCadastrar2.setBackground(new java.awt.Color(204, 255, 204));

        btnSair15.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        btnSair15.setText("Professor");

        lbOpcao6.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        lbOpcao6.setText("Consultar");

        btnSair16.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        btnSair16.setText("Aluno");

        btnSair17.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        btnSair17.setText("Técnico Admnistrativo");

        javax.swing.GroupLayout plCadastrar2Layout = new javax.swing.GroupLayout(plCadastrar2);
        plCadastrar2.setLayout(plCadastrar2Layout);
        plCadastrar2Layout.setHorizontalGroup(
            plCadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCadastrar2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbOpcao6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair16, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair15, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        plCadastrar2Layout.setVerticalGroup(
            plCadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCadastrar2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plCadastrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbOpcao6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PlLogin.setBackground(new java.awt.Color(0, 204, 204));

        lbSistema.setFont(new java.awt.Font("Geologica", 0, 24)); // NOI18N
        lbSistema.setForeground(new java.awt.Color(255, 255, 255));
        lbSistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSistema.setText("SISTEMA ESCOLAR");
        lbSistema.setToolTipText("");

        javax.swing.GroupLayout PlLoginLayout = new javax.swing.GroupLayout(PlLogin);
        PlLogin.setLayout(PlLoginLayout);
        PlLoginLayout.setHorizontalGroup(
            PlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlLoginLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(lbSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(162, 162, 162))
        );
        PlLoginLayout.setVerticalGroup(
            PlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlLoginLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        lbOp.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        lbOp.setText("Selecione a opção desejada:");

        plCadastrar.setBackground(new java.awt.Color(153, 255, 204));

        btnCadProfessor.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        btnCadProfessor.setText("Professor");
        btnCadProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadProfessorActionPerformed(evt);
            }
        });

        lbCadastrar.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        lbCadastrar.setText("Cadastrar");

        btnCadAluno.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        btnCadAluno.setText("Aluno");
        btnCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadAlunoActionPerformed(evt);
            }
        });

        btnCadTec.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        btnCadTec.setText("Técnico Admnistrativo");
        btnCadTec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadTecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plCadastrarLayout = new javax.swing.GroupLayout(plCadastrar);
        plCadastrar.setLayout(plCadastrarLayout);
        plCadastrarLayout.setHorizontalGroup(
            plCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCadastrarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadTec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        plCadastrarLayout.setVerticalGroup(
            plCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadTec, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        plConsultar.setBackground(new java.awt.Color(204, 255, 204));

        btnConsProfessor.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        btnConsProfessor.setText("Professor");
        btnConsProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsProfessorActionPerformed(evt);
            }
        });

        lbConsultar.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        lbConsultar.setText("Consultar");

        btnConsAluno.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        btnConsAluno.setText("Aluno");
        btnConsAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsAlunoActionPerformed(evt);
            }
        });

        btnConsTec.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        btnConsTec.setText("Técnico Admnistrativo");
        btnConsTec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsTecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plConsultarLayout = new javax.swing.GroupLayout(plConsultar);
        plConsultar.setLayout(plConsultarLayout);
        plConsultarLayout.setHorizontalGroup(
            plConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plConsultarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsTec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        plConsultarLayout.setVerticalGroup(
            plConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsTec, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        plEditar.setBackground(new java.awt.Color(153, 255, 153));

        btnEditarProfessor.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        btnEditarProfessor.setText("Professor");
        btnEditarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProfessorActionPerformed(evt);
            }
        });

        lbEditar.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        lbEditar.setText("Editar");

        btnEditarAluno.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        btnEditarAluno.setText("Aluno");
        btnEditarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAlunoActionPerformed(evt);
            }
        });

        btnEditarTec.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        btnEditarTec.setText("Técnico Admnistrativo");
        btnEditarTec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plEditarLayout = new javax.swing.GroupLayout(plEditar);
        plEditar.setLayout(plEditarLayout);
        plEditarLayout.setHorizontalGroup(
            plEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plEditarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbEditar)
                .addGap(43, 43, 43)
                .addComponent(btnEditarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarTec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        plEditarLayout.setVerticalGroup(
            plEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarTec, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        plExcluir.setBackground(new java.awt.Color(51, 255, 204));

        btnExcluirProfessor.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        btnExcluirProfessor.setText("Professor");
        btnExcluirProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProfessorActionPerformed(evt);
            }
        });

        lbExcluir.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        lbExcluir.setText("Excluir");

        btnExcluirTec.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        btnExcluirTec.setText("Técnico Admnistrativo");
        btnExcluirTec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTecActionPerformed(evt);
            }
        });

        btnExcluirAluno.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        btnExcluirAluno.setText("Aluno");
        btnExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plExcluirLayout = new javax.swing.GroupLayout(plExcluir);
        plExcluir.setLayout(plExcluirLayout);
        plExcluirLayout.setHorizontalGroup(
            plExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plExcluirLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbExcluir)
                .addGap(37, 37, 37)
                .addComponent(btnExcluirAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirTec, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        plExcluirLayout.setVerticalGroup(
            plExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plExcluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirTec, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSair.setBackground(new java.awt.Color(255, 51, 51));
        btnSair.setFont(new java.awt.Font("Geologica", 0, 18)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair do Sistema");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(plCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(plConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(plEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(plExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbOp, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbOp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(plConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(plEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(plExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //----- ÁREA DE CADASTRO DOS TIPOS DE USUÁRIOS [ALUNO - TECNICO ADMNIN E PROFESSOR] -----
    //----- PARA REALIZAR O CADASTRO, UTILIZAMOS OS JFRAMES QUE INICIAM COM FORMCAD, REFERENTES RESPECTIVAMENTE A ALUNO, TEC ADMIN E PROFESSOR
    private void btnCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadAlunoActionPerformed
        //CADASTRO DE NOVO ALUNO [BOTÃO DE CADASTRO ALUNO]
        this.dispose();
        FormCadAluno CadAluno = new FormCadAluno();
        CadAluno.setLocationRelativeTo(null);
        CadAluno.setVisible(true);    
    }//GEN-LAST:event_btnCadAlunoActionPerformed

    private void btnCadTecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadTecActionPerformed
        //CADASTRO DE NOVO TÉCNICO ADMNISTRATIVO [BOTÃO DE CADASTRO TEC ADMIN]
        this.dispose();
        FormCadTecAdmin CadTec = new FormCadTecAdmin();
        CadTec.setLocationRelativeTo(null);
        CadTec.setVisible(true);    
    }//GEN-LAST:event_btnCadTecActionPerformed

    private void btnCadProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadProfessorActionPerformed
        //CADASTRO DE NOVO TÉCNICO ADMNISTRATIVO [BOTÃO DE CADASTRO PROFESSOR]
        this.dispose();
        FormCadProfessor CadProf = new FormCadProfessor();
        CadProf.setLocationRelativeTo(null);
        CadProf.setVisible(true);    
    }//GEN-LAST:event_btnCadProfessorActionPerformed
    //----- FIM ÁREA CADASTRO -----

    //----- ARÉA DE CONSULTA DOS TIPOS DE USUÁRIOS [ALUNO - TECNICO ADMNIN E PROFESSOR] ----- 
    //----- PARA A ÁREA DE CONSULTA, FOI FEITO APENAS UMA JANELA DE SHOW MESSAGE DIALOG PARA RETORNAR OS DADOS
    private void btnConsAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsAlunoActionPerformed
        this.dispose();
        String ConsAluno = JOptionPane.showInputDialog("Insira o RA do Aluno a ser consultado:");
        if(AlunoDAO.pesquisa(ConsAluno)){//----- RETORNA SE EXISTE ALGUM ALUNO COM TAL CÓDIGO NO BANCO DE DADOS
            AlunoDAO.consultar(ConsAluno);//----- CADASTRA NO BANCO DE DADOS
        }else{
            JOptionPane.showMessageDialog(null, "Erro: Aluno não encontrado na base de dados...");
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }        
        this.setVisible(true);
    }//GEN-LAST:event_btnConsAlunoActionPerformed
    
    private void btnConsTecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsTecActionPerformed
        this.dispose();
        String ConsTec = JOptionPane.showInputDialog("Insira o Código do Técnico Admnistrativo a ser consultado:");
        if(TecAdminDAO.pesquisa(ConsTec)){
            TecAdminDAO.consultar(ConsTec);  
        }else{
            JOptionPane.showMessageDialog(null, "Erro: Técnico Admnistrativo não encontrado na base de dados...");
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }        
        this.setVisible(true);
    }//GEN-LAST:event_btnConsTecActionPerformed

    private void btnConsProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsProfessorActionPerformed
        this.dispose();
        String ConsProf = JOptionPane.showInputDialog("Insira o Código do Professor a ser consultado:");
        if(ProfessorDAO.pesquisa(ConsProf)){
            ProfessorDAO.consultar(ConsProf);  
        }else{
            JOptionPane.showMessageDialog(null, "Erro: Professor não encontrado na base de dados...");
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }        
        this.setVisible(true);
    }//GEN-LAST:event_btnConsProfessorActionPerformed
    //----- FIM ÁREA CONSULTA -----
    
    //----- ARÉA DE EDICÃO DOS TIPOS DE USUÁRIOS [ALUNO - TECNICO ADMNIN E PROFESSOR] -----
    //----- PARA A ÁREA DE EDIÇÃO, FOI UTILIZADO JFRAMES REPRESENTADOS COM O INICIO DE FORMEDICAO, PARA CADA UM DOS TIPOS DE USUÁRIOS
    private void btnEditarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAlunoActionPerformed
        this.dispose();
        String ra = JOptionPane.showInputDialog("Insira o RA do Aluno que deseja editar:");
        if(AlunoDAO.pesquisa(ra)){
            Indices_Frames.setValor(ra);//TRANSFERENCIA DO RA DE FORMA SEGURA PARA RECEBER EM OUTRA CLASSE/JFRAME
            FormEdicaoAluno EdAluno = new FormEdicaoAluno();
            EdAluno.setLocationRelativeTo(null);
            EdAluno.setVisible(true);  
        }else{
            JOptionPane.showMessageDialog(null, "Erro: Aluno não encontrado na base de dados...");
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }        
    }//GEN-LAST:event_btnEditarAlunoActionPerformed

    private void btnEditarTecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTecActionPerformed
       this.dispose();
        String Cod = JOptionPane.showInputDialog("Insira o Código do Técnico Admnistrativo que deseja editar:");
        if(TecAdminDAO.pesquisa(Cod)){
            Indices_Frames.setCod_TecAdmin(Cod);
            FormEdicaoTecAdmin EdTec = new FormEdicaoTecAdmin();
            EdTec.setLocationRelativeTo(null);
            EdTec.setVisible(true);  
        }else{
            JOptionPane.showMessageDialog(null, "Erro: Técnico Admnistrativo não encontrado na base de dados...");
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }        
    }//GEN-LAST:event_btnEditarTecActionPerformed

    private void btnEditarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProfessorActionPerformed
        this.dispose();
        String Cod = JOptionPane.showInputDialog("Insira o Código do Professor que deseja editar:");
        if(ProfessorDAO.pesquisa(Cod)){
            Indices_Frames.setCod_Professor(Cod);
            FormEdicaoProfessor EdProf = new FormEdicaoProfessor();
            EdProf.setLocationRelativeTo(null);
            EdProf.setVisible(true);  
        }else{
            JOptionPane.showMessageDialog(null, "Erro: Professor não encontrado na base de dados...");
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }        
    }//GEN-LAST:event_btnEditarProfessorActionPerformed
    //----- FIM ÁREA EDIÇÃO -----
    
    //----- ARÉA DE EXCLUSÃO DOS TIPOS DE USUÁRIOS [ALUNO - TECNICO ADMNIN E PROFESSOR] ----- 
    //----- PARA A EXCLUSÃO, FOI FEITO UMA JANELA SIMPLES COM SHOW MESSAGE DIALOG PARA CONFIRMAR A EXCLUSÃO DOS DADOS 
    private void btnExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAlunoActionPerformed
        this.dispose();
        String ExAluno = JOptionPane.showInputDialog("Insira o RA do Aluno a ser excluido:");
        if(AlunoDAO.pesquisa(ExAluno)){//----- FUNÇÃO QUE EXCLUI OS DADOS DA BASE DE DADOS, A PARTIR DA VERIFICAÇÃO SE EXISTE ALGUM CÓDIGO REFERENTE NA TABELA
            AlunoDAO.excluir(ExAluno);  
            JOptionPane.showMessageDialog(null, "Aluno Excluido com Sucesso...");
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }else{
            JOptionPane.showMessageDialog(null, "Erro: Aluno não encontrado na base de dados...");
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }        
    }//GEN-LAST:event_btnExcluirAlunoActionPerformed

    private void btnExcluirTecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTecActionPerformed
        this.dispose();
        String ExTec = JOptionPane.showInputDialog("Insira o Código do Técnico Admnistrativo a ser excluido:");
        if(TecAdminDAO.pesquisa(ExTec)){
            TecAdminDAO.excluir(ExTec);  
            JOptionPane.showMessageDialog(null, "Técnico Admnistrativo Excluido com Sucesso...");
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }else{
            JOptionPane.showMessageDialog(null, "Erro: Técnico Admnistrativo não encontrado na base de dados...");
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnExcluirTecActionPerformed

    private void btnExcluirProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProfessorActionPerformed
        this.dispose();
        String ExProf = JOptionPane.showInputDialog("Insira o Código do Professor a ser excluido:");
        if(ProfessorDAO.pesquisa(ExProf)){
            ProfessorDAO.excluir(ExProf);  
            JOptionPane.showMessageDialog(null, "Professor Excluido com Sucesso...");
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }else{
            JOptionPane.showMessageDialog(null, "Erro: Professor não encontrado na base de dados...");
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }        
    }//GEN-LAST:event_btnExcluirProfessorActionPerformed
    //----- FIM ÁREA EXCLUSÃO -----

    //----- SAIR DO PROGRAMA -----
    //----- BOTÃO SAIR 
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PlLogin;
    private javax.swing.JButton btnCadAluno;
    private javax.swing.JButton btnCadProfessor;
    private javax.swing.JButton btnCadTec;
    private javax.swing.JButton btnConsAluno;
    private javax.swing.JButton btnConsProfessor;
    private javax.swing.JButton btnConsTec;
    private javax.swing.JButton btnEditarAluno;
    private javax.swing.JButton btnEditarProfessor;
    private javax.swing.JButton btnEditarTec;
    private javax.swing.JButton btnExcluirAluno;
    private javax.swing.JButton btnExcluirProfessor;
    private javax.swing.JButton btnExcluirTec;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSair15;
    private javax.swing.JButton btnSair16;
    private javax.swing.JButton btnSair17;
    private javax.swing.JLabel lbCadastrar;
    private javax.swing.JLabel lbConsultar;
    private javax.swing.JLabel lbEditar;
    private javax.swing.JLabel lbExcluir;
    private javax.swing.JLabel lbOp;
    private javax.swing.JLabel lbOpcao6;
    private javax.swing.JLabel lbSistema;
    private javax.swing.JPanel plCadastrar;
    private javax.swing.JPanel plCadastrar2;
    private javax.swing.JPanel plConsultar;
    private javax.swing.JPanel plEditar;
    private javax.swing.JPanel plExcluir;
    // End of variables declaration//GEN-END:variables
}
