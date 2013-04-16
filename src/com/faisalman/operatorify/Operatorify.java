/*
 * Main class
 */
package com.faisalman.operatorify;

/**
 *
 * @author Faisal Salman
 */
public abstract class Operatorify {
    public static PhoneNumber identify (String num) {
        PhoneNumber phone = new PhoneNumber();        
        // set default values
        phone.areaCode = "";
        phone.country = Country.Indonesia;
        phone.operator = Operator.Unknown;
        phone.region = Region.Unknown;        
        // check country code
        if (!num.startsWith("0")) {
            if (!num.matches("^\\+?62\\d+")) {
                return phone; // unsupported phone number outside Indonesia
            } else {
                num = num.replaceFirst("\\+?\\d\\d", "0");
            }
        }
        // set operator
        if (num.startsWith("08")) {
            if (num.matches("^08(11|12|13|21|22|52|53|23)\\d+")) {
                phone.operator = Operator.Telkomsel;
            } else if (num.matches("^08(14|15|16|55|58|56|57)\\d+")) {
                phone.operator = Operator.Indosat;
            } else if (num.matches("^08(17|18|19|59|74|76|77|78|79)\\d+")) {
                phone.operator = Operator.XL;
            } else if (num.matches("^08(99|98|97|96)\\d+")) {
                phone.operator = Operator.Three;
            } else if (num.matches("^08(38|32|31)\\d+")) {
                phone.operator = Operator.Axis;
            } else if (num.matches("^08(81|82|88)\\d+")) {
                phone.operator = Operator.Smartfren;
            } else if (num.matches("^08(27|28)\\d+")) {
                phone.operator = Operator.Ceria;
            }
        } else {
            // sanitize area code
            if(num.matches("^0(61|21|22|24|31)\\d+")) {
                phone.areaCode = num.substring(0, 3);
                num = num.substring(3);
            } else {
                phone.areaCode = num.substring(0, 4);
                num = num.substring(4);
            }
            // set region
            phone.region = Region.getRegion(phone.areaCode);
            // set operator
            if (num.matches("^(30|60|61|62|63|90)\\d+")) {
                phone.operator = Operator.StarOne;
            } else if (num.matches("^(9|80|83)\\d+")) {
                phone.operator = Operator.Esia;
            } else if (num.matches("^(70|68|54|80|81|3)\\d+")) {
                phone.operator = Operator.Flexi;
            } else if (num.matches("^(50|21|31)\\d+")) {
                phone.operator = Operator.Hepi;
            }
        }
        return phone;
    }
}