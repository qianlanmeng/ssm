package com.lk.dao;

import com.lk.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {

    /**
     * 查询所有的产品
     * @return
     */
    @Select("select * from product")
    public List<Product> findAll();

    /**
     * 添加产品
     * @param product
     */
    @Insert("insert into  product (PRODUCTNUM,PRODUCTNAME,CITYNAME,DEPARTURETIME,PRODUCTPRICE,PRODUCTDESC,PRODUCTSTATUS) values ( #{PRODUCTNUM}, #{PRODUCTNAME}, #{CITYNAME}, #{DEPARTURETIME}, #{PRODUCTPRICE}, #{PRODUCTDESC}, #{PRODUCTSTATUS})")
    void save(Product product);
}
