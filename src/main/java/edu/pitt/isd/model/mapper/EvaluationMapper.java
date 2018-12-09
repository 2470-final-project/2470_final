package edu.pitt.isd.model.mapper;

import edu.pitt.isd.model.dto.Evaluation;
import edu.pitt.isd.model.dto.EvaluationExample;
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
public interface EvaluationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated
     */
    @SelectProvider(type=EvaluationSqlProvider.class, method="countByExample")
    long countByExample(EvaluationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated
     */
    @DeleteProvider(type=EvaluationSqlProvider.class, method="deleteByExample")
    int deleteByExample(EvaluationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated
     */
    @Delete({
        "delete from evaluation",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated
     */
    @Insert({
        "insert into evaluation (user_id, course_id, ",
        "start_time, end_time, ",
        "url, create_time, ",
        "update_time)",
        "values (#{userId,jdbcType=INTEGER}, #{courseId,jdbcType=INTEGER}, ",
        "#{startTime,jdbcType=TIMESTAMP}, #{endTime,jdbcType=TIMESTAMP}, ",
        "#{url,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Evaluation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated
     */
    @InsertProvider(type=EvaluationSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Evaluation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated
     */
    @SelectProvider(type=EvaluationSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="course_id", property="courseId", jdbcType=JdbcType.INTEGER),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Evaluation> selectByExampleWithRowbounds(EvaluationExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated
     */
    @SelectProvider(type=EvaluationSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="course_id", property="courseId", jdbcType=JdbcType.INTEGER),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Evaluation> selectByExample(EvaluationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, user_id, course_id, start_time, end_time, url, create_time, update_time",
        "from evaluation",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="course_id", property="courseId", jdbcType=JdbcType.INTEGER),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    Evaluation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated
     */
    @UpdateProvider(type=EvaluationSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated
     */
    @UpdateProvider(type=EvaluationSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated
     */
    @UpdateProvider(type=EvaluationSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Evaluation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated
     */
    @Update({
        "update evaluation",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "course_id = #{courseId,jdbcType=INTEGER},",
          "start_time = #{startTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP},",
          "url = #{url,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Evaluation record);
}