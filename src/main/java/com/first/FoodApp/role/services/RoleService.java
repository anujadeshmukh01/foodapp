package com.first.FoodApp.role.services;

import com.first.FoodApp.response.Response;
import com.first.FoodApp.role.dtos.RoleDTO;

import java.util.List;

public interface RoleService {


    Response<RoleDTO> creatRole(RoleDTO roleDTO);

    Response<RoleDTO> updateRole(RoleDTO roleDTO);

    Response<List<RoleDTO>> getAllRoles();

    Response<?> deleteRole(Long id);
}
