package com.zzy.crm.mapper;

import com.zzy.crm.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author PIGS
 * @since 2020-03-23
 */
@Repository
public interface EmployeeMapper extends BaseMapper<Employee> {

}
