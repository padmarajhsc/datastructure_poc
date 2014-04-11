package com.tesco.services.poc;

import com.tesco.services.poc.model.ProductMapper;
import com.tesco.services.poc.model.Product;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: padmaraj
 * Date: 11/04/2014
 * Time: 2:08 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ProductDAO {

    @SqlQuery("select * from products")
    @Mapper(ProductMapper.class)
    List<Product> findAll();

    @SqlUpdate("insert into products (productid, productname, productdesc, productstatus, productimage) values (:productid, :productname, :productdesc, :productstatus, :productimage)")
    void insert(
            @Bind("productid") Long productid
            , @Bind("productname") String productname
            , @Bind("productdesc") String productdesc
            , @Bind("productstatus") String productstatus
            , @Bind("productimage") String productimage
    );

    @SqlUpdate("update products set productname = :productname, productdesc = :productdesc, productstatus = :productstatus, productimage = :productimage where productid = :productid")
    void update(
            @Bind("productid") Long productid
            , @Bind("productname") String productname
            , @Bind("productdesc") String productdesc
            , @Bind("productstatus") String productstatus
            , @Bind("productimage") String productimage
    );

    @SqlUpdate("delete from products where productid = :productid")
    void delete(
            @Bind("productid") Long productid
    );

}
