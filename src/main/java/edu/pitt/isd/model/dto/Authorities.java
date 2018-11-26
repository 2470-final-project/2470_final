package edu.pitt.isd.model.dto;

public class Authorities {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column authorities.id
     * @mbg.generated
     */
    private Integer id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column authorities.username
     * @mbg.generated
     */
    private String username;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column authorities.authority
     * @mbg.generated
     */
    private String authority;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column authorities.id
     * @return  the value of authorities.id
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column authorities.id
     * @param id  the value for authorities.id
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column authorities.username
     * @return  the value of authorities.username
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column authorities.username
     * @param username  the value for authorities.username
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column authorities.authority
     * @return  the value of authorities.authority
     * @mbg.generated
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column authorities.authority
     * @param authority  the value for authorities.authority
     * @mbg.generated
     */
    public void setAuthority(String authority) {
        this.authority = authority == null ? null : authority.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table authorities
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Authorities other = (Authorities) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
                && (this.getAuthority() == null ? other.getAuthority() == null
                        : this.getAuthority().equals(other.getAuthority()));
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table authorities
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getAuthority() == null) ? 0 : getAuthority().hashCode());
        return result;
    }
}