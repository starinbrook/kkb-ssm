package com.kkb.ssm.po;

import java.util.Date;

public class Item {
    private Integer id;

    private String name;

    private Double price;

    private String pic;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "{{"
                + "\"id\":"
                + id
                + ",\"name\":\""
                + name + '\"'
                + ",\"price\":"
                + price
                + ",\"pic\":\""
                + pic + '\"'
                + ",\"createtime\":\""
                + createtime + '\"'
                + "}}";

    }
}