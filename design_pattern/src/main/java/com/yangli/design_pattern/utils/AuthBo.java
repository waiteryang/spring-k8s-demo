package cn.vipthink.model.bo;

import lombok.Data;

/**
 * @author fomy
 * @date 2020-10-14 18:08
 * @description
 */
@Data
public class AuthBo {
    
    private long expTime;
    private String typ; // a：admin员工；u：user用户
    private long userId;
    
    public boolean isExpired() {
        return expTime < System.currentTimeMillis() / 1000;
    }
    
    public boolean isAdminAuth() {
        return typ.equalsIgnoreCase("a");
    }
    
    public boolean isUser() {
        return typ.equalsIgnoreCase("u");
    }
    
}
