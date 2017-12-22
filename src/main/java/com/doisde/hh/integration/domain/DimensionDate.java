package com.doisde.hh.integration.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dimension_date")
public class DimensionDate implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	
	private Date date;
	
	private Integer year;
	
	private Integer month;
	
	private String monthName;
	
	private Integer yearDay;
	
	private String weekDay;
	
	private Integer weekCalendar;
	
	private String yearMonth;
	
	private String yearWeekCalendar;
	
	private String week;
	
	private Date weekFirstDay;
	
	private Date weekLastDay;
	
	private Date monthFirstDay;
	
	private Date monthLastDay;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public String getMonthName() {
		return monthName;
	}

	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}

	public Integer getYearDay() {
		return yearDay;
	}

	public void setYearDay(Integer yearDay) {
		this.yearDay = yearDay;
	}

	public String getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}

	public Integer getWeekCalendar() {
		return weekCalendar;
	}

	public void setWeekCalendar(Integer weekCalendar) {
		this.weekCalendar = weekCalendar;
	}

	public String getYearMonth() {
		return yearMonth;
	}

	public void setYearMonth(String yearMonth) {
		this.yearMonth = yearMonth;
	}

	public String getYearWeekCalendar() {
		return yearWeekCalendar;
	}

	public void setYearWeekCalendar(String yearWeekCalendar) {
		this.yearWeekCalendar = yearWeekCalendar;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public Date getWeekFirstDay() {
		return weekFirstDay;
	}

	public void setWeekFirstDay(Date weekFirstDay) {
		this.weekFirstDay = weekFirstDay;
	}

	public Date getWeekLastDay() {
		return weekLastDay;
	}

	public void setWeekLastDay(Date weekLastDay) {
		this.weekLastDay = weekLastDay;
	}

	public Date getMonthFirstDay() {
		return monthFirstDay;
	}

	public void setMonthFirstDay(Date monthFirstDay) {
		this.monthFirstDay = monthFirstDay;
	}

	public Date getMonthLastDay() {
		return monthLastDay;
	}

	public void setMonthLastDay(Date monthLastDay) {
		this.monthLastDay = monthLastDay;
	}

	@Override
	public String toString() {
		return "DimensionDate [" + (id != null ? "id=" + id + ", " : "") + (date != null ? "date=" + date + ", " : "")
				+ (year != null ? "year=" + year + ", " : "") + (month != null ? "month=" + month + ", " : "")
				+ (monthName != null ? "monthName=" + monthName + ", " : "")
				+ (yearDay != null ? "yearDay=" + yearDay + ", " : "")
				+ (weekDay != null ? "weekDay=" + weekDay + ", " : "")
				+ (weekCalendar != null ? "weekCalendar=" + weekCalendar + ", " : "")
				+ (yearMonth != null ? "yearMonth=" + yearMonth + ", " : "")
				+ (yearWeekCalendar != null ? "yearWeekCalendar=" + yearWeekCalendar + ", " : "")
				+ (week != null ? "week=" + week + ", " : "")
				+ (weekFirstDay != null ? "weekFirstDay=" + weekFirstDay + ", " : "")
				+ (weekLastDay != null ? "weekLastDay=" + weekLastDay + ", " : "")
				+ (monthFirstDay != null ? "monthFirstDay=" + monthFirstDay + ", " : "")
				+ (monthLastDay != null ? "monthLastDay=" + monthLastDay : "") + "]";
	}

}
