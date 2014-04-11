package com.tesco.services.poc.model;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: padmaraj
 * Date: 11/04/2014
 * Time: 2:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProductMapper implements ResultSetMapper<Product> {

    @Override
    public Product map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        Product product = new Product();


        product.setProductid(resultSet.getLong("productid"));
        product.setProductname(resultSet.getString("productname"));
        product.setProductdesc(resultSet.getString("productdesc"));
        product.setProductstatus(resultSet.getString("productstatus"));
        product.setProductimage(resultSet.getString("productimage"));

        return product;
    }
}
