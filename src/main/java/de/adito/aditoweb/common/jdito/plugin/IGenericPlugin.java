package de.adito.aditoweb.common.jdito.plugin;

import de.adito.aditoweb.common.jdito.plugin.v2.IServicePlugin;

/**
 * Common interface for plugins.
 *
 * @author R. Loipfinger, 25.08.2005
 * @deprecated Use {@link IServicePlugin} instead.
 */
interface IGenericPlugin {
    /**
     * @return the plugins implementation version.
     */
    String getVersion();

    /**
     * @return a description of the plugin and its features.
     */
    String getDescription();

    /**
     * Static plugin initialization. This method is called just once for each plugin.
     */
    @Deprecated
    default void initStatic() {
    }

    /**
     * Plugin initialization. Is executed every time the plugin is called.
     */
    @Deprecated
    default void init() {
    }

}
