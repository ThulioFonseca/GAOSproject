package main;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import aplication.Client;
import aplication.Device;
import aplication.WorkOrder;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCriarCliente;
	private JTextField textCriarModelo;
	private JTextField textCriarData;
	private JTextField textFinalizarPesquisar;
	private JTextField textFinalizarCliente;
	private JTextField textFinalizarModelo;
	private JTextField textFinalizarData;
	private JTextField textFinalizarValor;
	private JTextField textFinalizarCusto;
	private JTable tableListar;
	private JTable tableBalanco;
	private JTextField textCriarEmail;
	private JTextField textCriarTelefone;
	private JTextField textCriarFabricante;
	private JTextField textFinalizarStatus;

	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		} catch (InstantiationException e1) {

			e1.printStackTrace();
		} catch (IllegalAccessException e1) {

			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {

			e1.printStackTrace();
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public MainWindow() {

		List<WorkOrder> lista = new LinkedList<WorkOrder>();

		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setResizable(false);
		setTitle("GAOS v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// ****************************************/< Tela Home
		// >/*************************************************************************

		JPanel telaHome = new JPanel();
		telaHome.setBackground(SystemColor.controlHighlight);
		telaHome.setBounds(207, 11, 568, 539);
		telaHome.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(telaHome);
		telaHome.setLayout(null);
		telaHome.setVisible(true);

		JLabel lblNewLabel_2 = new JLabel("GAOS v1.0");
		lblNewLabel_2.setBounds(234, 203, 141, 46);
		lblNewLabel_2.setFont(new Font("Bauhaus 93", Font.PLAIN, 31));
		telaHome.add(lblNewLabel_2);
		contentPane.setLayout(null);

		// ****************************************/< Tela Criar
		// >/***********************************************************************

		JPanel telaCriar = new JPanel();
		telaCriar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		telaCriar.setVisible(false);
		telaCriar.setBackground(SystemColor.controlHighlight);
		telaCriar.setBounds(207, 11, 568, 539);
		contentPane.add(telaCriar);
		telaCriar.setLayout(null);
		telaCriar.setVisible(false);

		textCriarCliente = new JTextField();
		textCriarCliente.setToolTipText("Cliente");
		textCriarCliente.setBounds(65, 105, 439, 20);
		telaCriar.add(textCriarCliente);
		textCriarCliente.setColumns(10);

		textCriarModelo = new JTextField();
		textCriarModelo.setBounds(302, 234, 202, 20);
		telaCriar.add(textCriarModelo);
		textCriarModelo.setColumns(10);

		textCriarData = new JTextField();
		textCriarData.setBounds(65, 392, 96, 20);
		telaCriar.add(textCriarData);
		textCriarData.setColumns(10);

		JLabel lblCriarClient = new JLabel("Cliente");
		lblCriarClient.setBounds(65, 87, 48, 14);
		telaCriar.add(lblCriarClient);

		JLabel lblCriarModelo = new JLabel("Modelo");
		lblCriarModelo.setBounds(304, 216, 48, 14);
		telaCriar.add(lblCriarModelo);

		JLabel lblCriarData = new JLabel("Data");
		lblCriarData.setBounds(66, 377, 48, 14);
		telaCriar.add(lblCriarData);

		JTextArea textCriarDescricao = new JTextArea();
		textCriarDescricao.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textCriarDescricao.setBounds(66, 281, 437, 90);
		telaCriar.add(textCriarDescricao);

		JLabel lblCriarDescricao = new JLabel("Descri\u00E7\u00E3o do Problema");
		lblCriarDescricao.setBounds(66, 261, 150, 14);
		telaCriar.add(lblCriarDescricao);

		JButton btnCriarCancelar = new JButton("Cancelar");
		btnCriarCancelar.setBounds(414, 444, 89, 23);
		telaCriar.add(btnCriarCancelar);

		JLabel lblCriarNovaOrdem = new JLabel("Criar nova Ordem de Servi\u00E7o");
		lblCriarNovaOrdem.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 18));
		lblCriarNovaOrdem.setBounds(64, 36, 267, 36);
		telaCriar.add(lblCriarNovaOrdem);

		JLabel lblCriarEmail = new JLabel("Email");
		lblCriarEmail.setBounds(65, 136, 48, 14);
		telaCriar.add(lblCriarEmail);

		textCriarEmail = new JTextField();
		textCriarEmail.setBounds(65, 154, 202, 20);
		telaCriar.add(textCriarEmail);
		textCriarEmail.setColumns(10);

		textCriarTelefone = new JTextField();
		textCriarTelefone.setBounds(302, 154, 201, 20);
		telaCriar.add(textCriarTelefone);
		textCriarTelefone.setColumns(10);

		JLabel lblCriarTelefone = new JLabel("Telefone");
		lblCriarTelefone.setBounds(302, 136, 75, 14);
		telaCriar.add(lblCriarTelefone);

		JLabel lblCriarFabricante = new JLabel("Fabricante ");
		lblCriarFabricante.setBounds(67, 216, 75, 14);
		telaCriar.add(lblCriarFabricante);

		textCriarFabricante = new JTextField();
		textCriarFabricante.setBounds(65, 234, 202, 20);
		telaCriar.add(textCriarFabricante);
		textCriarFabricante.setColumns(10);

		Box horizontalBoxCriar = Box.createHorizontalBox();
		horizontalBoxCriar.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), " Device ",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		horizontalBoxCriar.setBounds(41, 192, 487, 235);
		telaCriar.add(horizontalBoxCriar);

		JButton btnCriarSalvar = new JButton("Salvar");
		btnCriarSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String status, nome, email, data, problema, modelo, fabricante;
				long telefone;
				double custo, preco;

				// Client

				nome = textCriarCliente.getText();
				telefone = Long.parseLong(textCriarTelefone.getText());
				email = textCriarEmail.getText();

				// WorkOrder
				status = "Aberto";
				data = textCriarData.getText();
				custo = 00;
				preco = 00;

				// Device

				problema = textCriarDescricao.getText();
				fabricante = textCriarFabricante.getText();
				modelo = textCriarModelo.getText();

				Client c = new Client(nome, telefone, email);
				Device d = new Device(problema, fabricante, modelo);
				WorkOrder ordem = new WorkOrder(status, c, d, data, custo, preco);
				lista.add(ordem);

				textCriarCliente.setText(null);
				textCriarTelefone.setText(null);
				textCriarEmail.setText(null);
				textCriarData.setText(null);
				textCriarModelo.setText(null);
				textCriarFabricante.setText(null);
				textCriarDescricao.setText(null);

			}
		});
		btnCriarSalvar.setBounds(315, 444, 89, 23);
		telaCriar.add(btnCriarSalvar);

		// *************************************/< Tela Finalizar
		// >/*************************************************************************************

		JPanel telaFinalizar = new JPanel();
		telaFinalizar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		telaFinalizar.setBounds(207, 11, 568, 539);
		contentPane.add(telaFinalizar);
		telaFinalizar.setBackground(SystemColor.controlHighlight);
		telaFinalizar.setLayout(null);
		telaFinalizar.setVisible(false);

		JRadioButton rdbtnCancelarOrdem = new JRadioButton("Cancelar ordem");
		rdbtnCancelarOrdem.setBackground(SystemColor.controlHighlight);
		rdbtnCancelarOrdem.setBounds(149, 413, 126, 23);
		telaFinalizar.add(rdbtnCancelarOrdem);

		JRadioButton rdbtnFiltrarOrdem = new JRadioButton("ID da Ordem");
		rdbtnFiltrarOrdem.setBackground(SystemColor.controlHighlight);
		rdbtnFiltrarOrdem.setBounds(418, 105, 115, 23);
		telaFinalizar.add(rdbtnFiltrarOrdem);

		textFinalizarPesquisar = new JTextField();
		textFinalizarPesquisar.setBounds(64, 106, 225, 20);
		telaFinalizar.add(textFinalizarPesquisar);
		textFinalizarPesquisar.setColumns(10);

		JLabel lblFinalizarStatus = new JLabel("Status");
		lblFinalizarStatus.setBounds(67, 349, 55, 16);
		telaFinalizar.add(lblFinalizarStatus);

		textFinalizarStatus = new JTextField();
		textFinalizarStatus.setEditable(false);
		textFinalizarStatus.setBounds(67, 368, 100, 20);
		telaFinalizar.add(textFinalizarStatus);
		textFinalizarStatus.setColumns(10);

		JRadioButton rdbtnFiltrarCliente = new JRadioButton("Cliente");
		rdbtnFiltrarCliente.setActionCommand("true");
		rdbtnFiltrarCliente.setBackground(SystemColor.controlHighlight);
		rdbtnFiltrarCliente.setBounds(333, 105, 83, 23);
		// rdbtnFiltrarCliente.addActionListener(this);
		telaFinalizar.add(rdbtnFiltrarCliente);

		ButtonGroup pesquisa = new ButtonGroup();
		pesquisa.add(rdbtnFiltrarCliente);
		pesquisa.add(rdbtnFiltrarOrdem);

		JLabel lblFinalizarPesquisar = new JLabel("Pesquisar");
		lblFinalizarPesquisar.setBounds(64, 87, 78, 14);
		telaFinalizar.add(lblFinalizarPesquisar);

		textFinalizarCliente = new JTextField();
		textFinalizarCliente.setEditable(false);
		textFinalizarCliente.setToolTipText("Cliente");
		textFinalizarCliente.setColumns(10);
		textFinalizarCliente.setBounds(64, 155, 439, 20);
		telaFinalizar.add(textFinalizarCliente);

		JLabel lblFinalizarCliente = new JLabel("Cliente");
		lblFinalizarCliente.setBounds(66, 137, 48, 14);
		telaFinalizar.add(lblFinalizarCliente);

		JLabel lblFinalizarModelo = new JLabel("Modelo");
		lblFinalizarModelo.setBounds(67, 185, 48, 14);
		telaFinalizar.add(lblFinalizarModelo);

		textFinalizarModelo = new JTextField();
		textFinalizarModelo.setEditable(false);
		textFinalizarModelo.setColumns(10);
		textFinalizarModelo.setBounds(65, 203, 312, 20);
		telaFinalizar.add(textFinalizarModelo);

		JLabel lblFinalizarDescricao = new JLabel("Descri\u00E7\u00E3o");
		lblFinalizarDescricao.setBounds(66, 230, 76, 14);
		telaFinalizar.add(lblFinalizarDescricao);

		JTextArea textFinalizarDescricao = new JTextArea();
		textFinalizarDescricao.setEditable(false);
		textFinalizarDescricao.setBounds(66, 250, 437, 90);
		telaFinalizar.add(textFinalizarDescricao);

		textFinalizarData = new JTextField();
		textFinalizarData.setEditable(false);
		textFinalizarData.setColumns(10);
		textFinalizarData.setBounds(407, 203, 96, 20);
		telaFinalizar.add(textFinalizarData);

		JLabel lblFinalizarData = new JLabel("Data");
		lblFinalizarData.setBounds(409, 186, 48, 14);
		telaFinalizar.add(lblFinalizarData);

		JButton btnFinalizarSalvar = new JButton("Salvar");
		btnFinalizarSalvar.setBounds(315, 450, 89, 23);
		telaFinalizar.add(btnFinalizarSalvar);

		JButton btnFinalizarCancelar = new JButton("Cancelar");
		btnFinalizarCancelar.setBounds(414, 450, 89, 23);
		telaFinalizar.add(btnFinalizarCancelar);

		JLabel lblFinalizarValor = new JLabel("Pre\u00E7o");
		lblFinalizarValor.setBounds(439, 351, 94, 14);
		telaFinalizar.add(lblFinalizarValor);

		textFinalizarValor = new JTextField();
		textFinalizarValor.setColumns(10);
		textFinalizarValor.setBounds(437, 368, 67, 20);
		telaFinalizar.add(textFinalizarValor);

		JLabel lblFinalizarCusto = new JLabel("Custo");
		lblFinalizarCusto.setBounds(330, 351, 48, 14);
		telaFinalizar.add(lblFinalizarCusto);

		textFinalizarCusto = new JTextField();
		textFinalizarCusto.setColumns(10);
		textFinalizarCusto.setBounds(330, 368, 67, 20);
		telaFinalizar.add(textFinalizarCusto);

		JCheckBox chckbxGerarRelatrio = new JCheckBox("Gerar relat\u00F3rio");
		chckbxGerarRelatrio.setBackground(SystemColor.controlHighlight);
		chckbxGerarRelatrio.setBounds(64, 450, 126, 23);
		telaFinalizar.add(chckbxGerarRelatrio);

		JRadioButton rdbtnFinalizarFinalizar = new JRadioButton("Finalizar");
		rdbtnFinalizarFinalizar.setBackground(SystemColor.controlHighlight);
		rdbtnFinalizarFinalizar.setBounds(64, 413, 83, 23);
		telaFinalizar.add(rdbtnFinalizarFinalizar);

		ButtonGroup finaliza = new ButtonGroup();
		finaliza.add(rdbtnFinalizarFinalizar);
		finaliza.add(rdbtnCancelarOrdem);

		JLabel lblFinalizarOrdemDe = new JLabel("Finalizar Ordem de Servi\u00E7o");
		lblFinalizarOrdemDe.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 18));
		lblFinalizarOrdemDe.setBounds(64, 36, 267, 36);
		telaFinalizar.add(lblFinalizarOrdemDe);

		JLabel lblCustoCifra = new JLabel("R$");
		lblCustoCifra.setBounds(311, 371, 48, 14);
		telaFinalizar.add(lblCustoCifra);

		JLabel lblPrecoCifra = new JLabel("R$");
		lblPrecoCifra.setBounds(418, 371, 48, 14);
		telaFinalizar.add(lblPrecoCifra);

		JButton btnFinalizarGO = new JButton("IR");
		btnFinalizarGO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				for (int i = 0; i < lista.size(); i++) {

					if (rdbtnFiltrarCliente.isSelected() == true) {
						String name = lista.get(i).getName();
						if (textFinalizarPesquisar.getText().equals(name)) {

							textFinalizarCliente.setText(lista.get(i).getName());
							textFinalizarDescricao.setText(lista.get(i).getTrouble());
							textFinalizarModelo.setText(lista.get(i).getModel());
							textFinalizarData.setText(lista.get(i).getDate());
							textFinalizarStatus.setText(lista.get(i).getStatus());

						}

					}

					else {

						long num = lista.get(i).getNumber();

						if (num == Long.parseLong(textFinalizarPesquisar.getText())) {

							textFinalizarCliente.setText(lista.get(i).getName());
							textFinalizarDescricao.setText(lista.get(i).getTrouble());
							textFinalizarModelo.setText(lista.get(i).getModel());
							textFinalizarData.setText(lista.get(i).getDate());
							textFinalizarStatus.setText(lista.get(i).getStatus());

						}

					}
				}
			}
		});
		btnFinalizarGO.setBounds(290, 105, 36, 24);
		telaFinalizar.add(btnFinalizarGO);

		// *************************************/< Tela Listar
		// >/****************************************************************************************

		JPanel telaListar = new JPanel();
		telaListar.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		telaListar.setBackground(SystemColor.controlHighlight);
		telaListar.setBounds(207, 11, 568, 539);
		contentPane.add(telaListar);
		telaListar.setLayout(null);
		telaListar.setVisible(false);

		JRadioButton rdbFiltarFinalizado = new JRadioButton("Finalizado");
		rdbFiltarFinalizado.setBackground(SystemColor.controlHighlight);
		rdbFiltarFinalizado.setBounds(66, 94, 93, 23);
		telaListar.add(rdbFiltarFinalizado);

		JRadioButton rdbtnFiltarCancelado = new JRadioButton("Cancelado");
		rdbtnFiltarCancelado.setBackground(SystemColor.controlHighlight);
		rdbtnFiltarCancelado.setBounds(161, 94, 93, 23);
		telaListar.add(rdbtnFiltarCancelado);

		JRadioButton rdbtnFiltarAberto = new JRadioButton("Aberto\r\n");
		rdbtnFiltarAberto.setBackground(SystemColor.controlHighlight);
		rdbtnFiltarAberto.setBounds(256, 94, 93, 23);
		telaListar.add(rdbtnFiltarAberto);

		String titulo[] = { "ID", "Status", "Nome", "E-mail", "Telefone", "Modelo", "Fabricante", "Data" };
		DefaultTableModel modelo = new DefaultTableModel(titulo, 0);

		tableListar = new JTable(modelo);
		tableListar.setEnabled(false);
		tableListar.setRowSelectionAllowed(false);
		tableListar.setAutoscrolls(true);
		tableListar.getTableHeader().setReorderingAllowed(false);
		tableListar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableListar.setBounds(60, 145, 500, 400);
		// telaListar.add(tableListar);

		JButton btnListarFiltrar = new JButton("Filtrar");
		/*
		 * btnListarFiltrar.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) {
		 * 
		 * int rowCount = modelo.getRowCount(); for (int i = rowCount - 1; i >= 0; i--)
		 * { modelo.removeRow(i); }
		 * 
		 * for (WorkOrder p : lista) {
		 * 
		 * modelo.addRow(new Object[] { p.getNumber(),p.getStatus(), p.getName(),
		 * p.getEmail(), p.getPhone(), p.getModel(), p.getManufacture(), p.getDate() });
		 * 
		 * } } });
		 */
		btnListarFiltrar.setBounds(355, 94, 89, 23);
		telaListar.add(btnListarFiltrar);

		JLabel lblListarOrdensDe = new JLabel("Listar Ordens de Servi\u00E7o");
		lblListarOrdensDe.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 18));
		lblListarOrdensDe.setBounds(64, 36, 267, 36);
		telaListar.add(lblListarOrdensDe);

		JScrollPane scrollPane = new JScrollPane(tableListar);
		scrollPane.setAutoscrolls(true);

		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(25, 145, 520, 359);
		telaListar.add(scrollPane);

		// ***************************************/< Tela Balanço
		// >/***************************************************************************

		JPanel telaBalanco = new JPanel();
		telaBalanco.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		telaBalanco.setBackground(SystemColor.controlHighlight);
		telaBalanco.setBounds(207, 11, 568, 539);
		contentPane.add(telaBalanco);
		telaBalanco.setLayout(null);
		telaBalanco.setVisible(false);

		tableBalanco = new JTable();
		tableBalanco.setBorder(new LineBorder(new Color(0, 0, 0)));
		tableBalanco.setBounds(60, 124, 446, 368);
		telaBalanco.add(tableBalanco);

		JLabel lblBalanco = new JLabel("Balan\u00E7o financeiro");
		lblBalanco.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 18));
		lblBalanco.setBounds(64, 36, 267, 36);
		telaBalanco.add(lblBalanco);

		// ******************************************************/< Tela Menu Lateral
		// >/*********************************************************

		JPanel menuLateral = new JPanel();
		menuLateral.setBackground(SystemColor.menu);
		menuLateral.setBounds(5, 16, 182, 310);
		menuLateral.setBorder(null);
		menuLateral.setLayout(null);
		contentPane.add(menuLateral);

		JButton btnNewButton = new JButton("Criar Ordem");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaHome.setVisible(false);
				telaCriar.setVisible(true);
				telaFinalizar.setVisible(false);
				telaListar.setVisible(false);
				telaBalanco.setVisible(false);
			}
		});

		btnNewButton.setBounds(10, 63, 162, 34);
		menuLateral.add(btnNewButton);

		JButton btnFinalizarPesquisar = new JButton("Finalizar / Pesquisar");
		btnFinalizarPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaHome.setVisible(false);
				telaCriar.setVisible(false);
				telaFinalizar.setVisible(true);
				telaListar.setVisible(false);
				telaBalanco.setVisible(false);
			}
		});
		btnFinalizarPesquisar.setBounds(10, 108, 162, 34);
		menuLateral.add(btnFinalizarPesquisar);

		JButton btnListar = new JButton("Listar Ordens");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				telaHome.setVisible(false);
				telaCriar.setVisible(false);
				telaFinalizar.setVisible(false);
				telaListar.setVisible(true);
				telaBalanco.setVisible(false);

				int rowCount = modelo.getRowCount();
				for (int i = rowCount - 1; i >= 0; i--) {
					modelo.removeRow(i);
				}

				for (WorkOrder p : lista) {

					modelo.addRow(new Object[] { p.getNumber(), p.getStatus(), p.getName(), p.getEmail(), p.getPhone(),
							p.getModel(), p.getManufacture(), p.getDate() });

				}

			}
		});
		btnListar.setBounds(10, 153, 162, 34);
		menuLateral.add(btnListar);

		JButton btnBalanoFinanceiro = new JButton("Balan\u00E7o financeiro");
		btnBalanoFinanceiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaHome.setVisible(false);
				telaCriar.setVisible(false);
				telaFinalizar.setVisible(false);
				telaListar.setVisible(false);
				telaBalanco.setVisible(true);

			}
		});
		btnBalanoFinanceiro.setBounds(10, 198, 162, 34);
		menuLateral.add(btnBalanoFinanceiro);

		JButton btnNewButton_1 = new JButton("Gaos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				telaHome.setVisible(true);
				telaCriar.setVisible(false);
				telaFinalizar.setVisible(false);
				telaListar.setVisible(false);
				telaBalanco.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Corbel Light", Font.PLAIN, 22));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(SystemColor.menu);
		btnNewButton_1.setBounds(10, 11, 57, 23);
		menuLateral.add(btnNewButton_1);

	}
}
