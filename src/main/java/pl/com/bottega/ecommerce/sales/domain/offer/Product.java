package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class Product {
    private String id;

    private String type;

    private String name;

    private Date snapshotDate;

    public String getProductId() {
        return id;
    }

    public String getProductName() {
        return name;
    }

    public Date getProductSnapshotDate() {
        return snapshotDate;
    }

    public String getProductType() {
        return type;
    }
}
