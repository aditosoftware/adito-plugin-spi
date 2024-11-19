package de.adito.aditoweb.common.jdito.plugin.v2;

import de.adito.aditoweb.common.jdito.plugin.IPlugin;
import de.adito.aditoweb.common.jdito.plugin.IPluginFacade;
import de.adito.aditoweb.common.jdito.plugin.PluginException;

/**
 * An interface for plugins which are started by the plugin service container.
 * {@linkplain IServicePlugin}s shall be provided via {@link java.util.ServiceLoader}.
 *
 * @author j.boesl, 26.09.24
 */
public interface IServicePlugin extends IPlugin {
    /**
     * @return the name of the plugin. Used to call the plugin.
     */
    String getName();

    /**
     * @return the plugins implementation version.
     */
    String getVersion();

    /**
     * @return a description of the plugin and its features.
     */
    String getDescription();

    /**
     * Executes the plugin.
     *
     * @param pParameters the parameters passed to the plugin.
     * @return the execution result.
     * @throws PluginException in case an error occurred.
     */
    String execute(String pParameters) throws PluginException;


    @Override
    default Object[] execute(Object[] pParameters, IPluginFacade pPluginFacade) throws PluginException {
        String parameter = switch (pParameters.length) {
            case 0 -> null;
            case 1 -> pParameters[0] == null ? null : pParameters[0].toString();
            default -> throw new IllegalArgumentException("Call to '%s' failed: too many arguments."
                    .formatted(getName()));
        };

        String s = execute(parameter);
        return s == null ? new String[0] : new String[]{s};
    }
}
