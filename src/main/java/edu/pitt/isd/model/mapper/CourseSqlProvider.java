package edu.pitt.isd.model.mapper;

import edu.pitt.isd.model.dto.Course;
import edu.pitt.isd.model.dto.CourseExample.Criteria;
import edu.pitt.isd.model.dto.CourseExample.Criterion;
import edu.pitt.isd.model.dto.CourseExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class CourseSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    public String countByExample(CourseExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("course");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    public String deleteByExample(CourseExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("course");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    public String insertSelective(Course record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("course");
        
        if (record.getSubject() != null) {
            sql.VALUES("subject", "#{subject,jdbcType=VARCHAR}");
        }
        
        if (record.getNumber() != null) {
            sql.VALUES("number", "#{number,jdbcType=VARCHAR}");
        }
        
        if (record.getYear() != null) {
            sql.VALUES("year", "#{year,jdbcType=DATE}");
        }
        
        if (record.getSemester() != null) {
            sql.VALUES("semester", "#{semester,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptId() != null) {
            sql.VALUES("dept_id", "#{deptId,jdbcType=INTEGER}");
        }
        
        if (record.getInstructorId() != null) {
            sql.VALUES("instructor_id", "#{instructorId,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    public String selectByExample(CourseExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("subject");
        sql.SELECT("number");
        sql.SELECT("year");
        sql.SELECT("semester");
        sql.SELECT("dept_id");
        sql.SELECT("instructor_id");
        sql.SELECT("name");
        sql.FROM("course");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Course record = (Course) parameter.get("record");
        CourseExample example = (CourseExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("course");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getSubject() != null) {
            sql.SET("subject = #{record.subject,jdbcType=VARCHAR}");
        }
        
        if (record.getNumber() != null) {
            sql.SET("number = #{record.number,jdbcType=VARCHAR}");
        }
        
        if (record.getYear() != null) {
            sql.SET("year = #{record.year,jdbcType=DATE}");
        }
        
        if (record.getSemester() != null) {
            sql.SET("semester = #{record.semester,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptId() != null) {
            sql.SET("dept_id = #{record.deptId,jdbcType=INTEGER}");
        }
        
        if (record.getInstructorId() != null) {
            sql.SET("instructor_id = #{record.instructorId,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("course");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("subject = #{record.subject,jdbcType=VARCHAR}");
        sql.SET("number = #{record.number,jdbcType=VARCHAR}");
        sql.SET("year = #{record.year,jdbcType=DATE}");
        sql.SET("semester = #{record.semester,jdbcType=VARCHAR}");
        sql.SET("dept_id = #{record.deptId,jdbcType=INTEGER}");
        sql.SET("instructor_id = #{record.instructorId,jdbcType=INTEGER}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        
        CourseExample example = (CourseExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(Course record) {
        SQL sql = new SQL();
        sql.UPDATE("course");
        
        if (record.getSubject() != null) {
            sql.SET("subject = #{subject,jdbcType=VARCHAR}");
        }
        
        if (record.getNumber() != null) {
            sql.SET("number = #{number,jdbcType=VARCHAR}");
        }
        
        if (record.getYear() != null) {
            sql.SET("year = #{year,jdbcType=DATE}");
        }
        
        if (record.getSemester() != null) {
            sql.SET("semester = #{semester,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptId() != null) {
            sql.SET("dept_id = #{deptId,jdbcType=INTEGER}");
        }
        
        if (record.getInstructorId() != null) {
            sql.SET("instructor_id = #{instructorId,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, CourseExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}