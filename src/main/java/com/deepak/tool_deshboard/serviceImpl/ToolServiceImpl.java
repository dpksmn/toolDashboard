package com.deepak.tool_deshboard.serviceImpl;

import org.springframework.stereotype.Service;

import com.deepak.tool_deshboard.repository.ToolRepository;
import com.deepak.tool_deshboard.service.ToolService;

@Service
public class ToolServiceImpl implements ToolService{
	
	private final ToolRepository toolRepository;
	
	public ToolServiceImpl(ToolRepository toolRepository) {
		this.toolRepository = toolRepository;
	}
}
