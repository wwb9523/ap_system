package com.sinosoft.ap.system.userhead.domain;

import org.apache.ibatis.annotations.Select;

import com.sinosoft.ap.system.userhead.domain.UserHeadEntity;


public interface UserHeadRepository {
	UserHeadEntity findHeadByUserId(String id);
}
