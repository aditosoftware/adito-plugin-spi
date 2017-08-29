package de.adito.aditoweb.common.jdito.plugin;

/**
 * Describes the plugin face for all plugins.
 *
 * @author R. Loipfinger, 25.08.2005
 */


interface IGenericPluginFacade
{
  /**
   * Logs a exception.
   *
   * @param pException  the exception.
   * @param pID         an identifier for the exception.
   * @param pDetails    additional details.
   * @param pShowDialog <tt>true</tt> to request a dialog to be shown.
   */
  public void log(Throwable pException, int pID, Object pDetails, boolean pShowDialog);

  /**
   * Logs a exception.
   *
   * @param pException            the exception.
   * @param pID                   an identifier for the exception.
   * @param pDetails              additional details.
   * @param pShowDialog           <tt>true</tt> to request a dialog to be shown.
   * @param pFirstDetailAsMessage <tt>true</tt> use the first element from details as message.
   * @since 3.1.0
   */
  public void log(Throwable pException, int pID, Object pDetails, boolean pShowDialog, boolean pFirstDetailAsMessage);

  /**
   * Logs a exception.
   *
   * @param pException  the exception.
   * @param pDetails    additional details.
   * @param pShowDialog <tt>true</tt> to request a dialog to be shown.
   */
  public void log(Throwable pException, Object pDetails, boolean pShowDialog);

  /**
   * Logs a exception.
   *
   * @param pException            the exception.
   * @param pDetails              additional details.
   * @param pShowDialog           <tt>true</tt> to request a dialog to be shown.
   * @param pFirstDetailAsMessage <tt>true</tt> use the first element from details as message.
   * @since 3.1.0
   */
  public void log(Throwable pException, Object pDetails, boolean pShowDialog, boolean pFirstDetailAsMessage);

  /**
   * Logs a exception.
   *
   * @param pDetails    additional details.
   * @param pShowDialog <tt>true</tt> to request a dialog to be shown.
   */
  public void log(Object pDetails, boolean pShowDialog);

  /**
   * Logs a exception.
   *
   * @param pDetails              additional details.
   * @param pShowDialog           <tt>true</tt> to request a dialog to be shown.
   * @param pFirstDetailAsMessage <tt>true</tt> use the first element from details as message.
   * @since 3.1.0
   */
  public void log(Object pDetails, boolean pShowDialog, boolean pFirstDetailAsMessage);
}
