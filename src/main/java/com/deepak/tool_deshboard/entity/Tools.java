package com.deepak.tool_deshboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "spare_parts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tools {
	@Id
    private String itemCode;
	
	@Column(nullable = false)
    private String spareDescription;
	
	@Column(nullable = false)
    private String uom;
	
	@Column(nullable = false)
    private Integer installedQty;
	
	@Column(nullable = false)
    private Integer stockMaintained;
	
	@Column(nullable = false)
    private Integer stockAvailable;
	
	@Column(nullable = false)
    private String storageLocation;
	
    private String remark;
}
