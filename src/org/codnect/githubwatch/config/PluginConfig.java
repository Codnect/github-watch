package org.codnect.githubwatch.config;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.Nullable;

/**
 * Created by Burak Köken on 4.5.2019.
 */
@State(
        name="GitHubWatchPluginConfig",
        storages = {
                @Storage(
                        id = "GitHubWatchPluginConfig",
                        file = "$APP_CONFIG$/GitHubWatchPluginConfig.xml"
                )
        }
)
public class PluginConfig implements PersistentStateComponent<PluginConfigData> {

    private PluginConfigData pluginConfigData;

    public PluginConfig() {
        pluginConfigData = new PluginConfigData();
    }

    @Nullable
    @Override
    public PluginConfigData getState() {
        return pluginConfigData;
    }

    @Override
    public void loadState(PluginConfigData pluginConfigData) {
        XmlSerializerUtil.copyBean(pluginConfigData, this.pluginConfigData);
    }

    public static PluginConfig getInstance() {
        return ServiceManager.getService(PluginConfig.class);
    }

}
