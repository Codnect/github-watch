package org.codnect.githubwatch.actions;

import com.intellij.ide.DataManager;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.options.ShowSettingsUtil;
import com.intellij.openapi.project.Project;
import org.codnect.githubwatch.configurable.GitHubWatchConfigurable;

/**
 * Created by Burak Köken on 1.5.2019.
 */
public class SettingsAction extends AnAction {

    private Project project;

    public SettingsAction() {
        DataContext dataContext = DataManager.getInstance().getDataContextFromFocus().getResult();
        project = DataKeys.PROJECT.getData(dataContext);
    }

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        ShowSettingsUtil.getInstance().showSettingsDialog(
                project,
                GitHubWatchConfigurable.class
                );
    }

}
