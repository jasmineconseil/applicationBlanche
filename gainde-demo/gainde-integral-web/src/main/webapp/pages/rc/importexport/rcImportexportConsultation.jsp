<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/importexport/rcInclude/rcImportexportConsultationInclude.jsp"%>
	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('returnPrecedentRcImportExport','rechercheRcImportexport')"></s:submit></td>
		</tr>
	</table>
	</div>
</s:form>