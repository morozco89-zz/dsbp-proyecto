package co.edu.javeriana.dsbp.proyecto.model.ebi;

import java.util.List;

public class ResponseWrapper {
    private String version;
    private int hitCount;
    private String nextCursorMark;
    private Request request;
    private List<Result> resultList;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public String getNextCursorMark() {
        return nextCursorMark;
    }

    public void setNextCursorMark(String nextCursorMark) {
        this.nextCursorMark = nextCursorMark;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public List<Result> getResultList() {
        return resultList;
    }

    public void setResultList(List<Result> resultList) {
        this.resultList = resultList;
    }

    @Override
    public String toString() {
        return "ResponseWrapper{" +
                "version='" + version + '\'' +
                ", hitCount=" + hitCount +
                ", nextCursorMark='" + nextCursorMark + '\'' +
                ", request=" + request +
                ", resultList=" + resultList +
                '}';
    }
}
