package de.adito.aditoweb.common.jdito.plugin.impl;

import de.adito.aditoweb.common.jdito.plugin.IPlugin;
import de.adito.aditoweb.common.jdito.plugin.v2.IServicePlugin;

/**
 * Abstract super class for server plugins.
 * This class must be implemented for each server plugin.
 *
 * @author R. Loipfinger, 26.05.2004
 * @deprecated Use {@link IServicePlugin} instead.
 */
public abstract class AbstractPlugin implements IPlugin {
    @Override
    public final String getVersion() {
        return "0.3.1";
    }
}