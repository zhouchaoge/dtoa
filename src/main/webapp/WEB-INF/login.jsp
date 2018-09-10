<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
<!-- <script type="text/javascript" src="http://libs.baidu.com/jquery/1.9.1/jquery.js"></script> -->
<script type="text/javascript" src="../js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
	//页面加载事件
	$(function(){
		//为输入框绑定离焦事件
		$("#name").blur(function(){
			//1.失去焦点获得输入框的内容
			var username = $(this).val();//this.value//$("#name").val()
			//alert(username);
			//2.去服务端校验用户是否存在-ajax
			/* $.ajax({
				url:"${pageContext.request.contextPath }/checkUsername",
				data:{"username":username},
				success:function(data){
					
					alert(data.name);
				},
				error:function(){
					alert("no");
				},
				dataType:"json"
			}
			); */
			$.post(
				"${pageContext.request.contextPath }/checkUsername",
				{"username":username},
				function(data){
					//alert(data.name);
					var usernameInfo = "";
					if(data){
						usernameInfo = "该用户名已存在";
					}else{
						usernameInfo = "该用户名可用";
					}
					$("#usernameInfo").html(usernameInfo);
				},
				"json"
			);
		});
	});
	
	
</script>
</head>
<body>
	<form action="${pageContext.request.contextPath }/main" >
		<table>
			<tr>
				<td>用户名：</td>
				<td>
					<input type="text" name="name" id="name" />
					<span id="usernameInfo"></span>
				</td>			
			</tr>
			<tr>
				<td>密码：</td>
				<td>
					<input type="password" name="realPass" id="realPass"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="登陆"  id="dtlogin" />
				</td>
			</tr>
		</table>
	</form>
</body>

</html>