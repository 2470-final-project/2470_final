package edu.pitt.isd.model.mapper;

import edu.pitt.isd.controller.question.vo.QuestionAndOptionVO;
import edu.pitt.isd.model.dto.Question;
import edu.pitt.isd.model.dto.QuestionExample;
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
public interface QuestionMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table question
     *
     * @mbg.generated
     */
    @SelectProvider(type = QuestionSqlProvider.class, method = "countByExample")
    long countByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table question
     *
     * @mbg.generated
     */
    @DeleteProvider(type = QuestionSqlProvider.class, method = "deleteByExample")
    int deleteByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table question
     *
     * @mbg.generated
     */
    @Delete({ "delete from question", "where id = #{id,jdbcType=INTEGER}" })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table question
     *
     * @mbg.generated
     */
    @Insert({ "insert into question (block, type, ", "question)",
            "values (#{block,jdbcType=INTEGER}, #{type,jdbcType=INTEGER}, ", "#{question,jdbcType=LONGVARCHAR})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(Question record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table question
     *
     * @mbg.generated
     */
    @InsertProvider(type = QuestionSqlProvider.class, method = "insertSelective")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insertSelective(Question record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table question
     *
     * @mbg.generated
     */
    @SelectProvider(type = QuestionSqlProvider.class, method = "selectByExampleWithBLOBs")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "block", property = "block", jdbcType = JdbcType.INTEGER),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER),
            @Result(column = "question", property = "question", jdbcType = JdbcType.LONGVARCHAR) })
    List<Question> selectByExampleWithBLOBsWithRowbounds(QuestionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table question
     *
     * @mbg.generated
     */
    @SelectProvider(type = QuestionSqlProvider.class, method = "selectByExampleWithBLOBs")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "block", property = "block", jdbcType = JdbcType.INTEGER),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER),
            @Result(column = "question", property = "question", jdbcType = JdbcType.LONGVARCHAR) })
    List<Question> selectByExampleWithBLOBs(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table question
     *
     * @mbg.generated
     */
    @SelectProvider(type = QuestionSqlProvider.class, method = "selectByExample")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "block", property = "block", jdbcType = JdbcType.INTEGER),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER) })
    List<Question> selectByExampleWithRowbounds(QuestionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table question
     *
     * @mbg.generated
     */
    @SelectProvider(type = QuestionSqlProvider.class, method = "selectByExample")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "block", property = "block", jdbcType = JdbcType.INTEGER),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER) })
    List<Question> selectByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table question
     *
     * @mbg.generated
     */
    @Select({ "select", "id, block, type, question", "from question", "where id = #{id,jdbcType=INTEGER}" })
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "block", property = "block", jdbcType = JdbcType.INTEGER),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER),
            @Result(column = "question", property = "question", jdbcType = JdbcType.LONGVARCHAR) })
    Question selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table question
     *
     * @mbg.generated
     */
    @UpdateProvider(type = QuestionSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Question record, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table question
     *
     * @mbg.generated
     */
    @UpdateProvider(type = QuestionSqlProvider.class, method = "updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Question record, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table question
     *
     * @mbg.generated
     */
    @UpdateProvider(type = QuestionSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table question
     *
     * @mbg.generated
     */
    @UpdateProvider(type = QuestionSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Question record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table question
     *
     * @mbg.generated
     */
    @Update({ "update question", "set block = #{block,jdbcType=INTEGER},", "type = #{type,jdbcType=INTEGER},",
            "question = #{question,jdbcType=LONGVARCHAR}", "where id = #{id,jdbcType=INTEGER}" })
    int updateByPrimaryKeyWithBLOBs(Question record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table question
     *
     * @mbg.generated
     */
    @Update({ "update question", "set block = #{block,jdbcType=INTEGER},", "type = #{type,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=INTEGER}" })
    int updateByPrimaryKey(Question record);

    @Select({ "SELECT q.*, o.option, o.option_number", "FROM question q LEFT JOIN question_option o ON q.id = o.question_id",
            "ORDER BY q.id, o.option_number" })
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "block", property = "block", jdbcType = JdbcType.INTEGER),
            @Result(column = "type", property = "type", jdbcType = JdbcType.INTEGER),
            @Result(column = "question", property = "question", jdbcType = JdbcType.LONGVARCHAR),
            @Result(column = "option", property = "option", jdbcType = JdbcType.VARCHAR),
            @Result(column = "option_number", property = "optionNumber", jdbcType = JdbcType.INTEGER) })
    List<QuestionAndOptionVO> selectQuestionAndOption();

}