package mybatis.model;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/24 11:07
 * @description: 权限
 */
public class SysPrivilege {
    /**
     * 权限id
     */
    private Long id;
    /**
     * 权限名称
     */
    private String privilegeName;
    /**
     * 权限url
     */
    private String privilegeUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl;
    }
}
