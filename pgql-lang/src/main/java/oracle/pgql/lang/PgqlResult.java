/**
 * Copyright (C) 2013 - 2016 Oracle and/or its affiliates. All rights reserved.
 */
package oracle.pgql.lang;

import oracle.pgql.lang.ir.GraphQuery;

public class PgqlResult {

  private final String queryString;
  private final String errorMessages;
  private final boolean queryValid;
  private final GraphQuery graphQuery;

  public PgqlResult(String queryString, boolean queryValid, String messages, GraphQuery graphQuery) {
    this.queryString = queryString;
    this.errorMessages = messages;
    this.queryValid = queryValid;
    this.graphQuery = graphQuery;
  }

  /**
   * @return the original query as String
   */
  public String getQueryString() {
    return queryString;
  }

  /**
   * @return true if the query is valid
   */
  public boolean isQueryValid() {
    return queryValid;
  }

  /**
   * @return a String with error messages if the query is not valid (see {@link #isQueryValid()}); null otherwise
   */
  public String getErrorMessages() {
    return errorMessages;
  }

  /**
   * @return a GraphQuery object if the query is valid; null otherwise
   */
  public GraphQuery getGraphQuery() {
    return graphQuery;
  }
}
