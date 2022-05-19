// Converter.java

// To use this code, add the following Maven dependency to your project:
//
//
//     com.fasterxml.jackson.core     : jackson-databind          : 2.9.0
//     com.fasterxml.jackson.datatype : jackson-datatype-jsr310   : 2.9.0
//
// Import this package:
//
//     import com.yemensoft.onyx.models.Converter;
//
// Then you can deserialize a JSON string with
//
//     LoginRes data = Converter.fromJsonString(jsonString);

package com.yemensoft.onyx.models;


public class LoginRes {
    public LoginRes.Data Data;
    public LoginRes.Result Result;
    public LoginRes.VersionInfo VersionInfo;


    public class Data {
        public Data.Login Login;
        public Data.Currency Currency;

        public class Currency {
            public String CurrNo;
            public String CurrDES;
            public String CurrShrt;
            public Object FracDES;
            public String FracEdes;
            public String CurrEdes;
            public String TrnLExch;
            public String TrnHExch;
        }


        public class Login {
            public String AGT_DES;
            public String AGT_NO;
            public String AGT_BRN_NO;
            public String USER_NAME;
            public String USER_NO;
            public String NEW_PASS_FLAG;
            public String PWD_RE_TRY_ATTEMPTS;
            public String WEB_REM_NUM_START;
            public String REMITTANCE_NUM_LEN;
            public String POST_TO_ONYX_BRN;
            public String ACCT_NO;
            public String IS_RECEIVE;
            public String IS_SEND;
            public String IS_SEARCH;
            public String CITY_SEND;
            public String PWD_RSET;
            public String USER_HISTORY;
            public String SND_REPORT;
            public String IS_CANCEL;
            public String IS_RENAME;
            public String RCV_REPORT;
            public String DATA_EXPORT;
            public String EXP_PDF;
            public String EXP_XML;
            public String CITY_RECEIVE;
            public String AGENT_RECEIVE;
            public String RECEIVE_HISTORY_DAYS;
            public String RETURN_SENT_FEE;
            public String SHOW_AGENT_BALENCE;
            public String ALLOW_RECIVE_BLCKLIST;
            public String ALLOW_SEND_BLCKLIST;
            public String COMPANY_ANAME;
            public String COMPANY_ENAME;
            public String AGT_ADES;
            public String AGT_EDES;
            public String BRN_PHONE;
            public String BRN_FAX;
            public String REM_CNCT_MLTI_USR;
            public String SECRE_NAME_LBL;
            public String LOCL_CUR_CODE;
            public String LOCL_CUR_NO;

        }
    }


    public class Result {
        public long ErrNo;
        public String ErrMsg;
    }

    public class VersionInfo {
        public String WebVersion;
        public String AndroidAppUpdateUrl;
        public String AndroidAppUpdateIsMandatory;
        public String AndroidAppVerName;
        public String IosAppUpdateUrl;
        public String IosAppUpdateIsMandatory;
        public String IosAppVerName;

    }
}




