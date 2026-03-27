package com.api.base;

import com.api.config.ConfigManager;

public class BusinessService extends BaseService {
	
	private static final String BUSINESS_BASE_URI = ConfigManager.businessBaseUrl(); // or ConfigManager.get("auth.base.url")
}
