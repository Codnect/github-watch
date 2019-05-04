package org.codnect.githubwatch.actions;

import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.options.ShowSettingsUtil;
import com.intellij.openapi.project.Project;
import org.codnect.githubwatch.configurable.GitHubWatchConfigurable;

/**
 * Created by Burak Köken on 1.5.2019.
 */
public class SettingsAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        Project project = anActionEvent.getData(PlatformDataKeys.PROJECT);
        ShowSettingsUtil.getInstance().showSettingsDialog(
                project,
                GitHubWatchConfigurable.class
                );
    }

}
