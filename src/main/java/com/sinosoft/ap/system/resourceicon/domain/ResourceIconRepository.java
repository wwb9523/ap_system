package com.sinosoft.ap.system.resourceicon.domain;

import org.apache.ibatis.annotations.Param;

public interface ResourceIconRepository {
	int delete(ResourceIconVO resourceIcon);
	int insert(ResourceIconVO resourceIcon);
	String selectResourceIconRelById(String resourceIconId);
}
