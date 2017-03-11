package gameFiles;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class GameUI extends JFrame{
	
	private Question[] questionArray;
	private int questionNum = 0;

	private javax.swing.JComboBox<String> CategoryDropMenu;
	private javax.swing.JLabel CategoryLabel;
	private javax.swing.JComboBox<String> DifficultyDropMenu;
	private javax.swing.JLabel DifficultyLabel;
	private javax.swing.JPanel OptionsPanel;
	private javax.swing.JButton StartButton;
	private javax.swing.JButton SignButton;
	private javax.swing.JButton LogButton;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel SignLogPanel;
	private javax.swing.JPasswordField ConfirmPassword;
	private javax.swing.JPasswordField LogInPassword;
	private javax.swing.JPasswordField NewPassWordField;
	private javax.swing.JTextField NewUserField;
	private javax.swing.JTextField LogInName;
	private javax.swing.JButton ChallengeButton;
	private javax.swing.JLabel HighScoreLabel;
	private javax.swing.JButton MenuButton;
	private javax.swing.JButton ReplayButton;
	private javax.swing.JPanel ResultPanel;
	private javax.swing.JLabel ScoreLabel;
	private javax.swing.JButton AnswerOp1;
	private javax.swing.JButton AnswerOp2;
	private javax.swing.JButton AnswerOp3;
	private javax.swing.JButton AnswerOp4;
	private javax.swing.JLabel CurrentScoreLabel;
	private javax.swing.JLabel QuestionLabel;
	private javax.swing.JLabel QuestionsContentLabel;
	private javax.swing.JPanel GamePanel;

	public GameUI() {
		initSignLogComponents();
		initOptionsComponents();
		initGameComponents();
		initResultComponents();
	}

	private void initSignLogComponents() {

		SignLogPanel = new javax.swing.JPanel();
		jLabel7 = new javax.swing.JLabel();
		SignButton = new javax.swing.JButton();
		LogButton = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		NewUserField = new javax.swing.JTextField();
		LogInName = new javax.swing.JTextField();
		LogInPassword = new javax.swing.JPasswordField();
		NewPassWordField = new javax.swing.JPasswordField();
		ConfirmPassword = new javax.swing.JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setMinimumSize(new java.awt.Dimension(800, 450));
		setPreferredSize(new java.awt.Dimension(800, 450));
		setResizable(false);
		setSize(new java.awt.Dimension(800, 450));

		jLabel7.setText("Confirm Password");

		SignButton.setText("Submit");
		SignButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					SignUpClicked(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}


		});
		LogButton.setText("Submit");
		LogButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					LogInClicked(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}


		});

		jLabel6.setText("Password");

		jLabel4.setText("Name:");

		jLabel3.setText("Name:");

		jLabel2.setText("Log-In");

		jLabel1.setText("Sign-Up");

		jLabel5.setText("Password");
		
		NewUserField.setText("");
		NewUserField.setMinimumSize(new java.awt.Dimension(111, 20));
		
		LogInName.setText("");
		LogInName.setMinimumSize(new java.awt.Dimension(111, 20));

		LogInPassword.setText("");
        LogInPassword.setMinimumSize(new java.awt.Dimension(111, 20));

		NewPassWordField.setText("");
        NewPassWordField.setMinimumSize(new java.awt.Dimension(111, 20));

		ConfirmPassword.setText("");
        ConfirmPassword.setMinimumSize(new java.awt.Dimension(111, 20));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(SignLogPanel);
		SignLogPanel.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(108, 108, 108)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel4)
								.addComponent(jLabel6)
								.addComponent(jLabel7))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(SignButton)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
				                        .addComponent(NewUserField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				                        .addComponent(NewPassWordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				                        .addComponent(ConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
				                .addGap(212, 212, 212)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(LogInPassword)
								.addComponent(LogButton)
								.addComponent(LogInName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(108, 108, 108))
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(214, 214, 214)
						.addComponent(jLabel1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel2)
						.addGap(169, 169, 169))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(147, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabel2)
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(LogInName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(LogInPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel5))
										.addGap(56, 56, 56)
										.addComponent(LogButton))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jLabel1)
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(NewUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel4))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(NewPassWordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel6))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel7))
										.addGap(18, 18, 18)
										.addComponent(SignButton)))
						.addGap(141, 141, 141))
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(SignLogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(SignLogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);

		pack();
		SignLogPanel.setVisible(true);
	}// </editor-fold>                        

	private void initOptionsComponents() {

		OptionsPanel = new javax.swing.JPanel();
		CategoryLabel = new javax.swing.JLabel();
		DifficultyLabel = new javax.swing.JLabel();
		StartButton = new javax.swing.JButton();
		CategoryDropMenu = new javax.swing.JComboBox<>();
		DifficultyDropMenu = new javax.swing.JComboBox<>();


		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(new java.awt.Dimension(800, 450));

		OptionsPanel.setMinimumSize(new java.awt.Dimension(800, 450));
		OptionsPanel.setPreferredSize(new java.awt.Dimension(800, 450));

		CategoryLabel.setBackground(new java.awt.Color(102, 255, 102));
		CategoryLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		CategoryLabel.setText("Category");

		DifficultyLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		DifficultyLabel.setText("Difficulty");

		StartButton.setText("Start Game");
		StartButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					StartGameClicked(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}


		});

		CategoryDropMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anime", "Video Games", "Movies", "Mythology", "Live Theater"}));
		CategoryDropMenu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CategoryDropMenuActionPerformed(evt);
			}
		});

		DifficultyDropMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Easy", "Medium", "Hard" }));

		javax.swing.GroupLayout GamePanelLayout = new javax.swing.GroupLayout(OptionsPanel);
		OptionsPanel.setLayout(GamePanelLayout);
		GamePanelLayout.setHorizontalGroup(
				GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GamePanelLayout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(StartButton)
						.addGap(356, 356, 356))
				.addGroup(GamePanelLayout.createSequentialGroup()
						.addGap(191, 191, 191)
						.addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(CategoryDropMenu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(CategoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
						.addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(DifficultyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(DifficultyDropMenu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(191, 191, 191))
				);
		GamePanelLayout.setVerticalGroup(
				GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(GamePanelLayout.createSequentialGroup()
						.addGap(116, 116, 116)
						.addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(CategoryLabel)
								.addComponent(DifficultyLabel))
						.addGap(18, 18, 18)
						.addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(CategoryDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(DifficultyDropMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
						.addComponent(StartButton)
						.addGap(90, 90, 90))
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(OptionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(OptionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);

		pack();
		OptionsPanel.setVisible(false);
	}// </editor-fold>                        

	private void initGameComponents() {

		GamePanel = new javax.swing.JPanel();
		QuestionLabel = new javax.swing.JLabel();
		QuestionsContentLabel = new javax.swing.JLabel();
		AnswerOp1 = new javax.swing.JButton();
		AnswerOp2 = new javax.swing.JButton();
		AnswerOp3 = new javax.swing.JButton();
		AnswerOp4 = new javax.swing.JButton();
		CurrentScoreLabel = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		GamePanel.setMinimumSize(new java.awt.Dimension(800, 450));

		QuestionLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		QuestionLabel.setText("Question:");

		QuestionsContentLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		QuestionsContentLabel.setText("Question goes here");

		AnswerOp1.setText("Option 1");
		AnswerOp1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AnswerPicked(evt);
			}
		});

		AnswerOp2.setText("Option 2");
		AnswerOp2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AnswerPicked(evt);
			}
		});

		AnswerOp3.setText("Option 3");
		AnswerOp3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AnswerPicked(evt);
			}
		});
		AnswerOp4.setText("Option 4");
		AnswerOp4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AnswerPicked(evt);
			}
		});
		CurrentScoreLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		CurrentScoreLabel.setText("Score: 000000");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(GamePanel);
		GamePanel.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addContainerGap(286, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
										.addComponent(QuestionLabel)
										.addGap(360, 360, 360))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
										.addComponent(QuestionsContentLabel)
										.addGap(338, 338, 338))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
										.addComponent(CurrentScoreLabel)
										.addGap(352, 352, 352))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addGroup(jPanel2Layout.createSequentialGroup()
														.addComponent(AnswerOp3)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(AnswerOp4))
												.addGroup(jPanel2Layout.createSequentialGroup()
														.addComponent(AnswerOp1)
														.addGap(84, 84, 84)
														.addComponent(AnswerOp2)))
										.addGap(284, 284, 284))))
				);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(100, 100, 100)
						.addComponent(QuestionLabel)
						.addGap(18, 18, 18)
						.addComponent(QuestionsContentLabel)
						.addGap(52, 52, 52)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(AnswerOp1)
								.addComponent(AnswerOp2))
						.addGap(35, 35, 35)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(AnswerOp3)
								.addComponent(AnswerOp4))
						.addGap(43, 43, 43)
						.addComponent(CurrentScoreLabel)
						.addContainerGap(100, Short.MAX_VALUE))
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addComponent(GamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addComponent(GamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				);

		pack();
		GamePanel.setVisible(false);

	}// </editor-fold>                        

	private void initResultComponents() {

		ResultPanel = new javax.swing.JPanel();
		ScoreLabel = new javax.swing.JLabel();
		HighScoreLabel = new javax.swing.JLabel();
		ChallengeButton = new javax.swing.JButton();
		MenuButton = new javax.swing.JButton();
		ReplayButton = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		ResultPanel.setMinimumSize(new java.awt.Dimension(800, 450));

		ScoreLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		ScoreLabel.setText("Score: 000000");

		HighScoreLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		HighScoreLabel.setText("High Score: 000000");

		ChallengeButton.setText("Challenge a Friend");

		MenuButton.setText("Menu");
		MenuButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				MenuClicked(evt);
			}


		});

		ReplayButton.setText("Replay");
		ReplayButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ReplayClicked(evt);
			}


		});

		javax.swing.GroupLayout ResultPanelLayout = new javax.swing.GroupLayout(ResultPanel);
		ResultPanel.setLayout(ResultPanelLayout);
		ResultPanelLayout.setHorizontalGroup(
				ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(ResultPanelLayout.createSequentialGroup()
						.addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(ResultPanelLayout.createSequentialGroup()
										.addGap(233, 233, 233)
										.addComponent(MenuButton)
										.addGap(212, 212, 212)
										.addComponent(ReplayButton))
								.addGroup(ResultPanelLayout.createSequentialGroup()
										.addGap(336, 336, 336)
										.addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultPanelLayout.createSequentialGroup()
														.addComponent(ScoreLabel)
														.addGap(12, 12, 12))
												.addComponent(HighScoreLabel, javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(ChallengeButton, javax.swing.GroupLayout.Alignment.TRAILING))))
						.addGap(0, 231, Short.MAX_VALUE))
				);
		ResultPanelLayout.setVerticalGroup(
				ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultPanelLayout.createSequentialGroup()
						.addContainerGap(174, Short.MAX_VALUE)
						.addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(MenuButton)
								.addComponent(ReplayButton))
						.addGap(68, 68, 68)
						.addComponent(ScoreLabel)
						.addGap(18, 18, 18)
						.addComponent(HighScoreLabel)
						.addGap(37, 37, 37)
						.addComponent(ChallengeButton)
						.addGap(73, 73, 73))
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addComponent(ResultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addComponent(ResultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				);

		pack();
		ResultPanel.setVisible(false);
	}




	private String CategoryDropMenuActionPerformed(java.awt.event.ActionEvent evt) {   
		JComboBox cat = (JComboBox) evt.getSource();
		String catSelection = (String) cat.getSelectedItem();
		return catSelection;
	} 
	private String DifficultyDropMenuActionPerformed(java.awt.event.ActionEvent evt) {   
		JComboBox dif = (JComboBox) evt.getSource();
		String difSelection = (String) dif.getSelectedItem();
		return difSelection;
	}


	private void LogInClicked(ActionEvent evt) throws IOException {
		if (LogIn.userLogIn(LogInName.getText(), LogInPassword.getPassword().toString())) {
			SignLogPanel.setVisible(false);
			OptionsPanel.setVisible(true);
		}
		
	}

	private void SignUpClicked(ActionEvent evt) throws IOException {
		System.out.println(NewPassWordField.getPassword().toString());
		if (LogIn.userSignUp(NewUserField.getText(), NewPassWordField.getPassword().toString(), ConfirmPassword.getPassword().toString())) {
			SignLogPanel.setVisible(false);
			OptionsPanel.setVisible(true);
		}
	}

	private void StartGameClicked(ActionEvent evt) throws Exception {
		DisplayQuestion();
		OptionsPanel.setVisible(false);
		GamePanel.setVisible(true);
	}
	private void AnswerPicked(ActionEvent evt) {
		if(questionNum+1 == questionArray.length){
			GamePanel.setVisible(false);
			ResultPanel.setVisible(true);
		}
		else{
			questionNum++;
		}
	}
	private void MenuClicked(ActionEvent evt) {
		ResultPanel.setVisible(false);
		OptionsPanel.setVisible(true);
	}
	private void ReplayClicked(ActionEvent evt) {
		ResultPanel.setVisible(false);
		GamePanel.setVisible(true);
	}

	private void DisplayQuestion() throws Exception{
		questionArray = Quiz.getQuestions();
		List<Question> questionList = Arrays.asList(questionArray);
		List<String[]> incorrectAnswers =  questionList.stream().map(Question::getWrongAnswers).collect(Collectors.toList());
	}



































	/**
	 * @param args the command line arguments
	 */
//	public static void main(String args[]) {
//		/* Set the Nimbus look and feel */
//		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//		 */
//		try {
//			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//				if ("Nimbus".equals(info.getName())) {
//					javax.swing.UIManager.setLookAndFeel(info.getClassName());
//					break;
//				}
//			}
//		} 
//		catch (ClassNotFoundException ex) {
//			java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} 
//		catch (InstantiationException ex) {
//			java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} 
//		catch (IllegalAccessException ex) {
//			java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} 
//		catch (javax.swing.UnsupportedLookAndFeelException ex) {
//			java.util.logging.Logger.getLogger(GameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		}
//		//</editor-fold>
//
//		/* Create and display the form */
//		java.awt.EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				new GameUI().setVisible(true);
//				try {
//					Quiz.test();
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	// Variables declaration - do not modify                     

}
