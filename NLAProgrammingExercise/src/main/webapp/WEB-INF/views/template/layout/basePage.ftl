<#macro basePage title="">
<!DOCTYPE html>
<html lang="en">
<head>
    <#include "/include/header.ftl">
</head>
<body>
	 <div id="header">
		<H2>
			NLA Programming Exercise
			<br />
			${title}
			<br />
		</H2>
	</div>
     <#include "/include/menu.ftl">

    <#nested/>

    <#include "/include/footer.ftl">    
</body>
</html>
</#macro>