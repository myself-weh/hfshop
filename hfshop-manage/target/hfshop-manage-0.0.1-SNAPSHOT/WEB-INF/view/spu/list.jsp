<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<%=request.getContextPath() %>/resource/css/bootstrap.css"" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/bootstrap4/js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/bootstrap4/js/bootstrap.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid">
	<!-- 查询条件 -->
	<div>
		<fieldset>
			<label for="key">关键字</label><input name="key" value="${spuvo.key }">
			<label for="brand">品牌</label><select id="brand" name="brandId">
			<option value="-1">请选择</option>
			<c:forEach items="${brandList }" var="brand">
				<option value="${brand.id }">${brand.name }</option>
			</c:forEach>
			</select>
			<label for="sortColumn">排序字段</label>
			<select id="sortColumn" name="sortColumn">
				<option value="">请选择</option>
				<option value="goodsName" ${sortColumn=='goodsName'?'selected':'' }>名称</option>
				<option value="caption" ${sortColumn=='caption'?'selected':'' }>标题</option>
				<option value="category_id" ${sortColumn=='category_id'?'selected':'' }>分类</option>
				<option value="brand_id" ${sortColumn=='brand_id'?'selected':'' }>品牌</option>
				
			</select>
			<label for="sortType">排序方式</label>
			<input type="radio" name="sortType" value="ASC" ${sortColumn=='ASC'?'checked':'' }>升序
			<input type="radio" name="sortType" value="DESC" ${sortColumn=='DESC'?'checked':'' }>降序
		</fieldset>
	</div>
	
	<!-- 查询结果 -->
	<div>
		<table class="table">
				<tr>
					<th>id</th>
					<th>名称</th>
					<th>在售</th>
					<th>品牌</th>
					<th>标题</th>
					<th>分类</th>
					<th>图片</th>
					<th>操作</th>
					
				</tr>
				
				<c:forEach items="${pageingo.list }" var="spu">
					<tr>
					
					<td>${spu.id }</td>
					<td>${spu.goodsName }</td>
					<td>${spu.isMarketable==1?'在售':'下架' }</td>
					<td>${spu.brand.name }</td>
					<td>${spu.caption }分类</td>
					<td><img src="${spu.smallPic }"/></td>
					<td>操作</td>
					
				</tr>
				</c:forEach>
		</table>
	</div>
</div>
</body>
</html>