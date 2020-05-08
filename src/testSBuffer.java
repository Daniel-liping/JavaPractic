public class testSBuffer {
    public static void main(String[] args) {
        StringBuilder sql = new StringBuilder();
        sql.append("/*dialect*/ ").append("\r\n");
        sql.append("SELECT p.fid, ").append("\r\n");
        sql.append("	p.fnumber fnumber, ").append("\r\n");
        sql.append("	p.cfsourcenumber sourceNumber, ").append("\r\n");
        sql.append("	p.Fbizdate paymentDate, ").append("\r\n");
        sql.append("	bank.fname_l2 payBankName, ").append("\r\n");
        sql.append("	bank.fnumber payBankNumber,  ").append("\r\n");
        sql.append("	bank.FBankAccountNumber payAccountNum,  ").append("\r\n");
        sql.append("	sett.fnumber settType,  ").append("\r\n");
        sql.append("	feeType.fnumber feeType,  ").append("\r\n");
        sql.append("	p.fpaydate payDate, ").append("\r\n");
        sql.append("	p.cfisNoticePayed isNoticePayed, ").append("\r\n");
        sql.append("	p.FBillStatus billStatus, ").append("\r\n");
        sql.append("	p.cfComefrom comefrom, ").append("\r\n");
        sql.append("	payb.fmakeType makeType, ").append("\r\n");
        sql.append("	payb.fbillMakerName billMakerName, ").append("\r\n");
        sql.append("	billMaker.fnumber billMakerNumber, ").append("\r\n");
        sql.append("	p.FSettleBizType settleBizType, ").append("\r\n");
        sql.append("	p.FAccepterDate accepterDate, ").append("\r\n");
        sql.append("	com.fnumber comNumber, ").append("\r\n");
        sql.append("	payb.fdraftNumber draftNumber, ").append("\r\n");
        sql.append("	(CASE WHEN payb.FMakeType=0 THEN payb.cfAuditTime  ").append("\r\n");
        sql.append("		WHEN payb.FMakeType=2 THEN (  ").append("\r\n");
        sql.append("									SELECT tpb.cfAuditTime FROM T_NT_PayableBill tp  ").append("\r\n");
        sql.append("									LEFT OUTER JOIN T_BOT_Relation tre  ").append("\r\n");
        sql.append("										ON tre.fsrcObjectId = tp.fid AND tre.fsrcentityid='FD410AF6' ").append("\r\n");
        sql.append("											AND tre.fdestentityid='FD410AF6' ").append("\r\n");
        sql.append("									LEFT OUTER JOIN T_NT_PayableBill tpb ").append("\r\n");
        sql.append("										ON tpb.FID = tre.fdestObjectId ").append("\r\n");
        sql.append("									WHERE tp.fid=payb.FID ").append("\r\n");
        sql.append("									)  ").append("\r\n");
        sql.append("		ELSE null END) auditTime  ").append("\r\n");
        sql.append("FROM T_CAS_PaymentBill p ").append("\r\n");
        sql.append("LEFT OUTER JOIN T_ORG_Company com ").append("\r\n");
        sql.append("	ON p.fcompanyid = com.fid ").append("\r\n");
        sql.append("LEFT OUTER JOIN T_BD_SettlementType sett ").append("\r\n");
        sql.append("	ON sett.FID = p.FSettlementTypeID ").append("\r\n");
        sql.append("LEFT OUTER JOIN T_BD_AccountBanks bank ").append("\r\n");
        sql.append("	ON bank.FID = p.FPayerAccountBankID ").append("\r\n");
        sql.append("LEFT OUTER JOIN T_BOT_Relation re ").append("\r\n");
        sql.append("	ON re.fsrcObjectId = p.fid AND re.fsrcentityid='40284E81' ").append("\r\n");
        sql.append("								AND re.fdestentityid='FD410AF6' ").append("\r\n");
        sql.append("LEFT OUTER JOIN T_NT_PayableBill payb ").append("\r\n");
        sql.append("	ON payb.FID = re.fdestObjectId ").append("\r\n");
        sql.append("LEFT OUTER JOIN T_ORG_Company billMaker ").append("\r\n");
        sql.append("	ON payb.fbillMakerid = billMaker.fid ").append("\r\n");
        sql.append("LEFT JOIN T_CAS_FeeType feeType ").append("\r\n");
        sql.append("	ON p.ffeetypeid=feeType.fid ").append("\r\n");
        sql.append("WHERE  ").append("\r\n");
        sql.append("     p.cfisSap=1 ").append("\r\n");
        sql.append("     AND (p.cfisNoticePayed=0 OR p.cfisNoticePayed IS NULL) ").append("\r\n");
        sql.append("     AND (p.cfnoticepaidtimes IS NULL OR p.cfnoticepaidtimes<=3) ").append("\r\n");

        //结算方式：31 集中结算（E结算），33 集中结算（授权账户）对应资金中心支付, 6银行付款单状态为交易成功
//        sql.append(
//                "     AND (((" + getSettleType(InterfaceParamUtil.getParam(ctx, InterfaceParamUtil.ESB_SETTLEMENTTYPE_FUND))
//                        + ") AND ((p.FBankPayState=6 and p.FSettleBizType=2 and p.fbillstatus=15)or (P.FSettleBizType=4 and p.FSettlementStatus=12))) ").append("\r\n");// 结算方式：31 集中结算（E结算），33
//        // 集中结算（授权账户）对应资金中心支付, 6银行付款单状态为交易成功
//        sql.append("    	 OR ((" + getSettleType(InterfaceParamUtil.getParam(ctx, InterfaceParamUtil.ESB_SETTLEMENTTYPE_BANK)) + ") AND FBillStatus=15) ")
//                .append("\r\n");// 结算方式：888 网银支付,32 集中结算 对应网银支付
//        //结算方式：012应付票据(银行承兑汇票),013应付票据(商业承兑汇票),014银行保理,015国内信用证 对应票据支付
//        sql.append("    	 OR ((" + getSettleType(InterfaceParamUtil.getParam(ctx, InterfaceParamUtil.ESB_SETTLEMENTTYPE_PAYABLEBILL)) + ") ").append("\r\n");// 结算方式：012应付票据(银行承兑汇票),013应付票据(商业承兑汇票),014银行保理,015国内信用证
//        sql.append(" AND EXISTS(SELECT pb.FID FROM T_NT_PayableBill pb LEFT JOIN T_BOT_Relation rala ON rala.fdestObjectId = pb.fid ").append("\r\n");
        sql
                .append(
                        " 			WHERE pb.FBillState = 5 AND ( pb.FDraftNumber IS NOT NULL ) AND rala.fsrcObjectId = p.fid AND ( pb.FMakeType <> 2 OR EXISTS(SELECT Fid FROM T_NT_PayableBill WHERE fSourceBillid = pb.fid AND FBillState = 5) )) )  ")
                .append("\r\n");
        sql.append("    	 ) ").append("\r\n");

    }
}
