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
.t_box1 { text-align: right; margin-bottom: 10px; padding-bottom: 10px; color: gray;}
.t_box1 #admin_page { display: inline-block; float: left;}
.t_box1 .user_menu { display: inline-block; float: right; color: gray;}
.h_line { clear: both; border: 1px solid lightgray; margin-top: 20px;}
.title { text-align: center; font-family: 'Do Hyeon', sans-serif; font-size: 40px;}
#camping { width: 70px; height: 70px;}
#title_sub_go { font-size: 0.8em;}

/* 메뉴 */
.m_menu { list-style: none; font-family: 'Do Hyeon', sans-serif; color: #333333;}
.m_menu .m_m_list { display: inline-block; float: left; width: 150px; height: 40px; 
margin-right: 10px; border: 1px solid lightgray; text-align: center; line-height: 40px; border-radius: 10px;}
.m_menu > .m_m_list { position: relative;}
.m_menu > .m_m_list:hover >.s_menu { display: block;}
.m_m_list > .s_menu { display: none; position: absolute; top: 41px; border: 1px solid lightgray; background: white; border-radius: 10px; z-index: 10;}
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
		<div id="admin_page"><a href="/JaAhCamping/manager/managerMain.jsp">관리자 페이지</a></div>
		<div class="user_menu">
		<%if(memberId == null) {  %>
			<a href="http://localhost:8088/JaAhCamping/logon/memberLoginForm.jsp"><span>로그인</span></a>&ensp; |&ensp;
			<a href="http://localhost:8088/JaAhCamping/member/memberJoinForm.jsp"><span>회원가입</span></a>&ensp; |&ensp;
		<%} else { %>
			<a href="/JaAhCamping/member/memberInfoForm.jsp"><span><%=memberId %>님</span></a>&ensp; |&ensp;
			<a href="/JaAhCamping/logon/memberLogout.jsp"><span>로그아웃</span></a>&ensp; |&ensp;
			<a href="/JaAhCamping/mall/cart/cartList.jsp"><span>장바구니</span></a>&ensp; |&ensp;
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
			<li class="m_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=110">텐트/타프</a>
				<div class="s_menu">
					<ul>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=110">텐트</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=120">텐트관련품</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=130">타프</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=140">폴대/펙/스트링/스토퍼</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=150">공구</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=160">기타(텐트/타프)</a></li>
					</ul>
				</div>
			</li>
			<li class="m_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=210">의자/테이블/침대</a>
				<div class="s_menu">
					<ul>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=210">의자</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=220">테이블</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=230">선반/수납가구</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=240">야전침대</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=250">퍼니쳐</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=260">기타(의자/테이블/침대)</a></li>
					</ul>
				</div>
			</li>
			<li class="m_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=310">버너/코펠/취사용품</a>
				<div class="s_menu">
					<ul>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=310">버너</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=320">코펠</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=330">취사용품</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=340">식기류</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=350">기타(버터/코펠/취사용품)</a></li>
					</ul>
				</div>
			</li>
			<li class="m_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=410">랜턴/난로</a>
				<div class="s_menu">
					<ul>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=410">랜턴</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=420">후레쉬</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=430">난로</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=440">액세서리</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=450">기타(랜턴/난로)</a></li>
					</ul>
				</div>
			</li>
			<li class="m_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=510">화로/바베큐</a>
				<div class="s_menu">
					<ul>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=510">화로대</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=520">바베큐 그릴</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=530">토치</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=540">바베큐 소품</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=550">기타(화로/바베큐)</a></li>
					</ul>
				</div>
			</li>
			<li class="m_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=610">침낭/매트/해먹</a>
				<div class="s_menu">
					<ul>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=610">침낭</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=620">베개/쿠션/방석</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=630">매트</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=640">해먹</a></li>
						<li class="s_m_list"><a href="/JaAhCamping/mall/shopAll.jsp?product_kind=650">기타(침낭/매트/해먹)</a></li>
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