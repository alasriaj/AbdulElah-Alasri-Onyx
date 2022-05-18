package com.yemensoft.onyx.models;

public class LoginRes {

    public Data data;
    public VersionInfo versionInfo;
    public Result result;

    public class Data{
        public Login login;
        public Currency currency;
        public class Login {
            public String getAGT_DES() {
                return AGT_DES;
            }

            public void setAGT_DES(String AGT_DES) {
                this.AGT_DES = AGT_DES;
            }

            private String AGT_DES;

            public String getAGT_NO() {
                return AGT_NO;
            }

            public void setAGT_NO(String AGT_NO) {
                this.AGT_NO = AGT_NO;
            }

            public String getAGT_BRN_NO() {
                return AGT_BRN_NO;
            }

            public void setAGT_BRN_NO(String AGT_BRN_NO) {
                this.AGT_BRN_NO = AGT_BRN_NO;
            }

            public String getUSER_NAME() {
                return USER_NAME;
            }

            public void setUSER_NAME(String USER_NAME) {
                this.USER_NAME = USER_NAME;
            }

            public String getUSER_NO() {
                return USER_NO;
            }

            public void setUSER_NO(String USER_NO) {
                this.USER_NO = USER_NO;
            }

            public String getNEW_PASS_FLAG() {
                return NEW_PASS_FLAG;
            }

            public void setNEW_PASS_FLAG(String NEW_PASS_FLAG) {
                this.NEW_PASS_FLAG = NEW_PASS_FLAG;
            }

            public String getPWD_RE_TRY_ATTEMPTS() {
                return PWD_RE_TRY_ATTEMPTS;
            }

            public void setPWD_RE_TRY_ATTEMPTS(String PWD_RE_TRY_ATTEMPTS) {
                this.PWD_RE_TRY_ATTEMPTS = PWD_RE_TRY_ATTEMPTS;
            }

            public String getWEB_REM_NUM_START() {
                return WEB_REM_NUM_START;
            }

            public void setWEB_REM_NUM_START(String WEB_REM_NUM_START) {
                this.WEB_REM_NUM_START = WEB_REM_NUM_START;
            }

            public String getREMITTANCE_NUM_LEN() {
                return REMITTANCE_NUM_LEN;
            }

            public void setREMITTANCE_NUM_LEN(String REMITTANCE_NUM_LEN) {
                this.REMITTANCE_NUM_LEN = REMITTANCE_NUM_LEN;
            }

            public String getPOST_TO_ONYX_BRN() {
                return POST_TO_ONYX_BRN;
            }

            public void setPOST_TO_ONYX_BRN(String POST_TO_ONYX_BRN) {
                this.POST_TO_ONYX_BRN = POST_TO_ONYX_BRN;
            }

            public String getACCT_NO() {
                return ACCT_NO;
            }

            public void setACCT_NO(String ACCT_NO) {
                this.ACCT_NO = ACCT_NO;
            }

            public String getIS_RECEIVE() {
                return IS_RECEIVE;
            }

            public void setIS_RECEIVE(String IS_RECEIVE) {
                this.IS_RECEIVE = IS_RECEIVE;
            }

            public String getIS_SEND() {
                return IS_SEND;
            }

            public void setIS_SEND(String IS_SEND) {
                this.IS_SEND = IS_SEND;
            }

            public String getIS_SEARCH() {
                return IS_SEARCH;
            }

            public void setIS_SEARCH(String IS_SEARCH) {
                this.IS_SEARCH = IS_SEARCH;
            }

            public String getCITY_SEND() {
                return CITY_SEND;
            }

            public void setCITY_SEND(String CITY_SEND) {
                this.CITY_SEND = CITY_SEND;
            }

            public String getPWD_RSET() {
                return PWD_RSET;
            }

            public void setPWD_RSET(String PWD_RSET) {
                this.PWD_RSET = PWD_RSET;
            }

