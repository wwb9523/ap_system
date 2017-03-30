package com.sinosoft.ap.system.resourceicon.domain;

import java.util.List;

import org.apache.ibatis.annotations.Select;


public interface ResourceIconRepository {
	void delete(ResourceIconVO icon);
	void insert(ResourceIconVO icon);
}
