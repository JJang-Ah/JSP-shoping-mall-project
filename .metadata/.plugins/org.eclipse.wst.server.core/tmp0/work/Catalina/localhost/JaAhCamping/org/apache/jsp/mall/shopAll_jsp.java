/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-06-19 16:15:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mall;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import manager.product.*;
import java.util.*;

public final class shopAll_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("manager.product");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>자아캠핑</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js\"></script>\r\n");
      out.write("<link href=\"/JaAhCamping/icons/camping_small.png\" rel=\"shortcut icon\" type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write(".new_items {text-align: center;}\r\n");
      out.write(".new_items div { margin: 10px auto;}\r\n");
      out.write(".new_items img { width: 200px; height: 250px;}\r\n");
      out.write(".add_list { margin-top: 40px; margin-bottom: 20px; height: 380px; padding-left: 100px;}\r\n");
      out.write(".add_list img { float: left;}\r\n");
      out.write(".clear { clear: both; visibility: hidden;}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("//슬라이더(slider), 카로섹(carosel)\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("	$('.slider').bxSlider({\r\n");
      out.write("	     autoControls: true, 	// 기본값:false, 재생/정지 컨트롤 버튼 유무\r\n");
      out.write("	     stopAutoOnclick: true, 	// 기본값:false, 불릿을 누르고나면 슬라이드 정지\r\n");
      out.write("	     auto: true, 			// 기본값: false, 자동 슬라이드 전환\r\n");
      out.write("	     autoHover: true, 		// 기본값: false, 마우스 위에 올렸을때 슬라이드 정지\r\n");
      out.write("	     speed: 2000, 			// 화면 전환 속도\r\n");
      out.write("	     pause: 3000,  			// 화면전환 시간 + 전환 지연시간 > 1초+1초 = 2초\r\n");
      out.write("	     // 중요한 속성\r\n");
      out.write("	     slideWidth: 200, 		// 이미지의 너비\r\n");
      out.write("	     slideHeight: 320, 		// 이미지의 높이\r\n");
      out.write("	     maxSlides: 5, 			// 이미지의 최대 노출 개수\r\n");
      out.write("	     minSlides: 2, 			// 이미지의 최소 노출 개수\r\n");
      out.write("	     moveSides: 2, 			// 슬라이드 이동 분할 개수\r\n");
      out.write("	     slideMargin: 20, 		// 슬라이드 사이의 마진\r\n");
      out.write("	     touchEnabled: false, 	// 웹 화면의 touch 이벤트를 제거\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");


ProductDAO productDAO = ProductDAO.getInstance();
List<ProductDTO> goodProductList = productDAO.getGoodProductList();


      out.write("\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	<div>\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "shopTop.jsp", out, false);
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	<div>\r\n");
      out.write("		<main> ");
      out.write("\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"new_items\">\r\n");
      out.write("				<h3>전체 신상품</h3>\r\n");
      out.write("				<div class=\"slider\" id=\"slider\">\r\n");
      out.write("				");
for(ProductDTO product : goodProductList) {
      out.write("\r\n");
      out.write("					<a href=\"shopContent.jsp?product_id=");
      out.print(product.getProduct_id());
      out.write("\"><img src=\"/images/");
      out.print(product.getProduct_image());
      out.write("\" class=\"c_new_img\"></a>\r\n");
      out.write("				");
}
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</main>\r\n");
      out.write("					\r\n");
      out.write("		<div class=\"add_list\">\r\n");
      out.write("			<a href=\"/JaAhCamping/mall/shopContent.jsp?product_id=15\"><img src=\"/JaAhCamping/add/all_add01.jpg\"></a>\r\n");
      out.write("			<a href=\"/JaAhCamping/mall/shopContent.jsp?product_id=45\"><img src=\"/JaAhCamping/add/all_add02.jpg\"></a>\r\n");
      out.write("			<a href=\"/JaAhCamping/mall/shopContent.jsp?product_id=47\"><img src=\"/JaAhCamping/add/all_add04.jpg\"></a>\r\n");
      out.write("			<a href=\"/JaAhCamping/mall/shopContent.jsp?product_id=46\"><img src=\"/JaAhCamping/add/all_add03.jpg\"></a>\r\n");
      out.write("			<a href=\"/JaAhCamping/mall/shopContent.jsp?product_id=48\"><img src=\"/JaAhCamping/add/all_add05.png\"></a>\r\n");
      out.write("		</div>	\r\n");
      out.write("		<hr class=\"clear\">\r\n");
      out.write("			\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "shopMain.jsp", out, false);
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	<div>\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "shopBottom.jsp", out, false);
      out.write("\r\n");
      out.write("	</div>\r\n");
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
