package com.template.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplateController {

	/**
	 * Available options :
	 * . data
	 * . tableClass
	 * . pagingDivSelector
	 * . pagingDivClass
	 * . pagingListClass
	 * . counterDivSelector
	 * . counterText
	 * . loadingDivSelector
	 * . sort
	 * . sortKey
	 * . sortDir
	 * . nbColumns
	 * . pageSize
	 * . identify
	 * . pagingNumberOfpages
	 * . filters
	 * . filterText
	 * . fiterEmptySelect
	 * . filterInputClass
	 * . filterSelectClass
	 * . onChange
	 * . beforeRefresh
	 * . afterRefresh
	 * . lineFormat
	 * . firstPage
	 * . prevPage
	 * . nextPage
	 * . lastPage
	 */
	
	@RequestMapping(value = "/data.jspx")
	public String data() {
		return "data";
	}
	
	public String ajaxData() {
		return "ajaxData";
	}
	
	public String couterText() {
		return "couterText";
	}
	
	public String sort() {
		return "sort";
	}
	
	public String filters() {
		return "filters";
	}
	
	public String lineFormat() {
		return "lineFormat";
	}

	/**
	 * Datatables methods :
	 * . refresh
	 * . destroy
	 * . option
	 * . page
	 * . reset-filters
	 * . select
	 * . insert
	 * . update
	 * . delete
	 */
	
}
