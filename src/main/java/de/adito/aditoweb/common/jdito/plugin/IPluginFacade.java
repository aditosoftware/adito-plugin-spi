package de.adito.aditoweb.common.jdito.plugin;

import java.util.*;

/**
 * Facade for server plugins.
 *
 * @author R. Loipfinger, 26.05.2004
 */


public interface IPluginFacade extends IGenericPluginFacade
{
  /**
   * EOF marker for database requests.
   */
  public final static int DBREQUEST_EOF = -1;

  /**
   * Executes a database request and returns the result as an array.
   *
   * @param pAlias          the database's alias.
   * @param pSqlStatements  an array with the statements to be executed.
   * @param pStart          the number of rows that shall be skipped upon retrieval.
   * @param pCount          the number of rows that shall be fetched.
   * @param pGetMetaData    <tt>true</tt> to fetch metadata.
   * @param pWithLobContent <tt>true</tt> to fetch lob content.
   * @param pWithRowCount   <tt>true</tt> to determine the number of available rows. This parameter
   *                        is only considered when pCount is not <tt>DBREQUEST_EOF</tt>.
   * @return the result as a list with the rows as object arrays. The single results are always
   * delivered as string. Blob content is base64 encoded.
   * @throws Exception in case an error occurred.
   */
  public ArrayList doDBRequest(String pAlias, String[] pSqlStatements, int pStart, int pCount, boolean pGetMetaData, boolean pWithLobContent, boolean pWithRowCount)
      throws Exception;

  /**
   * Execute a JDito process.
   *
   * @param pProcessName    the process's name.
   * @param pLocalVariables a map with variables passed to the process. The keys and values must be
   *                        Strings. The variables are available in the called process with "$local.[Key]".
   * @return the process's result as String.
   * @throws Exception in case an error occurred.
   */
  public String runJDitoProcess(String pProcessName, Map pLocalVariables)
      throws Exception;
}
