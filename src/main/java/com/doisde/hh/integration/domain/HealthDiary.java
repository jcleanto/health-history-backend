package com.doisde.hh.integration.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "health_diary")
public class HealthDiary extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "dimension_date_id")
	@NotNull
	private DimensionDate dimensionDate;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	@NotNull
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "health_emoji_id")
	@NotNull
	private HealthEmoji healthEmoji;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DimensionDate getDimensionDate() {
		return dimensionDate;
	}

	public void setDimensionDate(DimensionDate dimensionDate) {
		this.dimensionDate = dimensionDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public HealthEmoji getHealthEmoji() {
		return healthEmoji;
	}

	public void setHealthEmoji(HealthEmoji healthEmoji) {
		this.healthEmoji = healthEmoji;
	}

	@Override
	public String toString() {
		return "HealthDiary [" + (id != null ? "id=" + id + ", " : "")
				+ (dimensionDate != null ? "dimensionDate=" + dimensionDate + ", " : "")
				+ (user != null ? "user=" + user + ", " : "")
				+ (healthEmoji != null ? "healthEmoji=" + healthEmoji : "") + "]";
	}

}
