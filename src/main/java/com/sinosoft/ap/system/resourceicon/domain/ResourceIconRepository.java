package com.sinosoft.ap.system.resourceicon.domain;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import com.sinosoft.ap.system.resourceicon.domain.ResourceIconEntity;


public interface ResourceIconRepository {
	void delete(ResourceIconEntity icon);
	void insert(ResourceIconEntity icon);
}
