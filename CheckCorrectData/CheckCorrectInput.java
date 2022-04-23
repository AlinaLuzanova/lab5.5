package CheckCorrectData;

import Data.Coordinates;
import Data.OrganizationType;

public class CheckCorrectInput {

    public int checkCoordinateX(Float x) {
        if (Coordinates.checkValidX(x)) return 1;
        return 0;
    }
    public int checkCoordinateY(float y) {
        if (Coordinates.checkValidX(y)) return 1;
        return 0;
    }

    public int checkName(String name) {
        if (!name.equals("0") && !name.equals("")) return 1;
        return 0;
    }
    public int checkEmployeesCount(long employeesCount){
        if(employeesCount !=0) return 1;
        return 0;
    }

    public int checkAnnualTurnover(float annualTurnover) {
        if (annualTurnover != 0)
            return 1;
        return 0;
    }

    public int checkFullName(String fullName) {
        if (fullName != null) return 1;
        return 0;
    }

    public int checkOrganizationType(String type) {
        try {
            OrganizationType.valueOf(type);
            return 1;
        }
        catch (IllegalArgumentException e) {
            return 0;
        }
    }

    public int checkAddress(String postalAddress) {
        if (postalAddress != null) return 1;
        return 0;
    }

}