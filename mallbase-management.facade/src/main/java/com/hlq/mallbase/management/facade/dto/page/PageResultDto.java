package com.hlq.mallbase.management.facade.dto.page;

import java.io.Serializable;
import java.util.List;
/**
 * 
 * @时间:2017年11月2日
 * @作者: hukc
 * @Mail:hu1932@163.com
 * @说明:分页查询结果封装对象
 */
public class PageResultDto<T>  implements Serializable {
    // 结果集
    private List<T> rows;
    // 总数
    private long total;
    
	private int size;
	private int pages;
	private int current;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
}
