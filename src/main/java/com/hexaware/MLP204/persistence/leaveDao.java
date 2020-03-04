package com.hexaware.MLP204.persistence;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import java.util.*;

import com.hexaware.MLP204.model.leave;

public interface leaveDao{

    // insert into table

    @SqlUpdate("insert into leave values(:emp_id, :leave_left, :starting_date, :ending_date, :leave_type, :leave_reason, :notification_status, :leave_status, :total_leaves, :leaves_taken, :check_leave_status)")
    void insertleave(
        @Bind("emp_id") int emp_id,
        @Bind("leave_left") int leave_left,
        @Bind("starting_date") Date starting_date,
        @Bind("ending_date") Date ending_date,
        @Bind("leave_type") String leave_type,
        @Bind("leave_reason") String leave_reason,
        @Bind("notification_status") String notification_status,
        @Bind("leave_status") String leave_status,
        @Bind("total_leaves") int total_leaves,
        @Bind("leaves_taken") int leaves_taken,
        @Bind("leaves_taken") String check_leaves_status);

        // Queries for methods

   @SqlQuery("select* from leave")
   List<leave> list();

    @SqlQuery("select * from leave where emp_id = :empid")
    leave find(@Bind("empid") int empid);

    @SqlQuery("select* from leave where leave_left <> 0")
    List<leave> ListleaveOnleave_left();

    @SqlQuery("select* from leave ending_date = :endingdate")
    List<leave> listleaveOnendting_date(@Bind("ending_date") Date ending_date);

    @SqlQuery("select* from leave leave_type = :leavetype")
    List<leave> listleaveOnleavetype(@Bind("leave_type") String leave_type);

    @SqlQuery("select* from leave leave_reason= :leavereason")
    List<leave> listleaveOnleavereason(@Bind("leave_reason") String leave_reason);

    @SqlQuery("select* from leave notification_status = :notificationstatus")
    List<leave> listleaveOnnotificationstatus(@Bind("notification_status") String notificatin_status);

    @SqlQuery("select* from leave leave_status = :leavestatus")
    List<leave> listleaveOnleavestatus(@Bind("leave_status") String leave_status);

    @SqlQuery("select* from leave total_leaves = :totalleaves")
    List<leave> listleaveOntotalleaves(@Bind("total_leaves") int total_leaves);

    @SqlQuery("select* from leave leaves_taken = :leavestaken")
    List<leave> listleaveOnleavestaken(@Bind("leaves_taken") int leaves_taken);

    @SqlQuery("select* from leave check_leave_status = :checkleavestatus")
    List<leave> listleaveOncheckleavestatus(@Bind("check_leave_status") String check_leave_status);

    @SqlQuery("Delete from leave where leave_status = :Pending")
    List<leave> Deleteleave(@Bind("leave_status") String leave_status);

    @SqlQuery("Update leave where starting_date = :startingdate")
    List<leave> UpdateleaveOnstartingdate(@Bind("starting_date") Date starting_Date);

    @SqlQuery("Update leave where ending_date = :endingdate")
    List<leave> UpdateleaveOnendingdate(@Bind("ending_date") Date ending_Date);

    @SqlQuery("edit from leave where leave_status = :Pending")
    List<leave> editleave(@Bind("leave_status") String leave_status);

	com.hexaware.MLP204.model.List<leave> Listleave();

}
  

