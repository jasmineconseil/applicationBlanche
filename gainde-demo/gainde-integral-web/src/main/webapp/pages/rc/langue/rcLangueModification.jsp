<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/langue/rcInclude/rcLangueModificationInclude.jsp"%>

	<div style="float: left;">
		<table>
			<tr>
				<td><sj:submit key="button.edit" cssClass="buttonBar"
						validate="true"
						onclick="if (confirmRcUpdate()!=false) {doSubmit2('modifierRcLangue','modificationRcLangue');}"></sj:submit>
					<sj:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('returnPrecedentRcLangue','rechercheRcLangue')"></sj:submit></td>
			</tr>
		</table>
	</div>
</s:form>
