package de.adito.aditoweb.common.jdito.plugin;

/**
 * Is thrown when an error in a plugin implementation occurred.
 *
 * @author R. Loipfinger, 26.05.2004
 */


public class PluginException extends Exception
{
  final static int DEFAULTID = 0;

  private Object[] details = null;
  private int id = DEFAULTID;

  /**
   * Produces a new {@link PluginException} without additional detail.
   */
  public PluginException()
  {
    this(DEFAULTID, null, null);
  }

  /**
   * Produces a new {@link PluginException}.
   *
   * @param pDetail additional detail
   */
  public PluginException(Object pDetail)
  {
    this(pDetail instanceof Object[] ? (Object[]) pDetail : new Object[]{pDetail});
  }

  /**
   * Produces a new {@link PluginException}.
   *
   * @param pDetails additional detail
   */
  public PluginException(Object[] pDetails)
  {
    this(null, pDetails);
  }

  /**
   * Produces a new {@link PluginException}.
   *
   * @param pException the exception's cause.
   * @param pDetail    additional detail
   */
  public PluginException(Exception pException, Object pDetail)
  {
    this(pException, pDetail instanceof Object[] ? (Object[]) pDetail : new Object[]{pDetail});
  }

  /**
   * Produces a new {@link PluginException}.
   *
   * @param pException the exception's cause.
   * @param pDetails   additional detail
   */
  public PluginException(Exception pException, Object[] pDetails)
  {
    this(DEFAULTID, pException, pDetails);
  }

  /**
   * Produces a new {@link PluginException}.
   *
   * @param pID        the exception's identification.
   * @param pException the exception's cause.
   * @param pDetail    additional detail
   */
  public PluginException(int pID, Exception pException, Object pDetail)
  {
    this(pID, pException, pDetail instanceof Object[] ? (Object[]) pDetail : new Object[]{pDetail});
  }

  /**
   * Produces a new {@link PluginException}.
   *
   * @param pID        the exception's identification.
   * @param pException the exception's cause.
   * @param pDetails   additional detail
   */
  public PluginException(int pID, Exception pException, Object[] pDetails)
  {
    super(pException != null ? pException.getMessage() : null, pException);
    details = pDetails;
    id = pID;
  }

  /**
   * Produces a new {@link PluginException}.
   *
   * @param pException the exception's cause.
   */
  public PluginException(Exception pException)
  {
    super(pException != null ? pException.getMessage() : null, pException);
  }

  /**
   * @return additional detail
   */
  public Object[] getDetails()
  {
    return details;
  }

  /**
   * @return the exception's identification
   */
  public int getID()
  {
    return id;
  }
}
