package de.adito.aditoweb.common.jdito.plugin;

/**
 * Describes a plugin, as it is to be executed by the user.
 * The plugin has to be executed on the client.
 *
 * @author R. Loipfinger, 25.08.2005
 */


public interface IClientPlugin extends IGenericPlugin
{
  /**
   * Executes the plugin.
   *
   * @param pParameters   the parameters passed to the plugin.
   * @param pPluginFacade the facade for utility functions the plugin can use.
   * @return the execution result.
   * @throws PluginException in case an error occurred.
   */
  public String[] execute(String[] pParameters, IClientPluginFacade pPluginFacade)
      throws PluginException;
}
