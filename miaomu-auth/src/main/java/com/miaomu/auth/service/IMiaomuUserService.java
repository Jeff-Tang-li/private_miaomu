package com.miaomu.auth.service;

import com.miaomu.auth.entity.MiaomuUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.miaomu.common.entity.vo.UserRequest;
import com.miaomu.common.enums.ResponseEnum;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * <p>auth
 * 服务类
 * </p>
 *
 * @author jeff·Tang
 * @since 2020-11-19
 */
public interface IMiaomuUserService extends IService<MiaomuUser> {
    /**
     * 添加用户
     *
     * @param userRequest
     * @return
     */
    ResponseEntity<?> addUser(UserRequest userRequest);

    /**
     * 更新用户
     *
     * @param userRequest
     * @return
     */
    ResponseEntity<?> updateUser(UserRequest userRequest);

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    ResponseEntity<?> deleteUser(Integer id);

    ResponseEntity<?> users(Integer currentPage, Integer pageSize, String params, Integer sort);

    ResponseEntity<?> user(Integer id);
}
