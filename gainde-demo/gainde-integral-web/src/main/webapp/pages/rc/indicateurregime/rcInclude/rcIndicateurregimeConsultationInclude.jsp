<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcIndicateurregimeFB.ConsultationIndicateurregime" /></th>
	</tr>
	<tr>
		<th><s:text name="RcIndicateurregimeFB.TNUM_LIST_RCCODEINDICATEUR_OB" /></th>
		<td><s:textfield name="numListRcCodeIndicateurOB" readonly="true"
				id="TNUM_LIST_RCCODEINDICATEUR_OB" maxlength="15"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcIndicateurregimeFB.TNUM_LIST_RCCODEREGIMEDOUANIER_OB" /></th>
		<td><s:textfield name="numListRcCodeRegimeDouanierOB" id="TNUM_LIST_RCCODEREGIMEDOUANIER_OB" maxlength="1"
                        readonly="true"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcIndicateurregimeFB.TNUM_LIST_RCCODEREGIMEFISCAL_OB" /></th>
		<td><s:textfield name="numListRcCodeRegimeFiscalOB" readonly="true"
				id="TNUM_LIST_RCCODEREGIMEFISCAL_OB" maxlength="2"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcIndicateurregimeFB.TNUM_LIST_RCTYPEREGIME_OB" /></th>
		<td><s:textfield name="numListRcTypeRegimeOB" id="TNUM_LIST_RCTYPEREGIME_OB" maxlength="1"
                         readonly="true"
				cssClass="input200" /></td>
	</tr>
	<tr>
		 <th><s:text name="RcIndicateurregimeFB.DAT_RCDATEVALIDITE_OB" /></th>
	     <td><sj:datepicker id="DAT_RCDATEVALIDITE_OB" name="datRcDateValiditeOB" showOn="focus" displayFormat="dd/mm/yy" cssStyle="width: 200px;" disabled="true"/></td>
		 <td style="width: 20%"></td>
		 <th><s:text name="RcIndicateurregimeFB.DAT_RCDATECLOTURE" /></th>
	     <td><sj:datepicker id="DAT_RCDATECLOTURE" name="datRcDateCloture" showOn="focus" displayFormat="dd/mm/yy" cssStyle="width: 200px;" disabled="true"/></td>
    </tr>
</table>