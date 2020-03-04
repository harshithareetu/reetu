package com.hexaware.MLP204.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;

import com.hexaware.MLP204.model.leave;
/**
 * Mapper class to map from result set to leave object.
 */
public class leaveMapper implements ResultSetMapper<leave>{

    public final leave map(final int id,final ResultSet rs, final StatementContext st) throws SQLException 
      {

        return new leave(rs.getInt("emp_id"),rs.getInt("leave_left"),rs.getDate ("starting_date"), rs.getDate ("ending_date"),
        rs.getString ("leave_type"), rs.getString ("leave_reason"), rs.getString ("notification_status"),
        rs.getString ("approval_status"),rs.getString("leave_status"),rs.getString ("apply_leave"),
        rs.getInt("total_leaves"),rs.getInt ("leave_id"));
    }
    
} 