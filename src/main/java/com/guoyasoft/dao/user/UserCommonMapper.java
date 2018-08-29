package com.guoyasoft.dao.user;

import java.util.List;

import com.guoyasoft.bean.api.user.UserMenuBean;

public interface UserCommonMapper {

	List<UserMenuBean> selectUserMenu(UserMenuBean bean);

}
