package de.adito.aditoweb.common.jdito.plugin.impl;

import de.adito.aditoweb.common.jdito.plugin.IClientPlugin;

/**
 * Abstract super class for client plugins.
 * This class must be implemented for each client plugin.
 *
 * @author R. Loipfinger, 25.08.2005
 */


public abstract class AbstractClientPlugin implements IClientPlugin
{
  public final String getVersion()
  {
    return "0.1.0";
  }

  public void initStatic()
  {
  }

  public void init()
  {
  }
}
