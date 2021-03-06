package com.hexaware.MLP204.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;

import com.hexaware.MLP204.model.Employee;
/**
 * Mapper class to map from result set to employee object.
 */
public class EmployeeMapper implements ResultSetMapper<Employee> {
  /**
   * @param idx the index
   * @param rs the resultset
   * @param ctx the context
   * @return the mapped employee object
   * @throws SQLException in case there is an error in fetching data from the resultset
   */
  public final Employee map(final int idx, final ResultSet rs, final  StatementContext ctx) throws SQLException {
    /**
     * @return Employee
     */
    return new Employee(rs.getInt("empId"),
        idx, rs.getString("First_name"),
     rs. getString ("Second_name"),
     rs. getInt ("Contact_no"),
    rs. getString ("Address"),
    rs. getString ("Designation"),
    rs. getString ("Blood_group"),
    rs. getInt("Manager_id"),
    rs. getString ("user_name"),
    rs. getString ("password") ,
    rs. getString("emailid"),
    rs.getDate("date_of_joining"),
    rs.getInt("available_leave"));  
  }

}


