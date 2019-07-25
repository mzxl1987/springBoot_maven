package com.mego.service;

import com.mego.dto.PageDto;
import com.mego.dto.Result;
import com.mego.entity.Lamp;

public interface LampService {
	
	public Result<?> save(Lamp obj) throws Exception;
	public Result<?> edit(Lamp obj) throws Exception;
	public Result<?> delete(Lamp obj) throws Exception;
	
	public Result<?> QueryAll(Lamp obj) throws Exception;
	public PageDto QueryPage(Lamp obj,PageDto page) throws Exception;
}
