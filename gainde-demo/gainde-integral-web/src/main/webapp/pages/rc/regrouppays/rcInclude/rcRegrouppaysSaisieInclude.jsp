<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcRegrouppaysFB.SaisieRegrouppays" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegrouppaysFB.TNUM_LIST_RCCODEPAYS_OB" /></th>
		<td><s:textfield name="numListRcCodePaysOB"
				id="TNUM_LIST_RCCODEPAYS_OB" maxlength="3" onkeyup="f9_pays(this,event)"
				cssClass="input200" /></td>
        <td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcRegrouppaysFB.TNUM_LIST_RCCODEREGROUP_OB" /></th>
		<td><s:textfield name="numListRcCodeRegroupOB" onkeyup="f9_Regroupement(this,event)"
				id="TNUM_LIST_RCCODEREGROUP_OB" maxlength="10"
				cssClass="input200" /></td>
        <td style="width: 60%"></td>
	</tr>
</table>

