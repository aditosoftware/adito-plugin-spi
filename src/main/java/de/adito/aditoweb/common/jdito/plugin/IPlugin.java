package de.adito.aditoweb.common.jdito.plugin;


/**
 * Describes a plugin, as it is to be executed by the user.
 * The plugin has to be executed on the server.
 *
 * @author R. Loipfinger, 15.12.2004
 */


public interface IPlugin extends IGenericPlugin
{

  /**
   * Executes the plugin.
   *
   * @param pParameters   the parameters passed to the plugin.
   * @param pPluginFacade the facade for utility functions the plugin can use.
   * @return the execution result.
   * @throws PluginException in case an error occurred.
   */
  public Object[] execute(Object[] pParameters, IPluginFacade pPluginFacade)
      throws PluginException;
}