            public String getUSER_HISTORY() {
                return USER_HISTORY;
            }

            public void setUSER_HISTORY(String USER_HISTORY) {
                this.USER_HISTORY = USER_HISTORY;
            }

            public String getSND_REPORT() {
                return SND_REPORT;
            }

            public void setSND_REPORT(String SND_REPORT) {
                this.SND_REPORT = SND_REPORT;
            }

            public String getIS_CANCEL() {
                return IS_CANCEL;
            }

            public void setIS_CANCEL(String IS_CANCEL) {
                this.IS_CANCEL = IS_CANCEL;
            }

            public String getIS_RENAME() {
                return IS_RENAME;
            }

            public void setIS_RENAME(String IS_RENAME) {
                this.IS_RENAME = IS_RENAME;
            }

            public String getRCV_REPORT() {
                return RCV_REPORT;
            }

            public void setRCV_REPORT(String RCV_REPORT) {
                this.RCV_REPORT = RCV_REPORT;
            }

            public String getDATA_EXPORT() {
                return DATA_EXPORT;
            }

            public void setDATA_EXPORT(String DATA_EXPORT) {
                this.DATA_EXPORT = DATA_EXPORT;
            }

            public String getEXP_PDF() {
                return EXP_PDF;
            }

            public void setEXP_PDF(String EXP_PDF) {
                this.EXP_PDF = EXP_PDF;
            }

            public String getEXP_XML() {
                return EXP_XML;
            }

            public void setEXP_XML(String EXP_XML) {
                this.EXP_XML = EXP_XML;
            }

            public String getCITY_RECEIVE() {
                return CITY_RECEIVE;
            }

            public void setCITY_RECEIVE(String CITY_RECEIVE) {
                this.CITY_RECEIVE = CITY_RECEIVE;
            }

            public String getAGENT_RECEIVE() {
                return AGENT_RECEIVE;
            }

            public void setAGENT_RECEIVE(String AGENT_RECEIVE) {
                this.AGENT_RECEIVE = AGENT_RECEIVE;
            }

            public String getRECEIVE_HISTORY_DAYS() {
                return RECEIVE_HISTORY_DAYS;
            }

            public void setRECEIVE_HISTORY_DAYS(String RECEIVE_HISTORY_DAYS) {
                this.RECEIVE_HISTORY_DAYS = RECEIVE_HISTORY_DAYS;
            }

            public String getRETURN_SENT_FEE() {
                return RETURN_SENT_FEE;
            }

            public void setRETURN_SENT_FEE(String RETURN_SENT_FEE) {
                this.RETURN_SENT_FEE = RETURN_SENT_FEE;
            }

            public String getSHOW_AGENT_BALENCE() {
                return SHOW_AGENT_BALENCE;
            }

            public void setSHOW_AGENT_BALENCE(String SHOW_AGENT_BALENCE) {
                this.SHOW_AGENT_BALENCE = SHOW_AGENT_BALENCE;
            }

            public String getALLOW_RECIVE_BLCKLIST() {
                return ALLOW_RECIVE_BLCKLIST;
            }

            public void setALLOW_RECIVE_BLCKLIST(String ALLOW_RECIVE_BLCKLIST) {
                this.ALLOW_RECIVE_BLCKLIST = ALLOW_RECIVE_BLCKLIST;
            }

            public String getALLOW_SEND_BLCKLIST() {
                return ALLOW_SEND_BLCKLIST;
            }

            public void setALLOW_SEND_BLCKLIST(String ALLOW_SEND_BLCKLIST) {
                this.ALLOW_SEND_BLCKLIST = ALLOW_SEND_BLCKLIST;
            }

            public String getCOMPANY_ANAME() {
                return COMPANY_ANAME;
            }

            public void setCOMPANY_ANAME(String COMPANY_ANAME) {
                this.COMPANY_ANAME = COMPANY_ANAME;
            }

            public String getCOMPANY_ENAME() {
                return COMPANY_ENAME;
            }

