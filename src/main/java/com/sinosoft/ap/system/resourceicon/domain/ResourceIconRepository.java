package com.sinosoft.ap.system.resourceicon.domain;

import org.apache.ibatis.annotations.Select;
import com.sinosoft.ap.system.resourceicon.domain.ResourceIconEntity;

public interface ResourceIconRepository {
	ResourceIconEntity findIconByUserId(String id);
}
