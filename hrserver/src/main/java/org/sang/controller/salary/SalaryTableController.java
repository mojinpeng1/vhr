package org.sang.controller.salary;

import org.sang.bean.Department;
import org.sang.service.DepartmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sang on 2018/1/26.
 */
@RestController
@RequestMapping("/salary/table")
public class SalaryTableController {
    @Resource
    DepartmentService departmentService;

    @RequestMapping("/deps")
    public List<Department> departments() {
        return departmentService.getAllDeps();
    }
}
