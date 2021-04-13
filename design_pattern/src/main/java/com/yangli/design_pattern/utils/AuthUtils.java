//package
//
//import cn.vipthink.enums.ResultEnums;
//import cn.vipthink.exception.BusinessException;
//import cn.vipthink.model.bo.AuthBo;
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import org.apache.commons.lang3.StringUtils;
//import org.apache.commons.lang3.time.DateFormatUtils;
//
//import java.util.Date;
//
//;
//
///**
// * @author gsu-napoleon@qq.com
// * @date 2020/8/5 15:43
// */
//public final class AuthUtils {
//
//    private static final int TOKEN_PART_SIZE = 3;
//    private static final String HEADER_ALG = "alg";
//    private static final String CST_Z = "z";
//    private static final String BEARER = "Bearer";
//
//    /**
//     * 解析验证token
//     *
//     * @param authorization authorization
//     * @return
//     */
//    public static AuthBo parseAuthorization(String authorization) {
//        if (StringUtils.isBlank(authorization)) {
//            throw new BusinessException(ResultEnums.PARAM_ERROR, "InvalidToken:authorization:empty");
//        }
//        String newToken = authorization.replaceFirst(BEARER, "").trim();
//        String[] components = newToken.split("\\.");
//        if (components.length != TOKEN_PART_SIZE) {
//            throw new BusinessException(ResultEnums.PARAM_ERROR, "InvalidTokenComponentsCount:authorization:components");
//        }
//
//        String header = components[0];
//        String payload = components[1];
//        String signature = components[2];
//        if (StringUtils.isEmpty(header)) {
//            throw new BusinessException(ResultEnums.PARAM_ERROR, "MissingOrBadTokenHeader:header");
//        }
//        if (StringUtils.isEmpty(payload)) {
//            throw new BusinessException(ResultEnums.PARAM_ERROR, "MissingOrBadTokenHeader:payload");
//        }
//        if (StringUtils.isEmpty(signature)) {
//            throw new BusinessException(ResultEnums.PARAM_ERROR, "MissingOrBadTokenHeader:signature");
//        }
//
//        header = new String(org.springframework.util.Base64Utils.decodeFromString(header));
//        JSONObject headerObject = JSON.parseObject(header);
//
//        // 检查json对象；存在key为alg，且不为空
//        String alg = headerObject.getString(HEADER_ALG);
//        if (StringUtils.isEmpty(header) || StringUtils.isEmpty(alg)) {
//            throw new BusinessException(ResultEnums.PARAM_ERROR, "InvalidTokenHeader:header");
//        }
//
//        payload = new String(org.springframework.util.Base64Utils.decodeFromString(payload));
//
//        JSONArray payloadArr = JSON.parseArray(payload);
//
//        // 检查json数组中的第1个元素，存在key为tza，且为当前时区（CST）
//        String tza = payloadArr.getJSONObject(0).getString("tza");
//        if (StringUtils.isEmpty(tza) || !DateFormatUtils.format(new Date(), CST_Z).equalsIgnoreCase(tza)) {
//            throw new BusinessException(ResultEnums.PARAM_ERROR, "InvalidTokenTimezone:tza");
//        }
//
//        // 检查json数组中的第1个元素，存在key为exp，且大于当前时间
//        String exp = payloadArr.getJSONObject(0).getString("exp");
//        long expTime;
//        try {
//            expTime = Long.parseLong(exp);
//        } catch (NumberFormatException e) {
//            throw new BusinessException(ResultEnums.PARAM_ERROR, "InvalidTokenExpireTimestamp:exp");
//        }
//
//        // 检查json数组中第2个元素；存在key为uid，且不小于1
//        String uid = payloadArr.getJSONObject(1).getString("uid");
//        long userId;
//        try {
//            userId = Long.parseLong(uid);
//        } catch (NumberFormatException e) {
//            throw new BusinessException(ResultEnums.PARAM_ERROR, "InvalidUserId:uid");
//        }
//        if (userId < 1) {
//            throw new BusinessException(ResultEnums.PARAM_ERROR, "InvalidUserId:uid");
//        }
//
//        String typ = payloadArr.getJSONObject(1).getString("typ");
//
//        AuthBo bo = new AuthBo();
//        bo.setTyp(typ);
//        bo.setUserId(userId);
//        bo.setExpTime(expTime);
//
//        return bo;
//    }
//
//}
