package com.team6.dao;

import com.team6.entity.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated
     */
    int insert(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated
     */
    int insertSelective(Goods record);

    /**

     * 根据id 删除商品信息
     */
    public int deleteGoodsById(int id);

    /**
     * 根据id查询商品信息
     */
    public Goods queryGoodsById(int id);

    /**
     * 根据id更新商品信息
     */
    public int updateGoods(Goods goods);

    /**
     * 分页查询
     */


    Goods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Goods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Goods record);

    List<Map<String,Object>> querySaleByGoodType(@Param("typeId") int typeId,@Param("limit") int limit);

}