            public void setCOMPANY_ENAME(String COMPANY_ENAME) {
                this.COMPANY_ENAME = COMPANY_ENAME;
            }

            public String getAGT_ADES() {
                return AGT_ADES;
            }

            public void setAGT_ADES(String AGT_ADES) {
                this.AGT_ADES = AGT_ADES;
            }

            public String getAGT_EDES() {
                return AGT_EDES;
            }

            public void setAGT_EDES(String AGT_EDES) {
                this.AGT_EDES = AGT_EDES;
            }

            public String getBRN_PHONE() {
                return BRN_PHONE;
            }

            public void setBRN_PHONE(String BRN_PHONE) {
                this.BRN_PHONE = BRN_PHONE;
            }

            public String getBRN_FAX() {
                return BRN_FAX;
            }

            public void setBRN_FAX(String BRN_FAX) {
                this.BRN_FAX = BRN_FAX;
            }

            public String getREM_CNCT_MLTI_USR() {
                return REM_CNCT_MLTI_USR;
            }

            public void setREM_CNCT_MLTI_USR(String REM_CNCT_MLTI_USR) {
                this.REM_CNCT_MLTI_USR = REM_CNCT_MLTI_USR;
            }

            public String getSECRE_NAME_LBL() {
                return SECRE_NAME_LBL;
            }

            public void setSECRE_NAME_LBL(String SECRE_NAME_LBL) {
                this.SECRE_NAME_LBL = SECRE_NAME_LBL;
            }

            public String getLOCL_CUR_CODE() {
                return LOCL_CUR_CODE;
            }

            public void setLOCL_CUR_CODE(String LOCL_CUR_CODE) {
                this.LOCL_CUR_CODE = LOCL_CUR_CODE;
            }

            public String getLOCL_CUR_NO() {
                return LOCL_CUR_NO;
            }

            public void setLOCL_CUR_NO(String LOCL_CUR_NO) {
                this.LOCL_CUR_NO = LOCL_CUR_NO;
            }

            private String AGT_NO;
            private String AGT_BRN_NO;
            private String USER_NAME;
            private String USER_NO;
            private String NEW_PASS_FLAG;
            private String PWD_RE_TRY_ATTEMPTS;
            private String WEB_REM_NUM_START;
            private String REMITTANCE_NUM_LEN;
            private String POST_TO_ONYX_BRN;
            private String ACCT_NO;
            private String IS_RECEIVE;
            private String IS_SEND;
            private String IS_SEARCH;
            private String CITY_SEND;
            private String PWD_RSET;
            private String USER_HISTORY;
            private String SND_REPORT;
            private String IS_CANCEL;
            private String IS_RENAME;
            private String RCV_REPORT;
            private String DATA_EXPORT;
            private String EXP_PDF;
            private String EXP_XML;
            private String CITY_RECEIVE;
            private String AGENT_RECEIVE;
            private String RECEIVE_HISTORY_DAYS;
            private String RETURN_SENT_FEE;
            private String SHOW_AGENT_BALENCE;
            private String ALLOW_RECIVE_BLCKLIST;
            private String ALLOW_SEND_BLCKLIST;
            private String COMPANY_ANAME;
            private String COMPANY_ENAME;
            private String AGT_ADES;
            private String AGT_EDES;
            private String BRN_PHONE;
            private String BRN_FAX;
            private String REM_CNCT_MLTI_USR;
            private String SECRE_NAME_LBL;
            private String LOCL_CUR_CODE;
            private String LOCL_CUR_NO;
        }

        public class Currency {
            public String getCURR_NO() {
                return CURR_NO;
            }

            public void setCURR_NO(String CURR_NO) {
                this.CURR_NO = CURR_NO;
            }

            public String getCURR_DES() {
                return CURR_DES;
            }

            public void setCURR_DES(String CURR_DES) {
                this.CURR_DES = CURR_DES;
            }

