package org.codnect.githubwatch.dialogs;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Burak Köken on 2.5.2019.
 */
public class SettingsDialogWrapper extends DialogWrapper {

    public static final String DIALOG_TITLE = "GitHub Watch Settings";

    public static final int DIALOG_WIDTH = 450;
    public static final int DIALOG_HEIGHT = 300;

    public SettingsDialogWrapper() {
        super(true);
        init();
        setTitle(DIALOG_TITLE);
        setResizable(false);
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel dialogPanel = new JPanel(new BorderLayout());
        GroupLayout groupLayout = new GroupLayout(dialogPanel);
        JLabel labelGitHubApiKey = new JLabel("GitHub Api Key :");
        JTextField textFieldGitHubApiKey = new JTextField();
        textFieldGitHubApiKey.setPreferredSize(new Dimension(200, 30));

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(labelGitHubApiKey)
                                .addComponent(textFieldGitHubApiKey)
                        )


        );
        dialogPanel.setPreferredSize(new Dimension(DIALOG_WIDTH, DIALOG_HEIGHT));
        return dialogPanel;
    }

    @NotNull
    @Override
    protected Action[] createActions() {
        return new Action[]{this.getOKAction(), this.getCancelAction()};
    }

}
