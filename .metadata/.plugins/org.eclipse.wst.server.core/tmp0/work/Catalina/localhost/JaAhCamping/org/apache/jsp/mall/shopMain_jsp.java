/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-06-13 07:06:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mall;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.DecimalFormat;
import manager.product.*;

public final class shopMain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("manager.product");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.text.DecimalFormat");
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
      out.write("<title>Insert title here</title>");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("#product_kindName { text-align: center; margin-bottom: 20px; font-size: 40px; font-weight: bold;}\r\n");
      out.write(".d_kind2 { text-align: center; margin-bottom: 20px;}\r\n");
      out.write("/*상품 나열 */\r\n");
      out.write(".c_product { display: inline-block; width: 240px; height: 350px; margin: 10px; padding: 15px; position: relative;}\r\n");
      out.write(".c_p2 { font-weight: bold; display: inline;}\r\n");
      out.write(".c_p2 span {overflow: hidden;}\r\n");
      out.write(".c_p3_price { font-size: 1.1em; font-weight: bold;}\r\n");
      out.write(".s_p_discount { color: red; font-weight: bold; font-size: 0.8em;}\r\n");
      out.write("\r\n");
      out.write("/* hover 했을 때 화면 구성 */\r\n");
      out.write(".c_product figcaption {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  /* 이미지 위에 올라가야하기 때문에 position:absolute, top:0, left:0 */\r\n");
      out.write("  top: 0;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  background-color: rgba(0, 0, 0, 0.5);\r\n");
      out.write("  transition: .2s;\r\n");
      out.write("  opacity: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".c_product:hover figcaption { opacity: 1;}\r\n");
      out.write("\r\n");
      out.write("figcaption div {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 40%;\r\n");
      out.write("  width: 220px;\r\n");
      out.write("  height: 250px;\r\n");
      out.write("  color: white;\r\n");
      out.write("  font-size: 18px;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  line-height: 30px;\r\n");
      out.write("}\r\n");
      out.write("figcaption div:hover {\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".info {\r\n");
      out.write("  right: 11%;\r\n");
      out.write("  color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* 하단 - 페이징 영역*/\r\n");
      out.write("#paging { text-align: center; margin-top: 20px;}\r\n");
      out.write("#pBox { display: inline-block; width: 22px; height: 22px; padding: 5px; margin: 5px;}\r\n");
      out.write("#pBox:hover { background: #495057; color: white; font-weight: bold; border-radius: 10px;}\r\n");
      out.write(".pBox_c { background: #495057; color: white; font-weight: bold; border-radius: 10px;}\r\n");
      out.write(".pBox_b { font-weight: 900;}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");


request.setCharacterEncoding("utf-8");

DecimalFormat df = new DecimalFormat("###,###,###");
String product_kind = request.getParameter("product_kind");
if(product_kind == null) product_kind = "110";




//################ 페이징(paging) 처리 
//페이징(paging) 처리를 위한 변수 선언
int pageSize = 8; // 1페이지에 12건의 게시글을 표시
String pageNum = request.getParameter("pageNum");
if(pageNum == null) pageNum = "1";

int currentPage = Integer.parseInt(pageNum); // 현재 페이지
int startRow = (currentPage -1) * pageSize + 1; // 현재 페이지의 첫번째 행
int endRow = currentPage * pageSize;    // 현재 페이지의 마지막 행

//################


ProductDAO productDAO = ProductDAO.getInstance();

//분류별 상품에 대한 페이징 처리
List<ProductDTO> productList = productDAO.getProductList(startRow, pageSize, product_kind);
int cnt = productDAO.getProductCount(product_kind);


String product_kindName = "";
switch(product_kind) {
case "110": product_kindName = "텐트"; break;
case "120": product_kindName = "텐트관련품"; break;
case "130": product_kindName = "타프"; break;
case "140": product_kindName = "폴대/펙/스트링/스토퍼"; break;
case "150": product_kindName = "공구"; break;
case "160": product_kindName = "기타(텐트/타프)"; break;
case "210": product_kindName = "의자"; break;
case "220": product_kindName = "테이블"; break;
case "230": product_kindName = "선반/수납기구"; break;
case "240": product_kindName = "야전침대"; break;
case "250": product_kindName = "퍼니쳐"; break;
case "260": product_kindName = "기타(의자/테이블/침대)"; break;

case "310": product_kindName = "버너"; break;
case "320": product_kindName = "코펠"; break;
case "330": product_kindName = "취사용품"; break;
case "340": product_kindName = "식기류"; break;
case "350": product_kindName = "기타(버너/코펠/취사용품)"; break;

case "410": product_kindName = "랜턴"; break;
case "420": product_kindName = "후레쉬"; break;
case "430": product_kindName = "난로"; break;
case "440": product_kindName = "액세서리"; break;
case "450": product_kindName = "기타(랜턴/난로)"; break;
case "460": product_kindName = "기타(의자/테이블/침대)"; break;

case "510": product_kindName = "화로대"; break;
case "520": product_kindName = "바베큐 그릴"; break;
case "530": product_kindName = "토치"; break;
case "540": product_kindName = "바베큐 소품"; break;
case "550": product_kindName = "기타(화로/바베큐)"; break;

case "610": product_kindName = "침낭"; break;
case "620": product_kindName = "베개/쿠션/방석"; break;
case "630": product_kindName = "매트"; break;
case "640": product_kindName = "해먹"; break;
case "650": product_kindName = "커버"; break;
case "660": product_kindName = "기타(침낭/매트/해먹)"; break;
}

      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("	<div id=\"product_kindName\">\r\n");
      out.write("		<span>");
      out.print(product_kindName );
      out.write("</span>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"d_kind2\">상품수: 총 <b class=\"s_kind21\">");
      out.print(cnt );
      out.write("</b>건</div>\r\n");
      out.write("	<div class=\"d_kind3\">\r\n");
      out.write("		");
for(ProductDTO product: productList) { 
      out.write("\r\n");
      out.write("		<div class=\"c_product\">		\r\n");
      out.write("			<a href=\"shopContent.jsp?product_id=");
      out.print(product.getProduct_id());
      out.write("\">\r\n");
      out.write("				<div class=\"c_p1\"><img src=\"/images/");
      out.print(product.getProduct_image());
      out.write("\" width=\"250\" height=\"280\"></div>\r\n");
      out.write("				<div class=\"c_p2\"><span title=\"");
      out.print(product.getProduct_name());
      out.write('"');
      out.write('>');
      out.print(product.getProduct_name() );
      out.write("</span></div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"c_p3\"><span class=\"c_p3_price\" title=\"");
      out.print(product.getProduct_price());
      out.write('"');
      out.write('>');
      out.print(product.getProduct_price()/100*(100-product.getDiscount_rate()) );
      out.write("원</span>\r\n");
      out.write("				  <span class=\"s_p_discount\">(<span class=\"s_p_discount_1\">");
      out.print(product.getDiscount_rate() );
      out.write("%할인</span>)</span></div>\r\n");
      out.write("			</a>\r\n");
      out.write("			<figcaption>\r\n");
      out.write("				<a href=\"shopContent.jsp?product_id=");
      out.print(product.getProduct_id() );
      out.write("\"><div class=\"info\">");
      out.print(product.getProduct_name() );
      out.write("</div></a>	\r\n");
      out.write("			</figcaption>\r\n");
      out.write("			\r\n");
      out.write("		</div>");
 } 
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	   ");
      out.write("\r\n");
      out.write("	   <div id=\"paging\">\r\n");
      out.write("	   ");

	   if(cnt > 0) {
	      // 전체 페이지수 계산
	      int pageCount = cnt / pageSize + (cnt%pageSize==0? 0 : 1);
	      int startPage = 1; //시작페이지 번호
	      int pageBlock = 3; //페이징의 개수 
	      
	      // 시작 페이지 설정
	      if(currentPage % 3 != 0) startPage = (currentPage/3)*3 +1;
	      else startPage = (currentPage/3 -1) * 3 +1;
	         
	      // 끝 페이지 설정
	      int endPage = startPage + pageBlock - 1;
	      if(endPage > pageCount) endPage = pageCount;
	      
	      // 맨처음 페이지 이동 처리
	      if(startPage > 3) {
	         out.print("<a href='shopAll.jsp?pageNum=1&product_kind="+product_kind+"#t_kind'><div id='pBox' class='pBox_b' title='첫 페이지'>"+"〈〈"+"</div></a>");
	      }
	      
	      // 이전 페이지 처리
	      if(startPage > 3 ) {
	         out.print("<a href='shopAll.jsp?pageNum="+(currentPage-3)+"&product_kind="+product_kind+"#t_kind'><div id='pBox' class='pBox_b' title='이전 3페이지'>"+"〈"+"</div></a>");
	      }
	      // 페이징 블럭 출력 처리
	      for(int i=startPage; i<=endPage; i++) {
	         if(currentPage == i) { // 선택된 페이지가 현재 페이지일 때
	            out.print("<div id='pBox' class='pBox_c'>"+i+"</div>");
	         } else {      // 선택된 페이지가 다른 페이지일 떄 -> 이동에 대한 링크 설정
	            out.print("<a href='shopAll.jsp?pageNum=" + i+"&product_kind="+product_kind +"#t_kind'><div id='pBox'>" + i + "</div></a>");   
	         }
	      }
	      
	      // 다음 페이지 처리 
	      if(endPage < pageCount) {
	         int movePage = currentPage + 3;
	         if(movePage > pageCount) movePage=pageCount;
	         out.print("<a href='shopAll.jsp?pageNum="+movePage+"&product_kind="+product_kind+"#t_kind'><div id='pBox' class='pBox_b' title='다음 3페이지'>"+"〉"+"</div></a>");
	      }
	      
	      // 맨 끝 페이지 이동처리
	      if(endPage < pageCount) {
	         out.print("<a href='shopAll.jsp?pageNum="+pageCount+"&product_kind="+product_kind+"#t_kind'><div id='pBox' class='pBox_b' title='끝 페이지'>"+"〉〉"+"</div></a>");
	      }
	   }
	   
      out.write("\r\n");
      out.write("	   </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
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
