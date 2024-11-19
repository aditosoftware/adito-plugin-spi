package de.adito.aditoweb.common.jdito.plugin;

/**
 * Describes the plugin face for all plugins.
 *
 * @author R. Loipfinger, 25.08.2005
 * @deprecated No longer supported in cloud environments.
 */
interface IGenericPluginFacade {
    /**
     * Logs a exception.
     *
     * @param pException  the exception.
     * @param pID         an identifier for the exception.
     * @param pDetails    additional details.
     * @param pShowDialog <b>true</b> to request a dialog to be shown.
     * @deprecated No longer supported in cloud environments.
     */
    void log(Throwable pException, int pID, Object pDetails, boolean pShowDialog);

    /**
     * Logs a exception.
     *
     * @param pException            the exception.
     * @param pID                   an identifier for the exception.
     * @param pDetails              additional details.
     * @param pShowDialog           <b>true</b> to request a dialog to be shown.
     * @param pFirstDetailAsMessage <b>true</b> use the first element from details as message.
     * @since 3.1.0
     * @deprecated No longer supported in cloud environments.
     */
    void log(Throwable pException, int pID, Object pDetails, boolean pShowDialog, boolean pFirstDetailAsMessage);

    /**
     * Logs a exception.
     *
     * @param pException  the exception.
     * @param pDetails    additional details.
     * @param pShowDialog <b>true</b> to request a dialog to be shown.
     * @deprecated No longer supported in cloud environments.
     */
    void log(Throwable pException, Object pDetails, boolean pShowDialog);

    /**
     * Logs a exception.
     *
     * @param pException            the exception.
     * @param pDetails              additional details.
     * @param pShowDialog           <b>true</b> to request a dialog to be shown.
     * @param pFirstDetailAsMessage <b>true</b> use the first element from details as message.
     * @since 3.1.0
     * @deprecated No longer supported in cloud environments.
     */
    void log(Throwable pException, Object pDetails, boolean pShowDialog, boolean pFirstDetailAsMessage);

    /**
     * Logs a exception.
     *
     * @param pDetails    additional details.
     * @param pShowDialog <b>true</b> to request a dialog to be shown.
     * @deprecated No longer supported in cloud environments.
     */
    void log(Object pDetails, boolean pShowDialog);

    /**
     * Logs a exception.
     *
     * @param pDetails              additional details.
     * @param pShowDialog           <b>true</b> to request a dialog to be shown.
     * @param pFirstDetailAsMessage <b>true</b> use the first element from details as message.
     * @since 3.1.0
     * @deprecated No longer supported in cloud environments.
     */
    void log(Object pDetails, boolean pShowDialog, boolean pFirstDetailAsMessage);
}
