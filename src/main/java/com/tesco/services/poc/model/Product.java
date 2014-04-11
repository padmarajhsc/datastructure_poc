package com.tesco.services.poc.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created with IntelliJ IDEA.
 * User: padmaraj
 * Date: 11/04/2014
 * Time: 12:04 pm
 * To change this template use File | Settings | File Templates.
 */
public class Product {

    @JsonProperty
    private Long productid;

    @JsonProperty
    private String productname;

    @JsonProperty
    private String productdesc;

    @JsonProperty
    private String productstatus;

    @JsonProperty
    private String productimage;
    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc;
    }

    public String getProductstatus() {
        return productstatus;
    }

    public void setProductstatus(String productstatus) {
        this.productstatus = productstatus;
    }

    public String getProductimage() {
        return productimage;
    }

    public void setProductimage(String productimage) {
        this.productimage = productimage;
    }

}
