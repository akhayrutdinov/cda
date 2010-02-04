package pt.webdetails.cda.query;

import java.util.ArrayList;

import pt.webdetails.cda.dataaccess.Parameter;

/**
 * Created by IntelliJ IDEA.
 * User: pedro
 * Date: Feb 4, 2010
 * Time: 5:25:53 PM
 */
public class QueryOptions
{

  private boolean paginate = false;
  private int pageSize = 20;
  private int pageStart = 0;
  private ArrayList<Integer> sortBy = new ArrayList<Integer>();
  private ArrayList<Parameter> parameters = new ArrayList<Parameter>();

  public QueryOptions()
  {
  }


  public boolean isPaginate()
  {
    return paginate;
  }

  public void setPaginate(final boolean paginate)
  {
    this.paginate = paginate;
  }

  public int getPageSize()
  {
    return pageSize;
  }

  public void setPageSize(final int pageSize)
  {
    this.pageSize = pageSize;
  }

  public int getPageStart()
  {
    return pageStart;
  }

  public void setPageStart(final int pageStart)
  {
    this.pageStart = pageStart;
  }

  public ArrayList<Integer> getSortBy()
  {
    return sortBy;
  }

  public void setSortBy(final ArrayList<Integer> sortBy)
  {
    this.sortBy = sortBy;
  }

  public ArrayList<Parameter> getParameters()
  {
    return parameters;
  }

}
