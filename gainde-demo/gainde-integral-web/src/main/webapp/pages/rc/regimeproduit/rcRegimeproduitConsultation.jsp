<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/regimeproduit/rcInclude/rcRegimeproduitConsultationInclude.jsp" %>
<div style="float: left;">
	<table>
		<tr>
			<td><sj:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('returnPrecedentRegimeProduit','rechercheRcRegimeproduit')"></sj:submit></td>
		</tr>
	</table>
	</div>
</s:form>