            public String getCURR_SHRT() {
                return CURR_SHRT;
            }

            public void setCURR_SHRT(String CURR_SHRT) {
                this.CURR_SHRT = CURR_SHRT;
            }

            public String getFRAC_DES() {
                return FRAC_DES;
            }

            public void setFRAC_DES(String FRAC_DES) {
                this.FRAC_DES = FRAC_DES;
            }

            public String getFRAC_EDES() {
                return FRAC_EDES;
            }

            public void setFRAC_EDES(String FRAC_EDES) {
                this.FRAC_EDES = FRAC_EDES;
            }

            public String getCURR_EDES() {
                return CURR_EDES;
            }

            public void setCURR_EDES(String CURR_EDES) {
                this.CURR_EDES = CURR_EDES;
            }

            public String getTRN_L_EXCH() {
                return TRN_L_EXCH;
            }

            public void setTRN_L_EXCH(String TRN_L_EXCH) {
                this.TRN_L_EXCH = TRN_L_EXCH;
            }

            public String getTRN_H_EXCH() {
                return TRN_H_EXCH;
            }

            public void setTRN_H_EXCH(String TRN_H_EXCH) {
                this.TRN_H_EXCH = TRN_H_EXCH;
            }

            private String CURR_NO;
            private String CURR_DES;
            private String CURR_SHRT;
            private String FRAC_DES = null;
            private String FRAC_EDES;
            private String CURR_EDES;
            private String TRN_L_EXCH;
            private String TRN_H_EXCH;
        }
    }

    public class VersionInfo {
        public String getWebVersion() {
            return WebVersion;
        }

        public void setWebVersion(String webVersion) {
            WebVersion = webVersion;
        }

        public String getAndroidAppUpdateUrl() {
            return AndroidAppUpdateUrl;
        }

        public void setAndroidAppUpdateUrl(String androidAppUpdateUrl) {
            AndroidAppUpdateUrl = androidAppUpdateUrl;
        }

        public String getAndroidAppUpdateIsMandatory() {
            return AndroidAppUpdateIsMandatory;
        }

        public void setAndroidAppUpdateIsMandatory(String androidAppUpdateIsMandatory) {
            AndroidAppUpdateIsMandatory = androidAppUpdateIsMandatory;
        }

        public String getAndroidAppVerName() {
            return AndroidAppVerName;
        }

        public void setAndroidAppVerName(String androidAppVerName) {
            AndroidAppVerName = androidAppVerName;
        }

        public String getIOSAppUpdateUrl() {
            return IOSAppUpdateUrl;
        }

        public void setIOSAppUpdateUrl(String IOSAppUpdateUrl) {
            this.IOSAppUpdateUrl = IOSAppUpdateUrl;
        }

        public String getIOSAppUpdateIsMandatory() {
            return IOSAppUpdateIsMandatory;
        }

        public void setIOSAppUpdateIsMandatory(String IOSAppUpdateIsMandatory) {
            this.IOSAppUpdateIsMandatory = IOSAppUpdateIsMandatory;
        }

        public String getIOSAppVerName() {
            return IOSAppVerName;
        }

        public void setIOSAppVerName(String IOSAppVerName) {
            this.IOSAppVerName = IOSAppVerName;
        }

        private String WebVersion;
        private String AndroidAppUpdateUrl;
        private String AndroidAppUpdateIsMandatory;
        private String AndroidAppVerName;
        private String IOSAppUpdateUrl;
        private String IOSAppUpdateIsMandatory;
        private String IOSAppVerName;
    }
    public class Result {
        public int getErrNo() {
            return ErrNo;
        }

        public void setErrNo(int errNo) {
            ErrNo = errNo;
        }

        public String getErrMsg() {
            return ErrMsg;
        }

        public void setErrMsg(String errMsg) {
            ErrMsg = errMsg;
        }

        private int ErrNo;
        private String ErrMsg;
    }
}
