/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs;

import javax.persistence.*;


@Entity
@Table(name = "claim_code_generation")
public class ClaimCodeGeneration extends BaseFormRecordableOpenmrsData {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(nullable = false)
	private String min_value;

	@Column(nullable = false)
	private String max_value;

	@Column(nullable = false)
	private String current_value;
	
	public ClaimCodeGeneration() {
	}

	public ClaimCodeGeneration(Integer id, String min_value, String max_value, String current_value) {
		this.id = id;
		this.min_value = min_value;
		this.max_value = max_value;
		this.current_value = current_value;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getMin_value() {
		return min_value;
	}

	public void setMin_value(String min_value) {
		this.min_value = min_value;
	}

	public String getMax_value() {
		return max_value;
	}

	public void setMax_value(String max_value) {
		this.max_value = max_value;
	}

	public String getCurrent_value() {
		return current_value;
	}

	public void setCurrent_value(String current_value) {
		this.current_value = current_value;
	}
	
	
}
