/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-07-07 13:18:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mall.cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import mall.cart.*;
import java.util.*;
import mall.member.*;

public final class cartList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("mall.cart");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("mall.member");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.text.DecimalFormat");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>장바구니 목록</title>\r\n");
      out.write("<style>\r\n");
      out.write(".container { width: 100%; margin: 0 auto;}\r\n");
      out.write(".cart_list { width: 100%;}\r\n");
      out.write("/* 상단1 */\r\n");
      out.write(".d1 { width: 100%; padding: 15px; margin: 15px auto; text-align: center;}\r\n");
      out.write(".d1 .s1 { font-size: 1.5em; font-weight: bold; }\r\n");
      out.write(".d1 .s2 { width: 300px; background: #333; color: #fff; z-index: 10; position: relative;}\r\n");
      out.write(".d1 .s3 { width: 300px; background: #fff; color: #333; margin-left: 0px; z-index: -10; position: relative;}\r\n");
      out.write("\r\n");
      out.write("/* 상단2 */\r\n");
      out.write(".d2 { width: 40%; padding: 15px; margin: 5px 45px; float: right; display: inline-block; text-align: right;}\r\n");
      out.write(".d_line { clear: both; width: 90%; border: 1px solid lightgray;}\r\n");
      out.write("\r\n");
      out.write("/* 상단3 */\r\n");
      out.write(".d3 { width: 90%; padding: 15px; margin: 5px 45px; float: left;}\r\n");
      out.write(".d3 input[type=checkbox] { zoom: 1.5; margin-right: 10px; float: left;}\r\n");
      out.write(".d3 label { font-size: 0.9em; margin-right: 20px;}\r\n");
      out.write(".d3 input[type=button] { width: 80px; height: 30px; border: none; border-radius: 3px;font-weight: bold; cursor: pointer;}\r\n");
      out.write(".d3 #btn_buy_select { background: #444444; border: 1px solid #32708d; margin-right: 5px; color: white;}\r\n");
      out.write(".d3 #btn_delete_select { background: white; border: 1px solid black;}\r\n");
      out.write("\r\n");
      out.write("/* 중단 - 상품 정보 테이블 */\r\n");
      out.write(".t_cart_list { width: 90%; border: 1px solid gray; border-collapse: collapse; margin: 0 auto; text-size: 0.9em;\r\n");
      out.write("			border-left: none; border-right: none; clear: both;}\r\n");
      out.write(".t_cart_list tr { height: 40px;}\r\n");
      out.write(".t_cart_list td, .t_cart_list th { border-top: 1px solid #dee2e6; border-bottom: 1px solid #dee2e6; border-right: none; border-left: none;}\r\n");
      out.write(".t_cart_list th { background: #f1f3f5;}\r\n");
      out.write(".t_cart_list td { }\r\n");
      out.write(".t_cart_list tr:last-child { font-weight: normal;}\r\n");
      out.write(".left { text-align: left; margin-left: 10px;}\r\n");
      out.write(".center { text-align: center;}\r\n");
      out.write(".td0 { text-align: center; font-weight: bold; font-size: 1.1em; padding: 30px 0;}\r\n");
      out.write(".td1 .check_cart_one { zoom: 1.5;}\r\n");
      out.write(".td3 .s1 { font-weight: bold; color: #1e94be;}\r\n");
      out.write(".td3 .s2 { font-size: 0.9em; color: black;}\r\n");
      out.write(".td3 .s3 { font-size: 0.9em; color: gray; text-decoration: line-through;}\r\n");
      out.write(".td3 .s4 { font-weight: bold; color: #c84557;}\r\n");
      out.write(".td4 input[type=\"number\"] { width: 45px; margin-bottom: 5px;}\r\n");
      out.write("\r\n");
      out.write("/* number 화살표 항상 보이는 효과 */\r\n");
      out.write(".td4 input[type=number]::-webkit-inner-spin-button, \r\n");
      out.write(".td4 input[type=number]::-webkit-outer-spin-button { -webkit-appearance: \"Always Show Up/Down Arrows\"; opacity: 1;}\r\n");
      out.write("/* .td4 input[type=sumbmit] */\r\n");
      out.write(".td4 input[type=\"button\"] { width: 55px; height: 25px; border: 1px solid gray; border-radius: 2px; font-size: 0.8em; cursor: pointer;}\r\n");
      out.write(".td7 input[type=\"button\"] { width: 100px; height: 30px; border: 1px solid #444444; border-radius: 3px;  font-weight: bold; cursor: pointer;}\r\n");
      out.write("\r\n");
      out.write(".td7 .btn_buy_one { background: #444444; border: 1px solid gray; margin-bottom: 5px; color: white;}\r\n");
      out.write(".td7 .btn_delete_one { background: white; border: 1px solid black; color: black;}\r\n");
      out.write("\r\n");
      out.write("/* 하단 - d4 */\r\n");
      out.write(".d4 { width: 90%; padding: 15px; margin: 10px 45px;}\r\n");
      out.write(".d4 span { font-size: 0.9em; font-weight: bold; color: gray; margin-right: 10px;}\r\n");
      out.write(".d4 input[type=button] { width: 80px; height: 30px; border: none; border-radius: 3px; color: #fff; font-weight: bold; cursor: pointer;}\r\n");
      out.write(".d4 #btn_buy_select2 { background: #444444; border: 1px solid #32708d; margin-right: 5px;}\r\n");
      out.write(".d4 #btn_delete_select2 { background: white; border: 1px solid #444444; color: black;}\r\n");
      out.write("\r\n");
      out.write("/* 하단 - 총 상품금액 테이블 */\r\n");
      out.write(".t_cart_tot { width: 90%; border: 1px solid gray; border-collapse: collapse; margin: 0 auto; text-size: 0.9em;\r\n");
      out.write("			 clear: both; background: #f1f3f5;}\r\n");
      out.write(".t_cart_tot tr { height: 100px;}\r\n");
      out.write(".t_cart_tot td, .t_cart_tot th {}\r\n");
      out.write(".t_cart_tot span { font-weight: 1.5em; display: inline-block; margin-top: 5px;}\r\n");
      out.write(".t_cart_tot tr:first-child th:nth-of-type(5){ color: #196ab3;}\r\n");
      out.write(".t_cart_tot tr:first-child th:nth-of-type(7){ color: #196ab3;}\r\n");
      out.write("\r\n");
      out.write(".t_cart_tot tr:nth-child(2) { font-size: 0.7em;}\r\n");
      out.write(".t_cart_tot tr:nth-child(2) span { font-weight: normal;} \r\n");
      out.write(".t_cart_tot tr:nth-child(2) span b { color: #a13b66;} \r\n");
      out.write(".t_cart_tot tr:nth-child(2) th { border-top: 1px solid #196ab3;} \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* 하단 - 배송지 테이블 */\r\n");
      out.write(".t_cart_address { width: 90%; border: 1px solid gray; border-collapse: collapse; margin: 20px auto; text-size: 0.9em;\r\n");
      out.write("			border-left: none; border-right: none; clear: both;}\r\n");
      out.write(".t_cart_address tr {height: 80px;}\r\n");
      out.write(".t_cart_address td, .t_cart_address th { border: 1px solid #dee2e6;}\r\n");
      out.write(".t_cart_address th { background: #f1f3f5;}\r\n");
      out.write(".t_cart_address th input { margin-top: 10px;}\r\n");
      out.write(".t_cart_address td { padding-left: 10px;}\r\n");
      out.write(".t_cart_address td input { margin-left: 20px;}\r\n");
      out.write(".t_cart_address input[type=button] { width: 90px; height: 40px; background: #fff; border: 1px solid lightgray; padding: 5px;\r\n");
      out.write(" font-size: 0.9em; border-radius: 5px; cursor: pointer;}\r\n");
      out.write(" \r\n");
      out.write(" /* 하단 - 주문, 쇼핑계속하기 버튼*/\r\n");
      out.write(" .d5 { width: 90%; padding: 0 15px; margin: 0 45px 30px; text-align: center}\r\n");
      out.write(" .d5 input[type=button] { width: 150px; height: 50px; font-size: 1.05em; font-weight: bold; color: #fff; border-radius: 5px; cursor: pointer;}\r\n");
      out.write(" .d5 #btn_buy_select3 { background: #444444; border: 1px solid #3a85c8; color: white;}\r\n");
      out.write(" .d5 #btn_shopping { background: white; border: 1px solid #000; color: black;}\r\n");
      out.write(" .d_line2 { clear: both; width: 90%; border: 1px solid lightgray; margin-bottom: 20px;}\r\n");
      out.write(" \r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("document.addEventListener(\"DOMContentLoaded\", function() {\r\n");
      out.write("	let form = document.cartForm;\r\n");
      out.write("	let cart_ids = document.getElementsByName(\"cart_id\"); // 카트 아이디 태그의 배열\r\n");
      out.write("	\r\n");
      out.write("	// 주문, 삭제, 쇼핑계속하기 버튼\r\n");
      out.write("	let btn_buy_select = document.getElementById(\"btn_buy_select\");\r\n");
      out.write("	let btn_buy_select2 = document.getElementById(\"btn_buy_select2\");\r\n");
      out.write("	let btn_buy_select3 = document.getElementById(\"btn_buy_select3\");\r\n");
      out.write("	let btn_delete_select = document.getElementById(\"btn_delete_select\");\r\n");
      out.write("	let btn_delete_select2 = document.getElementById(\"btn_delete_select2\");\r\n");
      out.write("	let btn_shopping = document.getElementById(\"btn_shopping\");\r\n");
      out.write("	\r\n");
      out.write("	// 구매 수량 제한 효과 (1 ~ 100)\r\n");
      out.write("	let buy_counts = document.querySelectorAll(\".buy_count\");\r\n");
      out.write("	for(let buy_count of buy_counts) {\r\n");
      out.write("		buy_count.addEventListener(\"keyup\", function() {\r\n");
      out.write("			if(buy_count.value < 1) {\r\n");
      out.write("				buy_count.value = 1;\r\n");
      out.write("			} else if(buy_count.value > 100) {\r\n");
      out.write("				buy_count.value = 100;	\r\n");
      out.write("			}\r\n");
      out.write("		})\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	// 각 상품별 삭제 버튼 처리(1개 상품)\r\n");
      out.write("	let btn_delete_ones = document.querySelectorAll(\".btn_delete_one\");\r\n");
      out.write("	for(let i=0; i<btn_delete_ones.length; i++) {\r\n");
      out.write("		btn_delete_ones[i].addEventListener(\"click\", function() {\r\n");
      out.write("			location = 'cartDeletePro.jsp?cart_id=' + cart_ids[i].value;\r\n");
      out.write("		})\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	// 각 상품별 주문 버튼 처리(1개 상품)\r\n");
      out.write("	let btn_buy_ones = document.querySelectorAll(\".btn_buy_one\");\r\n");
      out.write("	for(let i=0; i<btn_buy_ones.length; i++) {\r\n");
      out.write("		btn_buy_ones[i].addEventListener(\"click\", function() {\r\n");
      out.write("			location = '../buy/buyForm.jsp?cart_id=' + cart_ids[i].value + \"&part=3\";\r\n");
      out.write("		})\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	////////////////////\r\n");
      out.write("	// 판매가 계산 (원가에서 할인된 가격)\r\n");
      out.write("	let p_sums = document.getElementsByName(\"p_sum\");\r\n");
      out.write("	let p_s1 = 0;\r\n");
      out.write("	let c1_s1 = document.querySelector(\".c1_s1\");\r\n");
      out.write("	let c2_s1 = document.querySelector(\".c2_s1\");\r\n");
      out.write("	let c3_s1 = document.querySelector(\".c3_s1\");\r\n");
      out.write("	\r\n");
      out.write("	// 원가 계산\r\n");
      out.write("	let p_sums2 = document.getElementsByName(\"p_sum2\");\r\n");
      out.write("	let p_s2 = 0;\r\n");
      out.write("	let c1_s2 = document.querySelector(\".c1_s2\");\r\n");
      out.write("	\r\n");
      out.write("	// 할인 금액 계산\r\n");
      out.write("	let p_sums3 = document.getElementsByName(\"p_sum3\");\r\n");
      out.write("	let p_s3 = 0;\r\n");
      out.write("	let c1_s3 = document.querySelector(\".c1_s3\");\r\n");
      out.write("	\r\n");
      out.write("	// 종, 개수 계산\r\n");
      out.write("	let k_count = 0;\r\n");
      out.write("	let p_count = 0;\r\n");
      out.write("	let c1_s4 = document.querySelector(\".c1_s4\");\r\n");
      out.write("	let c1_s5 = document.querySelector(\".c1_s5\");\r\n");
      out.write("	\r\n");
      out.write("	// 전체 선택 체크박스 처리\r\n");
      out.write("	let cart_ids_list = []; // 체크박스 선택과 해제시에 카트 아이디를 저장하는 배열\r\n");
      out.write("	let ck_count = 0;       // 각 상품별 체크박스의 체크 개수\r\n");
      out.write("	let ck_cart_ones = document.querySelectorAll(\".ck_cart_one\");\r\n");
      out.write("	let ck_cart_all = document.getElementById(\"ck_cart_all\");\r\n");
      out.write("	ck_cart_all.addEventListener(\"change\", function() {\r\n");
      out.write("		p_s1 = 0;\r\n");
      out.write("		p_s2 = 0;\r\n");
      out.write("		p_s3 = 0;\r\n");
      out.write("		k_count = 0;\r\n");
      out.write("		p_count = 0;\r\n");
      out.write("		if(ck_cart_all.checked == true) { // 전체 선택을 체크하였을 때 -> 각 상품별 모든 체크박스를 선택\r\n");
      out.write("			ck_count = ck_cart_ones.length;\r\n");
      out.write("			for(let i=0; i<ck_cart_ones.length; i++) {\r\n");
      out.write("				ck_cart_ones[i].checked = true;\r\n");
      out.write("				cart_ids_list.push(cart_ids[i].value);\r\n");
      out.write("				p_s1 += parseInt(p_sums[i].value);\r\n");
      out.write("				p_s2 += parseInt(p_sums2[i].value);\r\n");
      out.write("				p_s3 += parseInt(p_sums3[i].value);\r\n");
      out.write("				++k_count;\r\n");
      out.write("				p_count += parseInt(buy_counts[i].value);\r\n");
      out.write("			}\r\n");
      out.write("		} else {                          // 전체 선택을 해제하였을 때 -> 각 상품별 모든 체크박스를 해제\r\n");
      out.write("			ck_count = 0;\r\n");
      out.write("			cart_ids_list = [];\r\n");
      out.write("			for(let i=0; i<ck_cart_ones.length; i++) {\r\n");
      out.write("				ck_cart_ones[i].checked = false;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		cart_ids_list = [...new Set(cart_ids_list)]; // 중복 카트 아이디를 제거\r\n");
      out.write("		c1_s1.innerHTML = p_s1.toLocaleString() + '원';\r\n");
      out.write("		c2_s1.innerHTML = p_s1.toLocaleString() + '원';\r\n");
      out.write("		c3_s1.innerHTML = p_s1.toLocaleString() + '원';\r\n");
      out.write("		c1_s2.innerHTML = p_s2.toLocaleString() + '원';\r\n");
      out.write("		c1_s3.innerHTML = p_s3.toLocaleString() + '원';\r\n");
      out.write("		c1_s4.innerHTML = k_count + '종';\r\n");
      out.write("		c1_s5.innerHTML = p_count + '개';\r\n");
      out.write("		console.log(cart_ids_list);\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	// 각 상품별 체크박스 처리\r\n");
      out.write("	// 각 상품별 체크박스 중에서 해제된 것이 있다면 전체 선택 체크박스를 해제\r\n");
      out.write("	// 각 상품별 체크박스가 모두 체크되었다면 전체 선택 체크박스를 선택\r\n");
      out.write("	for(let i=0; i<ck_cart_ones.length; i++) {\r\n");
      out.write("		ck_cart_ones[i].addEventListener(\"change\", function(event) {\r\n");
      out.write("			if(ck_cart_ones[i].checked == false) { // 체크 해제\r\n");
      out.write("				ck_cart_all.checked = false;\r\n");
      out.write("				--ck_count;\r\n");
      out.write("				cart_ids_list = cart_ids_list.filter((e) => e !== cart_ids[i].value); // 해제되지 않은 카트 아이디를 다시 저장\r\n");
      out.write("				p_s1 -= parseInt(p_sums[i].value);\r\n");
      out.write("				p_s2 -= parseInt(p_sums2[i].value);\r\n");
      out.write("				p_s3 -= parseInt(p_sums3[i].value);\r\n");
      out.write("				--k_count;\r\n");
      out.write("				p_count -= parseInt(buy_counts[i].value);\r\n");
      out.write("			} else { // 체크 선택\r\n");
      out.write("				++ck_count;\r\n");
      out.write("				cart_ids_list.push(cart_ids[i].value);\r\n");
      out.write("				p_s1 += parseInt(p_sums[i].value);\r\n");
      out.write("				p_s2 += parseInt(p_sums2[i].value);\r\n");
      out.write("				p_s3 += parseInt(p_sums3[i].value);\r\n");
      out.write("				++k_count;\r\n");
      out.write("				p_count += parseInt(buy_counts[i].value);\r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("			if(ck_count == ck_cart_ones.length) {\r\n");
      out.write("				ck_cart_all.checked = true;\r\n");
      out.write("			}\r\n");
      out.write("			c1_s1.innerHTML = p_s1.toLocaleString() + '원';\r\n");
      out.write("			c2_s1.innerHTML = p_s1.toLocaleString() + '원';\r\n");
      out.write("			c3_s1.innerHTML = p_s1.toLocaleString() + '원';\r\n");
      out.write("			c1_s2.innerHTML = p_s2.toLocaleString() + '원';\r\n");
      out.write("			c1_s3.innerHTML = p_s3.toLocaleString() + '원';\r\n");
      out.write("			c1_s4.innerHTML = k_count + '종';\r\n");
      out.write("			c1_s5.innerHTML = p_count + '개';\r\n");
      out.write("			console.log(cart_ids_list);\r\n");
      out.write("		})\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	// 삭제 버튼 처리\r\n");
      out.write("	btn_delete_select.addEventListener(\"click\", function() {\r\n");
      out.write("		if(ck_count == 0) {\r\n");
      out.write("			alert('장바구니에 상품이 없습니다.');\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		location = 'cartDeletePro2.jsp?cart_id=' + cart_ids_list;\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	btn_delete_select2.addEventListener(\"click\", function() {\r\n");
      out.write("		if(ck_count == 0) {\r\n");
      out.write("			alert('장바구니에 상품이 없습니다.');\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		location = 'cartDeletePro2.jsp?cart_id=' + cart_ids_list;\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	// 주문 버튼 처리\r\n");
      out.write("	btn_buy_select.addEventListener(\"click\", function() {\r\n");
      out.write("		if(ck_count == 0) {\r\n");
      out.write("			alert('장바구니에 상품이 없습니다.');\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		location = '../buy/buyForm.jsp?cart_id=' + cart_ids_list + \"&part=3\";\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	btn_buy_select2.addEventListener(\"click\", function() {\r\n");
      out.write("		if(ck_count == 0) {\r\n");
      out.write("			alert('장바구니에 상품이 없습니다.');\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		location = '../buy/buyForm.jsp?cart_id=' + cart_ids_list + \"&part=3\";\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	btn_buy_select3.addEventListener(\"click\", function() {\r\n");
      out.write("		if(ck_count == 0) {\r\n");
      out.write("			alert('장바구니에 상품이 없습니다.');\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		location = '../buy/buyForm.jsp?cart_id=' + cart_ids_list + \"&part=3\";\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	// 쇼핑계속하기 버튼 처리\r\n");
      out.write("	btn_shopping.addEventListener(\"click\", function() {\r\n");
      out.write("		location = '../shopAll.jsp';\r\n");
      out.write("	})\r\n");
      out.write("			\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

String memberId = (String)session.getAttribute("memberId");

if(memberId == null) { 
	out.print("<script>alert('로그인을 해주세요.');");
	out.print("location='../../logon/memberLoginForm.jsp';</script>");
	return;
}

SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일");
DecimalFormat df = new DecimalFormat("#,###,###");

// 회원 DB 연결 질의 -> 주소 정보 활용
MemberDAO memberDAO = MemberDAO.getInstance();
MemberDTO member = memberDAO.getMember(memberId);

String address = member.getAddress();
String local = address.substring(0, 2); // 주소에서 지역 2글자만 추출, ex) 서울, 경기, 대구, 제주 ...

// 배송 날짜 계산과 포맷
// 규칙1. 서울: 다음날 배송, 경기: 2일 안에 배송, 지방: 3일 안에 배송, 제주도 지역: 5일 안에 배송.
// 규칙2. 토요일, 일요일은 제외.
// 현재날짜와 시간, 주소 판단, 요일 판단
int n = 0; // 추가되는 날짜
Calendar c = Calendar.getInstance();
int w = c.get(Calendar.DAY_OF_WEEK); // 요일 1~7, 1:일, 2:월, 3:화, 4:수, 5:목, 6:금, 7:토

switch(local) {
case "서울":
	if(w >= 2 && w <= 5) ++n;
	else if(w == 6 || w == 7) n += 3;
	else if(w == 1) n += 2;  
	break;
case "경기":
	if(w >= 2 && w <= 4) n += 2;
	else if(w >= 5 && w <= 7) n += 4;
	else if(w == 1) n += 3;
	break;
case "제주":
	n += 7;
	break;
default: // 지방
	if(w == 2 || w == 3) n += 3;
	else if(w >= 4 && w <= 7) n += 5;
	else if(w == 1) n += 4;
	break;
}

// 추가된 일수를 더한 날짜
c.add(Calendar.DATE, n);
int month = c.get(Calendar.MONTH) + 1; // 0~11로 표현, 1을 더해서 보정
int date = c.get(Calendar.DATE);
int week = c.get(Calendar.DAY_OF_WEEK); // 1~7로 표현
String[] weekday = {"", "일", "월", "화", "수", "목", "금", "토"};

// 배송일 확인
String d_day = month + "월 " + date + "일 (" + weekday[week] + ")";
// System.out.println("배송일 : " + month + "월 " + date + "일 (" + weekday[week] + "요일)");

// 장바구니 DB 연결, 질의
CartDAO cartDAO = CartDAO.getInstance();
List<CartDTO> cartList = cartDAO.getCartList(memberId);
int cartListCount = cartDAO.getCartListCount(memberId);

// 상품가격(정가), 할인율, 할인가격(판매가)
int product_price = 0;
int discount_rate = 0;
int buy_price = 0;
int buy_count = 0;
int p_sum = 0; // 각 상품의 합계(할인가격)
int p_tot = 0; // 주문 상품의 총합계(할인가격)

int p_sum2 = 0; // 각 상품의 합계(원가)
int p_tot2 = 0; // 주문 상품의 총합계(원가)

int d_count = 0; // 실제 할인된 금액, ex) 10000원(원가), 10%할인, 9000원(할인가), 1000원(실제 할인된 금액)
int p_sum3 = 0;  // 각 상품의 실제 할인된 금액의 합계
int p_tot3 = 0;  // 주문 상품의 실제 할인된 금액의 총합계

int k_count = 0; // 주문 상품의 종류
int p_count = 0; // 주문 상품의 총개수



      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../shopTop.jsp", out, false);
      out.write("\r\n");
      out.write("	<div class=\"cart_list\">\r\n");
      out.write("		<div class=\"d1\">\r\n");
      out.write("			<span class=\"s1\">자아캠핑 장바구니</span>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"d2\">\r\n");
      out.write("			<span>01장바구니</span> > <span>02주문서작성/결제</span> > <span>03주문완료</span>\r\n");
      out.write("		</div>\r\n");
      out.write("		<hr class=\"d_line\">\r\n");
      out.write("		<div class=\"d3\">\r\n");
      out.write("			<input type=\"checkbox\" name=\"ck_cart_all\" class=\"ck_cart_all\" id=\"ck_cart_all\"><label for=\"ck_cart_all\">전체 선택</label>\r\n");
      out.write("			<input type=\"button\" value=\"주문\" id=\"btn_buy_select\">\r\n");
      out.write("			<input type=\"button\" value=\"삭제\" id=\"btn_delete_select\">\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("		<table class=\"t_cart_list\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th colspan=\"3\">상품정보</th>\r\n");
      out.write("				<th>수량</th>\r\n");
      out.write("				<th>상품금액</th>\r\n");
      out.write("				<th>배송정보</th>\r\n");
      out.write("				<th>주문</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			");
if(cartListCount == 0) { 
      out.write("\r\n");
      out.write("			<tr><td colspan=\"7\" class=\"td0\"> 장바구니에 상품이 없습니다. </td></tr>\r\n");
      out.write("			");
} else { 
      out.write("\r\n");
      out.write("	\r\n");
      out.write("				");
for(CartDTO cart : cartList) { 
					product_price = cart.getProduct_price();
					discount_rate = cart.getDiscount_rate();
					buy_price = cart.getBuy_price();
					buy_count = cart.getBuy_count();
					
					p_sum = buy_price *  buy_count;  // 각 상품의 합계 (할인가격)
					p_tot += p_sum;                  // 총합계(할인가격)
					
					p_sum2 = product_price * buy_count; // 각 상품의 합계 (원가)
					p_tot2 += p_sum2;                   // 총합계(원가)
					
					p_sum3 = product_price * discount_rate / 100 * buy_count; // 각 상품의 할인된 가격, ex) 10000 * 10 / 100 * 구매수량
					p_tot3 += p_sum3;                             // 각 상품의 할인된 가격의 총합계
					
					++k_count;            // 주문 상품 종류
					p_count += buy_count; // 주문 상품 총개수
				
      out.write("\r\n");
      out.write("				<form action=\"cartUpdatePro.jsp\" method=\"post\" name=\"cartForm\">\r\n");
      out.write("				<input type=\"hidden\" name=\"cart_id\" value=\"");
      out.print(cart.getCart_id() );
      out.write("\">\r\n");
      out.write("				<input type=\"hidden\" name=\"product_id\" value=\"");
      out.print(cart.getProduct_id() );
      out.write("\">\r\n");
      out.write("				<input type=\"hidden\" name=\"p_sum\" value=\"");
      out.print(p_sum );
      out.write("\">\r\n");
      out.write("				<input type=\"hidden\" name=\"p_sum2\" value=\"");
      out.print(p_sum2 );
      out.write("\">\r\n");
      out.write("				<input type=\"hidden\" name=\"p_sum3\" value=\"");
      out.print(p_sum3 );
      out.write("\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td class=\"center td1\" width=\"3%\"><input type=\"checkbox\" name=\"check_cart_one\" class=\"ck_cart_one\"></td>\r\n");
      out.write("					<td class=\"center td2\" width=\"8%\"><img src=\"/images/");
      out.print(cart.getProduct_image());
      out.write("\" width=\"60\" height=\"90\"></td>\r\n");
      out.write("					<td class=\"left td3\" width=\"48%\">\r\n");
      out.write("						<span class=\"s1\"><a href=\"../shopContent.jsp?product_id=");
      out.print(cart.getProduct_id());
      out.write('"');
      out.write('>');
      out.print(cart.getProduct_name() );
      out.write("</a></span><br>\r\n");
      out.write("						<span class=\"s2\">");
      out.print(cart.getBrand() );
      out.write("</span><br>\r\n");
      out.write("						<span class=\"s3\">");
      out.print(df.format(product_price) );
      out.write("원</span> | <span class=\"s4\">");
      out.print(df.format(buy_price) );
      out.write(' ');
      out.write('(');
      out.print(cart.getDiscount_rate() );
      out.write("%)</span>\r\n");
      out.write("					</td>\r\n");
      out.write("					<td class=\"center td4\" width=\"8%\">\r\n");
      out.write("						<input type=\"number\" name=\"buy_count\" value=\"");
      out.print(buy_count);
      out.write("\" class=\"buy_count\"><br>\r\n");
      out.write("						<input type=\"submit\" name=\"btn_count\" value=\"변경\" class=\"btn_update\">\r\n");
      out.write("					</td>\r\n");
      out.write("					<td class=\"center td5\" width=\"9%\">");
      out.print(df.format(p_sum) );
      out.write("원</td>\r\n");
      out.write("					<td class=\"center td6\" width=\"12%\">");
      out.print(d_day );
      out.write("도착예정</td>\r\n");
      out.write("					<td class=\"center td7\" width=\"12%\">\r\n");
      out.write("						<input type=\"button\" name=\"btn_buy_one\" value=\"주문\" class=\"btn_buy_one\"><br>\r\n");
      out.write("						<input type=\"button\" name=\"btn_delete_one\" value=\"삭제\" class=\"btn_delete_one\">\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				</form>\r\n");
      out.write("			");
}} 
      out.write("\r\n");
      out.write("			\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"7\">JaAhCamping 배송 상품 총 금액 : <b class=\"c1_s1\">");
      out.print(df.format(p_tot) );
      out.write("</b> 원(+배송비 <b>0원</b>)</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<div class=\"d4\">\r\n");
      out.write("			<span>선택한 상품</span>\r\n");
      out.write("			<input type=\"button\" value=\"주문\" id=\"btn_buy_select2\">\r\n");
      out.write("			<input type=\"button\" value=\"삭제\" id=\"btn_delete_select2\">\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("<!-- 		<table class=\"t_cart_tot\"> -->\r\n");
      out.write("<!-- 			<tr> -->\r\n");
      out.write("<!-- 				<th>총 상품금액<br><span class=\"s1 c2_s1\">0원</span></th> -->\r\n");
      out.write("<!-- 				<th><img src=\"../../icons/plus.png\" width=\"30\"></th> -->\r\n");
      out.write("\r\n");
      out.write("<!-- 				<th><img src=\"../../icons/minus.png\" width=\"30\"></th> -->\r\n");
      out.write("\r\n");
      out.write("<!-- 				<th><img src=\"../../icons/equal.png\" width=\"30\"></th> -->\r\n");
      out.write("<!-- 				<th>최종 결제금액<br><span class=\"s4 c3_s1\">0원</span></th> -->\r\n");
      out.write("<!-- 			</tr> -->\r\n");
      out.write("<!-- 			<tr> -->\r\n");
      out.write("<!-- 				<th colspan=\"7\"> -->\r\n");
      out.write("<!-- 					<span>정가 <b class=\"c1_s2\">0원</b>에서 <b class=\"c1_s3\">0원</b> 할인</span><br> -->\r\n");
      out.write("<!-- 					<span>총 주문수량: <b class=\"c1_s4\">0종</b> (<b class=\"c1_s5\">0개</b>)</span> -->\r\n");
      out.write("<!-- 				</th> -->\r\n");
      out.write("<!-- 			</tr> -->\r\n");
      out.write("<!-- 		</table> -->\r\n");
      out.write("		\r\n");
      out.write("		<table class=\"t_cart_address\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>배송일 안내<br><input type=\"button\" value=\"배송안내\"></th>\r\n");
      out.write("				<td>배송지 : ");
      out.print(address );
      out.write("<input type=\"button\" value=\"배송지 변경\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("		<div class=\"d5\">\r\n");
      out.write("			<input type=\"button\" value=\"주문하기\" id=\"btn_buy_select3\">&ensp;&ensp;\r\n");
      out.write("			<input type=\"button\" value=\"쇼핑계속하기\" id=\"btn_shopping\">\r\n");
      out.write("		</div>\r\n");
      out.write("		<hr class=\"d_line2\">\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../shopBottom.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
