/*
 * Region list
 */
package com.faisalman.phoneidentifier;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Faisal Salman
 */
public class Region {
    public String code;
    public String name;
    public Region(String code) {
        this.code = code;
        this.name = this.map.containsKey(code) ? this.map.get(code) : "";
    }
    private static final Map<String, String> map;
    static {
        Map<String, String> map = new HashMap<String, String>();
        map.put("21", "Jakarta");
        map.put("22", "Bandung");
        map.put("231", "");
        map.put("232", "");
        map.put("233", "");
        map.put("234", "");
        map.put("24", "Semarang");
        map.put("261", "");
        map.put("262", "");
        map.put("263", "");
        map.put("264", "");
        map.put("265", "");
        map.put("266", "");
        map.put("267", "");
        map.put("271", "");
        map.put("272", "");
        map.put("273", "");
        map.put("274", "");
        map.put("275", "");
        map.put("276", "");
        map.put("280", "");
        map.put("281", "");
        map.put("282", "");
        map.put("283", "");
        map.put("284", "");
        map.put("285", "");
        map.put("286", "");
        map.put("287", "");
        map.put("289", "");
        map.put("291", "");
        map.put("292", "");
        map.put("293", "");
        map.put("294", "");
        map.put("295", "");
        map.put("296", "");
        map.put("297", "");
        map.put("298", "");
        map.put("31", "Surabaya");
        map.put("321", "");
        map.put("322", "");
        map.put("323", "");
        map.put("324", "");
        map.put("325", "");
        map.put("326", "");
        map.put("327", "");
        map.put("328", "");
        map.put("331", "");
        map.put("332", "");
        map.put("333", "");
        map.put("334", "");
        map.put("335", "");
        map.put("338", "");
        map.put("341", "");
        map.put("342", "");
        map.put("343", "");
        map.put("351", "");
        map.put("352", "");
        map.put("353", "");
        map.put("354", "");
        map.put("355", "");
        map.put("356", "");
        map.put("357", "");
        map.put("358", "");
        map.put("361", "");
        map.put("362", "");
        map.put("363", "");
        map.put("365", "");
        map.put("366", "");
        map.put("368", "");
        map.put("370", "");
        map.put("371", "");
        map.put("372", "");
        map.put("373", "");
        map.put("374", "");
        map.put("376", "");
        map.put("379", "");
        map.put("380", "");
        map.put("381", "");
        map.put("382", "");
        map.put("383", "");
        map.put("384", "");
        map.put("385", "");
        map.put("386", "");
        map.put("387", "");
        map.put("388", "");
        map.put("389", "");
        map.put("401", "");
        map.put("402", "");
        map.put("403", "");
        map.put("404", "");
        map.put("405", "");
        map.put("408", "");
        map.put("409", "");
        map.put("410", "");
        map.put("411", "");
        map.put("413", "");
        map.put("414", "");
        map.put("417", "");
        map.put("418", "");
        map.put("419", "");
        map.put("420", "");
        map.put("421", "");
        map.put("422", "");
        map.put("423", "");
        map.put("426", "");
        map.put("427", "");
        map.put("428", "");
        map.put("430", "");
        map.put("431", "");
        map.put("432", "");
        map.put("434", "");
        map.put("435", "");
        map.put("438", "");
        map.put("443", "");
        map.put("450", "");
        map.put("451", "");
        map.put("452", "");
        map.put("453", "");
        map.put("457", "");
        map.put("458", "");
        map.put("461", "");
        map.put("462", "");
        map.put("464", "");
        map.put("471", "");
        map.put("473", "");
        map.put("474", "");
        map.put("481", "");
        map.put("482", "");
        map.put("484", "");
        map.put("485", "");
        map.put("485", "");
        map.put("61", "Medan");
        this.map = map;
    }
}