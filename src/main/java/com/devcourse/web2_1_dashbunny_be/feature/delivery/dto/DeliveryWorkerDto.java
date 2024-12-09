package com.devcourse.web2_1_dashbunny_be.feature.delivery.dto;

import lombok.Data;

@Data
public class DeliveryWorkerDto {
	private Long userId;
	private String phone;
	private String name;
	private String role;
	private String isWithdrawn;
	private Double latitude;
	private Double longitude;
	private String status;
}
