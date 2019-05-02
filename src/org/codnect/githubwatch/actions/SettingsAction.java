package org.codnect.githubwatch.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.codnect.githubwatch.dialogs.SettingsDialogWrapper;

/**
 * Created by Burak Köken on 1.5.2019.
 */
public class SettingsAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        new SettingsDialogWrapper().showAndGet();
    }
}
