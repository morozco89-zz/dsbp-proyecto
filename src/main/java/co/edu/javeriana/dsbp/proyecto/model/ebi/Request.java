package co.edu.javeriana.dsbp.proyecto.model.ebi;

public class Request {
    private String queryString;
    private String resultType;
    private String cursorMark;
    private int pageSize;
    private Object sort;
    private boolean synonym;

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getCursorMark() {
        return cursorMark;
    }

    public void setCursorMark(String cursorMark) {
        this.cursorMark = cursorMark;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Object getSort() {
        return sort;
    }

    public void setSort(Object sort) {
        this.sort = sort;
    }

    public boolean isSynonym() {
        return synonym;
    }

    public void setSynonym(boolean synonym) {
        this.synonym = synonym;
    }
}
