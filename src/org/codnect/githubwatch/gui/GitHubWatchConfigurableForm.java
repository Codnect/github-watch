package org.codnect.githubwatch.gui;

import javax.swing.*;

/**
 * Created by Burak Köken on 3.5.2019.
 */
public class GitHubWatchConfigurableForm {

    private JPanel rootPanel;
    private JLabel labelGitHubApiKey;
    private JTextField textFieldGitHubApiKey;
    private JLabel labelDescription;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setRootPanel(JPanel rootPanel) {
        this.rootPanel = rootPanel;
    }

    public JLabel getLabelGitHubApiKey() {
        return labelGitHubApiKey;
    }

    public void setLabelGitHubApiKey(JLabel labelGitHubApiKey) {
        this.labelGitHubApiKey = labelGitHubApiKey;
    }

    public JTextField getTextFieldGitHubApiKey() {
        return textFieldGitHubApiKey;
    }

    public void setTextFieldGitHubApiKey(JTextField textFieldGitHubApiKey) {
        this.textFieldGitHubApiKey = textFieldGitHubApiKey;
    }

    public JLabel getLabelDescription() {
        return labelDescription;
    }

    public void setLabelDescription(JLabel labelDescription) {
        this.labelDescription = labelDescription;
    }

}
