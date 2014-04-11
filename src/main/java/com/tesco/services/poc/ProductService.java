package com.tesco.services.poc;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.db.Database;
import com.yammer.dropwizard.db.DatabaseFactory;

/**
 * Created with IntelliJ IDEA.
 * User: padmaraj
 * Date: 11/04/2014
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class ProductService extends Service<ProductConfiguration> {

    public static void main(String[] args) throws Exception
    {
        new ProductService().run(args);
    }

    private ProductService()
    {
        super("product");
    }


    @Override
    protected void initialize(ProductConfiguration userConfiguration, Environment environment) throws Exception {

        final DatabaseFactory factory = new DatabaseFactory(environment);
        final Database db = factory.build(userConfiguration.getDatabase(), "mysql");
        final ProductDAO dao = db.onDemand(ProductDAO.class);
        environment.addResource(new ProductResource(dao));
    }
}
