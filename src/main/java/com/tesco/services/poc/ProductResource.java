package com.tesco.services.poc;

import com.tesco.services.poc.model.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: padmaraj
 * Date: 11/04/2014
 * Time: 11:52 AM
 * To change this template use File | Settings | File Templates.
 */

@Path("/datastructure")
public class ProductResource {

    private ProductDAO productDAO;

    public ProductResource(ProductDAO productDAO) {
        super();
        this.productDAO = productDAO;
    }

    @GET
    @Path("/get")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public List<Product> fetch(){

        return productDAO.findAll();
    }

    @PUT
    @Path("/update/{productid}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public void update(@PathParam("productid") Long productid, Product product)
    {
        productDAO.update(
                productid,
                product.getProductname(),
                product.getProductdesc(),
                product.getProductstatus(),
                product.getProductimage()
        );
    }

    @POST
    @Path("/insert")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public void add(Product product)
    {
        productDAO.insert(product.getProductid(),product.getProductname(),product.getProductdesc(),product.getProductstatus(),product.getProductimage());
    }

    @DELETE
    @Path("/delete/{productid}")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON})
    public void delete(@PathParam("productid") Long productid)
    {
        productDAO.delete(productid);
    }

}