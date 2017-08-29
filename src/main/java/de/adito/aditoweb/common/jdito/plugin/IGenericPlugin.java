package de.adito.aditoweb.common.jdito.plugin;

/**
 * Common interface for plugins.
 *
 * @author R. Loipfinger, 25.08.2005
 */


interface IGenericPlugin
{
  /**
   * @return the plugins implementation version.
   */
  public String getVersion();

  /**
   * @return a short description for the plugin that is displayed in error messages.
   */
  public String getDescription();

  /**
   * Static plugin initialization. This method is called just once for each plugin.
   */
  public void initStatic();

  /**
   * Plugin initialization. Is executed every time the plugin is called.
   */
  public void init();

}
