package de.adito.aditoweb.common.jdito.plugin;

import java.util.List;
import java.util.Map;

/**
 * Facade for server plugins.
 *
 * @author R. Loipfinger, 26.05.2004
 * @deprecated No longer supported in cloud environments.
 */
public interface IPluginFacade extends IGenericPluginFacade {
    /**
     * EOF marker for database requests.
     */
    int DBREQUEST_EOF = -1;

    /**
     * Executes a database request and returns the result as an array.
     *
     * @param pAlias          the database's alias.
     * @param pSqlStatements  an array with the statements to be executed.
     * @param pStart          the number of rows that shall be skipped upon retrieval.
     * @param pCount          the number of rows that shall be fetched.
     * @param pGetMetaData    <b>true</b> to fetch metadata.
     * @param pWithLobContent <b>true</b> to fetch lob content.
     * @param pWithRowCount   <b>true</b> to determine the number of available rows. This parameter
     *                        is only considered when pCount is not <b>DBREQUEST_EOF</b>.
     * @return the result as a list with the rows as object arrays. The single results are always
     * delivered as string. Blob content is base64 encoded.
     * @throws Exception in case an error occurred.
     * @deprecated No longer supported in cloud environments.
     */
    List doDBRequest(String pAlias, String[] pSqlStatements, int pStart, int pCount, boolean pGetMetaData, boolean pWithLobContent, boolean pWithRowCount)
            throws Exception;

    /**
     * Execute a JDito process.
     *
     * @param pProcessName    the process's name.
     * @param pLocalVariables a map with variables passed to the process. The keys and values must be
     *                        Strings. The variables are available in the called process with "$local.[Key]".
     * @return the process's result as String.
     * @throws Exception in case an error occurred.
     * @deprecated No longer supported in cloud environments.
     */
    String runJDitoProcess(String pProcessName, Map pLocalVariables)
            throws Exception;
}
