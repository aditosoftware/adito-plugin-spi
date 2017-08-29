package de.adito.aditoweb.common.jdito.plugin.impl;

import de.adito.aditoweb.common.jdito.plugin.IPlugin;

/**
 * Abstract super class for server plugins.
 * This class must be implemented for each server plugin.
 *
 * @author R. Loipfinger, 26.05.2004
 */

public abstract class AbstractPlugin implements IPlugin
{
  public final String getVersion()
  {
    return "0.3.1";
  }

  public void initStatic()
  {
    // Default: Nichts tun
  }

  public void init()
  {
    // Default: Nichts tun
  }


}
