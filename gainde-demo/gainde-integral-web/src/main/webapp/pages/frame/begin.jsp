<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="sn.com.douane.web.rc.Session" %>


<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gainde Integral</title>

<script src="<%= request.getContextPath()%>/config/Jscript/manifeste.js" type="text/javascript"></script>
<script src="<%= request.getContextPath()%>/config/Jscript/f9_functions.js" type="text/javascript"></script>
<script src="<%= request.getContextPath()%>/config/Jscript/functions.js" type="text/javascript"></script>
<script src="<%= request.getContextPath()%>/config/Jscript/declaration.js" type="text/javascript"></script>
<script src="<%= request.getContextPath()%>/config/Jscript/douane.js" type="text/javascript"></script>
<script src="<%= request.getContextPath()%>/config/Jscript/rc.js" type="text/javascript"></script>
<script src="<%= request.getContextPath()%>/config/swap.js" type="text/javascript"></script>

<script type="JavaScript">
    function save1Cookie(days,skinName) {
          if (days) {
                var date = new Date();
                date.setTime(date.getTime()+(days*24*60*60*1000));
                var expires = "; expires="+date.toGMTString();
          }
          else expires = "";
          document.cookie = "skinName="+skinName+expires+"; path=/";
    }

    function choix(choix) {
        save1Cookie(60,choix);
    }
</script>



