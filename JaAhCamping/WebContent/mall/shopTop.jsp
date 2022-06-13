<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap" rel="stylesheet">
<link href="/JaAhCamping/icons/camping_small.png" rel="shortcut icon" type="image/x-icon">

<style>
#container { width: 1200px; margin: 20px auto;}
/* 상단 */
a { text-decoration: none; color: black;}
.t_box1 { text-align: right;}
.t_box1 #admin_page { display: inline-block; float: left;}
.t_box1 .user_menu { display: inline-block; float: right; color: gray;}
.h_line { clear: both; border: 1px solid lightgray; margin-top: 20px;}
.title { text-align: center; font-family: 'Do Hyeon', sans-serif; font-size: 40px;}
#camping { width: 70px; height: 70px;}
#title_sub_go { font-size: 0.8em;}

/* 메뉴 */
.m_menu { list-style: none; font-weight: bold; color: lightgray;}
.m_menu .m_m_list { display: inline-block; float: left; width: 150px; height: 40px; 
margin-right: 10px; border: 1px solid lightgray; text-align: center; line-height: 40px; border-radius: 10px;}
.m_menu > .m_m_list { position: relative;}
.m_menu > .m_m_list:hover >.s_menu { display: block;}
.m_m_list > .s_menu { display: none; position: absolute; top: 41px; border: 1px solid lightgray; background: white; border-radius: 10px;}
.s_menu .s_m_list { text-align: left; width: 200px;}

.t_line { clear: both; border: 1px solid lightgray; margin-top: 100px;}
</style>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");

String memberId = (String)session.getAttribute("memberId");


%>
<div id="container">

	<div class="t_box1"> <%--  --%>
		<div id="admin_page"><a href="http://localhost:8088/JaAhCamping/manager/managerMain.jsp">관리자 페이지</a></div>
		<div class="user_menu">
		<%if(memberId == null) {  %>
			<a href="http://localhost:8088/JaAhCamping/logon/memberLoginForm.jsp"><span>로그인</span></a>&ensp; |&ensp;
			<a href="http://localhost:8088/JaAhCamping/member/memberJoinForm.jsp"><span>회원가입</span></a>&ensp; |&ensp;
		<%} else { %>
			<a href="../member/memberInfoForm.jsp"><span><%=memberId %>님</span></a>&ensp; |&ensp;
			<a href="../logon/memberLogout.jsp"><span>로그아웃</span></a>&ensp; |&ensp;
			<a href="cart/cartList.jsp"><span>장바구니</span></a>&ensp; |&ensp;
		<%} %>
		<a href="#">고객센터</a>&nbsp;|&nbsp;
		<a href="#">커뮤니티</a>
		</div>
	</div>
	<hr class="h_line">
	
	<%-- 상단 제목 --%>
	<h1 class="title"><a href="http://localhost:8088/JaAhCamping/mall/shopAll.jsp">자아캠핑&nbsp;<img alt="camping" src="/JaAhCamping/icons/camping.png" id="camping"></a></h1>
	
	<nav class="menu">
		<ul class="m_menu">
			<li class="m_m_list"><a href="#">텐트/타프</a>
				<div class="s_menu">
					<ul>
						<li class="s_m_list"><a href="#">텐트</a></li>
						<li class="s_m_list"><a href="shopAll.jsp?product_kind=120">텐트관련품</a></li>
						<li class="s_m_list"><a href="#">타프</a></li>
						<li class="s_m_list"><a href="#">폴대/펙/스트링/스토퍼</a></li>
						<li class="s_m_list"><a href="#">공구</a></li>
						<li class="s_m_list"><a href="#">기타(텐트/타프)</a></li>
					</ul>
				</div>
			</li>
			<li class="m_m_list"><a href="#">의자/테이블/침대</a>
				<div class="s_menu">
					<ul>
						<li class="s_m_list"><a href="#">의자</a></li>
						<li class="s_m_list"><a href="#">테이블</a></li>
						<li class="s_m_list"><a href="#">선반/수납가구</a></li>
						<li class="s_m_list"><a href="#">야전침대</a></li>
						<li class="s_m_list"><a href="#">퍼니쳐</a></li>
						<li class="s_m_list"><a href="#">기타(의자/테이블/침대)</a></li>
					</ul>
				</div>
			</li>
			<li class="m_m_list"><a href="#">버너/코펠/취사용품</a>
				<div class="s_menu">
					<ul>
						<li class="s_m_list"><a href="#">버너</a></li>
						<li class="s_m_list"><a href="#">코펠</a></li>
						<li class="s_m_list"><a href="#">취사용품</a></li>
						<li class="s_m_list"><a href="#">식기류</a></li>
						<li class="s_m_list"><a href="#">기타(버터/코펠/취사용품)</a></li>
					</ul>
				</div>
			</li>
			<li class="m_m_list"><a href="#">랜턴/난로</a>
				<div class="s_menu">
					<ul>
						<li class="s_m_list"><a href="#">랜턴</a></li>
						<li class="s_m_list"><a href="#">후레쉬</a></li>
						<li class="s_m_list"><a href="#">난로</a></li>
						<li class="s_m_list"><a href="#">액세서리</a></li>
						<li class="s_m_list"><a href="#">기타(랜턴/난로)</a></li>
					</ul>
				</div>
			</li>
			<li class="m_m_list"><a href="#">화로/바베큐</a>
				<div class="s_menu">
					<ul>
						<li class="s_m_list"><a href="#">화로대</a></li>
						<li class="s_m_list"><a href="#">바베큐 그릴</a></li>
						<li class="s_m_list"><a href="#">토치</a></li>
						<li class="s_m_list"><a href="#">바베큐 소품</a></li>
						<li class="s_m_list"><a href="#">기타(화로/바베큐)</a></li>
					</ul>
				</div>
			</li>
			<li class="m_m_list"><a href="#">침낭/매트/해먹</a>
				<div class="s_menu">
					<ul>
						<li class="s_m_list"><a href="#">침낭</a></li>
						<li class="s_m_list"><a href="#">베개/쿠션/방석</a></li>
						<li class="s_m_list"><a href="#">매트</a></li>
						<li class="s_m_list"><a href="#">해먹</a></li>
						<li class="s_m_list"><a href="#">기타(침낭/매트/해먹)</a></li>
					</ul>
				</div>
			</li>
			<li class="m_m_list"><a href="#">고객센터</a>
			</li>
		</ul>
	</nav>
	<hr class="t_line">
</div>

</body>
</html>