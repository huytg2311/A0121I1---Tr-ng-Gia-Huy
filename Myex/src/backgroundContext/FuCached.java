package backgroundContext;

import java.util.Date;

public class FuCached {
    private Object Data;
    private Date expiredDate;

    public FuCached() {
    }

    public FuCached(Object data, Date expiredDate) {
        Data = data;
        this.expiredDate = expiredDate;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }
}
