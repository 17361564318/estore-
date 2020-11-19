function search() {
		var keyword=document.getElementById("keyword").value;
		if (keyword != "") {
			window.location.href="SearchBookServlet?keyword="+keyword;
		}else{
			alert("请输入关键字！");
		}
}