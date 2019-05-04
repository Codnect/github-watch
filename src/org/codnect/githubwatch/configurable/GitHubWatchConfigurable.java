package org.codnect.githubwatch.configurable;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SearchableConfigurable;
import org.codnect.githubwatch.config.PluginConfig;
import org.codnect.githubwatch.gui.GitHubWatchConfigurableForm;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by Burak Köken on 3.5.2019.
 */
public class GitHubWatchConfigurable implements SearchableConfigurable {

    public static final String ID = "preferences.GitHubWatchConfigurable";
    public static final String DISPLAY_NAME = "GitHub Watch Plugin";

    private GitHubWatchConfigurableForm gitHubWatchConfigurableForm;
    private PluginConfig pluginConfig;

    public GitHubWatchConfigurable() {
        pluginConfig = PluginConfig.getInstance();
    }

    @NotNull
    @Override
    public String getId() {
        return ID;
    }

    @Nls
    @Override
    public String getDisplayName() {
        return DISPLAY_NAME;
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        gitHubWatchConfigurableForm = new GitHubWatchConfigurableForm(pluginConfig.getState());
        return gitHubWatchConfigurableForm.getRootPanel();
    }

    @Override
    public boolean isModified() {
        return gitHubWatchConfigurableForm.isModified();
    }

    @Override
    public void apply() throws ConfigurationException {
        gitHubWatchConfigurableForm.apply();
    }

    @Override
    public void reset() {
        gitHubWatchConfigurableForm.reset();
    }

    @Override
    public void disposeUIResources() {
        gitHubWatchConfigurableForm = null;
    }
}
