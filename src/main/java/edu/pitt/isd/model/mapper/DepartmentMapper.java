package edu.pitt.isd.model.mapper;

import edu.pitt.isd.model.dto.Department;
import edu.pitt.isd.model.dto.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface DepartmentMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table department
     * @mbg.generated
     */
    @SelectProvider(type = DepartmentSqlProvider.class, method = "countByExample")
    long countByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table department
     * @mbg.generated
     */
    @DeleteProvider(type = DepartmentSqlProvider.class, method = "deleteByExample")
    int deleteByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table department
     * @mbg.generated
     */
    @Delete({ "delete from department", "where id = #{id,jdbcType=INTEGER}" })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table department
     * @mbg.generated
     */
    @Insert({ "insert into department (name)", "values (#{name,jdbcType=VARCHAR})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(Department record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table department
     * @mbg.generated
     */
    @InsertProvider(type = DepartmentSqlProvider.class, method = "insertSelective")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insertSelective(Department record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table department
     * @mbg.generated
     */
    @SelectProvider(type = DepartmentSqlProvider.class, method = "selectByExample")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR) })
    List<Department> selectByExampleWithRowbounds(DepartmentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table department
     * @mbg.generated
     */
    @SelectProvider(type = DepartmentSqlProvider.class, method = "selectByExample")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR) })
    List<Department> selectByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table department
     * @mbg.generated
     */
    @Select({ "select", "id, name", "from department", "where id = #{id,jdbcType=INTEGER}" })
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR) })
    Department selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table department
     * @mbg.generated
     */
    @UpdateProvider(type = DepartmentSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table department
     * @mbg.generated
     */
    @UpdateProvider(type = DepartmentSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table department
     * @mbg.generated
     */
    @UpdateProvider(type = DepartmentSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Department record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table department
     * @mbg.generated
     */
    @Update({ "update department", "set name = #{name,jdbcType=VARCHAR}", "where id = #{id,jdbcType=INTEGER}" })
    int updateByPrimaryKey(Department record);
}