package mybatis.model;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/23 11:54
 * @description: domain
 */
public class Country {

    /**
     * id
     */
    private Long id;

    /**
     * 名称
     */
    private String countryname;

    /**
     * code
     */
    private String countrycode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}
