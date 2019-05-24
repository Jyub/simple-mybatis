package mybatis.model;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/24 11:12
 * @description: 角色权限关联
 */
public class SysRolePrivilege {
    /**
     * 角色id
     */
    private Long roleId;
    /**
     * 权限id
     */
    private Long privilegeId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }
}
