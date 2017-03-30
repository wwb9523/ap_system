package com.sinosoft.ap.system.resourceicon.domain;

import org.apache.ibatis.annotations.Param;

public interface ResourceIconRepository {
	void delete(ResourceIconVO resourceIcon);
	void insert(ResourceIconVO resourceIcon);
	String selectResourceIconRelById(String resourceIconId);
}
