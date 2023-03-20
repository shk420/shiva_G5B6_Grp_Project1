package com.department.HrDepartment;

import com.department.SuperDepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	@Override
    public String departmentName() {
        return "HR Department";
    }
	@Override
    public String getTodaysWork() {
        return "Fill today's timesheet and mark your attendance";
    }
	
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity() {
        return "team Lunch";
    }
}